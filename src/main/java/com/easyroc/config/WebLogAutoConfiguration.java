package com.easyroc.config;

import com.easyroc.properties.WebLogProperties;
import com.easyroc.service.WebLogAspect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //表示这个类为配置类
@EnableConfigurationProperties({WebLogProperties.class})
@ConditionalOnProperty(prefix = "easyroc.weblog", value = "enabled", matchIfMissing = true)
public class WebLogAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public WebLogAspect webLogAspect() {
        return new WebLogAspect();
    }

}
