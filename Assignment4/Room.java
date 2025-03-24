 class Room{
	
	int height = 50;
	int width = 25;
	int breadth = 45;
	
	int volume() {
		
		 int volume = height * width * breadth;
		 
		 return volume ;
	}
		
}	 
	
	
public class RoomDemo {

	public static void main(String[] args) {
		
		Room r1 = new Room();
				
		System.out.println(r1.volume());
	}
	

	}
