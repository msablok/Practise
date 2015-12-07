
public class GoodDogTestDrive {

	public static void main(String[] args) {
		GoodDog dog=new GoodDog();
		dog.setSize(70);
		GoodDog dog1=new GoodDog();
		dog1.setSize(35);
System.out.println("Dog one: "+ dog.getSize());
System.out.println("Dog two: "+ dog1.getSize());
dog.bark();
dog1.bark();
	}

}
