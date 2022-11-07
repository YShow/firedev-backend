package com.firedev.backend.exception.config;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import lombok.Value;

@Value
@AllArgsConstructor
@Builder
@ToString
@Schema(description = "General error message")
public class ApiError {


    @Schema(description = "The error message presented")
    private String message;
    @Schema(description = "The timestamp of the message")
    private LocalDateTime timestamp;


}
