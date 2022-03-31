package constructor;

public class Car {
	String  name;
	int id;
	String Brand;
	Car(){
		System.out.println("this is default");
	}
	Car(String cname,int id,String bname){
		this.name=cname;
		this.id=id;
		this.Brand=bname;
	}
   void getdetils() {
	   System.out.println("car name is:"+name);
	   System.out.println("id is :"+ id);
	   System.out.println("brand name is:"+ Brand);
   }
	public static void main(String[] args) {
		Car c=new Car();//default constructor
		Car c1=new Car("Accord",1001,"Honda");
		Car c2=new Car("camry",1002,"Tayota");
		Car c3=new Car("corolla",1003,"Tayota");
		
		c1.getdetils();
		c2.getdetils();
		c3.getdetils();
	}

}
