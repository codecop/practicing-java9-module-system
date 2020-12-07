javac printer-api\src\module-info.java    printer-api\src\com\printer\api\Printer.java                                 -d dist\printer-api

javac printer-impl\src\module-info.java   printer-impl\src\com\printer\impl\ConsolePrinter.java    -p dist\printer-api -d dist\printer-impl

javac printer-client\src\module-info.java printer-client\src\com\printer\client\PrinterClient.java -p dist\printer-api -d dist\printer-client
