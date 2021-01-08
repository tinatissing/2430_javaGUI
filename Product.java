package eStoreSearch;

class Product {

	protected String productID;
	protected String description;
	protected int year;
	protected String price;

	public Product( String startID, String startDes, int startYear, String startPrice ) {
		/*if( startID.equals( null ) || startDes.equals( null ) || startYear.equals( null ) ) {
			System.out.println( "Fatal error creating product." );
		}*/
		productID = startID;
		description = startDes;
		year = startYear;
		price = startPrice;
	}
	public Product( Product originalObject ) {
		productID = originalObject.productID;
		description = originalObject.description;
		year = originalObject.year;
		price = originalObject.price;
	}

	public String getID() {
		return productID;
	}
	public void setID( String productID ) throws Exception {
		if( productID.isEmpty() == false ) {
			this.productID = productID;
		}
		else {
			throw new Exception( "Fatal error: must provide value for ProductID" );
		}
	}
	public String getDes() {
		return description;
	}
	public void setDes( String description ) throws Exception {
		if( description.isEmpty() == false ) {
			this.description = description;
		}
		else {
			throw new Exception( "Fatal error: must provide description." );
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear( int year ) throws Exception {
		if( year <= 9999 || year >= 1000 ) {
			this.year = year;
		}
		else {
			throw new Exception( "Fatal error: must provide year within range." );
		}
	}
	public String getPrice() {
		return price;
	}
	public void setPrice( String newValue ) {
		price = newValue;
	}

	public String toString() {
		return productID + " " + description + " " + year + " " + price;
	}

	public boolean equals( Object other ) {
		if( other == null ) {
			return false;
		}
		else if( getClass() != other.getClass() ) {
			return false;
		}
		else {
			Product otherProduct = ( Product )other;

			return productID.equals( otherProduct.productID ) && description.equals( otherProduct.description ) && year == otherProduct.year && price.equals( otherProduct.price );
		}
	}
}

