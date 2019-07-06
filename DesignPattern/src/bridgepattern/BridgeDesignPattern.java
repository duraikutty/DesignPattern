package bridgepattern;

interface Renderer{
	void rendererCircle(float radius);
}

class VentorRenderer implements Renderer{

	@Override
	public void rendererCircle(float radius) {
		System.out.println("Drawing a circle of radius"+radius);
	}
}

class RasterRenderer implements Renderer{

	@Override
	public void rendererCircle(float radius) {
		System.out.println("Drawing pixels for a circle "+radius);
	}
	
}

abstract class Shape{
	public abstract void draw();
	public abstract void resize(float factor);
	protected Renderer renderer;
	public Shape(Renderer renderer) {
		this.renderer = renderer;
	}
}

class Circle extends Shape{
	public float radius;
	
	public Circle(Renderer renderer) {
		super(renderer);
	}
	
	public Circle(Renderer renderer, float radius) {
		super(renderer);
		this.radius = radius;
	}



	@Override
	public void draw() {
		renderer.rendererCircle(radius);
	}

	@Override
	public void resize(float factor) {
		radius  = radius * factor;
	}
	
}

public class BridgeDesignPattern {
	public static void main(String[] args) {
		

	}
}