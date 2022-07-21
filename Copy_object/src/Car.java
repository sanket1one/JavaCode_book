
public class Car {
	private String make;
	private String model;
	private int year;
	
	Car(String make,String model, int year)
	{
//		this.make = make;
//		this.model = model;
//		this.year = year;
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	Car(Car x){
		this.copy(x);
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public void copy(Car x)
	{
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
}
