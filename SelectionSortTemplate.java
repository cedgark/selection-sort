import java.util.List;
import java.util.ArrayList;

class SelectionSortTemplate {

	public static void runSort(List<String> list, int n) {

		// Selection sort code goes here
		for (int i = 0; i < n - 1; i++) {

				int min = i;

				for (int j = i + 1; j < n; j++) {
					/* check the element to be minimum */
					if (list.get(j).compareTo(list.get(min)) < 0) {
						System.out.println("comparison");
						System.out.print(j);
						System.out.print("=");
						System.out.println(min);


						min = j;
						System.out.println(list);
					}
				}

				/* swap the minimum element with the current element*/
				if (i != min) {
					System.out.println("Swap");
					System.out.print(i);
					System.out.print(":");
					System.out.println(min);
					String temp = list.get(i);
					list.set(i, list.get(min));
					list.set(min, temp);
					System.out.println(list);

				}

			}

		}


	public static void main(String args[]) {
		ArrayList<Double> time = new ArrayList<Double>();
		for(int i =0; i < 10;i++) {
		double time1 = System.nanoTime();

		// Create an ArrayList to store words
		ArrayList<String> list = new ArrayList<String>();

		// We have a string, and can split this string to get the individual words
		String test = "this is a test string";
		String[] splitTest = test.split("\\s+");


		// We add the individual words to the ArrayList
		for (String a : splitTest)
			list.add(a);

		System.out.println(list);
		// Run the sort
		SelectionSortTemplate.runSort(list, list.size());
		System.out.println(list);
		list.clear();
		double time2 = System.nanoTime();
		time.add(time2-time1);
	}
	double total = 0;
	for(int i =0; i < time.size();i++) {
	total = total + time.get(i);
}
	System.out.println(total / time.size());
	}

}
