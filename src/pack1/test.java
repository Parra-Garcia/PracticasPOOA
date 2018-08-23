package pack1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(Operaciones.MULTIPLICACION);
	Operaciones.SUMA.name();
	Operaciones.RESTA.name();
	
	for(Operaciones elemento:Operaciones.values()){
		System.out.println(elemento.getValor());
		
	}
	}
	
}
