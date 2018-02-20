package rmuti.ds.dynamicarray;

/**
 * เป็นคลาสที่ทำ dynamic array แบบ array list
 *  
 * @author chaluemwutnoyunsan
 */
public class ArrayList {
	private Object[] elementData = new Object[1];
	private int size = 0;

	/**
	 * เป็น method เพื่อเพิ่มข้อมูลใน array list โดยส่งตำแหน่งที่เพิ่ม (i) และค่าที่ต้องการเพิ่ม (e)
	 * @param i ตำแหน่งที่ต้องการเพิ่มข้อมูล
	 * @param e ค่าที่ต้องการเพิ่ม
	 */
	public void add(int i, Object e) {
		ensureCapacity(size + 1);
		for (int j = size - 1; j >= i; j--) {
			elementData[j + 1] = elementData[j];
		}
		elementData[i] = e;
		size++;
	}

	/**
	 * เป็น method เพื่อเพิ่มข้อมูอที่ตำแหน่งท้ายของ array list
	 * @param e ข้อมูลที่ต้องการเพิ่ม
	 */
	public void add(Object e) {
		add(size, e);
	}

	/**
	 * เป็น method เพื่อหาขนาดของ array list
	 * @return คือค่าขนาดของ array list
	 */
	public int size() {
		return size;
	}

	/**
	 * เป็น method เพื่อลบข้อมูลออกจาก array list
	 * @param i ตำแหน่งของข้อมูลที่ต้องการลบออกจาก array list
	 */
	public void remove(int i) {
		for (int j = i; j < size - 1; j++) {
			elementData[j] = elementData[j + 1];
		}
		elementData[size - 1] = null;
	}

	/**
	 * เป็น method เพื่อดึงค่าออกจาก array list	
	 * @param i ตำแหน่งของข้อมูลที่ต้องการดึง
	 * @return คืนค่าข้อมูลที่ต้องการดึง
	 */
	public Object get(int i) {
		return elementData[i];
	}

	private void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			int s = 2 * elementData.length;
			Object[] arr = new Object[s];
			for (int i = 0; i < size; i++) {
				arr[i] = elementData[i];
			}
			elementData = arr;
		}
	}
}
