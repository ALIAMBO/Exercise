public class MultiDimensionalArray {

    
    public static void main(String[] args){

        int     [] var1 = new int[3];
        double  [] var2 = new double[3];
        char    [] var3 = new char[3]; 
        boolean [] var4 = new boolean[3]; 
        String  [] var5 = new String[3];

        boolean isLoggedIn = true;
        boolean hasPermission = false;
     
            int [][] matrix = {
                {1,2,3},
                {4,5,6,7},
                {8,9}
            };

            int [] numbers = {10,20,30,40,50};

            System.out.println("Exercise 1. ");
            System.out.println("");
            System.out.println("Main array lenght: " + matrix.length);

            for (int i = 0; i < matrix.length; i++) {
                System.out.println("Sub array lenght: " + matrix[i].length);
                for(int col =0 ;col < matrix[i].length; col++){
                    System.out.println(matrix[i][col]);
                }
            }

            System.out.println("--------------------------");
            System.out.println("Exercise 2. ");
            System.out.println("");
            for (int i = 0; i <1; i++) {
                System.out.println("int: " + var1[i]);
                System.out.println("double: " + var2[i]);
                System.out.println("char: " + var3[i]);
                System.out.println("boolean: " + var4[i]);
                System.out.println("String: " + var5[i]);
            }
            
            System.out.println("--------------------------");
            System.out.println("Exercise 3. ");
            System.out.println("");   
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]+ ", ");
             
            }
            System.out.println("");
            System.out.println("Error Array out of boundary test: ");
                   
                try {
                    for (int i = 0; i < numbers.length; i++) { 
                    System.out.print(numbers[i+4]+ ", ");
                }
                } catch (Exception e) {
                    System.out.println("");
                    System.out.println(e);
                    System.out.println("Please input correct array");
                    
                }

            System.out.println("--------------------------");
            System.out.println("Exercise 4. ");
            System.out.println(""); 
            System.out.println("Check if the user is logged in and has permission. ");
           if (!isLoggedIn || !hasPermission) {
                System.out.println("The user has logged in.");
           }else{
            System.out.println("Wrong credentials. ");
           }

        }

}
