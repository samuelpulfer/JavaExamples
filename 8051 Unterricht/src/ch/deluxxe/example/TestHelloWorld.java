package ch.deluxxe.example;

public class TestHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld a = new HelloWorld("Hello World");
		a.main();
		a.setOutput("Hello Moon");
		a.main();
		System.out.println(a.getOutput());
		
	}
	
	public void testMain(){
		System.out.println("test");
	}

}
