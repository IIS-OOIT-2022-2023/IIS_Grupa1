package introduction;

public class Variables {

	public static void main(String[] args) {
		
		//deklaracija promenljive
		double firstNumber;
		//inicijalizacija promenljive
		firstNumber = 1;
		//deklaracija i inicijalzacija
		double secondNumber = 5;
		
		double doubleResult = (firstNumber/secondNumber);
		System.out.println(doubleResult);
		
		//eksplicitna konverzija
		int result = (int) (firstNumber/secondNumber);
		System.out.println(result);
		
		boolean alwaysTrue = true;
		boolean secondBoolean = false;
		
		//logički operatori
		//konjunkcija (AND)
		System.out.println(alwaysTrue && secondBoolean); //false
		//disjunckija (OR)
		System.out.println(alwaysTrue || secondBoolean); //true
		//negacija 
		System.out.println(!alwaysTrue); //false
		System.out.println(!secondBoolean); //true
		
		//konkatenacija (spajanje) stringova
		String name = "Petar";
		String lastName = "Petrovic";
		System.out.println(name + " " + lastName);
		
		//faktorijel broja 5
		int number = 5;
		int factoriel = 1;
		
		while (number > 0) 
		{
			factoriel = factoriel * number;   //5*4*3*2*1
			number--;
			
		}
		System.out.println("Faktorijel broja 5 je: " + factoriel);
		
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0)
				System.out.println(i);
		}

	}

}
