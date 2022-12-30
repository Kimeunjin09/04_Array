package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
		public void practice1(){
		
		int[]arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(i + 1+ " ");
		}
		
		System.out.println();
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				sum = sum + arr[i]; // sum += arr[i];
			}
		}
		System.out.print("짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		
		int arr[] = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = arr.length - i;
			System.out.print(i + " ");
			
			System.out.println();
			
			int sum = 0;
			
			if(i % 2 == 1) {
				
				sum += arr[i];
			}
			System.out.print("홀수 번째 인덱스 합 : " + sum);
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 1; i <= arr.length; i++) {
			System.out.print(i  + " ");
		}
	}
	
	public void soliution3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int arr[] = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 0 : ");
		int num = sc.nextInt();
		System.out.print("입력 1 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num3 = sc.nextInt();
		System.out.print("입력 3 : ");
		int num4 = sc.nextInt();
		System.out.print("입력 4: ");
		int num5 = sc.nextInt();
		
		int[]arr = { num, num2, num3, num4, num5};
		
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			if( input == arr[i]) {
				System.out.println("인덱스 : " + i);
				
				flag = true;
			}	
		}
		if( !flag ) {
			System.out.println("일치하는 값이 존재하지 않습니다");
		}
	}	
	
	public void solution4() {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d : ", i);
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = true;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == search) {
				System.out.print("인덱스 : " + i);
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		System.out.print(input + "에" + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
				
				count++;
		} 
	}
		System.out.println();
		
		System.out.print(ch + "개수 : " + count);
}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.print("총 합 : " + sum);
	}
	
	public void practice7(){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		
		char arr[] = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			if(i < 8) {
				arr[i] = input.charAt(i);
			} else {
				arr[i] = '*';
			}
		System.out.print(arr[i]);	
		}
	}
}