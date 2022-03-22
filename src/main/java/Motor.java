package test;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	void asignarTipo (String tipo) {
		if (tipo == "electrico" || tipo == "gasolina")
		{
			if (tipo == "electrico"){
				this.tipo = "electrico";
			}else{
				this.tipo = "gasolina";
			}
		}
		else{
			this.tipo = null;
		}
		
	}
}
