import javax.swing.*;
class Demo
{
	String[] Name={"NULL","H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar"};
	int[] Mass={0,1,4,7,9,11,12,14,16,19,20,23,24,27,28,31,32,35,40};
	int a,b,c;
	String x,y,z;
public void menu()
{
	a=Integer.parseInt(JOptionPane.showInputDialog("1.Enter the Element\n2.Exit"));
	if(a==1)
	enter();
	else if(a==2)
	System.exit(0);
	else
{
	JOptionPane.showMessageDialog(null,"Wrong input,try again");
	menu();
}
}
public void enter()
{
	b=Integer.parseInt(JOptionPane.showInputDialog("Enter Atomic Number less than 20"));
	x=Name[b];
	c=Mass[b];
	if(b<=20)
	print();
	else
{
	JOptionPane.showMessageDialog(null,"Wrong Input, Try again");
	enter();
}
}
	public void print()
{
	JOptionPane.showMessageDialog(null,"The Element is " +x+" and its molar mass is "+c);
	menu();
}

	public static void main(String abc[])
{
	Demo d=new Demo();
	d.menu();
}
}


