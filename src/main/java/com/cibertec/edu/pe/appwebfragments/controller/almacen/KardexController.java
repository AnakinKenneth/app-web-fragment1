package com.cibertec.edu.pe.appwebfragments.controller.almacen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/almacen/kardex")
public class KardexController {

    @GetMapping("listarkardex")
    public String index(){
        return "almacen/kardex";
    }

}
