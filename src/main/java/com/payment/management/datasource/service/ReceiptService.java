package com.payment.management.datasource.service;

import com.payment.management.datasource.controller.Format;

import java.io.InputStream;

public interface ReceiptService {

    void process(InputStream file, Format format);
}
