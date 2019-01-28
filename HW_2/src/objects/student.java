package objects;

public class student {
	
	public String name;
	
	public int PanID;
	
	public double cGPA;
	
	public student(String name, int PanID, double cGPA) {
		this.name = name;
		this.PanID = PanID;
		this.cGPA = cGPA;
	}
	
	public student(student st) {
		this.name = st.name;
		this.PanID = st.PanID;
		this.cGPA = st.cGPA;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(int PanID) {
		this.PanID = PanID;
	}
	
	public void setGPA(double cGPA) {
		this.cGPA = cGPA;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.PanID;
	}
	
	public double getGPA() {
		return cGPA;
	}
	@Override
	public String toString() {
		return "Name: " + name + "	Panther ID: " + PanID + "	Cumulative GPA: " + cGPA;
	}
}
