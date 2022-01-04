package structural.adapter;

public class DataBaseRuner {
	public static void main(String[] args) {
		DataBase dataBase = new AdapterJavaToDataBase();

		dataBase.insert();
		dataBase.update();
		dataBase.select();
		dataBase.remove();
	}
}
