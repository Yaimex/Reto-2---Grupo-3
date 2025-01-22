package modelo;

public class Agencia {
	int id;
	String nombre, logo, colorDeMarca, tipoDeAgencia, contraseña;
	int numEmpleados;

public Agencia() {
	
}
public Agencia(int id, String nombre, String logo, String colorDeMarca, int numEmpleados, String tipoDeAgencia, String contraseña ) {
	this.id = id;
	this.nombre = nombre;
	this.logo = logo;
	this.colorDeMarca = colorDeMarca;
	this.numEmpleados = numEmpleados;
	this.tipoDeAgencia = tipoDeAgencia;
	this.contraseña = contraseña;
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
public String getLogo() {
	return logo;
}
public void setLogo(String logo) {
	this.logo = logo;
}
public String getColorDeMarca() {
	return colorDeMarca;
}
public void setColorDeMarca(String colorDeMarca) {
	this.colorDeMarca = colorDeMarca;
}
public String getTipoDeAgencia() {
	return tipoDeAgencia;
}
public void setTipoDeAgencia(String tipoDeAgencia) {
	this.tipoDeAgencia = tipoDeAgencia;
}
public String getContraseña() {
	return contraseña;
}
public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}
public int getNumEmpleados() {
	return numEmpleados;
}
public void setNumEmpleados(int numEmpleados) {
	this.numEmpleados = numEmpleados;
}
}
