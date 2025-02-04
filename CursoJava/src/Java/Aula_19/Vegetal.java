package Java.Aula_19;

public class Vegetal {
	private Boolean vivo;
	private int massa;

	public Vegetal(int massa) {
		this.vivo = true;
		this.massa = massa;
	}

	public Boolean getVivo() {
		return vivo;
	}

	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}

	public int getMassa() {
		return massa;
	}

	public void setMassa(int massa) {
		this.massa = massa;
	}

	public void info() {
		// TODO Auto-generated method stub
		System.out.printf("Tipo......:%s %n", getClass().toGenericString());
		System.out.printf("Vivo......:%s %n", this.vivo ? "Sim" : "Não");
		System.out.printf("Massa.....:%d %n", this.massa);
		System.out.println("---------------");

	}
}
