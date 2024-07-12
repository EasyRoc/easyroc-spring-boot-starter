package com.easyroc.service;

import com.easyroc.properties.EmailProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class EmailService {

    private EmailProperties emailProperties;

    /**
     * 模拟邮件发送功能
     */
    public void sendEmail() {

        System.out.println("Sending email... \n" +
                "username: " + emailProperties.getUsername() + "\n" +
                "password: " + emailProperties.getPassword() + "\n" +
                "host: " + emailProperties.getHost() + "\n" +
                "port: " + emailProperties.getPort());
    }

}
