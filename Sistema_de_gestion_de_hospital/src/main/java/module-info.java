module co.edu.uniquindio.sistema_de_gestion_de_hospital {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.sistema_de_gestion_de_hospital to javafx.fxml;
    exports co.edu.uniquindio.sistema_de_gestion_de_hospital;
}