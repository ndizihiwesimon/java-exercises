public class Second {

    static void second(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Second Method \nPlease enter a number!");
        int n = sc.nextInt();
        int sum = 0;

        if(n<0){
            System.out.println("Please enter positive number");
        }
        else {
            for(int i = 0; i <= n; i++){
                if (i%2==0){
                    sum = sum + i;
                }
            }
            System.out.println("Sum of positive odd numbers less or equal to " + n +" is "+ sum);
            System.out.println("--------------------------------------------------------\n");
        }
    }

   
}