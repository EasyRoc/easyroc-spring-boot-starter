package com.easyroc.config;

import com.easyroc.properties.EmailProperties;
import com.easyroc.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnClass({EmailService.class})
@EnableConfigurationProperties({EmailProperties.class})
@Slf4j
public class EmailAutoConfiguration {

    @Autowired
    private EmailProperties emailProperties;

    @Bean
    @ConditionalOnMissingBean
    public EmailService emailService() {
        log.info("Creating EmailService bean...");
        EmailService emailService = new EmailService();
        emailService.setEmailProperties(emailProperties);
        return emailService;
    }

}
