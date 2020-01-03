import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* DFS */
		
		Scanner scan = new Scanner(System.in);

		int numOfRoom = scan.nextInt();
		scan.nextLine();
		

		ArrayList<Integer> numOfPeople = new ArrayList<>();

		for (int i = 0; i < numOfRoom; i++) {
			numOfPeople.add(scan.nextInt());
		}
		scan.nextLine();

		int entireSupervisor = scan.nextInt();
		int subSupervisor = scan.nextInt();

		long numOfEntireSupervisor = 0L;
		long numOfSubSupervisor = 0L;

		for (int i = 0; i < numOfPeople.size(); i++) {
			numOfEntireSupervisor++;
			if (subSupervisor != 0 && (numOfPeople.get(i)- entireSupervisor) > 0)
				numOfSubSupervisor += (long) Math.ceil(((double) (numOfPeople.get(i) - entireSupervisor) / (double) subSupervisor));

		}
		System.out.println(numOfEntireSupervisor + numOfSubSupervisor);

	}

}
