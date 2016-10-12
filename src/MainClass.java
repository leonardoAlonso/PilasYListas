import java.util.Scanner;

public class MainClass {

	private static int pos;
	private static Scanner e;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack<Integer> a = new ArrayStack<>();
		ListaEnlazada<Integer>b = new ListaEnlazada<>();
		long TInicio,Tfin,tiempo;
		e = new Scanner(System.in);
		System.out.println("Insertar datos en pila");
		TInicio = System.currentTimeMillis();
		
		for(int i = 0; i <= 100000; i++){
			a.push(i);
		}
		
		Tfin = System.currentTimeMillis();
		tiempo = Tfin-TInicio;
		System.out.println("El tiempo que tardo en insertarse datos en la pila fue: " + tiempo + " milisegundos\n");
		
		System.out.println("El ultimo elemento es: "+a.topAndPop());
		System.out.println("La pila esta vacia?: "+a.isEmpty());
		System.out.println("El tamano de la pila es: " + a.top() + "\n");
		
		System.out.println("Insertar datos en lista");
		TInicio = System.currentTimeMillis();
		
		for(int i = 0; i <= 100000; i++){
			b.insertarPrimero(i);
		}
		
		Tfin = System.currentTimeMillis();
		tiempo = Tfin-TInicio;
		
		System.out.println("El tiempo que tardo en insertarse datos en la lista fue: " + tiempo + " milisegundos \n");
		
		System.out.println("El ultimo elemento de la lista es: " + b.devolverUltimo());
		System.out.println("El primer elemento de la lista es: " + b.devolverPrimero());
		System.out.println("La lista esta vacia?: " + b.estaVacia());
		System.out.println("El tamano de la lista es: " + b.Num() + "\n");
		
		System.out.print("Ingresa una pocicion para buscar en la lista: ");
		pos = e.nextInt();
		System.out.println();
		System.out.println("El dato en la pocicion indicada es: " + b.devolverDato(pos));
	}

}
