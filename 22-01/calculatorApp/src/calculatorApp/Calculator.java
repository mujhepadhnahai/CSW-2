package calculatorApp;

public class Calculator {
	
	int a;
	int b;
    int result ;
	Calculator(){
		this.result = 0;
	}
	Calculator(int a, int b){
	   this.a = a;
	   this.b = b;
	}
	public void add(int a, int b) {
		this.result = a+b;
	}
	public void sub(int a, int b) {
		this.result = a-b;
	}
	public void multi(int a, int b) {
		this.result = a*b;
	}
	public void div(int a, int b) {
		if (b != 0) {
			this.result = a / b;
		} else {
			System.out.println("Error: Division by zero.");
			this.result = 0;
		}
	}
	void result() {
		 System.out.println("the answer is : "+result);
	}
}
