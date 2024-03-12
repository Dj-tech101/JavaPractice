package abstractionEcoomerce;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class shoppingImp  implements shoppingCartApp{

	{
		System.out.println("WELCOME TO "+shoppingCartApp.shopName);
	}
	
	List<product>proList;
	
	
	public shoppingImp() {
		super();
		this.proList = new ArrayList<product>();
		
	}

	@Override
	public void addItems(product pro) {
		// TODO Auto-generated method stub
		
		proList.add(pro);
		
		
	}

	@Override
	public void removeItems(product pro) {
		// TODO Auto-generated method stub
		proList.remove(pro);
		
		
	}

	@Override
	public double calculateTotal() {
		
		double total = 0;
		
		for (product item : proList) {
			
			total+=item.getPrice();
			
		}
		
		
		return total;
	}

}
