/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.vcard;

import edu.ista.vcard.domain.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Genesis
 */
@Configuration
public class AppConfig {
    
    @Bean("listaCliente")
    public List<Cliente> listaCliente (){
        List<Cliente> listaCliente= new ArrayList<>();
        Cliente cliente = new Cliente("Genesis Pena","Cuenca","8pm","genesis@gmail.com","123456789","www.ecuador.com","https://creamas.org/wp-content/uploads/2019/07/FOTOGRAFIA-CARNET.jpg");
        Cliente cliente1 = new Cliente("Boris Quizhpe","Cuenca","9pm","boris@gmail.com","123456789","www.ecuador.com","https://creamas.org/wp-content/uploads/2017/11/carnet.jpg");
        Cliente cliente2 = new Cliente("Juan Topo","Quito","8pm","juan@gmail.com","123456789","www.ecuador.com","https://larepublica.pe/resizer/xBfmNvKICa57Xo2LcNQiOB9FWUM=/1250x735/top/smart/cloudfront-us-east-1.images.arcpublishing.com/gruporepublica/ZQXOZ3XRJNEUTAGM3KHNNUHMAA.jpg");
        listaCliente.add(cliente);
        listaCliente.add(cliente1);
        listaCliente.add(cliente2);
        return listaCliente;
    } 
}
