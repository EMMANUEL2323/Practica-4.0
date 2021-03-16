/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import clases.ito.poo.Ubicacion;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuerpoCeleste.
 * 
 * @author emman
 */
public class CuerpoCeleste {


	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";

	/**
	 * Description of the property localizaciones.
	 */
	private HashSet<Ubicacion> localizaciones = new HashSet<Ubicacion>();

	/**
	 * Description of the property composicion.
	 */
	private String composicion = "";

	// Start of user code (user defined attributes for CuerpoCeleste)

	// End of user code

	/**
	 * The constructor.
	 */
	public CuerpoCeleste() {
		// Start of user code constructor for CuerpoCeleste)
		super();
		// End of user code
	}
	
	public CuerpoCeleste(String nombre, HashSet<Ubicacion> localizaciones, String composicion) {
		super();
		this.nombre = nombre;
		this.localizaciones = localizaciones;
		this.composicion = composicion;
	}
	
	// Start of user code (user defined methods for CuerpoCeleste)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns localizaciones.
	 * @return localizaciones 
	 */
	public HashSet<Ubicacion> getLocalizaciones() {
		return this.localizaciones;
	}

	/**
	 * Returns composicion.
	 * @return composicion 
	 */
	public String getComposicion() {
		return this.composicion;
	}

	/**
	 * Sets a value to attribute composicion. 
	 * @param newComposicion 
	 */
	public void setComposicion(String newComposicion) {
		this.composicion = newComposicion;
	}

	@Override
	public String toString() {
		return "CuerpoCeleste [nombre=" + nombre + ", localizaciones=" + localizaciones + ", composicion=" + composicion
				+ "]";
	}

}
