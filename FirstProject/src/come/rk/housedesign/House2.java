package come.rk.housedesign;

public class House2 implements HouseDesign{
	
	@Override
	public void rooms() {
		System.out.println("5 bedrooms 1 living room");
	}
	@Override
	public void bathrooms() {
		System.out.println("4 bathrooms");
	}
	@Override
	public void woodenflooring() {
		System.out.println("Yes");
	}
	@Override
	public void marbleflooring() {
		System.out.println("No marble");
	}
	@Override
	public void backyard() {
		System.out.println("1000sqft backyard");
	}

}
