/**
 * 
 */
package javase.day21;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

/**
 * @author H.Xing
 *
 */
public class StudentInfoTest {

	public static void main(String[] args) throws IOException {
		
		Comparator<Student> cmp = Collections.reverseOrder();//定义临时规则：集合元素反转
		
//		Set<Student> stu = StudentInfoTool.readKeyboardInput();
		Set<Student> stu = StudentInfoTool.readKeyboardInput(cmp);//含临时倒序规则

		StudentInfoTool.writeStudents(stu);
		
		
	}
	
	
	
	
}
