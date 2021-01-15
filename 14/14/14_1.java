public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random ();

        printBiggest ();
        printBiggest (10);
        printBiggest (10, 20);
        printBiggest (10, 20, 30);
        getFromUserFloat (scanner);
        //אשמח אם תעזור לי לכתוב את שתי הפונקציות האחרונות שלא הצלחתי להזמינן


        // 1. create a function called printBiggest with the following overloading:
        //  printBiggest() -- will print "I am the biggest of them all!"
        // printBiggest(int a) -- will print a + " is biggest"
        //  printBiggest(int a, int b) -- will print the biggest of a and b + " is biggest"
        // printBiggest(int a, int b, int c) -- will print the biggest of a and b and c+ " is biggest
    }


    //Targil 1:
    public static void printBiggest() {
        System.out.println ("I am the biggest");
    }

    public static void printBiggest(int a) {
        System.out.println (String.format ("%d is the biggest", a));
    }

    public static void printBiggest(int a, int b) {
        if (a > b) {
            System.out.println (String.format ("%d is the biggest", a));
        } else {
            System.out.println (String.format ("%d is the biggest", b));
        }

    }

    public static void printBiggest(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println (a);
        } else if (b > c) {
            System.out.println (b);
        } else {
            System.out.println (c);
        }
        System.out.println (String.format ("%d is equal-biggest",
                (a > b && a > c) ? a : b > c ? b : c));
    }


    // Targil 2:
     // create a function that accepts Scanner as an argument and inputs a float from the user
      //hint: inputFromUser(Scanner s)
     public static void getFromUserFloat (Scanner scanner)   {
         System.out.println ("Please Enter a float number: ");
         float f = scanner.nextFloat ();
     }

     // Targil 3:
     //create a function that accepts Random as an argument and prints a random number and also gets the min max range as parameters
     //hint: createRandom(Random r, int min, in max)

      public static void creatRandom( Random random , int min , int max)   {
              // 100-250 --> 250-100 == 151 numbers
              // random (max-min) (250-100) (150 + 1) 0-150
              // 0   + 100 (min) = 100
              // 150 + 100 (min) = 250
              int random_number = random.nextInt(max - min + 1) + min;
      }

      //Targil 4:
     // create a function that accepts an array of double, and also min max range as parameters
      //hint: printInRange(double[] arr, double min, double max)
       //the function will print all the array elements which are in the range
        private static  void printInRange (double[] arr, double min , double max )   {
          for ( int index = 0; index < arr.length; index ++)   {
              if (arr [index] >= min && arr [index] <= max)  {
                  System.out.println (arr [index]);
              }

          }
        }


