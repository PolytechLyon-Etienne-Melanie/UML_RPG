package test.rpg.perso.competence;

import test.rpg.perso.Personnage;

public class Attaque implements Capacite {

	@Override
	public float probaReussite(Personnage src) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void effet(Personnage cible, Personnage src) {
		// TODO Auto-generated method stub
	}
	
	public String getName()
	{
		return "Attaque";
	}
}
