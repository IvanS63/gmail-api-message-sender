package com.myapp.mailsender.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("email-sender")
@Data
@Component
public class EmailConfig {
    private String fromAddress;
}
