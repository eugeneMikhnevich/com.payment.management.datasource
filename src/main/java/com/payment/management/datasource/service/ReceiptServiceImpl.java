package com.payment.management.datasource.service;

import com.payment.management.datasource.controller.Format;
import com.payment.management.datasource.service.parser.Parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    private Map<Format, Parser> parsers;

    @Override
    public void process(InputStream file, Format format) {

    }
}
