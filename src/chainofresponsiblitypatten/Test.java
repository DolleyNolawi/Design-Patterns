package chainofresponsiblitypatten;

public class Test {

	public static void main(String[] args) {
		
		Subnum sub = new Subnum();
		Addnum add = new Addnum();
		Divnum div = new Divnum();
		
		sub.setNextChain(add);	
		add.setNextChain(div);
		
		Numbers num = new Numbers(2, 3, "div");
		
		sub.calculate(num);
	}

}
