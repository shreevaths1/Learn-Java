class Shipment extends BoxWeight2{
	double cost;
	Shipment(){
		super();
		cost=-1;
	}
	
	Shipment(double width,double height,double depth,double weight,double cost){
		super(width,height,depth,weight);
		this.cost =cost;
	}
	
	Shipment(double len,double weight,double cost){
		super(len,weight);
		this.cost=cost;
	}
	Shipment(Shipment ob){
		super(ob);
		this.cost = ob.cost; 
	}
}

class DemoShipment {
	public static void main(String args[]) {
		Shipment shipment1 = new Shipment(10,20,15,10,3.41);
		Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
		
		System.out.println("Volume of shipment1 is "+shipment1.vol());
		System.out.println("Weight of shipment1 is "+shipment1.weight);
		System.out.println("Shipping cost: $"+shipment1.cost);
		System.out.println();
		
		System.out.println("Volume of shipment2 is "+shipment2.vol());
		System.out.println("Weight of shipment2 is "+shipment2.weight);
		System.out.println("Shipping cost: $"+shipment2.cost);
		System.out.println();
	}
}
