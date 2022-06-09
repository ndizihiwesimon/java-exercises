public class Third {
    static void third(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Third Method \nPlease enter a number!");
        int n = sc.nextInt();
        int sum = 0;

        if(n<0){
            System.out.println("Please enter positive number");
        }
        else {
            for(int i = 0; i <= n; i++){
                sum += pow(i,2);
            }
            System.out.println("Sum of square positive numbers less or equal to " + n +" is "+ sum);
            System.out.println("--------------------------------------------------------\n");
        }
    }
}