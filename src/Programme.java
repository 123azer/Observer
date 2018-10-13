
public class Programme {

	public static void main(String[] args) {
		
		GPS g=new GPS();
		
		EcranIntegre ec=new EcranIntegre();
		Ordinateur or = new Ordinateur();
		
		//'On'ajoute'l’écran'integré'comme'observeur'de'Gps.'
		g.ajouterObservateur(ec);
		
		//'On'simule'l'arrivée'de'nouvelles'valeurs'via'des'capteurs.'
		g.setMessage("N'39°59°993'/'W'123°00°000");
		
		//'On'ajoute'un'ordinateur'distant'comme'observeur'de'Gps.'
		g.ajouterObservateur(or);
		
		//'Nouvelle'simulaGon'd'arrivée'de'nouvelles'valeurs'via'des'capteurs.'
		g.setMessage("N'37°48°898'/'W'124°12°011");

	}

}
