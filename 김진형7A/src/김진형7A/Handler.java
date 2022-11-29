package 김진형7A;

import java.util.ArrayList;

public class Handler {

	private ArrayList<Phonebook> list = new ArrayList<Phonebook>();
	private int idx = 0;

	private int nextIdx() {
		return ++idx;
	}

	public Handler() {
		if (list.isEmpty()) {
			list.add(new Phonebook(nextIdx(), "김진형", "01028521259"));
			list.add(new Phonebook(nextIdx(), "장나현", "01027571257"));
			list.add(new Phonebook(nextIdx(), "김경문", "01031312789"));
		}

	}

	public ArrayList<Phonebook> getList() {
		return list;
	}

	public String insert(Phonebook ob) {
		ob.setIdx(nextIdx());
		list.add(ob);
		return "추가되었습니다";
	}

	public Phonebook getItem(int idx) {
		Phonebook item = null;
		for (Phonebook p : list) {
			if (p.getIdx() == idx) {
				item = p;
				break;
			}
		}
		return item;
	}

	public int modify(Phonebook ph) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getIdx() == ph.getIdx()) {
				index = i;
				break;
			}
		}
		list.set(index, ph);
		return index;
	}

	public int delete(int idx) {
		boolean flag = list.removeIf(ph -> ph.getIdx() == idx);
		return flag ? 1 : 0;
	}

	public static String addhyp(String phone) {

		String Tel = phone;

		if (Tel != null) {
			if (Tel.length() == 11) {
				// 010-1234-1234
				Tel = Tel.substring(0, 3) + "-" + Tel.substring(3, 7) + "-" + Tel.substring(7);

			} else if (Tel.length() == 8) {
				// 1588-1234
				Tel = Tel.substring(0, 4) + "-" + Tel.substring(4);
			} else {
				if (Tel.startsWith("02")) { // 서울은 02-123-1234
					Tel = Tel.substring(0, 2) + "-" + Tel.substring(2, 5) + "-" + Tel.substring(5);
				} else { // 그외는 012-123-1345
					Tel = Tel.substring(0, 3) + "-" + Tel.substring(3, 6) + "-" + Tel.substring(6);
				}
			}

		}
		return Tel;
	}

}
