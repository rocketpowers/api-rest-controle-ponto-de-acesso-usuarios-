package com.rockets.demo.Controller;

import com.rockets.demo.Model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
	
	@Autowired
	com.rockets.demo.Service.JornadaService JornadaService;
	
	@PostMapping
	public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
		return JornadaService.saveJornada(jornadaTrabalho);
		
	}
	
	@GetMapping
	public List<JornadaTrabalho>getJornadaList(){
		return JornadaService.findAll();
		
	}
	
	@GetMapping("/{idJornada}")
	public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") long idJornada) throws Exception{
		return ResponseEntity.ok(JornadaService.getById(idJornada).orElseThrow(()-> new NoSuchElementException("not found")));	
				
		
	}
	
	

}
