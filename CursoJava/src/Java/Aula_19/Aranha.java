package Java.Aula_19;

public class Aranha extends Animal {
	private int veneno;

	public Aranha(int velocidade, int massa, int forca, int veneno) {
		super(velocidade, massa, forca);
		// TODO Auto-generated constructor stub
		this.veneno = veneno;
	}

	public void atacar(Animal a) {
		if (this.getVivo() == true) {
			if (this.getForca() <= a.getForca()) {
				this.setForca(getForca() + a.getMassa());
			}

			if ((this.getForca() + getVeneno()) > a.getForca()) {
				this.setMassa(this.getMassa() + a.getMassa());
				a.setVivo(false);
			} else {
				setVivo(false);
			}
		} else {
			System.out.println("---------------------------");
			System.out.println(getClass().toGenericString() + " está morto, impossivel atacar!");
			System.out.println("---------------------------");
		}
	}

	public int getVeneno() {
		return veneno;
	}

	public void setVeneno(int veneno) {
		this.veneno = veneno;
	}
	
	

}
