package com.example.demo.codeExamples.comentario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ComentarioController {

    @Autowired
    ComentarioService comentarioService;

    @GetMapping("comentarios")
    public List<Comentario> obtenerComentarios(){
        return comentarioService.obtenerComentarios();
    }

    @GetMapping("comentarios/jdbc")
    public ArrayList<Comentario> obtenerComentariosJdbc(){
        return comentarioService.obtenerComentarioJDBC();
    }


}
