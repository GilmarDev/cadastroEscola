package com.escolaadventista.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name =  "estudantes")
public class Estudante {
	
	

	@Id
	@GeneratedValue(generator= "increment")
	@GenericGenerator(name= "increment",strategy = "increment")
	private long id;
	
	@Column(name = "nome_do_aluno")
	String nomeDoAluno;
	
	@Column(name = "idade")
	int idade;
	
	@Column(name = "nome_mae")
	String nomeMae;
	
	@Column(name = "telefone")
	String telefone;
	
	@Column(name = "endereco")
	String endereco;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeDoAluno() {
		return nomeDoAluno;
	}

	public void setNomeDoAluno(String nomeDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + idade;
		result = prime * result + ((nomeDoAluno == null) ? 0 : nomeDoAluno.hashCode());
		result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudante other = (Estudante) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id != other.id)
			return false;
		if (idade != other.idade)
			return false;
		if (nomeDoAluno == null) {
			if (other.nomeDoAluno != null)
				return false;
		} else if (!nomeDoAluno.equals(other.nomeDoAluno))
			return false;
		if (nomeMae == null) {
			if (other.nomeMae != null)
				return false;
		} else if (!nomeMae.equals(other.nomeMae))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

	
}
