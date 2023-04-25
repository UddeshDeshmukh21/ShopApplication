package tester.app;

import java.util.Scanner;

import com.App.Category;
import com.App.Colddrinks;
import com.App.Cosmatic;
import com.App.Fruits;
import com.App.Grains;
import com.App.Oil;

public class ShopApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double price;
		int qty;
		double total_amount;
		
		System.out.println("----------Online Shop Apllication-----------");
		System.out.println("\n");
		
		System.out.println("Available Category");
		
		Category[] ct = Category.values();
		
		for(int i=0;i<ct.length;i++)
		{
			System.out.println(ct[i]);
		}
		
	 System.out.println("\n");
		
	 	
	 do {
	 
		System.out.println("Choice Category ");
		
		 Category m=Category.valueOf(sc.next().toUpperCase());
		 
		 switch (m) {
		 
		case COSMATIC:
			System.out.println("Available Product");
			
			Cosmatic [] cos = Cosmatic.values();
			
			for(int i=0; i<cos.length;i++)
			{
				System.out.println(cos[i]);
			}
			
			Cosmatic cosmatic =Cosmatic.valueOf(sc.next().toLowerCase());
			System.out.println("Enter Product Name To Buy ");
			
			switch (cosmatic) {
			case garnier: 
				System.out.println("Your Product "+ cosmatic);
				System.out.println("MRP : 180/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*180;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case himalaya: 
				System.out.println("Your Product "+ cosmatic);
				System.out.println("MRP : 135/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*135;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case nivea: 
				System.out.println("Your Product "+ cosmatic);
				System.out.println("MRP : 110/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*110;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case vico_termaric: 
				System.out.println("Your Product "+ cosmatic);
				System.out.println("MRP : 120/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*120;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;

			default:
				System.out.println(" Product Not Available");
				break;
			}
			
			
			break;
			
			
			//Case : FRUITS
			
		case FRUITS:
			System.out.println("Available Product");
			
			Fruits [] fr = Fruits.values();
			
			for(int i=0; i<fr.length;i++)
			{
				System.out.println(fr[i]);
			}
			
			Fruits fruits =Fruits.valueOf(sc.next().toLowerCase());
			System.out.println("Enter Product Name To Buy ");
			
			switch (fruits) {
			case apple: 
				System.out.println("Your Product "+ fruits);
				System.out.println("MRP PER KG : 160/-");
				System.out.print("Enter KG  :");
				qty=sc.nextInt();
				total_amount=qty*160;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case banana: 
				System.out.println("Your Product "+ fruits);
				System.out.println("MRP PER DOZEN : 40/-");
				System.out.print("DOZEN * :");
				qty=sc.nextInt();
				total_amount=qty*40;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case orange: 
				System.out.println("Your Product "+ fruits);
				System.out.println("MRP PER KG : 120/-");
				System.out.print("Enter KG  :");
				qty=sc.nextInt();
				total_amount=qty*120;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case coconuts: 
				System.out.println("Your Product "+ fruits);
				System.out.println("MRP : 50/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*50;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case kiwi: 
				System.out.println("Your Product "+ fruits);
				System.out.println("MRP : 25/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*25;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;

			default:
				System.out.println(" Product Not Available");
				break;
			}
			
			
			break;

			
			//Case : OIL
			
		case OIL:
			System.out.println("Available Product");
			
			Oil[] ol = Oil.values();
			
			for(int i=0; i<ol.length;i++)
			{
				System.out.println(ol[i]);
			}
			
			Oil oil =Oil.valueOf(sc.next().toUpperCase());
			System.out.println("Enter Product Name To Buy ");
			
			switch (oil) {
			case GEMINEOIL: 
				System.out.println("Your Product "+ oil);
				System.out.println("MRP PER KG : 190/-");
				System.out.print("Enter KG :");
				qty=sc.nextInt();
				total_amount=qty*190;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case SUNFLOWER: 
				System.out.println("Your Product "+ oil);
				System.out.println("MRP PER KG : 195/-");
				System.out.print("Enter KG :");
				qty=sc.nextInt();
				total_amount=qty*195;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case RUCHIGOLD: 
				System.out.println("Your Product "+ oil);
				System.out.println("MRP PER KG : 160/-");
				System.out.print("Enter KG :");
				qty=sc.nextInt();
				total_amount=qty*160;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case FORTUNE: 
				System.out.println("Your Product "+ oil);
				System.out.println("MRP PER KG : 170/-");
				System.out.print("Enter KG :");
				qty=sc.nextInt();
				total_amount=qty*170;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case STAROIL: 
				System.out.println("Your Product "+ oil);
				System.out.println("MRP PER KG : 155/-");
				System.out.print("Enter KG :");
				qty=sc.nextInt();
				total_amount=qty*155;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;

			default:
				System.out.println(" Product Not Available");
				break;
			}
			
			
			break;

			
			// Case : GRAINS
			
			
		case GRAINS:
			System.out.println("Available Product");
			
			Grains[] gr = Grains.values();
			
			for(int i=0; i<gr.length;i++)
			{
				System.out.println(gr[i]);
			}
			
			Grains grains =Grains.valueOf(sc.next().toUpperCase());
			System.out.println("Enter Product Name To Buy ");
			
			switch (grains) {
			case wheat: 
				System.out.println("Your Product "+ grains);
				System.out.println("MRP PER KG : 45/-");
				System.out.print("Enter KG :");
				qty=sc.nextInt();
				total_amount=qty*45;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case cornmeal: 
				System.out.println("Your Product "+grains);
				System.out.println("MRP PER KG : 32/-");
				System.out.print("Enter KG :");
				qty=sc.nextInt();
				total_amount=qty*32;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case rice: 
				System.out.println("Your Product "+ grains);
				System.out.println("MRP PER KG : 55/-");
				System.out.print("Enter KG :");
				qty=sc.nextInt();
				total_amount=qty*55;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case Bread: 
				System.out.println("Your Product "+ grains);
				System.out.println("MRP : 60/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*60;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case pasta: 
				System.out.println("Your Product "+ grains);
				System.out.println("MRP PER KG : 120/-");
				System.out.print("Enter KG :");
				qty=sc.nextInt();
				total_amount=qty*120;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;

			default:
				System.out.println(" Product Not Available");
				break;
			}
			
			
			break;

			
			
			// Case : COLDDRINKS
			
		case COLDDRINKS:
			System.out.println("Available Product");
			
			Colddrinks[] cd = Colddrinks.values();
			
			for(int i=0; i<cd.length;i++)
			{
				System.out.println(cd[i]);
			}
			
			Colddrinks Col =Colddrinks.valueOf(sc.next().toUpperCase());
			System.out.println("Enter Product Name To Buy ");
			
			switch (Col) {
			case pepsi: 
				System.out.println("Your Product "+ Col);
				System.out.println("500ml "+ Col);
				System.out.println("MRP : 30/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*30;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case cola: 
				System.out.println("Your Product "+ Col);
				System.out.println("500ml "+ Col);
				System.out.println("MRP : 40/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*40;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case mazza: 
				System.out.println("Your Product "+  Col);
				System.out.println("500ml "+ Col);
				System.out.println("MRP : 25/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*25;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case fruity: 
				System.out.println("Your Product "+ Col);
				System.out.println("500ml "+ Col);
				System.out.println("MRP : 50/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*50;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;
			case redbull: 
				System.out.println("Your Product "+  Col);
				System.out.println("500ml "+ Col);
				System.out.println("MRP : 130/-");
				System.out.print("Enter Qty :");
				qty=sc.nextInt();
				total_amount=qty*130;
				System.out.println("Total Amount to Pay :"+total_amount);
				
				break;

			default:
				System.out.println(" Product Not Available");
				break;
			}
			
			
			break;
			
			
		default:
			System.out.println(" Product Not Available");
			break;
			
			
		} // End of Switch
		 
		 
		 
		 
	 } while(true); //End Of loop
		
		
		
	
		

	}

}
