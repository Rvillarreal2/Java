import iroute.Iroute;
import objects.Route;
import objects.Station;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Iroute<Station> newRoute = new Route();
		System.out.println("This route has no stops! Size = " + newRoute.size());
		
		newRoute.add(new Station("AA"));
		newRoute.add(new Station(5, "AB"));
		newRoute.add(new Station(7, "AC"));
		newRoute.add(new Station(4, "AD"));
		newRoute.add(new Station(8, "AE"));
		
		newRoute.displayList();
		System.out.println();
		
		Iroute<Station> newRoute2 = new Route();
		
		newRoute2.add(new Station(4, "BA"));
		newRoute2.add(new Station(3, "BB"));
		newRoute2.add(new Station(6, "BC"));
		newRoute2.add(new Station(4, "BD"));
		newRoute2.add(new Station(7, "BE"));
		newRoute2.append(newRoute);
		newRoute2.displayList();
		System.out.println();
		newRoute2.empty();
		newRoute2.displayList();
		System.out.println();
		
		newRoute2.add(new Station(4, "BA"));
		newRoute2.add(new Station(3, "BB"));
		newRoute2.add(new Station(6, "BC"));
		newRoute2.add(new Station(4, "BD"));
		newRoute2.add(new Station(7, "BE"));
		newRoute.appendAt(newRoute2, 2);
		newRoute.displayList();
		System.out.println();
		
		newRoute.remove(8);
		newRoute.add(new Station(3, "extra"), 8);
		newRoute.displayList();
		
		System.out.println(newRoute.get(1));
		System.out.println(newRoute.get(1).visDistance());
		System.out.println(newRoute.get(1).name);
		System.out.println("There are now " + newRoute.size() + " stops on this route.");
		
	}

}
