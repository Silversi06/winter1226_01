package info.view;
import java.util.ArrayList;
import java.util.Scanner;

import info.vo.SchoolInfo;
import info.vo.StudentVO;

public class StudentView {
	
	public void view(ArrayList<StudentVO> svoList) {
		System.out.println("�б��� : "+SchoolInfo.SCHOOL_NAME);
		Scanner scan = new Scanner(System.in);
		//������(enhanced) for��
		for(StudentVO svo : svoList) {
			
			System.out.print("����: "+svo.getName()+"\t   ");
			System.out.print("�й�: "+svo.getStuId()+"\t");
			System.out.print("�г�: "+svo.getGrade()+"\t");
			System.out.print("����: "+svo.getMajor()+"\n");
		}
		System.out.println("�б���ȭ : "+SchoolInfo.PHONE_NUMBER);
		System.out.println("�б��ּ� : "+SchoolInfo.SCHOOL_ADRRESS);
	}
}
