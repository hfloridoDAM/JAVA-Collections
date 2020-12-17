
public class Cuenta {
	
	private String nombre;
	private int numCuenta;
	private float saldo;
	
	public Cuenta (String nombre, int numCuenta, float saldo) {
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", numCuenta=" + numCuenta
				+ ", saldo=" + saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numCuenta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numCuenta != other.numCuenta)
			return false;
		return true;
	}
	
	
}
