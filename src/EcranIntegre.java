
public class EcranIntegre implements observateur {
	GPS observable;
	public EcranIntegre() {
		super();
		
	}

	@Override
	public void actualiser(observable o) {
		if(o instanceof GPS){
		observable=(GPS) o;
		System.out.println("EcranIntegre "+ observable.getMessage());
		}
	}

}
