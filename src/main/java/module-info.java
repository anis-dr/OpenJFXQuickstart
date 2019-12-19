module OpenJFXQuickstart {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;
    requires com.jfoenix;
    requires org.jsoup;

    opens com.draganovic to javafx.fxml;
    exports com.draganovic;
}
