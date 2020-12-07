package com.printer.client;

import java.util.ServiceLoader;

import com.printer.api.Printer;

public class PrinterClient {
    public static void main(String[] args) {
        ServiceLoader<Printer> loader = ServiceLoader.load(Printer.class);
        Printer printer = loader.findFirst().get();
        printer.print("Hello world!");
    }
}