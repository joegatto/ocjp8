package mock;

public class TestClass6 {

	public float parseFloat(String s) {
		float f = 0.0f; // 1
		try {
			f = Float.valueOf(s).floatValue(); // 2
		} catch (NumberFormatException nfe) {
			f = Float.NaN; // 4
			return f; // 5
		} finally {
			return f; // 6
		}
	}
}
