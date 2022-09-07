
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ShoppingCart S1 = new ShoppingCart();
		
	Item beans = new Item("Can of beans", 200);
	Item steak = new Item("Ny Strip", 1200);
	Item potato = new Item("Idaho", 200);
	Item rice = new Item("White Rice", 100);
	Item milk = new Item ("2%", 300);
	Item egg = new Item ("Large", 300);
	
	System.out.println(S1.SC.isEmpty());
	
	System.out.println(S1.SC.getCurrentSize());
	S1.SC.add(milk);
	System.out.println(S1.SC.getCurrentSize());
	S1.SC.add(steak);
	System.out.println(S1.SC.getCurrentSize());
	S1.SC.add(beans);
	System.out.println(S1.SC.getCurrentSize());
	S1.SC.add(rice);
	System.out.println(S1.SC.getCurrentSize());
	S1.SC.add(potato);
	System.out.println(S1.SC.getCurrentSize());
	S1.SC.add(potato);
	System.out.println(S1.SC.getCurrentSize());
	
	System.out.println(S1.SC.isEmpty());
	
	System.out.println(S1.SC.getFrequencyOf(milk));
	System.out.println(S1.SC.getFrequencyOf(potato));
	
	System.out.println(S1.SC.contains(egg));
	System.out.println(S1.SC.contains(milk));

	System.out.println(S1.SC.remove());
	System.out.println(S1.SC.getCurrentSize());
	
	System.out.println(S1.SC.remove(milk));
	System.out.println(S1.SC.getCurrentSize());
	
	S1.SC.clear();
	System.out.println(S1.SC.getCurrentSize());
	
	S1.SC.add(milk);
	System.out.println(S1.SC.getCurrentSize());
	S1.SC.add(steak);
	System.out.println(S1.SC.getCurrentSize());
	S1.SC.add(beans);
	System.out.println(S1.SC.getCurrentSize());
	S1.SC.add(rice);
	System.out.println(S1.SC.getCurrentSize());
	S1.SC.add(potato);
	System.out.println(S1.SC.getCurrentSize());
	S1.SC.add(potato);
	System.out.println(S1.SC.getCurrentSize());
	
	
	int totalCost=0;
	Item[] Items = S1.SC.toArray();
	for(int index = 0; index < S1.SC.getCurrentSize(); index++) {
		Item nextItem = Items[index];
		S1.SC.add(nextItem);
		totalCost = totalCost +nextItem.getPrice();
	}
	}

}
