import java.util.Scanner;
import java.util.Arrays;

public class StudentGradeCalculator{
			
	public int numberOfSubjects;

	public static void main(String... args){
	

		StudentGradeCalculator studentGradeCalculator = new StudentGradeCalculator();
		int[][] results = studentGradeCalculator.displayResults();
		//displayPosition();

			}



		public int[][] collectScores(){


			Scanner userInput = new Scanner(System.in);

			System.out.println("How many students do you have? ");
			int numberOfStudents = userInput.nextInt();

			System.out.println("How many subjects do they offer? ");
			this.numberOfSubjects = userInput.nextInt();


			int[][] array = new int[numberOfStudents][numberOfSubjects];
		
			int column;
			int row;

			for(row = 0; row < array.length; row++){

				for(column = 0; column < array[row].length; column++){

					System.out.println("Entering score for student" + " " + (row+1));
					System.out.println("Enter score for subject" + " " + (column+1));
					array[row][column] = userInput.nextInt();

				}

			}

		return array;

		}


		public int[][] displayResults(){


			int[][] scoresCollected = collectScores();

		
		


		System.out.print("============================================================"+"\n"); 


		System.out.print("STUDENT" + "\t"); 



			for(int column = 0; column < this.numberOfSubjects; column++){
				System.out.print("\t"+ "SUB" + (column+1));
			}

		System.out.print("\t" + "TOT" + "\t" + "AVE" + "\t" + "POS"); 

		System.out.println();

		System.out.print("============================================================"+"\n"); 

	


		for(int row = 0; row < scoresCollected.length; row++){
			int total = 0;
			double average = 0;
			for(int column = 0; column < scoresCollected[row].length; column++){

				if(column < 1){
					System.out.print("Student" + " " + (row+1) + "\t");
					System.out.print(scoresCollected[row][column] + "\t"); 
					total += scoresCollected[row][column]; 
					average = (double)total /this.numberOfSubjects;
					}
				else{
					System.out.print(scoresCollected[row][column] + "\t"); 
					total += scoresCollected[row][column]; 
					average = (double)total / this.numberOfSubjects;

						}

					}
				
				 //sum = total[column];
				System.out.print(total + "\t");
				//float = average[column];
				System.out.printf("%.1f",average);

				System.out.println();

				}
			System.out.print("============================================================"+"\n"); 

	return scoresCollected;
	}






	


}