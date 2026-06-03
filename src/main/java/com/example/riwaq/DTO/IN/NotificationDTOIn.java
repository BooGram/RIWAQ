package com.example.riwaq.DTO.IN;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDTOIn {

    @NotEmpty(message = "Message must not be empty")
    private String message;

    @NotEmpty(message = "Type must not be empty")
    @Pattern(regexp = "FRIEND_REQUEST|FRIEND_ACCEPTED|POST_LIKE|NEW_REVIEW|GENERAL", message = "Type must be FRIEND_REQUEST, FRIEND_ACCEPTED, POST_LIKE, NEW_REVIEW, or GENERAL")
    private String type;

    private Integer referenceId;

    @NotNull(message = "Recipient ID must not be null")
    private Integer recipientId;

    private Integer senderId;
}
