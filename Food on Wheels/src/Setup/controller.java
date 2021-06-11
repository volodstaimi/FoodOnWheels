package Setup;

public class controller {
	
	Res_GUI gui= new Res_GUI();
	Restaurant res1 =new Restaurant();
//	public void editlist(int id, String foodname, double foodPrice)
//	{
//		Restaurant res =new Restaurant();
//		res.getRestaurantList(0).EditFoodDetails(id, foodname, foodPrice);
//		String name=res.getRestaurantList(0).getResName();
//		gui.GUI(name,res.getRestaurantList(0).getFullFoodList(0));
//	}
	
	public controller()
	{
		
		res1.AddNewResturant(0, "pizzahut", "emaar", "00", true, 0, "pizza", 1000);
		
		
		
	}
	
	public String getfoodTxt()
	
	{	
		return (res1.getFullFoodList(0));}
	
	public void delete(int id)
	{
		
		res1.deleteFoodDetail(id);
	}
	public void addnew( int resid, String foodName, double price )
	{
		
		res1.AddNewItem(0, foodName, price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		controller c= new controller ();
		c.gui.GUI(c.res1.getResName());
		c.res1.savedata();
		
	}

}
