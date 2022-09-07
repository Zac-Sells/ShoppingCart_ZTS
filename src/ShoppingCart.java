import java.lang.reflect.Array;

public class ShoppingCart implements CartInterface{
	ResizableArrayBag<Item> SC = new ResizableArrayBag<Item>(25);

	@Override
	public double cartTotalPrice() {
		// TODO Auto-generated method stub
	
		return 0;
	}

	@Override
	public int cartCurrentSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isCartEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addItem(Object newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeItem(Object newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clearCart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int itemFrequency(Object newEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean cartContains(Object newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean SaveForLater(Object newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

}