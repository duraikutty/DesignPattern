package Principle;
//This is normal implemention. But, This is not advisable
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

enum Color{
	RED,BLUE,GREEN
}

enum Size{
	SMALL,MEDIUM,LARGE
}

class Product{
	String name;
	Color color;
	Size size;
	public Product(String name, Color color, Size size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
}

class ProductFilter{
	public Stream<Product> filterByColor(List<Product> products,Color color){
		return products.stream().filter(p->p.color == color);
	}
	
	public Stream<Product> filterBySize(List<Product> products,Size size){
		return products.stream().filter(p->p.size == size);
	}
	
	public Stream<Product> filterBySizeAndColor(List<Product> products,Size size,Color color){
		return products.stream().filter(p->p.size == size && p.color == color);
	}
}
public class OpenClosePrincipleNotAdvisable {
	public static void main(String[] args) {
	Product apple = new Product("Apple", Color.RED, Size.MEDIUM);
	Product orange = new Product("orange", Color.RED, Size.LARGE);
	Product grape = new Product("grape", Color.BLUE, Size.SMALL);
	Product mango = new Product("mango", Color.GREEN, Size.MEDIUM);
	
	List<Product> products  = Arrays.asList(apple,orange,grape,mango);
	ProductFilter pf = new ProductFilter();
	pf.filterByColor(products, Color.BLUE).forEach(p->System.out.println(p.name + " is green"));
	
	}
}
