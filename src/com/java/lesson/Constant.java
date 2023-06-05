package com.java.lesson;

public class Constant {
	
	public static void main(String[] args) {
		final int ADULT_AGE = 20; //定数ADULT_AGEを宣言し、20で初期化
		//ADULT_AGE = 25; 定数ADULT_AGEを25で上書きしようとするが定数なので上書きが不可能。エラーが起きる。
		System.out.println(ADULT_AGE); //ADULT_AGEを表示
	}
}
