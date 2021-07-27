package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.JornadaRepository;
import model.JornadaTrabalho;

@Service
public class JornadaService {


	JornadaRepository jornadaRepository;
	
	@Autowired
	public JornadaService(JornadaRepository jornadaRepository) {
		this.jornadaRepository=jornadaRepository;
	}
	
	public JornadaTrabalho saveJornada (JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}
}
