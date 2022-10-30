/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.vcard.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Genesis
 */
@Data
@AllArgsConstructor
@Component
public class ClienteUser {
    
    @Autowired
    private List<Cliente> clienteLista;

    public ClienteUser() {
    }
    
}
