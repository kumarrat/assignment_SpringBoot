package com.geekster.universityEvent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {
    @Id
    private Long eventId;
    @NotBlank
    private String eventName;
    @NotBlank
    private String locationOfEvent;
    @NotBlank
    private LocalDate date;
    @NotBlank
    private LocalTime startTime;
    @NotBlank
    private LocalTime endTime;
}
