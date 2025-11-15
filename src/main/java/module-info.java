module co.bases.datos.proyectofinaldb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens co.bases.datos.proyectofinaldb to javafx.fxml;
    exports co.bases.datos.proyectofinaldb;
}