package info.controller;
import java.util.Scanner;
import java.util.ArrayList;

import info.view.StudentView;
import info.vo.SchoolInfo;
import info.vo.StudentDAO;
import info.vo.StudentVO;

public class StudentinfoController {
	public static final int CONTINUE=1;
	public static final int EXIT=0;
	
	ArrayList<StudentVO>svoList;
	
	public void insert(StudentVO svo){
		svoList.add(svo);
	}
	
	//학생정보를 입력받는 s1과 반복여부를 입력받는  s2를 선언한다
	//이름과 학번 학년 전공 주소 전화번호를 입력받는다
	public static void main(String[] args) {
		
		ArrayList<String>name = new ArrayList<String>();
		ArrayList<Integer>stuId = new ArrayList<Integer>();
		ArrayList<Integer>grade = new ArrayList<Integer>();
		ArrayList<String>major = new ArrayList<String>();
		ArrayList<String>address = new ArrayList<String>();
		ArrayList<String>mobile = new ArrayList<String>();
		
		Scanner s1= new Scanner(System.in);
		Scanner s2= new Scanner(System.in);
		
		int flag = CONTINUE;
		System.out.println("=======      학생 정보 입력 화면       ========");
		while(true) {
			if(flag == CONTINUE) {
				System.out.print("==성명 : ");
				name.add(s1.nextLine());
				System.out.print("==학번 : ");
				stuId.add(s2.nextInt());
				System.out.print("==학년 : ");
				grade.add(s2.nextInt());
				System.out.print("==전공 : ");
				major.add(s1.nextLine());
				System.out.print("==주소 : ");
				address.add(s1.nextLine());
				System.out.print("==전화번호 : ");
				mobile.add(s1.nextLine());
			}
			else if(flag==EXIT) {
				break;
			}
			System.out.println("계속 입력하시겠습니까?(계속: 1,종료: 0): ");
			flag = s2.nextInt();
			System.out.println("-----------------------------------");
		}
		
		
		StudentinfoController controller = new StudentinfoController();
		StudentDAO dao= new StudentDAO();
		
		for(int i=0; i<name.size(); i++) {
			StudentVO svo = new StudentVO(name.get(i),stuId.get(i),grade.get(i),major.get(i),address.get(i),mobile.get(i));
			dao.insert(svo);
		}
		controller.svoList=dao.select();
		//화면출력
		StudentView sutView = new StudentView();
		stuView.view(controller.svoList);
		s1.close();
		s2.close();
	}
}