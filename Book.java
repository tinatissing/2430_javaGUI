package eStoreSearch;

class Book extends Product {

	private String publisher;
	private String author;

	public Book( String startID, String startDes, int startYear, String startPrice, String startPub, String startAuthor ) {
		super( startID, startDes, startYear, startPrice );
		publisher = startPub;
		author = startAuthor;
	}

	public Book( Book original ) {
		this( original.productID, original.description, original.year, original.price, original.publisher, original.author );
	}


	public String getPub() {
		return publisher;
	}
	public void setPub( String newValue ) {
		publisher = newValue;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor( String newValue ) {
		author = newValue;
	}

	//@Overrride
	public String toString() {
		return super.toString() + " " + publisher + " " + author;
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
			Book otherBook = ( Book )other;
			
			return super.equals( otherBook ) && publisher == otherBook.publisher && author == otherBook.author;
		}
	}
}
