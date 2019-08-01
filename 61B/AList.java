public class AList <Item> implements List61B <Item> {
	/** generic AList*/

	private Item[] items;
	private int size;


	public AList(){
		items = (Item[]) new Object[100];
		size = 0;
	}

	@Override
	public void addLast(Item x) {
		if (size == items.length) { //will happen when size counter is already 100 in this case
			resize(size + 1); // in this scenatiro, resize the container first 
		}
		items[size] = x;
		size += 1;
	}

	private void resize(int capacity){
		Item a[] = (Item[]) new Object[capacity];
		System.arraycopy(items,0,a,0,size);
		items = a;
	}
	@Override
	public Item getLast(){
		return items[size - 1];

	}
	@Override
	public Item get(int i){
		return items[i];
	}
	@Override
	public int size(){
		return size;
	}

	@Override
	public Item removeLast(){ //currently this operation would lead to problem
		Item x = getLast();
		size = size - 1;
		return x;
	}
} 