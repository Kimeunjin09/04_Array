package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
	
	// 얕은 복사 (shallow: 얕은)
	// -> 주소를 복사하여 서로 다른 두 변수가
	//    하나의 배열(또는 객체_)을 참조하는 상태를 만드는 복사 방법
	
	public void shallowCopy() {
		
		int arr[] = {1, 2, 3, 4, 5};
		
		// 얕은 복사 진행
		int[] copyArr = arr; // 주소만 복사
		
		System.out.println("주소확인");
		System.out.println("arr; " + arr);
		System.out.println("copyArr: " + copyArr);
		
		// 배열 값 변경
		System.out.println("변경 전");
		System.out.println("arr: " + Arrays.toString(arr)); 
		System.out.println("copyarr: " + Arrays.toString(copyArr)); 
		
		// 얕은 복사한 배열의 값을 변경해봄
		copyArr[2] = 999;
		
		// 배열 값 변경 확인
		// 배열 값 변경
				System.out.println("변경 후");
				System.out.println("arr: " + Arrays.toString(arr)); 
				System.out.println("arr: " + Arrays.toString(copyArr)); 
	} 
	
	// 깊은 복사(deep)
	// -> 같은 자료형의 새로운 배열을 만들어서
	// 기존 배열의 데이터를 모두 복사하는 방법
	
	public void deepCopy() {
		int[] arr = {1, 2, 3, 4, 5}; //원본
		
		// 1. for문을 이용한 깊은복사
		int[] copyArr1 = new int[arr.length]; //  5칸짜리 배열생성(원본 다섯개니까)
		
		for(int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i];
		}
 		
		
		//2. System.arraycopy (원본배열, 원본 복사 시작 인덱스, 복사 배열
							// 복사배열의 삽입 시작 인덱스, 복사 길이가 들어가야함)
		int[] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		// 3. Arrays.copyOf(원본 배열, 복사할 길이가 들어오면 됨)
		int[] copyArr3 = Arrays.copyOf(arr, arr.length);
		
		
		// 값 변경 후 확인
		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4] = 5000;
 		
		System.out.println("arr: " + Arrays.toString(arr));
		System.out.println("copyArr1: " + Arrays.toString(copyArr1));
		System.out.println("copyArr2: " + Arrays.toString(copyArr2));
		System.out.println("copyArr3: " + Arrays.toString(copyArr3));
	}
	
	public void createLottoNumber() {
		//로또번호 생성기
		// [6, 12, 16, 20, 21, 42]
		
		// 1. 1~45 사이 중복되지 않는 난수 6개 생성 => Math.random()
		// 2. 생성된 난수가 오름차순으로 정렬 => Arrays.sort()
		
		// 1) 정수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 2) 생성된 배열을 처음부터 끝까지 순차 접근하는 for문 작성
		for(int i= 0; i < lotto.length; i++) {
			
			// 3) 1 ~ 45 사이의 난수생성
			int random = (int)(Math.random() * 45 + 1);
			// 1.0 * 45까지하면 45전까지 나옴 45까지 나와야하니까 +1
			//double이 우선이라 형변환을 해줘야하는데 연산 먼저니까 괄호치고 int random 이라는 곳에 담아줌
			// 0.0 <= x < 1.0
			// 0.0 <= x*45 < 45.0
			// 1.0 <= x*45+1 < 46
			// 1 <- (int)(x*45+1) < 46
					
			// 4) 생성된 난수를 순서대로 배열 요소에 대입
			
			lotto[i] = random;
			
			// 5) 중복 검사를 위한 for문 작성
			for(int x = 0; x < i; x++) {
				//생성된 애들까지만 검사하면 되니까 i 까지
				
				i--;
				// i가 1씩 증가할 때 마다 난수가 하나생성
				// -> 중복 값이 있으므로 난수를 새로 하나 더 생성해야함.
				// --> i는 기본적으로 0~5까지 6회 반복되지만
				//     i값을 인위적으로 1감소시켜서 7회 반복되는 모양을 만듦.
				
				// 6) 현재 생성된 난수와 같은 수가 앞쪽 요소에 있는지 검사
				if(random == lotto[x]) {
					break;
					//앞쪽에서 중복 데이터를 발견하면 남은 값을 비교할 필요 없음
					//-> 효율 향상을 위해서 검사하는for문은 종료
				}
			}
		} // for문 끝
		
		// 7) 오름차순 정렬
		// -> 선택, 삽입, 버블, 퀵 등등
		// --> 자바가 정렬 방법을 미리 만들어서 제공하고 있음
		//     Arrays.sort(배열명) : 배열 내 값들이 오름차순으로 정렬됨
		// 시간복잡도, 효율 공부하기
		
		Arrays.sort(lotto);
		
		//결과출력
		System.out.println(Arrays.toString(lotto));
	}
}
