package modelo;

import java.time.LocalDate;

public class Alojamiento {
	String nombreHotel, ciudad, tipoHabitacion;
	double precio;
	LocalDate fechaEntrada, fechaSalida;
	
	public Alojamiento() {
		
	}
	public Alojamiento(String nombreHotel, String ciudad, Double precio, LocalDate fechaEntrada, LocalDate fechaSalida, String tipoHabitacion) {
		this.nombreHotel = nombreHotel;
		this.ciudad = ciudad;
		this.precio = precio;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.tipoHabitacion = tipoHabitacion;
	}
	
	

}
