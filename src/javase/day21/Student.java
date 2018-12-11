/**
 * 
 */
package javase.day21;

/**
 * @author H.Xing
 *
 */
//描述学生对象；（包括姓名，三门课成绩）计算出总成绩
public class Student implements Comparable<Student> {

	private String name;
	
	private int score_1,score_2,score_3;
	
	private int sum;
	
	public Student(String name, int score_1, int score_2, int score_3) {
		super();
		this.name = name;
		this.score_1 = score_1;
		this.score_2 = score_2;
		this.score_3 = score_3;
		this.sum = score_1+score_2+score_3;
		
	}

	public String getName() {
		return name;
	}
	
	public int getSum() {
		return sum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}


	@Override
	public int compareTo(Student stu) {
		
		int num = new Integer(this.sum).compareTo(new Integer(stu.sum));
		if(num==0)
			return this.name.compareTo(stu.name);
		return num;
	}

	@Override
	public String toString() {
		return name + "：" + score_1 + "," + score_2 + "," +  score_3+ " sum=" + sum ;
	}
	
	
}
