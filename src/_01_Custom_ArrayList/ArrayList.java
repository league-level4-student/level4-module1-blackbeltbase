package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] array;
	public ArrayList() {
     array = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return array[loc];
	}
	
	public void add(T val) {
				T[] secondArray = (T[])new Object[array.length+1];
				secondArray[secondArray.length-1] = val;
				for(int i = 0; i<array.length;i++) {
					secondArray[i] = array[i];
				}
				array = secondArray;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newStuff = (T[]) new Object[array.length+1];
		for(int i = 0; i<newStuff.length;i++) {
			if(i<loc) {
				newStuff[i] = array[i];
			}
			else if(i>loc) {
				newStuff[i] = array[i-1];
			}
			else {
				newStuff[i] = val;
			}
		}
		array = newStuff;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
T[] newStuff = (T[]) new Object[array.length-1] ;
				
		
		//B. make a for loop to iterate through the member array
		for(int i = 0; i<array.length;i++) {
		if(i<loc) {
			newStuff[i] = array[i];
		}
		else if(i>loc) {
			newStuff[i-1] =array[i];
		}
		else {
		}
		}
		array = newStuff;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i<array.length;i++) {
			if(array[i] == val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return array.length;
	}
}