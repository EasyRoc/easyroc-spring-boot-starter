package com.easyroc.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

@ConfigurationProperties("easyroc.weblog")
public class WebLogProperties implements Serializable {

    public Boolean enabled;  //Boolean封装类，默认为null

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
