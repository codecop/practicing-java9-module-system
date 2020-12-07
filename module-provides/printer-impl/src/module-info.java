module com.printer.impl {
    requires com.printer.api;
    provides com.printer.api.Printer with com.printer.impl.ConsolePrinter;
}