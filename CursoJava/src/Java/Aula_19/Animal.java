package Java.Aula_19;

abstract class Animal {
	private Boolean vivo;
	private int massa;
	private int x;
	private int y;
	private int velocidade;
	private int forca;

	public Animal(int velocidade, int massa, int forca) {
		this.vivo = true;
		this.massa = massa;
		this.x = 0;
		this.y = 0;
		this.forca = forca;
		this.velocidade = velocidade;

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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public void mover() {
		// TODO Auto-generated method stub
		if (this.vivo == true) {
			this.x = this.x + this.velocidade;
			this.y = this.y + this.velocidade;
		} else {
			System.out.println("------------");
			System.out.println(this.getClass().getSimpleName() + " está morto, não pode mover");
			System.out.println("------------");
		}

	}

	public void comer(int massa) {
		// TODO Auto-generated method stub
		if (this.vivo == true) {
			this.forca = this.forca + massa;
		} else {
			System.out.println("------------");
			System.out.println(this.getClass().getSimpleName() + " está morto, não pode comer");
			System.out.println("------------");
		}
	}

	public void info() {
		// TODO Auto-generated method stub
		System.out.printf("Tipo......:%s %n", this.getClass().getSimpleName());
		System.out.printf("Vivo......:%s %n", this.getVivo() ? "Sim" : "Não");
		System.out.printf("Massa.....:%d %n", this.massa);
		System.out.printf("Velocidade:%d %n", this.velocidade);
		System.out.printf("força.....:%d %n", this.forca);
		System.out.println("---------------");

	}

	public void atacar(Animal a) {
		// TODO Auto-generated method stub
		if (this.vivo == true) {
			if (this.forca > a.forca) {
				this.forca = this.forca + a.massa;
				a.vivo = false;
			} else {
				this.vivo = false;
			}
		} else {
			System.out.println("------------");
			System.out.println(this.getClass().getSimpleName() + " está morto, não pode atacar");
			System.out.println("------------");
		}

	}

}
