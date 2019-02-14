package Principle;


class Rectangle{
	protected int length,breath;
	
	public Rectangle() {}
	
	public Rectangle(int length, int breath) {
		this.length = length;
		this.breath = breath;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}
	
	public int gtArea() {
		return length * breath;
	}
	
}

class Square extends Rectangle{

	public Square() {
	  }

	  public Square(int size) {
	    breath = length = size;
	  }
	
	@Override
	public void setBreath(int size) {
		super.setBreath(size);
		super.setLength(size);
	}
	
	@Override
	public void setLength(int size) {
		super.setLength(size);
		super.setBreath(size);
	}
	
}

public class LiskovSubstitutionPrincipleDemo {

	public static void main(String[] args) {
		

	}
}
