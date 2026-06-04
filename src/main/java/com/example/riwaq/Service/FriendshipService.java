package com.example.riwaq.Service;

import com.example.riwaq.Api.ApiException;
import com.example.riwaq.DTO.IN.FriendshipDTOIn;
import com.example.riwaq.DTO.OUT.FriendshipDTOOut;
import com.example.riwaq.Model.Friendship;
import com.example.riwaq.Model.User;
import com.example.riwaq.Repository.FriendshipRepository;
import com.example.riwaq.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FriendshipService {

    private final FriendshipRepository friendshipRepository;
    private final UserRepository userRepository;

    public List<FriendshipDTOOut> getAllFriendships() {
        return friendshipRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public FriendshipDTOOut getFriendshipById(Integer id) {
        Friendship friendship = friendshipRepository.findFriendshipById(id);
        if (friendship == null) {
            throw new ApiException("Friendship not found");
        }
        return convertToDTO(friendship);
    }

    public void addFriendship(FriendshipDTOIn dto) {
        User sender = userRepository.findUserById(dto.getSenderId());

        if (sender == null) {
            throw new ApiException("Sender not found");
        }

        User receiver = userRepository.findUserById(dto.getReceiverId());

        if (receiver == null) {
            throw new ApiException("Receiver not found");
        }

        if (dto.getSenderId().equals(dto.getReceiverId())) {
            throw new ApiException("User cannot send friendship request to themselves");
        }

        Friendship existingFriendship = friendshipRepository.findFriendshipBySenderIdAndReceiverId(
                dto.getSenderId(),
                dto.getReceiverId()
        );

        if (existingFriendship != null) {
            throw new ApiException("Friendship already exists");
        }

        Friendship reverseFriendship = friendshipRepository.findFriendshipBySenderIdAndReceiverId(
                dto.getReceiverId(),
                dto.getSenderId()
        );

        if (reverseFriendship != null) {
            throw new ApiException("Friendship already exists");
        }

        Friendship friendship = new Friendship();

        friendship.setSenderId(dto.getSenderId());
        friendship.setReceiverId(dto.getReceiverId());

        if (dto.getStatus() == null) {
            friendship.setStatus("PENDING");
        } else {
            friendship.setStatus(dto.getStatus());
        }

        friendshipRepository.save(friendship);
    }

    public void updateFriendship(Integer id, FriendshipDTOIn dto) {
        Friendship friendship = friendshipRepository.findFriendshipById(id);

        if (friendship == null) {
            throw new ApiException("Friendship not found");
        }

        if (dto.getStatus() == null) {
            throw new ApiException("Status is required");
        }

        friendship.setStatus(dto.getStatus());

        friendshipRepository.save(friendship);
    }

    public void deleteFriendship(Integer id) {
        Friendship friendship = friendshipRepository.findFriendshipById(id);
        if (friendship == null) {
            throw new ApiException("Friendship not found");
        }
        friendshipRepository.delete(friendship);
    }

    private FriendshipDTOOut convertToDTO(Friendship friendship) {
        return new FriendshipDTOOut(
                friendship.getId(),
                friendship.getSenderId(),
                friendship.getReceiverId(),
                friendship.getStatus()
        );
    }
}
