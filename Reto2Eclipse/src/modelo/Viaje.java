package modelo;

public class Viaje {
	int id;
	String nombre, descripcion, tipoDeViaje, paísDeDestino, serviciosNoIncluidos;
	int duracion;
	
public Viaje() {
}
public Viaje(int id, String nombre, String descripcion, String tipoDeViaje, int duracion, String servicioNoIncluidos ) {
	this.id = id;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.tipoDeViaje = tipoDeViaje;
	this.duracion = duracion;
	this.serviciosNoIncluidos = servicioNoIncluidos;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public String getTipoDeViaje() {
	return tipoDeViaje;
}
public void setTipoDeViaje(String tipoDeViaje) {
	this.tipoDeViaje = tipoDeViaje;
}
public String getPaísDeDestino() {
	return paísDeDestino;
}
public void setPaísDeDestino(String paísDeDestino) {
	this.paísDeDestino = paísDeDestino;
}
public String getServiciosNoIncluidos() {
	return serviciosNoIncluidos;
}
public void setServiciosNoIncluidos(String serviciosNoIncluidos) {
	this.serviciosNoIncluidos = serviciosNoIncluidos;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
}