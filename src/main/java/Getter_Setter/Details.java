package Getter_Setter;

public class Details {
        private int myNumber;

        public int getMyNumber() {
            return myNumber;
        }

        public void setMyNumber(int num) {
            myNumber = num;
        }
        public static void main(String[] args) {
            Details deatilsObject = new Details();
            deatilsObject.setMyNumber(42);
            System.out.println("getting my number "+deatilsObject.getMyNumber()); // Prints 42
        }
    }

