package info.vo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
	ArrayList<StudentVO> svoList = new ArrayList<StudentVO>();
	
	public void insert(StudentVO svo) {
		svoList.add(svo);
	}
	public ArrayList<StudentVO> select(){
		return svoList;
	}
}
