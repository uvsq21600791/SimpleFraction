package simpleFraction;

public class Fraction {
	public int nominateur;
	public int denominateur;
	
	public Fraction() {
		this.nominateur = 0;
		this.denominateur =1;
	}
	
	public Fraction(int nominateur, int denominateur) {
		this.nominateur = nominateur;
		this.denominateur = denominateur;
	}
	
	public String toString() {
		return this.nominateur +"/"+this.denominateur;
	}
}