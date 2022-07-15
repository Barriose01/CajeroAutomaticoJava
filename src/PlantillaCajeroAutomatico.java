//-------------------------PLANTILLA CAJERO AUTOMATICO 4-----------------------//
// 30/08/2021
// Eddie Casañas
// Santiago, Chile
//-----------------------------------------------------------------------------//


import java.util.*;
public class PlantillaCajeroAutomatico {
	public double saldo;
	int salida = 0;
	Scanner obj = new Scanner(System.in);
	
	public PlantillaCajeroAutomatico(double saldo){
		this.saldo = saldo;
	}
	public void getSaldo() {
		System.out.println("\nCONSULTA DE SALDO");
		System.out.println("Su saldo es de: " + this.saldo + "\n");
	}
	
	public int retiro() {
		String retiro, monto;
		int parseRetiro; 
		double parseMonto;
		
		while(true) {
			System.out.println("ELIJA EL MONTO A RETIRAR\n");
			System.out.println("(1): 1000");
			System.out.println("(2): 5000");
			System.out.println("(3): 10000");
			System.out.println("(4): 50000");
			System.out.println("(5): Ingresar un monto");
			System.out.println("(6): Volver");
			
			try {
				retiro = obj.nextLine();
				parseRetiro = Integer.parseInt(retiro);
				
				if(parseRetiro < 1 || parseRetiro > 6) {
					continue;
				}else {
					break;
				}
			}catch(Throwable exc) {
				System.out.println("Ingrese una opcion valida\n");
			}
			
		}
		switch(parseRetiro) {
		case 1:
			if(this.saldo < 1000) {
				System.out.println("Saldo insuficiente\n");
			}else {
				this.saldo -= 1000;
				System.out.println("RETIRO: 1000");
				System.out.println("SALDO: " + this.saldo + "\n");
			}
			break;
		
		case 2:
			if(this.saldo < 5000) {
				System.out.println("Saldo insuficiente\n");
			}else {
				this.saldo -= 5000;
				System.out.println("RETIRO: 5000");
				System.out.println("SALDO: " + this.saldo + "\n");
			}
			break;
		case 3:
			if(this.saldo < 10000) {
				System.out.println("Saldo insuficiente\n");
			}else {
				this.saldo -= 10000;
				System.out.println("RETIRO: 10000");
				System.out.println("SALDO: " + this.saldo + "\n");
			}
			break;
		case 4:
			if(this.saldo < 50000) {
				System.out.println("Saldo insuficiente\n");
			}else {
				this.saldo -= 50000;
				System.out.println("RETIRO: 50000");
				System.out.println("SALDO: " + this.saldo + "\n");
			}
			break;
		case 5:
				System.out.println("Ingrese monto: ");
				try {
					monto = obj.nextLine();
					parseMonto = Double.parseDouble(monto);
					if(this.saldo < parseMonto) {
						System.out.println("Saldo insuficiente\n");
					}else if(parseMonto < 0) {
						System.out.println("No puede retirar montos negativos\n");
					}else {
						this.saldo -= parseMonto;
						System.out.println("RETIRO: " + monto);
						System.out.println("SALDO: " + this.saldo + "\n");
					}
					
					break;
				}catch(Throwable exc) {
					System.out.println("Ingrese un monto valido\n");
				}

			break;
					
		case 6:
			salida = 6;
			break;
		}
		if(salida == 6) {
			return salida;
		}else {
			return 0;
		}

	}
	
	public int deposito() {
		String opcion, deposito;
		int parseOpcion;
		double parseDeposito;
		
		while(true) {
			System.out.println("(1): Ingresar el monto a depositar");
			System.out.println("(2): Volver");
			try {
				opcion = obj.nextLine();
				parseOpcion = Integer.parseInt(opcion);
				if(parseOpcion < 1 || parseOpcion > 2) {
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
			try {
				System.out.println("Ingrese el monto a depositar: ");
				deposito = obj.nextLine();
				parseDeposito = Double.parseDouble(deposito);
				if(parseDeposito < 0) {
					System.out.println("Ingrese un monto valido\n");
				}else {
					this.saldo += parseDeposito;
					System.out.println("DEPOSITO REALIZADO: " + parseDeposito);
					System.out.println("SALDO: " + this.saldo + "\n");
				}
				
				break;
			}catch(Throwable exc) {
				System.out.println("Ingrese un monto valido\n");
			}
			break;
			
		case 2:
			salida = 2;
			break;
		}
		if(salida == 2) {
			return salida;
		}else {
			return 0;
		}
		
	}
	
	public int salida() {
		return 1;
	}
	
}
