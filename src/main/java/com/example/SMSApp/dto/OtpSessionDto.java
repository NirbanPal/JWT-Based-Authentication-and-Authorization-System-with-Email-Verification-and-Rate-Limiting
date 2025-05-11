package com.example.SMSApp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OtpSessionDto implements Serializable {
    private String hashedOtp;
    private boolean isValid;
    private LocalDateTime createdAt;
}

