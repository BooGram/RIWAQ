package com.example.riwaq.DTO.Out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostLikeDTOOut {
    private Integer id;
    private Integer userId;
    private Integer postId;
    private LocalDateTime createdAt;
}
