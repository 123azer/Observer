
public class Ordinateur implements observateur {
	
	GPS observable;
	public Ordinateur() {
		super();
		
	}

	@Override
	public void actualiser(observable o) {
		if(o instanceof GPS){
		observable=(GPS) o;
		System.out.println("Ordinateur "+observable.getMessage());
		}
	}

}
