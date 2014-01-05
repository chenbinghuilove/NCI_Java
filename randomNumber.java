package randomNumber;

import java.util.Random;

public class RandomUtil {
	
	
	 public static final String ALLCHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 public static final String LETTERCHAR = "abcdefghijkllmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 public static final String NUMBERCHAR = "0123456789";

	/**
	 * 返回一个定长的随机字符串(只包含大小写字母、数字)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public static String generateString(int length) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(ALLCHAR.charAt(random.nextInt(ALLCHAR.length())));
		}
		return sb.toString();
	}

	/**
	 * 返回一个定长的随机纯字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public static String generateMixString(int length) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(LETTERCHAR.charAt(random.nextInt(LETTERCHAR.length())));
		}
		return sb.toString();
	}

	/**
	 * 返回一个定长的随机纯大写字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public static String generateLowerString(int length) {
		return generateMixString(length).toLowerCase();
	}
	public static String generateUpperString(int length) {
		return generateMixString(length).toUpperCase();
	}
	
		/**
	 * 在范围（min----max）内进行随机数
	 */
	public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
    /**
    *在范围（0-max）内的随机数
    */
	public static int getRandom(int max) {
	   Random rand=new Random();
       return (rand.nextInt(max));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("生成随机10位字符串："+generateString(10));
		System.out.println("生成随机10位纯字符串："+generateMixString(10));
		System.out.println("生成随机10位小写字符串："+generateLowerString(10));
		System.out.println("生成随机10位大写字符串："+generateUpperString(10));
	}

}
