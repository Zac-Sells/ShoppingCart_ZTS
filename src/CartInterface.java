/**
 * An interface that describes the operations of a shopping cart.
 * For Example the shopping cart would be used by a retail website to 
 * represent a physical shopping cart at a store.
 * @author sells
 *
 */
public interface CartInterface<T>{
/**
 *Gets the total price of all of the items in the shopping cart.
 * @return an double that represents the total price of all items
 */
	public double cartTotalPrice();
/**
 * 	Gets the total number of items in the cart
 * @return an integer number of the total number of items in the cart
 */
	public int cartCurrentSize();
/**
 * See weather or not the shopping cart is empty or not
 * @return true if the cart does not contain any items and returns false if the cart contains items
 */
	public boolean isCartEmpty();
/**
 * 
 * @param newEntry
 * Add an item to the shopping cart
 * @return true if item is successfully added and false if not
 */
	public boolean addItem(T newEntry);
/**
 * Removes an unspecified item from the cart
 * @return either the item that was removed or null
 */
	public T remove(); 
/**
 * 
 * @param newEntry
 * removes a specific item from the cart
 * @return true if item was successfully removed and false if not
 */
	public boolean removeItem(T newEntry);
/**
 * removes all items from the cart resulting in an empty cart
 */
	public void clearCart();
/**
 * 
 * @param newEntry
 * Counts how many times a particular item occurs in the shopping cart
 * @return the integer number of how many times a particular item appears in the cart
 */
	public int itemFrequency(T newEntry);
/**
 * 
 * @param newEntry
 * See weather or not the shopping cart contains a particular item
 * @return true if a particular item is in the cart and false if not
 */
	public boolean cartContains(T newEntry);
/**
 * 
 * @return an array containing all of the items that are currently held in the cart 
 */
	public T[] toArray();
/**
 * 
 * @param newEntry
 * Moves a particular item from the cart to a save for later list to allow the shopper to easily add the item back to the cart at a later time
 * @return true if the item was successfully added to the save for later list and false if not
 */
	public boolean SaveForLater(T newEntry);
}
