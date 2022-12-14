import java.util.*;

class Tile{
	 int edge;	
	 int area;
	
	Tile(int edge){
		this.edge=edge;
		this.area=edge*edge;
	}

	int Area(){
		return area;
	}
}

class Floor{
	int length;
	 int width;

	Floor(int length, int width){
		this.length = length;
		this.width = width;
	}

	void totalTiles(Tile t){
		double tileArea = t.Area();
		double floorArea = length*width;
		double noOfTiles = floorArea/tileArea;
		System.out.println("Number of Tiles: "+noOfTiles);
	}
}

class floortile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of Tile: ");
		int tileLength = sc.nextInt();
		Tile t = new Tile(tileLength);
		
		System.out.println("Enter the length and width of Floor: ");
		int fLength = sc.nextInt();
		int fWidth = sc.nextInt();

		Floor f = new Floor(fLength,fWidth);
		
		f.totalTiles(t);
	}
}