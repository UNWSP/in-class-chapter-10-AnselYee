package inclass10;

public class DemoHorses {
	public static void main(String[] args) {
		Horse horse1=new Horse();
		RaceHorse horse2=new RaceHorse();
		horse1.setName("i");
		horse1.setColor("q");
		horse1.setbirthYear("2020");
		horse2.setName("y");
		horse2.setColor("z");
		horse2.setbirthYear("2022");
		horse2.setRaces(5);
		System.out.println(horse1.getName()+" is "+horse1.getColor()+" and was born in "+horse1.getbirthYear());
		System.out.println(horse2.getName()+" is "+horse2.getColor()+" and was born in "+horse2.getbirthYear()+" has been in "+horse2.getRaces()+" races");
	}
}
