package ar.edu.unlam.bebida.interfaces;

public interface Bebida {
	
	public abstract Boolean  dispensar();
	public abstract Double obtenerPrecio();
	public abstract void sumarStock();
	public abstract Integer getStock();

}
