public class SingletonClass {

	private static SingletonClass instance;
	
	public synchronized static SingletonClass getInstance() {
		if(instance == null) {
			instance = new SingletonClass();
			System.out.println("Object created...!");
		} else {
			System.out.println("Object already exists.");
		}
		return instance;
	}
	public void message(String str) {
		System.out.println("Message function called, Hello "+str);
	}
}
public class SingletonClassMain {

	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		obj1.message("Pradeep");
		obj2.message("Kumar");
	}
}
