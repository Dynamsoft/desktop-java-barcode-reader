# A JavaFX Barcode Reader 

It uses [Dynamsoft Barcode Reader](https://www.dynamsoft.com/barcode-reader/overview/) to read barcodes.

It is possible to read barcodes from video stream with vlcj.

![](https://github.com/Dynamsoft/desktop-java-barcode-reader/releases/download/assets/video_record_javafx_barcode_reader.gif)

Java 11 and JavaFX 13 are the baseline as vlcj-javafx is used. You also have to install [VLC](https://www.videolan.org/index.html). The cpu architecture of VLC should match the JVM's architecture.

It is recommended to use the full version of Liberica JDK 11 which has JavaFX packed by default.

You could use this command to run the runnable jar with Liberica JDK 11.

```
java -jar BarcodeReaderFX.jar
```

For other versions of JDK, you may have JavaFX installed first and run with this command (this may not work for some JDKs):

```
java -jar BarcodeReaderFX.jar --module-path <path-to-javafx-home/lib> --add-modules javafx.controls,javafx.graphics,javafx.fxml
```

## Use Maven

[Maven plugin for JavaFX](https://github.com/openjfx/javafx-maven-plugin) is used to manage the project.

In case you want to build and install the latest snapshot, you can clone the project, set JDK 11 and run:

```
mvn install
```

Add JavaFX dependencies if your JDK does not have JavaFX:

```xml
<dependency>
    <groupId>org.openjfx</groupId>
    <artifactId>javafx-controls</artifactId>
    <version>14</version>
</dependency>
```

Compile the project:

```
mvn javafx:run
```

For more details, please visit the JavaFX Maven plugin's [page]().

## Blog

<https://www.dynamsoft.com/codepool/barcode-reader-with-javafx-and-vlcj.html>