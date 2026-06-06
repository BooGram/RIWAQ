package com.example.riwaq.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Friendship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Pattern(regexp = "PENDING|ACCEPTED|REJECTED", message = "Status must be PENDING, ACCEPTED, BLOCKED, or REJECTED")
    @Column(nullable = false)
    private String status = "PENDING";

    @ManyToOne
    @JoinColumn(name = "senderId", nullable = false)
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiverId", nullable = false)
    private User receiver;

    @JsonIgnore
    @OneToMany(mappedBy = "friendship")
    private Set<ReadingChallenge> readingChallenges;
}