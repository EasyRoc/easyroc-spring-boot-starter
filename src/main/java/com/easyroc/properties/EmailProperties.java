package com.easyroc.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "easyroc.email")
public class EmailProperties {

    private String username = "";

    private String password = "";

    private String host = "smtp.163.com";

    private Integer port = 25;

}
