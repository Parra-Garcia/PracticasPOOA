package pack1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(Operaciones.MULTIPLICACION);
	Operaciones.SUMA.name();
	
	
	for(Operaciones elemento:Operaciones.values()){
		System.out.println(elemento.getValor());
		System.out.println(elemento.name());
	}
	}
	
}
