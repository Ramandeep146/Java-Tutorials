package generics_Tutorial;

public class MyGenericClass <T1,T2>{
	
	private T1 x;
	private T2 y;
	
	MyGenericClass(T1 x, T2 y){
		this.x = x;
		this.y = y;
	}
	
	public T1 getValue1() {
		return x;
	}
	
	public T2 getValue2() {
		return y;
	}

}
