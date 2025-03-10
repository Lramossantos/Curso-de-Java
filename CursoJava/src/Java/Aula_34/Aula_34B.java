package Java.Aula_34;

import java.util.ArrayList;

public class Aula_34B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> n = new ArrayList<>();
		ArrayList<String> s = new ArrayList<>();
		
		n.add(100);
		n.add(200);
		n.add(300);
		
		n.clear();
		
		for (int i = 0; i < n.size(); i++) {
			System.out.println(n.get(i));
		}

	}

}
