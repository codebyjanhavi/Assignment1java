public class ContraOverloading{
   int roll;
   String name;
   int marks;
	public ContraOverloading(){
		roll=141;
		name="Janhavi";
		marks= 50;
		System.out.println("Name: "+name+" Roll No: "+roll+ " Marks: "+marks);
	}
	public ContraOverloading(int r){
		roll=r;
		System.out.println("Roll No: "+roll);
	}
	public ContraOverloading(int r, String n){
		roll=r;
		name=n;
		System.out.println("Name: "+name+" Roll No: "+roll);
	}
	public ContraOverloading(int r,String n, int m){
		roll=r;
		name= n;
		marks= m;
		System.out.println("Name: "+name+" Roll No: "+roll+ " Marks: "+marks);
	}
public static void main(String args[]){
	ContraOverloading c1= new ContraOverloading();
	ContraOverloading c2= new ContraOverloading(143);
	ContraOverloading c3= new ContraOverloading(141,"Janhavi");
	ContraOverloading c4= new ContraOverloading(144,"Vaishnavi",60);
	}
}

