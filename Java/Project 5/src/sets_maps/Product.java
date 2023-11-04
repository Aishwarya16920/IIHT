package sets_maps;

import java.util.Objects;

public class Product {
		// TODO Auto-generated method stub
		
		private String name;
		private String category;
		
		public Product(String name, String category) {
			this.name = name;
			this.category = category;
		}
		
		public String toString() {
			return String.format("\n{name=%s, category=%s}", name, category);
		}
		
		public boolean equals(Object other) {
			if(other == null) {
				return false;
			}
			if(!(other instanceof Product)) {
				return false;
			}
			
			Product otherProduct = (Product) other;
			
			if((otherProduct.name.equals(this.name)) &&  (otherProduct.category.equals(this.category))) {
				return true;
			}
			
			return false;
		}
		
		public int hashCode() {
			return Objects.hash(name, category);
		}
}
