package com.example.primeirocrud.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class EstudanteController implements Initializable  {
    @FXML
    private ToggleGroup Sexo;

    @FXML
    private Button btn_delete;

    @FXML
    private Button btn_edit;

    @FXML
    private Button btn_save;

    @FXML
    private TextField input_age;

    @FXML
    private TextField input_name;

    @FXML
    private RadioButton radioF;

    @FXML
    private RadioButton radioM;

    @FXML
    private TableColumn table_age;

    @FXML
    private TableColumn table_id;

    @FXML
    private TableColumn table_name;

    @FXML
    private TableColumn table_sex;

    @FXML
    private TableView table_student;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    void mostrarNome(ActionEvent event) {
        String name = input_name.getText().toString(); //armazena o nome digitado no input_nome do projeto
        Alert alert = new Alert(Alert.AlertType.INFORMATION); //cria um alerta que irá aparecer na ação realizada(clicar em salvar)
        alert.setTitle("testando o sistema"); //texto do alerta
        alert.setHeaderText("Funcionando"); // cabeçalho do alerta
        alert.setContentText(name); // descrição do alerta
        alert.show();// exibe o alerta
    }
}
