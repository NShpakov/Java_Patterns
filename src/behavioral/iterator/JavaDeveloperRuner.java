package behavioral.iterator;

public class JavaDeveloperRuner {
	public static void main(String[] args) {
		String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSql"};

		JavaDeveloper javaDeveloper = new JavaDeveloper("Nikolay Shpakov", skills);

		Iterator iterator = javaDeveloper.getIterator();
		System.out.println("Developer: " + javaDeveloper.getName());
		System.out.println("Skills: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString()+" ");
		}
	}
}
