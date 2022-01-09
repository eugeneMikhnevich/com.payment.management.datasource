package com.payment.management.datasource.config;

import com.payment.management.datasource.controller.Format;
import com.payment.management.datasource.service.parser.Parser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class ServiceConfig {

    @Bean
    public Map<Format, Parser> parsers(List<Parser> parsers) {
        return parsers.stream()
                .collect(Collectors.toMap(
                        Parser::getFormat,
                        parser -> parser
                ));
    }
}
