package association;

import java.util.ArrayList;
import java.util.List;

public class building  {

	
	List<oneBhk>bhkOne;
	List<twoBhkRoom>bhkTwo;
	List<threeBhkRoom>bhkThree;
	List<String>popFirstFloor;
	
	
	public void setDesign() {
		
		oneBhk firstFloor101= new oneBhk("plastic");
		
		oneBhk firstFloor102= new oneBhk("plastic+mitthi");
		
		oneBhk firstFloor103= new oneBhk("plastic+steel");
		
		oneBhk firstFloor104= new oneBhk("plastic+meethi +steel");
		
		oneBhk firstFloor105= new oneBhk("plastic+goldy");
		
//		
//		twoBhkRoom secondFloor201= new twoBhkRoom("IronRod");
//		
//		twoBhkRoom secondFloor202= new twoBhkRoom("IronRod+plastic");
//		
//		
//		threeBhkRoom thirdFloor301= new threeBhkRoom("Gold");
//		threeBhkRoom thirdFloor302= new threeBhkRoom("Gold+plastic");
		   
		
		bhkOne= new ArrayList<oneBhk>();

		bhkOne.add(firstFloor105);
		
		bhkOne.add(firstFloor101);
		
		
//		popFirstFloor= new ArrayList<String>();
//		
//		for (int i = 0; i < popFirstFloor.size(); i++) {
//			
//			popFirstFloor.add(bhkOne.get(i).getDesign());
//			
//			System.out.println(bhkOne.get(i).getDesign());
//		}
		 
	}
	
	public void getPopDetails() {
		
		for (oneBhk obj : bhkOne) {
			
			
			System.out.println(obj.getDesign());
		}
		
	}
}
