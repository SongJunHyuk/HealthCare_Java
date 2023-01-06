import java.util.ArrayList;
import java.util.List;

public class ArrayListText {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		List<String> al2 = new ArrayList<String>();

		List<Item> itemList = new ArrayList();
		Item item1 = new Item(1, "str1");
		Item item2 = new Item(2, "str2");
		Item item3 = new Item(3, "str3");
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item2);
		
		for(Item item : itemList) {
			System.out.println(item);
		}
	}
}

class Item {
	int n;
	String s;
	public Item() {}
	public Item(int n , String s) {
		super();
		this.n = n;
		this.s = s;
	}
	
	@Override
	public String toString() {
		return "Item [n=" + n + ", s=" + s + "]";
	}
}