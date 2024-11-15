package com.asilstore.controllers;

import com.asilstore.models.Cliente;
import com.asilstore.models.Producto;
import com.asilstore.services.IProductoService;
import com.asilstore.services.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/Store")
public class ProductoController {

    @Autowired
    private IProductoService service;
    @Autowired
    private UploadService upload;
    @GetMapping("")
    public String index(){
        return "index";
    }
    @GetMapping("/create")
    public String create(){

        return "productos/create";
    }

    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute Producto producto, BindingResult result, @RequestParam("image") MultipartFile file) throws IOException {
        if(result.hasErrors()){
            return "productos/create";
        }

        Cliente usuario = new Cliente();

        //imagen
        if (producto.getId() == null) {//cuando se crea un producto

            String nombreImagen = upload.guardarimagen(file);
            producto.setImagen(nombreImagen);

        } else {
            if (file.isEmpty()) {//editamos el producto pero no cambiamos las imagenes
                Producto p =new Producto();
                p = service.findById(producto.getId()).get();
                producto.setImagen(p.getImagen());
            } else {//cuando editamos la imagen
                String nombreImagen = upload.guardarimagen(file);
                producto.setImagen(nombreImagen);
            }
        }

        service.save(producto);
        return "redirect:/index";
    }
}
