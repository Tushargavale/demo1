package Calculator;

import java.util.Scanner;

public class companydata {
	String pname;
	float price;
	int quantity;
	Scanner s;
	void input()
	{
		s=new Scanner(System.in);
		System.out.println("Enter product name");
		pname=s.next();
		System.out.println("Enter price");
		price=s.nextInt();
		System.out.println("Enter quantity");
		quantity=s.nextInt();
				
		
	}
	void discount()
	{
	if (price > 3000)
	price=(float) (0.9*price);
	else
		price=(float) (0.91*price);
	System.out.println("product price is "+ price);

	}
	void display()
	{
		System.out.println("product name is "+ pname);
		
		System.out.println("Total quantity is  "+quantity);
	}
	

	public static void main(String[] args)
	{
		companydata a= new companydata();
		a.input();
		a.display();
		a.discount();
		
	}
	

	}
