/**
 * 
 */
package javase.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author H.Xing
 *
 */
public class StudentInfoTool {

	//读取键盘输入
	public static Set<Student> readKeyboardInput(){
		return readKeyboardInput(null);
	}
	
	//读取键盘输入
	public static Set<Student> readKeyboardInput(Comparator<Student> cmp){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Student> s = null;
		
		if(cmp==null){
			s = new TreeSet<Student>();
		}else{
			s = new TreeSet<Student>(cmp);
		}
		
		String str = null;
		try {
			
			while((str=br.readLine())!=null){
				
				if("over".equals(str))
					break;
				String[] stu = str.split(",");
				Student student  = new Student(stu[0], Integer.parseInt(stu[1]), Integer.parseInt(stu[2]), Integer.parseInt(stu[3]));
				s.add(student);
				
			}
			
		} catch (IOException e) {

			throw new RuntimeException("键盘输入读取失败！！！");
			
		}
		return s;
		
	}
	
	//将键盘输入写出到文本
	public static void writeStudents(Set<Student> stu) throws IOException{
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("stuifo.txt"));
		
		for (Student student : stu) {
			bw.write(student.toString());
			bw.newLine();
//			bw.flush();
		}
		bw.close();
		
	}
	
	
	
	
}
