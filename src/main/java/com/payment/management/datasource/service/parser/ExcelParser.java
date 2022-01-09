package com.payment.management.datasource.service.parser;

import com.payment.management.datasource.controller.Format;
import com.payment.management.datasource.model.Receipt;
import org.springframework.stereotype.Component;

import java.io.InputStream;

@Component
public class ExcelParser implements Parser {

    @Override
    public Receipt parse(InputStream is) {
        return null;
    }

    @Override
    public Format getFormat() {
        return Format.EXCEL;
    }
}
