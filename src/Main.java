public class Main {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {

             if (i % 3 == 0) {
                System.out.print( "'"+ "Ka"+"'"+ ",");
            }

                else if  (i % 5 == 0){
                System.out.print("'"+ "Ching!" + "'" + ",");
                }
                    if (i % 15 == 0 ){
                    System.out.print("'"+ "Ka-Ching!" + "'" + ",");
                    }

                        else if (i % 15 != 0 && i % 5 != 0 && i % 3 != 0){//repeating multiple of 15 with 3
                         System.out.print("'"+ i +"'"+ "," );
                }
            }
        }
    }

