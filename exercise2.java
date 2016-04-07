import javax.swing.JOptionPane;

public class exercise2 {
	private String name;
	private int age;
	public exercise2(){
		
		name  = JOptionPane.showInputDialog("please enter the person2's name");
		age = Integer.parseInt(JOptionPane.showInputDialog("please enter the person2's age"));
			
	}
	public  exercise2 (String name, int age){
		this.name =name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
		}
	public void setAge(int age){
		this.age=age;
	}
	public String toString(){
		return this.name + "" + this.age; 
		
	}
}