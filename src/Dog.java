
public class Dog {
String name;
	public static void main(String[] args) {
		// create dog object
		Dog dog1= new Dog();
		dog1.name="Bart";
		//dog1.bark();
		//now make a Dog array
		Dog[] myDogs=new Dog[3];
		myDogs[0]=new Dog();
		myDogs[1]=new Dog();
		myDogs[2]=dog1;
		myDogs[0].name="johny";
		myDogs[1].name="killer";
		System.out.println("Last dog name is  "+myDogs[2].name);
int x=0;
while(x<myDogs.length)
{
	myDogs[x].bark();
	x=x+1;
}

	}
public void bark()
  {
System.out.println(name+" says ruff!");	
  }
}

