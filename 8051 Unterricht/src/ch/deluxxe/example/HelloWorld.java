package ch.deluxxe.example;

public class HelloWorld {
	// Instance variables
	private String privStr = "Nothing";
	public String pubStr;

	// Constructor
	public HelloWorld() {
		Output();
	}
	public HelloWorld(String towrite) {
		privStr = towrite;
		Output();
	}
	//Setter
	public void setOutput(String towrite){
		this.privStr = towrite;
	}
	//Getter
	public String getOutput(){
		return privStr;
	}
	//Methods
	private String Output(){
		System.out.println(this.privStr);
		return this.privStr;
	}
	public void main(){
		Output();
	}
	//@Test
	public void testHelloWorld(){
		HelloWorld testa = new HelloWorld("TestString");
		testa.main();
	}
	

}
