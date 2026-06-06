package com.example.riwaq.DTO.OUT;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FriendshipDTOOut {
    private Integer id;
    private Integer senderId;
    private Integer receiverId;
    private String status;


}
