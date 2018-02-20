package rmuti.ds.dynamicarray;

/**
 * คลาส ArrayListStack ใช้เพื่อการเรียนการสอนในวิชา data structure
 * โดยคลาสนี้จะนำ array list เพื่อมาทำเป็น stack
 * 
 * @author chaluemwutnoyunsan
 */
public class ArrayListStack {
	private ArrayList lst;
	
	public ArrayListStack() {
		lst = new ArrayList();
	}
	
	/**
	 * เป็น method เพื่อ push ข้อมูลลงไปใน stack
	 * @param e ข้อมูลที่ต้องการ push
	 */
	public void push(Object e) {
		lst.add(e);
	}
	
	/**
	 * เป็น method เพื่อ peek ข้อมูลตัวบนสุดของ stack 
	 * @return ข้อมูลตัวท้ายของ stack
	 */
	public Object peek() {
		return lst.get(lst.size()-1);
	}
	
	/**
	 * เป็น method เพื่อ pop ซึ่งเป็นการดึงข้อมูลออกจาก stack
	 * @return ข้อมูลตัวท้ายของ stack
	 */
	public Object pop() {
		Object obj = peek();
		lst.remove(lst.size()-1);
		return obj;
	}
	
	/**
	 * เป็น method เพื่อหาขนาดของ stack
	 * @return ขนาดของ stack
	 */
	public int size() {
		return lst.size();
	}
	
}
