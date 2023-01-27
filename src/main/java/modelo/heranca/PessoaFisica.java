package modelo.heranca;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "F")
public class PessoaFisica extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
