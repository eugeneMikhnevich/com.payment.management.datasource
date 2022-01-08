package com.payment.management.datasource.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class WebConfig {

//    @Value("${file.upload.max-size}")
//    private long fileMaxSize;
//
//    @Value("${file.upload.encoding}")
//    private String fileEncoding;

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
//        multipartResolver.setMaxUploadSize(100000);
//        multipartResolver.setUploadTempDir();
//        multipartResolver.setDefaultEncoding("fileEncoding");
        return multipartResolver;
    }
}
