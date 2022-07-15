//-------------------------CAJERO AUTOMATICO 4-----------------------//
// 30/08/2021
// Eddie Casañas
// Santiago, Chile
//-------------------------------------------------------------------//


import java.util.*;
public class CajeroAutomatico4 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		//Ingresar el saldo que tendra la cuenta en el constructor
		PlantillaCajeroAutomatico pc = new PlantillaCajeroAutomatico(10000);
		String opcion;
		int parseOpcion, salida = 0;

		while(true) {
			while(true) {
				System.out.println("BIENVENIDO AL CAJERO AUTOMATICO\n");
				System.out.println("(1): Consultar saldo");
				System.out.println("(2): Hacer retiro");
				System.out.println("(3): Hacer deposito");
				System.out.println("(4): Salir");
				
				try {
					opcion = obj.nextLine();
					parseOpcion = Integer.parseInt(opcion);
					if(parseOpcion < 1 || parseOpcion > 4) {
						continue;
					}else {
						break;
					}
				}catch(Throwable exc) {
					System.out.println("Ingrese una opcion valida\n");
				}		
			}
			
			switch(parseOpcion) {
			case 1:
				pc.getSaldo();
				break;
			case 2:
				while(true) {
					salida = pc.retiro();
					if(salida == 0) {
						continue;
					}else {
						break;
					}
				}
				break;
			case 3:
				while(true) {
					salida = pc.deposito();
					if(salida == 0) {
						continue;
					}else {
						break;
					}
				}
				break;
			case 4:
				salida = pc.salida();
				break;
			}
			if(salida == 1) {
				break;
			}
		}

	}
}
