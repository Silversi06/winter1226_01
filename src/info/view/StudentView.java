package info.view;
import java.util.ArrayList;
import java.util.Scanner;

import info.vo.SchoolInfo;
import info.vo.StudentVO;

public class StudentView {
	
	public void view(ArrayList<StudentVO> svoList) {
		System.out.println("학교명 : "+SchoolInfo.SCHOOL_NAME);
		Scanner scan = new Scanner(System.in);
		//개선된(enhanced) for문
		for(StudentVO svo : svoList) {
			
			System.out.print("성명: "+svo.getName()+"\t   ");
			System.out.print("학번: "+svo.getStuId()+"\t");
			System.out.print("학년: "+svo.getGrade()+"\t");
			System.out.print("전공: "+svo.getMajor()+"\n");
		}
		System.out.println("학교전화 : "+SchoolInfo.PHONE_NUMBER);
		System.out.println("학교주소 : "+SchoolInfo.SCHOOL_ADRRESS);
	}
}
