package com.cibertec.edu.pe.appwebfragments.controller.almacen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/almacen/guiaremision")
public class GuiaRemisionController {

    @GetMapping("listarguias")
    public String index(){
        return "almacen/guiaremision";
    }

}
