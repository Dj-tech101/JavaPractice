package association2;

public class sales extends staff {

	
	int  ot;

	public sales(String name, String address, long mob, int ot) {
		super(name, address, mob);
		this.ot = ot;
	}

	@Override
	public String toString() {
		return "purchase [ot=" + ot + "]";
	}

	public int getOt() {
		return ot;
	}

	public void setOt(int ot) {
		this.ot = ot;
	}

	@Override
	public double earning(double amount) {
		// TODO Auto-generated method stub
		return amount+=ot;
		
		
		
	}
}
