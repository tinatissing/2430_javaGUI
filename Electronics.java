package eStoreSearch;

class Electronics extends Product {

	private String maker;

	public Electronics( String startID, String startDes, int startYear, String startPrice, String startMaker ) {
		super( startID, startDes, startYear, startPrice );
		maker = startMaker;
	}
	public Electronics( Electronics original ) {
		this( original.productID, original.description, original.year, original.price, original.maker );
	}

	public String getMaker() {
		return maker;
	}
	public void setMaker( String newValue ) {
		maker = newValue;
	}

	//@Overrride
	public String toString() {
		return super.toString() + " " + maker;
	}

	//@Override
	public boolean equals( Object other ) {
		if( other == null ) {
			return false;
		}
		else if ( getClass() != other.getClass() ) {
			return false;
		}
		else {
			Electronics otherElec = ( Electronics )other;
			
			return super.equals( otherElec ) && maker  == otherElec.maker;
		}
	}
}

