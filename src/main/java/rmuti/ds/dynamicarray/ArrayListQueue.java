package rmuti.ds.dynamicarray;

/**
 * เป็นคลาสที่ใช้ array list เพื่อทำ queue
 * @author chaluemwutnoyunsan
 */
public class ArrayListQueue {
	private ArrayList lst;

	public ArrayListQueue() {
		lst = new ArrayList();
	}

	/**
	 * เป็น method เพื่อเพิ่มข้อมูลลงไปใน queue
	 * @param e ข้อมูลที่ต้องการเพิ่มใน queue
	 */
	public void enqueue(Object e) {
		lst.add(e);
	}

	/**
	 * เป็น method เพื่อลบข้อมูลออกจาก queue
	 * @return คืนค่าข้อมูลตัวแรกของ queue
	 */
	public Object dequeue() {
		Object obj = lst.get(0);
		lst.remove(0);
		return obj;
	}

	/**
	 * เป็น method เพื่อดูข้อมูลตัวแรกของ queue
	 * @return คืนค่าข้อมูลตัวแรกของ queue
	 */
	public Object peek() {
		return lst.get(0);
	}
	
	/**
	 * เป็น method เพื่อหาขนาดของ queue
	 * @return ขนาดของ queue
	 */
	public int size() {
		return lst.size();
	}

}
