package come.rk.housedesign;

public class House1 implements HouseDesign {
	@Override
	public void rooms() {
		System.out.println("3 bedrooms 1 livingroom");
		
	}
	@Override
	public void bathrooms() {
		System.out.println("2 bathrooms");
	}
	@Override
	public void woodenflooring() {
		System.out.println("No woodenflooring");
	}
	@Override
	public void marbleflooring() {
		System.out.println(" Italian Marble floor");
	}
	@Override
	public void backyard() {
		System.out.println("500sqft backyard");
		
	}
	

}
