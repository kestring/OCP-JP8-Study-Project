package assessmentTest;

public class Compiles {
	class RainException extends Exception {
	}

	public static void main(String[] args) {
		try (Scanner s = new Scanner("rain"); String line = "";) {
			if (s.nextLine().equals("rain"))
				throw new RainException();
		} finally {
			s.close();
		}
	}
}
