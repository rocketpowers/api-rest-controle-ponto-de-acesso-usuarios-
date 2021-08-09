package com.rockets.demo.Service;

import java.util.List;
import java.util.Optional;
import com.rockets.demo.Model.JornadaTrabalho;
import com.rockets.demo.Repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class JornadaService {


	JornadaRepository jornadaRepository;

	@Autowired
	public JornadaService(JornadaRepository jornadaRepository) {
		this.jornadaRepository = jornadaRepository;
	}

	public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
		return jornadaRepository.save(jornadaTrabalho);

	}

	public List<JornadaTrabalho> findAll() {
		return   jornadaRepository.findAll();
	}

	public Optional<JornadaTrabalho> getById(Long idJornada) {
		return jornadaRepository.findById(idJornada);
	}

	public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
		return jornadaRepository.save(jornadaTrabalho);

	}

	public void deleteJornada(Long idJornada) {
		jornadaRepository.deleteById(idJornada);
	}
}
