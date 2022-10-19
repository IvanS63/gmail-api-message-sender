package com.myapp.mailsender.controller;

import com.myapp.mailsender.gmail.GmailAuthService;
import com.myapp.mailsender.gmail.GmailMessageSendingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.io.IOException;
import java.security.GeneralSecurityException;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class MainController {
    private final GmailMessageSendingService messageService;

    @GetMapping("/send")
    public void send(){
        try {
            messageService.sendEmail("semenovivan94@gmail.com");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
