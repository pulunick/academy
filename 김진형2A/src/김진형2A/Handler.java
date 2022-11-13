package 김진형2A;

public class Handler {

	Todo[] arr = new Todo[10];

	public String calenderAll() {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				result += arr[i].toString();
				result += "\n";
			}
		}
		return result;
	}

	public int insert(Todo ob) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = ob;
				return 1;
			}

		}
		return 0;
	}

	public String update(String finish) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].title.contains(finish)) {
				arr[i].complet = "[완료]";

			}
		}
		return result;
	}

	public int delete(String finish) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].title.equals(finish)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}

}
