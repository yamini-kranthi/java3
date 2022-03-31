package constructor;

public class Car {
	String  name;
	int id;
	String Brand;
	int price;
	Car(){
		System.out.println("this is default");
	}
	Car(String cname,int id,String bname,int price){
		this.name=cname;
		this.id=id;
		this.Brand=bname;
		this.price=price;
	}
   void getdetils() {
	   System.out.println("car name is:"+name);
	   System.out.println("id is :"+ id);
	   System.out.println("brand name is:"+ Brand);
	     System.out.println("price  is:"+ price);
   }
	public static void main(String[] args) {
		Car c=new Car();//default constructor
		Car c1=new Car("Accord",1001,"Honda",10000);
		Car c2=new Car("camry",1002,"Tayota",20000);
		Car c3=new Car("corolla",1003,"Tayota",30000);
		
		c1.getdetils();
		c2.getdetils();
		c3.getdetils();
	}

}
