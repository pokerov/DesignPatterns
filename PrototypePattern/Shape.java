public abstract class Shape implements Cloneable {

	private String id;
	protected String type; // Visible for all successors but for package only
	
	abstract void draw();
	
	public String getType() {
		return type;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	// Custom implementation of clone() method which you can see is
	// inherited by super (parent) class and it is same
	
	@Override public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		}
		catch (CloneNotSupportedException e) {
			System.err.println("Clone not supported. " + e.getMessage());
		}
		return clone;
	}
}