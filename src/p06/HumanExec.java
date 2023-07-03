package p06;

import java.util.Random;

public class HumanExec {

	public static void main(String[] args) {
		/*
		 * 5명의 사람을 만듬
		 * 각각의 이름과 나이를 직접 초기화
		 * 5명짜리 Human 배열을 만듬.
		 * 반복문을 사용하여 최고령, 최연소가 누구인지 출력
		*/
		Random r = new Random(); //랜덤
		
		Human[] humans = new Human[5]; //Human Data type 5개 선언
		
		for(int i=0; i<humans.length; i++) { //초기화하면서 값도 정함
			humans[i] = new Human();
			humans[i].name = "song" + i; //이름은 순서대로 생성
			humans[i].age = r.nextInt(100)+1; // 나이는 랜덤 초기화
			System.out.println("이름 : " + humans[i].name + " 연령 : " + humans[i].age);
		}

		int age_max = humans[0].age; //나이 최고값
		int age_min = humans[0].age; //나이 최소값 
		int max_index = 0; //최대값 인덱스
		int min_index = 0; //최소값 인덱스
		int sum = 0; //나이 총합
		int average = 0; //나이 평균값
		for(int i = 0; i<humans.length; i++) { // 최연소와 최고령 분류
			if(age_max < humans[i].age) {
				age_max = humans[i].age;
				max_index = i;
			}
			
			if(age_min > humans[i].age) {
				age_min = humans[i].age;
				min_index = i;
			}
			sum += humans[i].age;
			
		}
		average = sum/humans.length; //평균구하기
		
		int[] arry_age = new int[humans.length]; //평균구한걸 배열에 넣기
		
		for(int i=0; i < humans.length; i++) {
			arry_age[i] =  Math.abs(average - humans[i].age); //절대값이 작은것이 가장 평균값에 가까운 나이이기때문에 해놨음
		}
		
		int rank = arry_age[0]; //비교를위한 rank 
		int rank_index = 0; //" 인덱스
		for(int i=0; i < humans.length; i++) { //그렇게해서 절대값이 작은것을 비교
			if(rank > arry_age[i]) {
				rank = arry_age[i];
				rank_index = i;
			}
		}
		System.out.println();
		System.out.println("최연소 이름 : "+ humans[min_index].name + " 최연소 나이 : " + humans[min_index].age);
		System.out.println("최고령 이름 : "+ humans[max_index].name + " 최고령 나이 : " + humans[max_index].age);
		System.out.println();
		System.out.println("평균값에 가장 가까운 사람은");
		System.out.println("이름 :" + humans[rank_index].name + " 나이 : " + humans[rank_index].age);
		
		System.out.println();
		System.out.println("사람들의 평균 나이값 : " + average);
	}
}
