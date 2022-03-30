package constructor;

public class Myclass {
   String Sname;
   int id;
   String Cname;
   Myclass(String name,int id,String collegename){//parameterized constructor
	   this.Sname=name;
	   this.id=id;
	   this.Cname=collegename;   
   }   
   void display() {
	   System.out.println("student name is:" + Sname);
	   System.out.println("id is:"+ id);
	   System.out.println("Cname is :"+ Cname);
   }
	public static void main(String[] args) {
		Myclass m=new Myclass("sandya",1001,"bbcit");
		Myclass m1=new Myclass("vishala",1002,"bbcit");
		m.display();
		m1.display();
	

	}
}
