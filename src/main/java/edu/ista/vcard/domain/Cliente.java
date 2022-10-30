/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.vcard.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Genesis
 */
@Data
@AllArgsConstructor
public class Cliente {
    
    private String nombre;
    private String ciudad;
    private String horario;
    private String correo;
    private String celular;
    private String pagina;
    private String urlFoto;

    public Cliente() {
    }
   
}
