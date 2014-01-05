package counter;
import java.io.*;
public class CountString {

	public static int count(String filename, String target)
			throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		StringBuilder strb = new StringBuilder();
		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}
			strb.append(line);
		}
		String result = strb.toString();
		int count = 0;
		int index = 0;
		while (true) {
			index = result.indexOf(target, index + 1);
			if (index > 0) {
				count++;
			} else {
				break;
			}
		}
		br.close();
		return count;
	}

	public static void main(String[] args) {
		try {
			System.out.println(count("D:\\chen.txt", "a"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
