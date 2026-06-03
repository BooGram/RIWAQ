package com.example.riwaq.Service;

import com.example.riwaq.Api.ApiException;
import com.example.riwaq.DTO.IN.NotificationDTOIn;
import com.example.riwaq.DTO.OUT.NotificationDTOOut;
import com.example.riwaq.Model.Notification;
import com.example.riwaq.Repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public List<NotificationDTOOut> getAllNotifications() {
        return notificationRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public NotificationDTOOut getNotificationById(Integer id) {
        Notification notification = notificationRepository.findNotificationById(id);
        if (notification == null) {
            throw new ApiException("Notification not found");
        }
        return convertToDTO(notification);
    }

    public void addNotification(NotificationDTOIn dto) {
        Notification notification = new Notification();
        notification.setMessage(dto.getMessage());
        notification.setType(dto.getType());
        notification.setReferenceId(dto.getReferenceId());
        notification.setRecipientId(dto.getRecipientId());
        notification.setSenderId(dto.getSenderId());
        notificationRepository.save(notification);
    }

    public void updateNotification(Integer id, NotificationDTOIn dto) {
        Notification notification = notificationRepository.findNotificationById(id);
        if (notification == null) {
            throw new ApiException("Notification not found");
        }
        notification.setMessage(dto.getMessage());
        notification.setType(dto.getType());
        notification.setReferenceId(dto.getReferenceId());
        notification.setRecipientId(dto.getRecipientId());
        notification.setSenderId(dto.getSenderId());
        notificationRepository.save(notification);
    }

    public void deleteNotification(Integer id) {
        Notification notification = notificationRepository.findNotificationById(id);
        if (notification == null) {
            throw new ApiException("Notification not found");
        }
        notificationRepository.delete(notification);
    }

    private NotificationDTOOut convertToDTO(Notification notification) {
        return new NotificationDTOOut(
                notification.getId(),
                notification.getMessage(),
                notification.getStatus(),
                notification.getType(),
                notification.getReferenceId(),
                notification.getCreatedAt(),
                notification.getRecipientId(),
                notification.getSenderId()
        );
    }
}
