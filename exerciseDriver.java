import javax.swing.JOptionPane;

public class exerciseDriver {
		public static void main(String [] args){
			exercise person1 = new exercise();
			exercise2 person2 = new exercise2();
			JOptionPane.showMessageDialog(null,"the person1's name and age is \n"+person1);
			
			JOptionPane.showMessageDialog(null,"the person2's name and age is \n" +person2);
		if (person1.getAge()==person2.getAge() && person1.getName()==person2.getName()){
			JOptionPane.showMessageDialog(null,"the"+ person1.getName() +
					" and"+ person2.getName() +" have same name and age ");
		}
		if ( person1.getName()==person2.getName()){
			JOptionPane.showMessageDialog(null,"the person1 and person2 have same name ");
		}
		if (person1.getAge()==person2.getAge()){
			JOptionPane.showMessageDialog(null,"the "+ person1.getName() +
					"  and "+ person2.getName() +
					"  have same age ");
		}
		if(person1.getAge()<person2.getAge()){
			JOptionPane.showMessageDialog(null,"the"+ person2.getName()+"is older than"+person1.getName());
			JOptionPane.showMessageDialog(null,"the"+ person1.getName()+"is younger than"+person2.getName());
		}
		if(person1.getAge()>person2.getAge()){
			JOptionPane.showMessageDialog(null,"the"+ person1.getName()+"is older than"+person2.getName());
		JOptionPane.showMessageDialog(null,"the"+ person2.getName()+"is younger than"+person1.getName());
			
		}
		}
}
