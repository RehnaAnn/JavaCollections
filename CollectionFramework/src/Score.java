import java.util.ArrayList;
import java.util.ListIterator;

public class Score {
	
	public static void main(String[] args) {
		
		//arraylist of integers
		ArrayList<Integer> scores = new ArrayList<Integer>();
		System.out.println(scores.size());
		scores.add(2); //adding an integesr2 to an arraylist
		scores.add(5);
		scores.add(2);
		scores.add(3);
		scores.add(3);
		scores.add(3);
		scores.add(0,55); //insert element 55 in to the 0th index
		System.out.println(scores.size());
		//for each
		//(Typethatarraylistholds variablename : arraylistname)
		for(Integer score : scores) {
			System.out.println(score);
			
			for( int i=0; i<=scores.size()-1; i++) {
				System.out.println(scores.get(i));
			}
		}		
		
		ArrayList<String> students = new ArrayList<String>();
		students.add("student1");
		students.add("student2");
		students.add("student3");
		System.out.println(students.size());
		System.out.println(students.isEmpty());
		
		students.set(1, "Rehna");
		students.remove("student3");
		System.out.println(students.size());
		System.out.println("List iterator example");
		System.out.println(scores);
		ListIterator iterate=scores.listIterator();

		while(iterate.hasNext()) {
			
			Integer a=(Integer) iterate.next();
			
			if(a % 2==0) {
				iterate.remove();
			}
			else {
				iterate.add(100);
			}
			System.out.println(scores);
		}


	}

}
