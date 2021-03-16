/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Calzado.
 * 
 * @author emman
 */
public class Calzado {

	/**
	 * Description of the property clave.
	 */
	private int clave = 0;

	/**
	 * Description of the property material.
	 */
	private String material = "";

	/**
	 * Description of the property troquel.
	 */
	private String troquel = "";

	/**
	 * Description of the property numCalzado.
	 */
	private float numCalzado = 0F;

	/**
	 * Description of the property numxLote.
	 */
	private int numxLote = 0;

	/**
	 * Description of the property costoxPar.
	 */
	private float costoxPar = 0F;

	/**
	 * Description of the property colores.
	 */
	private String colores = "";

	// Start of user code (user defined attributes for Calzado)

	// End of user code

	/**
	 * The constructor.
	 */
	public Calzado() {
		// Start of user code constructor for Calzado)
		super();
		// End of user code
	}
	
	public Calzado(int clave, String material, String troquel, float numCalzado, int numxLote, float costoxPar,
			String colores) {
		super();
		this.clave = clave;
		this.material = material;
		this.troquel = troquel;
		this.numCalzado = numCalzado;
		this.numxLote = numxLote;
		this.costoxPar = costoxPar;
		this.colores = colores;
	}

	/**
	 * Description of the method cantProdxDia.
	 * @param costoxLote 
	 * @param costoxUnidad 
	 * @return 
	 */
	public float cantProdxDia(float costoxLote, float costoxUnidad) {
		// Start of user code for method cantProdxDia
		float cantProdxDia = 0F;
		return cantProdxDia;
		// End of user code
	}

	// Start of user code (user defined methods for Calzado)

	// End of user code
	/**
	 * Returns clave.
	 * @return clave 
	 */
	public int getClave() {
		return this.clave;
	}

	/**
	 * Sets a value to attribute clave. 
	 * @param newClave 
	 */
	public void setClave(int newClave) {
		this.clave = newClave;
	}

	/**
	 * Returns material.
	 * @return material 
	 */
	public String getMaterial() {
		return this.material;
	}

	/**
	 * Sets a value to attribute material. 
	 * @param newMaterial 
	 */
	public void setMaterial(String newMaterial) {
		this.material = newMaterial;
	}

	/**
	 * Returns troquel.
	 * @return troquel 
	 */
	public String getTroquel() {
		return this.troquel;
	}

	/**
	 * Sets a value to attribute troquel. 
	 * @param newTroquel 
	 */
	public void setTroquel(String newTroquel) {
		this.troquel = newTroquel;
	}

	/**
	 * Returns numCalzado.
	 * @return numCalzado 
	 */
	public float getNumCalzado() {
		return this.numCalzado;
	}

	/**
	 * Sets a value to attribute numCalzado. 
	 * @param newNumCalzado 
	 */
	public void setNumCalzado(float newNumCalzado) {
		this.numCalzado = newNumCalzado;
	}

	/**
	 * Returns numxLote.
	 * @return numxLote 
	 */
	public int getNumxLote() {
		return this.numxLote;
	}

	/**
	 * Sets a value to attribute numxLote. 
	 * @param newNumxLote 
	 */
	public void setNumxLote(int newNumxLote) {
		this.numxLote = newNumxLote;
	}

	/**
	 * Returns costoxPar.
	 * @return costoxPar 
	 */
	public float getCostoxPar() {
		return this.costoxPar;
	}

	/**
	 * Sets a value to attribute costoxPar. 
	 * @param newCostoxPar 
	 */
	public void setCostoxPar(float newCostoxPar) {
		this.costoxPar = newCostoxPar;
	}

	/**
	 * Returns colores.
	 * @return colores 
	 */
	public String getColores() {
		return this.colores;
	}

	/**
	 * Sets a value to attribute colores. 
	 * @param newColores 
	 */
	public void setColores(String newColores) {
		this.colores = newColores;
	}

	@Override
	public String toString() {
		return "Calzado [clave=" + clave + ", material=" + material + ", troquel=" + troquel + ", numCalzado="
				+ numCalzado + ", numxLote=" + numxLote + ", costoxPar=" + costoxPar + ", colores=" + colores + "]";
	}

}
