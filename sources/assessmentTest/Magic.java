package assessmentTest;
import java.util.Optional;
import java.util.stream.Stream;

public class Magic {

	private static void magic(Stream<Integer> s) {
		Optional o = s.filter(x -> x < 5).limit(3).max((x, y) -> x—y);
		System.out.println(o.get());
	}

}
