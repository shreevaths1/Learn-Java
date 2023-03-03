import java.util.Random;

interface SharedConstants {
	int NO = 0;
	int YES = 1;
	int NEVER = 5;
	int SOON = 4;
	int MAYBE = 2;
	int LATER = 3;
}

class Question implements SharedConstants {
	Random rand = new Random();
	
	//If you include this initialization outside
	//then you will get same answer for all four called lines 
	//in main() method.
	//int prob = (int) (100 * rand.nextDouble());

	int askMe() {
		int prob = (int) (100 * rand.nextDouble());
		if (prob < 30) {
			return NO;
		} 
		else if (prob < 60) {
			return YES;
		} 
		else if (prob < 75) {
			return LATER;
		} 
		else if (prob < 98) {
			return SOON;
		} 
		else {
			return NEVER;
		}
	}
}

class AskMe implements SharedConstants{
	static void answer(int result) {
		switch(result) {
		case NO:
			System.out.println("No");
			break;
		case YES:
			System.out.println("Yes");
			break;
		case MAYBE:
			System.out.println("Maybe");
			break;
		case LATER:
			System.out.println("Later");
			break;
		case SOON:
			System.out.println("Soon");
			break;
		case NEVER:
			System.out.println("Never");
			break;
		}
		
	}
	
	public static void main(String args[]) {
		Question q = new Question();
		answer(q.askMe());
		answer(q.askMe());
		answer(q.askMe());
		answer(q.askMe());
	}
}
