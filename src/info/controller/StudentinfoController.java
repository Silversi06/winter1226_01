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
	
	//�л������� �Է¹޴� s1�� �ݺ����θ� �Է¹޴�  s2�� �����Ѵ�
	//�̸��� �й� �г� ���� �ּ� ��ȭ��ȣ�� �Է¹޴´�
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
		System.out.println("=======      �л� ���� �Է� ȭ��       ========");
		while(true) {
			if(flag == CONTINUE) {
				System.out.print("==���� : ");
				name.add(s1.nextLine());
				System.out.print("==�й� : ");
				stuId.add(s2.nextInt());
				System.out.print("==�г� : ");
				grade.add(s2.nextInt());
				System.out.print("==���� : ");
				major.add(s1.nextLine());
				System.out.print("==�ּ� : ");
				address.add(s1.nextLine());
				System.out.print("==��ȭ��ȣ : ");
				mobile.add(s1.nextLine());
			}
			else if(flag==EXIT) {
				break;
			}
			System.out.println("��� �Է��Ͻðڽ��ϱ�?(���: 1,����: 0): ");
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
		//ȭ�����
		StudentView sutView = new StudentView();
		stuView.view(controller.svoList);
		s1.close();
		s2.close();
	}
}