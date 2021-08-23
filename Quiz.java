package exercise1;

import java.util.Scanner;

public class Quiz {
	public static void main(String [] args){
		String q1 = "How many planets are in the Solar System?\n"
				  + "(a)between 100-200/between 150-200\n(b)Exactly 8 planets, excluding Pluto\n";
		
		String q2 = "What are stars?\n"
				  + "(a)Candles\n(b)Celestial bodies considered suns from distant galaxies\n(c)Little lights hanged by the planet's ceiling\n";
		
		String q3 = "How many days can a person survive without water?\n"
				  + "(a)365 days, if he/she's lucky\n(b)3 days\n(c)A whole month, only if it rains\n";
		
		String q4 = "What is square root of 16?\n"
				  + "(a)3\n(b)4\n(c)5\n";
		
		String q5 = "What is the sky`s color?\n"
				  + "(a)Blue\n(b)Fuchsia\n(c)The sky does not have a color";
		
		Question[] questions  = {
			new Question(q1, "b"),
			new Question(q2, "b"),
			new Question(q3, "b"),
			new Question(q4, "b"),
			new Question(q5, "a")
			};
		takeTest(questions);
	}	
	
	public static void takeTest(Question [] questions){
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
		
		for(int i = 0; i < questions.length; i++){
			System.out.println(questions[i].prompt);
			String answer  = keyboardInput.nextLine();
			if(answer.equals(questions[i].answer)){
				score ++;
			}
		}
		if(score <= 2){
			System.out.println("The score is " + score + "." + " I'm dissapointed, you could've done much better.");
		}
		else if(score == 3){
			System.out.println("Your score is " + score + "." + " You're doing good for yourself, but not excelent.");
		}
		else if((score > 3) && (score < 5)){
			System.out.println("Your score is exactly " + score + "." + " You're so CLOSE to the PERFECT score!");
		}
		if(score == 5){
			System.out.println("Your score is 5/5! You might be a robot :| .");
		}
	}
}
