package modelo.heranca;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "J")
public class PessoaJuridica extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
