package com.payment.management.datasource.service;

import com.payment.management.datasource.controller.Format;
import com.payment.management.datasource.model.Receipt;
import com.payment.management.datasource.service.parser.Parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    private final Map<Format, Parser> parsers;

    @Autowired
    public ReceiptServiceImpl(Map<Format, Parser> parsers) {
        this.parsers = parsers;
    }

    @Override
    public Receipt process(InputStream file, Format format) {
        return Optional.ofNullable(parsers.get(format))
                .map(parser -> parser.parse(file))
                .orElse(null);
    }
}
