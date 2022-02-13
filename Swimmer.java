class Swimmer implements Comparable<Swimmer>
{
	//code for methods not shown
	private int ht;
	private int wt;
	private int age;
	public Swimmer() {
		this.ht = 0;
		this.wt = 0;
		this.age = 0;
		
	}
	public Swimmer(int ht, int wt, int age) {
		this.ht = ht;
		this.wt = wt;
		this.age = age;
	}
	public void setWeight(int wt) {
		this.wt = wt;
	}
	public void setHeight( int ht) {
		this.ht = ht;
	}
	public void setAge( int age) {
		this.age = age;
	}
	public Object clone() {
		return this;
	}
	public int getWeight() {
		return this.wt;
	}
	public int getHeight() {
		return this.ht;
	}
	public int getAge() {
		return this.age;
	}
	public boolean equals( Object o ) {
		if(o instanceof Swimmer == false) {
			return false;
		}
		else
		return this.compareTo((Swimmer)o)==0;
	}
	public int compareTo( Swimmer rhs ) {
		int compareHeight = ((Swimmer) rhs).getHeight();
		int compareWeight = ((Swimmer) rhs).getWeight();
		int compareAge = ((Swimmer) rhs).getAge(); 
		if(this.getHeight() > compareHeight)
			return 1;
		else if(this.getHeight() == compareHeight) {
			if(this.getWeight() > compareWeight)
				return 1;
			else if(this.getWeight() == compareWeight) {
				if(this.getAge() > compareAge)
					return 1;
				else if(this.getAge() == compareAge)
					return 0;
				else return -1;
			}
			else return -1;
		}
		else return -1; 
	}
	public String toString() {
		return ht + "" + wt + "" + age;
	}
}