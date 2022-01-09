package com.payment.management.datasource.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class WebConfig {

    @Value("${file.upload.max-size-per-file}")
    private long filesMaxSize;

    @Value("${file.upload.max-size}")
    private long fileMaxSize;

    @Value("${file.upload.max-size-in-memory}")
    private int fileMaxInMemorySize;

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(filesMaxSize);
        multipartResolver.setMaxUploadSizePerFile(fileMaxSize);
        multipartResolver.setMaxInMemorySize(fileMaxInMemorySize);
        return multipartResolver;
    }
}
