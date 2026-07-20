/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegomartinez.controller;

import javafx.scene.image.Image;

/**
 *
 * @author informatica
 */
public class ImageController {
//    /**
//     * Metodo que utiliza el patron Factory, para crear diferentes imagenes y retornaras
//     */@param nombreImagen el Nombre de la imagen a crear
//       @return La imagen a mostrar
//               
    private final String RUTA_IMAGENES = "/com/diegomartinez/resources/";
    
    public Image getImageLogin(String nombreImagen){
        Image imagenAMostrar;
        
        switch (nombreImagen){
            case "logo":
                imagenAMostrar = new Image(RUTA_IMAGENES+"login-logo.png");
                break;
            default:
                imagenAMostrar = new Image(RUTA_IMAGENES+"login-logo.png");
        }
        return imagenAMostrar;
        
    }
}   
