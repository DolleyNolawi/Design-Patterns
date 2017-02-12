package chainofresponsiblitypatten;

public class Subnum implements Chain {
    
	private Chain nextChain;
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalcWanted() == "sub"){
			System.out.println("This is the Div result:  "+ (request.getNumber1() - request.getNumber2()));
		}else{
			nextChain.calculate(request);
		}
	}

}
