package com.payment.management.datasource.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Format {
    PDF("pdf"),
    EXCEL("excel"),
    WORD("word");

    private final String name;

    public static Format getFormat(String name) {
        if (PDF.getName().equalsIgnoreCase(name)) {
            return PDF;
        } else if (EXCEL.getName().equalsIgnoreCase(name)) {
            return EXCEL;
        } else if (WORD.getName().equalsIgnoreCase(name)) {
            return WORD;
        } else {
            return null;
        }
    }
}
