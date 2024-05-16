package Figuras;

import java.util.ArrayList;
import java.util.List;

public class Dibujo2D extends Figuras {
	
	//atributos
	private List<Figuras> dibujo;
	
	//constructor
	public Dibujo2D() {
		this.dibujo= new ArrayList<Figuras>();
	}
	public Dibujo2D(Figuras figura) {
		this.dibujo= new ArrayList<Figuras>();
	}
	
	//setters and getters
	public List<Figuras> getDibujo(){
		return dibujo;
	}
	
	//metodos
	public void agregarFigura(Figuras f) {
		dibujo.add(f);
	}
	
	@Override
	public double calcularArea() {
		double totalArea= 0;
		
		for(Figuras i: dibujo) {
			totalArea += i.calcularArea();
		}
		return totalArea;
	}

	@Override
	public double calcularPerimetro() {
            double totalPerimetro= 0;
		
		for(Figuras i: dibujo) {
			totalPerimetro += i.calcularPerimetro();
		}
		return totalPerimetro;
	}

	@Override
	public String toString() {
		return this.dibujo.toString();
	}
	
	public void imprimirDibujo() {
		for(Figuras i: this.dibujo) {
			System.out.println(i.getTipoFigura()+", "+i);
		}
	}

}
