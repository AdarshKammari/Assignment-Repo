

public class gitClass {int x,y,a,b;
private String name ="Encapsulation" ;
public String Name="Inheritance";
public void type() {
	if (x == y) {
		System.out.println("There is no information about this class's inhertance"+" "+ "This class is " +name);
	}
	else {
		System.out.println("The Class got Inherited"+" "+Name);
	}
}
public void newmethod() {
	
	if(a!=b) {
		System.out.println("Message here");
		
	}
}
public void amethod() {
	//this is also a method.//
	//for committing//
	System.out.println("message here");
}
public void second() {
	//second commit//
	System.out.println("new Message");
}

public void mergemethod() {
	//this is a method used for merging.//


}


public static void main(String[] args) {
	gitClass obj = new gitClass();
	obj.type();

}

}
