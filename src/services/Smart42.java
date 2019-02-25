package services;

public class Smart42 {

	private String p;
	private String m;

	public Smart42() {

	}

	public Smart42(String p, String m) {
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

	public void rulesDriver() {

		if(m.equals("Piloto")) {
			if (p.equals("Comissaria1") || p.equals("Comissaria2") || p.equals("Presidiario")) {
				System.out.println("Passageiro invalido, leia as regras novamente e tente Novmente.");
				System.exit(0);
			}
		}
		if(m.equals("ChefeDeServiço")) {
			if (p.equals("Oficial1") || p.equals("Oficial2") || p.equals("Presidiario")) {
				System.out.println("Passageiro invalido, leia as regras novamente e tente novamente.");
				System.exit(0);
			}
		}
		if(m.equals("Policial")) {
			if (p.equals("Comissaria1") || p.equals("Comissaria2") || p.equals("Oficial1") || p.equals("Oficial2")) {
				System.out.println("Passageiro invalido, leia as regras novamente e tente novamente.");
				System.exit(0);
			}
		}
    }
	
	public void canDrive () {
		if(m.equals("Piloto") || m.equals("ChefeDeServiço") || m.equals("Policial")) {
		}else {
			System.out.println("Motorista Invalido, leia as regras e tente novamente.");
			System.exit(0);
		}
	}
	
	public void theSame() {
		if(p.equals(m)) {
			System.out.println("O motorista e o passageiro não podem ser os mesmos, tente novamente.");
			System.exit(0);
		}
	}
	
}