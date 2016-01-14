package test.rpg.perso;

import java.util.Random;

import test.rpg.engine.console.printer.Log;
import test.rpg.perso.classe.Caracteristique;
import test.rpg.perso.classe.Classe;
import test.rpg.perso.classe.monstre.Rodeur;

public class Entity
{
	public static final int xpMount = 10;
	protected String nom;
	protected int niveau;
	protected int sante;

	protected int santeMax;
	protected Classe classe;
	
	protected Random rand;
	
	public Entity(String nom, int n, Classe classe)
	{
		this.nom = nom;
		niveau = n;
		this.classe = classe;
		calculSanteMax();
		sante = santeMax;
		
		rand = new Random();
	}
	
	public Entity()
	{
		this("Default Entity", 1, new Rodeur());
	}
	
	public Caracteristique getCaracteristique()
	{
		return classe.getCarac();
	}
	
	public void calculSanteMax()
	{
		santeMax = 50 + getCaracteristique().getSante() * niveau;
	}
	
	public String getNom()
	{
		return nom;
	}

	public int getNiveau()
	{
		return niveau;
	}

	public int getSante()
	{
		Log.d("sante " + sante);
		return sante;
	}

	public int getSanteMax()
	{
		Log.d("sante max " + santeMax);
		return santeMax;
	}

	public Classe getClasse()
	{
		return classe;
	}
	
	@Override
	public String toString()
	{
		return "Nom : " + nom + " | Niveau : " + niveau + " | Classe : " + classe.getNom();
	}
	
	public int getXpVal()
	{
		return niveau * Entity.xpMount + rand.nextInt(Entity.xpMount);
	}
}
