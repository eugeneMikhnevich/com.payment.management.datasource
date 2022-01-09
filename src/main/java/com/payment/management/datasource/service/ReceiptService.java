package com.payment.management.datasource.service;

import com.payment.management.datasource.controller.Format;
import com.payment.management.datasource.model.Receipt;

import java.io.InputStream;

public interface ReceiptService {

    Receipt process(InputStream file, Format format);
}
