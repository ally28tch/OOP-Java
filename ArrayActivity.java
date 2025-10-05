public class ArrayActivity{
    public static void main(String[] args) {
        int[] score = {72, 85, 90, 78, 99, 92, 88, 75, 82, 74};

        System.out.println("First: " + score[0]);
        System.out.println("Lowest: " + score[0]);
        System.out.println("Highest: " + score[4]);
        System.out.println("Last: " + score[score.length - 1] + "\n");

        for (int i = 0; i < score.length; i++){
            System.out.println("Score[" + i + "] = " + score[i] );
        }
        for (int s : score){
            System.out.print("\nScore: " + s); 
        }
        int sum = 0;
        for (int s : score) {
            sum += s;
        }
        double average = sum / score.length;
        System.out.println("\nAverage score: " +  average);
    }
}