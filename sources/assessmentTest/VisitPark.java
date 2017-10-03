package assessmentTest;

public class VisitPark {
	enum AnimalsInPark {
		SQUIRREL, CHIPMUNK, SPARROW;
	}

	public static void main(String[] args) {
		AnimalsInPark[] animals = AnimalsInPark.values();
		System.out.println(animals[1]);
	}
}