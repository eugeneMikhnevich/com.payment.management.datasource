package com.payment.management.datasource.service.parser;

import com.payment.management.datasource.controller.Format;
import com.payment.management.datasource.model.Receipt;

import java.io.InputStream;

public interface Parser {

    Receipt parse(InputStream is);

    Format getFormat();
}
