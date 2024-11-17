//Average of 25 scores in exams.
class AvgOfScores{
	public static void main(String args[]) {
	
		int [] scores = {90,89,89,79,98,98,58,79,98,86,84,50,89,78,89,50,89,56,79,89,67,89,98,78,89};
		float sum=0;
		for (int i=0; i<25; i++) {
			sum= sum+ scores[i];
		}
		System.out.println("Average= " + sum/25);		
	
	}
}