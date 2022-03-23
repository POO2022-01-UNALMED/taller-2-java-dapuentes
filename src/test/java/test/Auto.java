package test;
public class Auto {
	String modelo;
	int precio;
	String marca;
	Asiento[] asientos;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos(){
		int a = 0;
		for(int i = 0; i < asientos.length; i++){
			if (asientos[i] != null) {
				a++;
			}
		}
		return a;
	}
	
	String verificarIntegridad(){
		if (registro == motor.registro) {
			for (Asiento asiento:asientos) {
				if (asiento != null) {
					if(registro != asiento.registro) {
						return "Las piezas no son originales";
					}
				}
			}
			return "Auto original";
		} 
		return "Las piezas no son originales";	
	}
}
