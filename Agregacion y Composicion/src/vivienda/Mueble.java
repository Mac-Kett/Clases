package vivienda;

public class Mueble {

	private String material;
	private String nombre;
	private String color;
	
	public Mueble (String material, String nom, String color) {
		setMaterial(material);
		setNombre(nom);
		setColor(color);
	}
	
	public String getMaterial() {
		return material;
	}
	private void setMaterial(String material) {
		this.material = material;
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	private void setColor(String color) {
		this.color = color;
	}
	
	
	
}
