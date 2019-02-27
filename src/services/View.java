package services;

public class View {
	
	private String p;
	private String m;
	
	public View(){
	}
	public View(String p, String m) {
		this.p = p;
		this.m = m;
	}
	
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	public String getM() {
		return m;
	}
	public void setM(String m) {
		this.m = m;
	}
	
	public void introduction() {
		System.out.printf("                         **********   CodeIT Airlines   **********\n\n" + 
		"CodeIT Airlines precisa embarcar 8 passageiros em um avião, sendo eles um Piloto, e dois Oficiais que fazem parte da tripulação técnica,\n" + 
		"um Chefe De Serviço de Voo e duas Comissarias que fazem parte da tripulação da cabine, e mais um Policial e um Presidiario.\n" +
		"O transporte dos tripulantes e dos passageiros sera realizado por um SmartForTwo, que é um veiculo que suporta apenas 2 Pessoas.\n" + 
		"Existem algumas regras para o embarque que são politicas da empresa e necessitam ser seguidas.\n\n\n");
	}
	
	public void rules() {
		System.out.printf("                         **********   Regras   **********\n\n" + 
	    "Apenas três pessoas podem dirigir o SmartForTwo, sendo elas o Piloto, Chefe De Serviço de Voo e o Policial.\n" + 
		"Nenhuma das Comissarias pode ficar sozinha com o Piloto.\n" +
	    "Nenhum dos Oficiais pode ficar sozinho com o Chefe De Serviço de Voo.\n" +
		"O Presidiario não pode ficar sozinho em momento algum com os tripulantes sem a presença do policial,\n" +
	    "nem no terminal e nem no avião.\n\n\n");
	}
	
	public void embarkView () {
		System.out.printf("\n--Passageiro: %s embarcado com sucesso, Motorista: %s retornando a área de embarque\n\n", p,m);
	}
	
	public void lastEmbark() {
		System.out.printf("\n--Passageiro: %s e Motorista: %s embarcados no avião.\n", p,m);
	}
	
	public void congratz() {
		System.out.printf("\nParabéns, todos os passageiros foram embarcados com sucesso.\n\n"+
	    "                                                   ENCERRANDO PROGRAMA.");
	}

}
