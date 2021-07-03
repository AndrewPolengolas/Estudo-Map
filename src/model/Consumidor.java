package model;

public class Consumidor implements Comparable<Consumidor>{
	private String nome;
	private Integer cpf;
	
	public Consumidor(String nome, Integer cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getCpf() {
		return cpf;
	}
	
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	@Override
	public int compareTo(Consumidor consumidor) {
		
		if (this.cpf < consumidor.cpf) {
            return -1;
        }
        if (this.cpf > consumidor.cpf) {
            return 1;
        }
        return 0;
	}

}
