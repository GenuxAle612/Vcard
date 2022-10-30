/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.vcard.controller;

import edu.ista.vcard.domain.ClienteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Genesis
 */
@Controller
public class ClienteController {
    
    @Autowired
    private ClienteUser clienteUser;
    
    @GetMapping({"/","/index"})
    public String index(Model model){
        model.addAttribute("clienteUser", clienteUser);
        return "index";
    }
}
