package com.luo.cofig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "spring.influx")
public class InfluxDbProperties {
    private String url;
    private String userName;
    private String password;
    private String database;
    private String retentionPolicy = "autogen";
    private String retentionPolicyTime = "30d";
    private int actions = 2000;
    private int flushDuration = 1000;
    private int jitterDuration = 0;
    private int bufferLimit = 10000;

}