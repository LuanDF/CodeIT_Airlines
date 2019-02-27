//Autor:Luan_Dias_Félix_dos_Santos
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Driver;
import entities.Passenger;
import entities.People;
import services.Smart42;
import services.View;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		View view = new View();
		
		List<People> airportList = new ArrayList<>();
		List<People> airplaneList = new ArrayList<>();
		
		airportList.add(new Driver("Piloto"));
		airportList.add(new Driver("ChefeDeServiço"));
		airportList.add(new Driver("Policial"));
		airportList.add(new Passenger("Oficial1"));
		airportList.add(new Passenger("Oficial2"));
		airportList.add(new Passenger("Comissaria1"));
		airportList.add(new Passenger("Comissaria2"));
		airportList.add(new Passenger("Presidiario"));
		
		view.introduction();
		view.rules();
		
		do{
			Smart42 s42 = new Smart42();
			
		    System.out.println("Pessoas atualmente na área de embarque:");
		    for (People x : airportList) {
				System.out.println(x);
			}
			System.out.printf("\nEscolha um motorista:");
			
			String m = sc.nextLine();
			s42.setM(m);
			s42.canDrive();
			
			People checkM = new Driver(m);
			if (!airportList.contains(checkM)) {
				System.out.println("Motorista não se encontra mais na área de embarque, tente novamente.");
				break;
			}
			
			System.out.printf("Agora escolha um passageiro:");
			String p = sc.nextLine();
			s42.setP(p);
			
			People checkP = new Passenger(p);
			if (!airportList.contains(checkP)) {
				System.out.println("Passageiro não se encontra mais na área de embarque, tente novamente.");
				break;
			}
			
			if(p.equals("Policial")) {
				int i = 1;
				int n = 0;
				if(airplaneList.size() > i || airplaneList.size() == n) {
					System.out.println("Policial não pode deixar Presidiario sozinho com os outros passageiros, tente novamente.");
					break;
				}
			}
			
			s42.theSame();
			s42.rulesDriver();
			
			People delete = new Passenger(p);	
			airportList.remove(delete);
			airplaneList.add(new Passenger(p));
			view.setM(m);
			view.setP(p);
			
			if(airportList.size() == 1) {
				airplaneList.add(new Driver(m));
				view.lastEmbark();
				System.out.printf("\nLista de passageiros dentro do avião:\n");
				for (People x : airplaneList) {
					System.out.println(x);
				}
				view.congratz();
				break;
			}
			
			People checkI = new Passenger("Presidiario");
			People checkC = new Passenger("Policial");
			if(airplaneList.contains(checkI) && !airplaneList.contains(checkC) && airplaneList.size() > 1) {
				System.out.println("Presidiario não pode ficar com os ouros passageiros sem a presença do Policial, tente novamente.");
				break;
			}
			
			if(p.equals("Policial")) {
				int i = 2;
				if(airplaneList.size() == i && !airplaneList.contains(checkI)) {
					System.out.println("Policial não pode deixar Presidiario sozinho com os outros passageiros, tente novamente.");
					break;
				}
			}
			
			view.embarkView();
			
		}while(airportList != null);
		sc.close();
	}

}
