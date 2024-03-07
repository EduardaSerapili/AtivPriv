package ativPrivate;

public class Pessoa {
	
	String Nome;
	int Idade = 0;
	private String Acesso;
	
	public Pessoa (String acesso) {
		
		this.Acesso = "";
		this.Idade = 0;
		
		
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getAcesso() {
		return Acesso;
	}

	public void setAcesso(String acesso) {
		if(this.Idade>=18) {
			System.out.println("Acesso liberado");
			
		}else {
			System.out.println("Acesso não permitido");
		}
		Acesso = acesso;
	}
	
	
}
