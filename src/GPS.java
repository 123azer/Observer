import java.util.ArrayList;
import java.util.List;
public class GPS implements observable {
	
	private String Message;
	private List <observateur> observateurs;
	
	
	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
		notifierObservateurs();
        
	}

	public GPS() {
		this.Message=new String();
		this.observateurs=new ArrayList<>();
	}

	@Override
	public void ajouterObservateur(observateur obj) {
		observateurs.add(obj);
	}

	@Override
	public void supprimerObservateur(observateur obj) {
		observateurs.remove(obj);
	}

	@Override
	public void notifierObservateurs() {
		for (observateur obj : observateurs) {
			obj.actualiser(this);
		}
		
	}
	

}
