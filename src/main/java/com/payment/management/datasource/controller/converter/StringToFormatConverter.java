package com.payment.management.datasource.controller.converter;

import com.payment.management.datasource.controller.Format;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StringToFormatConverter implements Converter<String, Format> {

    @Override
    public Format convert(String source) {
        return Optional.ofNullable(Format.getFormat(source))
                .orElseThrow(() -> new IllegalArgumentException("Invalid format " + source));
    }
}
