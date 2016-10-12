import java.util.ArrayList;

//Clase Array Stack

//Construccion:  Sin inicializar

/**
 * Operaciones publicas
 * void push(x)   		--> insertar x
 * void pop()     		--> extraer el elemento mas recientemente insertado
 * AnyType top()  		--> devolver el elemento mas reciente 
 * AnyType topAndPop() 	--> devolver y extraer el elemento mas reciente
 * boolean isEmpy()		--> devolder true si vacia; en caso contrario false
 * void makeEmpy()		--> extraer todos los elementos
 **/
//top, pop, o topAndPop con una pila vacia
public class ArrayStack<AnyType> implements Stack<AnyType> {
	private ArrayList<AnyType>a;
	private int topOfStack;
	
	public ArrayStack(){
		a = new ArrayList<AnyType>();
		topOfStack = -1;
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return topOfStack == -1;
	}

	@Override
	public void makeEmpty() {
		// TODO Auto-generated method stub
		topOfStack = -1;
	}

	@Override
	public AnyType top() {
		if(isEmpty())
			return null;
		return a.get(topOfStack);
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(!isEmpty())
			topOfStack--;
		
	}

	@Override
	public AnyType topAndPop() {
		// TODO Auto-generated method stub
		if(isEmpty())
			return null;
		return a.get(topOfStack--);
	}

	@Override
	public void push(AnyType x) {
		// TODO Auto-generated method stub
		if(topOfStack + 1 == a.size())
			a.add(x);
		++topOfStack;
		
	}

}
