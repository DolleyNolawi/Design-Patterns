package chainofresponsiblitypatten;

public class Addnum implements Chain{

	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getCalcWanted().equals("add")){
			int sum = request.getNumber1() + request.getNumber2();
			System.out.println("the sum is " + sum);
		}else{
			nextChain.calculate(request);
		}		
	}

}
