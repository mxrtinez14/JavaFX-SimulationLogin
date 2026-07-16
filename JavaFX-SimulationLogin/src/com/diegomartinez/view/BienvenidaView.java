/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegomartinez.view;

import com.diegomartinez.controller.ImageController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author informatica
 */
public class BienvenidaView extends VBox {
    private static BienvenidaView instanciaBienvenidaView;
    private ImageView imgLogoLogin;
    private Label lblBienvenida;
    private Button btnCerrarVentanaSesion;
    private final String RUTA_ESTILIOS = "/com/diegomartinez/styles/";
    

    public BienvenidaView(String nombreCompleto) {
        this.getStylesheets().add(RUTA_ESTILIOS + "LoginStyles.css");
        this.setPadding( new Insets(15) );
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
        
        this.setBorder(new Border( 
                new BorderStroke( Color.LAVENDERBLUSH, //Color del borde
                            BorderStrokeStyle.SOLID, //estilo de linea
                            new CornerRadii(20),//Pixeles de redondeado
                            new BorderWidths(7))//Ancho del Borde
        ));
        
        lblBienvenida = new Label("¡Bienvenido " + nombreCompleto + "!");
        
        imgLogoLogin = new ImageView( new ImageController().getImageLogin("logo") );
        imgLogoLogin.setFitHeight(100);
        imgLogoLogin.setFitWidth(100);
        imgLogoLogin.setCache(true);
        
        btnCerrarVentanaSesion = new Button("Cerrar");
        
        this.getChildren().addAll(
                lblBienvenida,
                imgLogoLogin,
                btnCerrarVentanaSesion
        );
    }

    public static void setInstanciaBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }

    public ImageView getImgLogoLogin() {
        return imgLogoLogin;
    }

    public Label getLblBienvenida() {
        return lblBienvenida;
    }

    public Button getBtnCerrarVentanaSesion() {
        return btnCerrarVentanaSesion;
    }

}
