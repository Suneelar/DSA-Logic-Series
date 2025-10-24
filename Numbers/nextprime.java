public class nextprime {
    public static void main(String[] args) {
        int num = 9;
        for (int j = num+1; j <=25; j++) {
            num = j;
        
            boolean flag = true;
            if (num <= 1) {
                flag = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println(num+" Prime");
                break;
            }
           
        }
    }
    }

