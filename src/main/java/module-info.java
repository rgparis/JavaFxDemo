module com.rgparis.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens com.rgparis.javafxdemo to javafx.fxml;
    exports com.rgparis.javafxdemo;
}