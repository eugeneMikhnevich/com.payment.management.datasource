package com.payment.management.datasource.controller;

import com.payment.management.datasource.service.ReceiptService;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {

    private final ReceiptService receiptService;

    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }

    @PostMapping
    public void uploadReceipt(
            @RequestParam("file") @NonNull MultipartFile file,
            @RequestHeader("format") @NonNull Format format) {
        try {
            receiptService.process(file.getInputStream(), format);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
