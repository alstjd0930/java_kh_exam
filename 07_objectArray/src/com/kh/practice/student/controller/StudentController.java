package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		sArr[0]=new Student("김길동","자바",100);
		sArr[1]=new Student("박길동","디바",50);
		sArr[2]=new Student("이길동","화면",85);
		sArr[3]=new Student("정길동","서바",60);
		sArr[4]=new Student("홍길동","자바",20);
	}
	public Student[] printStudents(){
		return sArr;
	}
	public int sumScore() {
		int result= 0;
		for (int i = 0 ; i<sArr.length ; i++) {
			result += sArr[i].getScore();
		}
		return result;
	}
	public double[] avgScore() {
		double[] avgArr = new double[2];
		double result = sumScore()/sArr.length;
		avgArr[0]= sumScore();
		avgArr[1]=result;
		return avgArr;
		
	}
	
}
