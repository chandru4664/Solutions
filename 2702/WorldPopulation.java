
public class WorldPopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long worldpopulation = 6000000000L;
		for(int i=2000 ; i<2010; i++)
		{
			worldpopulation =  (long) (worldpopulation + (worldpopulation*0.0100));
		}

		System.out.println("During the year 2010 Population would be "+worldpopulation);
	}

}
