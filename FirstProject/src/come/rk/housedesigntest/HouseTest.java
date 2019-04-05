package come.rk.housedesigntest;

import java.util.Scanner;
import come.rk.housedesign.*;

public class HouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter name:");
		Scanner sc = new Scanner(System.in);
		String customername = sc.nextLine();
		
		if( customername.equals("")) {
			//Replace this woth custom excption
			System.out.println("You can't proceed without name. So plz enter:");
		}
		else if(customername.equalsIgnoreCase("q")) {
			System.out.println("Exit");
			System.exit(1);
			
			
		}
		 
			System.out.println("welcome :"+customername);
		
		House1 hc = new House1();
		hc.backyard();
		System.out.println("Thank you " + customername + " Your ID is " +  HouseDesign.ID);
		sc.close();

	}

}