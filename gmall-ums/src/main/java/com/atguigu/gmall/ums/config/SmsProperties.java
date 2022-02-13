package com.atguigu.gmall.ums.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author LaoMa
 * @since 2021/8/16
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "aliyun.sms")
public class SmsProperties {
    public String appSecret;
    public String appCode;
    public String host;
    public String path;
    public String method;
    public String templateId;
}
