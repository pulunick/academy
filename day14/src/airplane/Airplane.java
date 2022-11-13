package airplane;

import java.util.Random;

public class Airplane {
	
	private Random ran = new Random();
	Human[] arr = new Human[5];
	
	// Human c = s1;		(함수 호출하면서 인자 전달 과정에서 up-casting이 이루어진다)
	public int entrance(Human c) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null ) {
				arr[i] = c;
				System.out.println(c.name + " 탑승 완료 ");
				return 1;
			}
		}
		System.out.println(c.name + " 탑승 불가");
		return 0;
	}

	public int emergency() {
		int index;
		int cnt = 0;
		do {
			index = ran.nextInt(arr.length);
			if(cnt > 100) {
				System.out.println("탑승객이 없습니다");
				return -1;
			}
			cnt ++;
		}while(arr[index] == null);
		
		System.out.println(arr[index].name + "고객이 급체했습니다");
		return index;
	}

	public void healing(int n1) { // 입장에서 up-casting을 했기에 여기서 down-casting이 필요하다
		Human pa = arr[n1];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Doctor && arr[i] != pa) {
				Doctor d3 = (Doctor)arr[i];
				d3.heal(pa);
				break;
			}
			System.out.println();
		}
		
		
	}

}
