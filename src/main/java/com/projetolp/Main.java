package com.projetolp;

//mvn clean compile exec:java

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) 
    {
        launch();
    }

    
    @Override
    public void start(Stage primaryStage) 
    {      
        //Atributos recebem dados
        Label label1 = new Label("Name: ");
        Label label2 = new Label("Número: ");         

        TextField nome = new TextField();
        TextField num = new TextField();

        nome.setPromptText("Digite seu nome");
        num.setPromptText("Digite seu número");

        Label resultado = new Label("Resultado aparecerá aqui...");
        //

        //Atributos processam dados
        Button b = new Button("Enviar");    
        b.setOnAction(e -> {       
            resultado.setText("");     
            String texto1 = nome.getText();
            String texto2 = num.getText();
            try {
                int valor = Integer.parseInt(texto2); // tenta converter para inteiro
                User user1 = new User();
                String msg = user1.Teste(texto1, valor);
                resultado.setText(msg);
            } catch (NumberFormatException ex) {
                // caso não seja inteiro, mostra alerta
                resultado.setText("Digite Inteiro");
            }            
        });

        HBox box = new HBox(5);
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(label1, nome, label2, num);  
        
        VBox vBox = new VBox(10); // espaçamento vertical de 10px
        vBox.getChildren().addAll(box, b,resultado);
        vBox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(vBox, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX App");
        primaryStage.show();
    }
}
