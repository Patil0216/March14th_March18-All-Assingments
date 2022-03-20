package Java.Fundamentals;
class Animall{
	int legs;
	int mouth;
	int tail;
	int speed;
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getMouth() {
		return mouth;
	}
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	public int getTail() {
		return tail;
	}
	public void setTail(int tail) {
		this.tail = tail;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

public class MARCH16_Getter_Setter_Animall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animall a1=new Animall();
		a1.setLegs(4);
		a1.setMouth(1);
		a1.setTail(1);
		a1.setSpeed(70);
		System.out.println("Animals usally have "+a1.getLegs()+"Legs");
		System.out.println("Animals usally have "+a1.getMouth()+"Mouth");
		System.out.println("Animals usally have "+a1.getTail()+"Tail");
		System.out.println("Animals usally have "+a1.getSpeed()+"Km/hr Speed");
	}

}
