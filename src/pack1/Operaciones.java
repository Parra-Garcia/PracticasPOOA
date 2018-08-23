package pack1;

public enum Operaciones {
	SUMA('+'), RESTA('-'), MULTIPLICACION('*'), DIVISION('/') //variables declaradas
	
	private String valor;
	
	Operaciones(String valor){ //no ponerle al construcctor identificadores de acceso ya que no se pueden hacer objetos de el
		 this.valor = valor;
		 
	}
	public String getValor(){
		return this.valor;
	}
}
