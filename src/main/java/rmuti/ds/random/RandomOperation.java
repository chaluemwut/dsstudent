package rmuti.ds.random;

import java.util.Random;

public class RandomOperation {

	/**
	 * 
	 * @return
	 */
	public int randomInt() {
		return randomInt(1, 20_000);
	}

	/**
	 * 
	 * @param lowerBound
	 * @param upperBound
	 * @return
	 */
	public int randomInt(int lowerBound, int upperBound) {
		Random random = new Random();
		return random.nextInt(upperBound - lowerBound) + lowerBound;
	}

	/**
	 * 
	 * @return
	 */
	public String randomString() {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345678901";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * str.length());
			salt.append(str.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}

}
