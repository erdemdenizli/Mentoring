import java.util.ArrayList;

public class ArrayListAdd_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();

		
		list.add(Integer.valueOf("1"));
		list.add(Integer.parseInt("2"));
		list.add((int) Short.valueOf("3"));
		list.add((int) Short.parseShort("4"));
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		list.remove(4);
	}

}
