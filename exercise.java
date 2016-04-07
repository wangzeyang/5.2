import javax.swing.JOptionPane;

public class exercise {
		private String name;
		private int age;
		public exercise(){
			
			name  = JOptionPane.showInputDialog("please enter the person1's name");
			age = Integer.parseInt(JOptionPane.showInputDialog("please enter the person1's age"));
				
		}
		//Constructor
		
		
		
		public  exercise (String name, int age){
			this.name =name;
			this.age=age;
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
			return this.name + " " + this.age; 
			
		}
}
