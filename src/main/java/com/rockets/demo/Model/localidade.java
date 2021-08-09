package com.rockets.demo.Model;


import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class localidade {
	
	@Id
	private long id;
	@ManyToOne
	private NivelAcesso nivelAcesso;
	private String descricao;
	
	
	
	
}
