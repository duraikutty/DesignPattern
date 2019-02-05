package Principle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

enum Colors{
	RED,GREEN,BLUE;
}

enum Sizes{
	SMALL,MEDIUM,LARGE
}

interface Specification<T>{
	boolean isSatisfied(Products products);
}

interface Filter<T>{
	Stream<T> filter(List<T> items, Specification<T> spec);
}

class ColorSpecification implements Specification<Products>{
	
	private Colors colors;
	
	public ColorSpecification(Colors colors) {
		this.colors = colors;
	}
	
	@Override
	public boolean isSatisfied(Products item) {
		return item.colors == colors;
	}	
}

class SizeSpecification implements Specification<Products>{
	
	private Sizes sizes;
	
	public SizeSpecification(Sizes sizes) {
		this.sizes = sizes;
	}
	
	@Override
	public boolean isSatisfied(Products item) {
		return item.sizes == sizes;
	}	
}

class AndSpecification<T> implements Specification<T>{
	
	private Specification<T> first,second;
	
	public AndSpecification(Specification<T> first, Specification<T> second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean isSatisfied(Products products) {
		return first.isSatisfied(products) && second.isSatisfied(products);
	}	
}


class BetterFilter implements Filter<Products>{

	@Override
	public Stream<Products> filter(List<Products> items, Specification<Products> spec) {
		return items.stream().filter(p->spec.isSatisfied(p));
	}
	
}

class Products{
	String name;
	Colors colors;
	Sizes sizes;
	public Products(String name, Colors colors, Sizes sizes) {
		this.name = name;
		this.colors = colors;
		this.sizes = sizes;
	}
	@Override
	public String toString() {
		return "Products [name=" + name + ", colors=" + colors + ", sizes=" + sizes + "]";
	}
	
}
public class OpenClosePrincipleAdvisable {
	public static void main(String[] args) {
	
		Products apple = new Products("Apple", Colors.RED, Sizes.MEDIUM);
		Products orange = new Products("orange", Colors.RED, Sizes.LARGE);
		Products grape = new Products("grape", Colors.BLUE, Sizes.SMALL);
		Products mango = new Products("mango", Colors.GREEN, Sizes.MEDIUM);
		
		List<Products> productsList = Arrays.asList(apple,orange,grape,mango);
		
	    BetterFilter betterFilter = new BetterFilter();
	    betterFilter.filter(productsList, new ColorSpecification(Colors.GREEN)).forEach(p->System.out.println(p.name +" is green"));
	    
	    betterFilter.filter(productsList, new AndSpecification<>(new ColorSpecification(Colors.RED), new SizeSpecification(Sizes.MEDIUM))).forEach(p->System.out.println(p.name+" is red and medium"));
	}
}
