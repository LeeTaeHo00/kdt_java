package ex03_이태호;

public class Main {

	public static void main(String[] args) {
		String nation = "Korea,Spain,Germany,America";
		StringInter inter = new StringInter() {
			@Override
			public String modify(String str) {

				String result = "";

				try {
					for (int i = 0; i < str.length(); i++) {
						if (str.charAt(i) == ',') {
							result += "!";
						}

						else {
							result += str.charAt(i);
						}
					}
				}

				catch (NullPointerException e) {
					e.printStackTrace();
					System.out.println("할 수 없습니다.");
				}

				return result;
			}
		};

		StringInter inter2 = str -> {
			String result = "";

			try {
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == ',') {
						result += "!";
					}

					else {
						result += str.charAt(i);
					}
				}
			}

			catch (NullPointerException e) {
				e.printStackTrace();
				System.out.println("할 수 없습니다.");
			}

			return result;
		};

		System.out.println(inter.modify(nation));
		System.out.println(inter2.modify(nation));

	}

}
