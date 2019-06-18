// DiceMain.java

/**
 * Class to test Dice
 * 
 * Simulates the rolling of two dice ten times, 
 *    printing the sum each time.
 *
 * @author andrianoff
 * @version June 25, 2014
 */
public class DiceMain
{	
	public static void main(String[] args)
	{
		Dice d = new Dice(6);
		Dice r = new Dice(6);
		int sum, dvalue, rvalue, rollnum = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0, sevens = 0, eights = 0, nines = 0, tens = 0, elevens = 0, twelves = 0, doubles = 0;

		for (int i = 0; i < 10000; i++)
		{
			rollnum++;
			dvalue = d.roll();
			rvalue = r.roll();
			sum = dvalue + rvalue;
			System.out.println("Roll 1: " + dvalue);
			System.out.println("Roll 2: " + rvalue);
			System.out.println("Sum: " + sum);
			if(dvalue == rvalue) {
				doubles++;
			}
			switch(sum) {
				case(2): {
					twos++;
					break;
				}
				case(3): {
					threes++;
					break;
				}
				case(4): {
					fours++;
					break;
				}
				case(5): {
					fives++;
					break;
				}
				case(6): {
					sixes++;
					break;
				}
				case(7): {
					sevens++;
					break;
				}
				case(8): {
					eights++;
					break;
				}
				case(9): {
					nines++;
					break;
				}
				case(10): {
					tens++;
					break;
				}
				case(11): {
					elevens++;
					break;
				}
				case(12): {
					twelves++;
					break;
				}
			}
		}

		System.out.println("Number of Times Doubles was Rolled: " + doubles);
		System.out.println("Number of Times Two was Rolled: " + twos);
		System.out.println("Number of Times Three was Rolled: " + threes);
		System.out.println("Number of Times Four was Rolled: " + fours);
		System.out.println("Number of Times Five was Rolled: " + fives);
		System.out.println("Number of Times Six was Rolled: " + sixes);
		System.out.println("Number of Times Seven was Rolled: " + sevens);
		System.out.println("Number of Times Eight was Rolled: " + eights);
		System.out.println("Number of Times Nine was Rolled: " + nines);
		System.out.println("Number of Times Ten was Rolled: " + tens);
		System.out.println("Number of Times Eleven was Rolled: " + elevens);
		System.out.println("Number of Times Twelve was Rolled: " + twelves);
		System.out.println("Number of Rolls: " + rollnum);
	}
}
