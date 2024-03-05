
public class multidimensional_array2 {

	public static void main(String[] args) {
		// 多次元配列
		
		//多次元配列　書き方 ②
		// String[][] country = new String[3][2];
		// country[0][0] = "日本";
		// country[0][1] = "タイ";
		// country[1][0] = "アメリカ";
		// country[1][1] = "ブラジル";
		// country[2][0] = "フランス";
		// country[2][1] = "ロシア";
		
		String[][] country = new String[3][2];
		
		country[0][0] = "日本";
		country[0][1] = "タイ";
		country[1][0] = "アメリカ";
		country[1][1] = "ブラジル";
		country[2][0] = "フランス";
		country[2][1] = "ロシア";
		
		System.out.println(country[0][0] + "\n");
		
		String[][] country2 = new String[3][2];
		
		country2[0][0] = "日本";
		country2[0][1] = "タイ";
		country2[1][0] = "アメリカ";
		country2[1][1] = "ブラジル";
		country2[2][0] = "フランス";
		country2[2][1] = "ロシア";
		
		System.out.println(country2[1][1]);

	}

}
