
public interface Stack<T> {
	public boolean isEmpty();
	public void makeEmpty();
	public T top();
	public void pop();
	public T topAndPop();
	public void push(T x);
}
