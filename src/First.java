public class First {
    static void first(){
        Scanner sc = new Scanner(System.in);
        System.out.println("First Method \nPlease enter a number!");
        int n = sc.nextInt();
        int sum = 0;

        if(n<0){
            System.out.println("Please enter positive number");
        }
        else {
            for(int i = 0; i <= n; i++){
                sum = sum + i;
            }
            System.out.println("Sum of positive numbers less or equal to " + n +" is "+ sum);
            System.out.println("--------------------------------------------------------\n");
        }
    }
}