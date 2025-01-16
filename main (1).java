//ARRAYS
//1 Task
//public class main {
//    public static void main(String[] args) {
//        int[] intarray = new int [10];
//
//        double[] doublearray = new double[10];
//
//    }
//}


//2 Task
//public class main {
//    public static String[] strings = new String[5];
//
//    public static void main(String[] args) {
//        for (int i = 0; i < strings.length; i++) {
//            if (i % 2 == 0) {
//                strings[i] = "Even";
//            } else {
//                strings[i] = "Odd";
//            }
//        }
//        for (String str : strings) {
//            System.out.println(str);
//        }
//    }
//}



//3 Task
//public class main {
//    public static void main(String[] args) {
//        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                numbers[i] = -numbers[i];
//            }
//        }
//
//        for (int num : numbers) {
//            System.out.print(num + " ");
//        }
//    }
//}

//4 Task
//public class main {
//    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
//    public static int[] resultArray;
//
//    public static void main(String[] args) {
//        resultArray = new int[firstArray.length + secondArray.length];
//        for (int i = 0; i < firstArray.length; i++) {
//            resultArray[i] = firstArray[i];
//        }
//        for (int i = 0; i < secondArray.length; i++) {
//            resultArray[firstArray.length + i] = secondArray[i];
//        }
//        for (int i = 0; i < resultArray.length; i++) {
//            System.out.print(resultArray[i] + (i < resultArray.length - 1 ? ", " : ""));
//        }
//    }
//}

//5 Task
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        if (N > 0) {
//            int[] numbers = new int[N];
//            for (int i = 0; i < N; i++) {
//                numbers[i] = scanner.nextInt();
//            }
//            if (N % 2 == 0) {
//                for (int i = N - 1; i >= 0; i--) {
//                    System.out.println(numbers[i]);
//                }
//            } else {
//                for (int i = 0; i < N; i++) {
//                    System.out.println(numbers[i]);
//                }
//            }
//        }
//    }
//}


//6 Task
//import java.util.Scanner;
//
//public class main {
//    public static int[] array;
//
//    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        array = new int[N];
//        for (int i = 0; i < N; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println(max);
//    }
//}


//7 Task
//import java.util.Scanner;
//
//public class main {
//    public static String[] strings;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        strings = new String[6];
//
//        for (int i = 0; i < 6; i++) {
//            strings[i] = scanner.nextLine();
//        }
//
//        for (int i = 0; i < strings.length; i++) {
//            for (int j = i + 1; j < strings.length; j++) {
//                if (strings[i] != null && strings[i].equals(strings[j])) {
//                    strings[j] = null;
//                }
//            }
//        }
//
//        for (String str : strings) {
//            System.out.print(str + " ");
//        }
//    }
//}


//8 Task
//public class main {
//    public static int[][] MULTIPLICATION_TABLE;
//
//    public static void main(String[] args) {
//        MULTIPLICATION_TABLE = new int[10][10];
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
//            }
//        }
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//9 Task
//public class main {
//    public static int[][] result = new int[10][];
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            result[i] = new int[i + 1];
//            for (int j = 0; j <= i; j++) {
//                result[i][j] = i + j;
//            }
//        }
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}



//10 Task
//import java.util.Scanner;
//
//public class main {
//    public static int[][] multiArray;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        multiArray = new int[N][];
//
//        for (int i = 0; i < N; i++) {
//            int size = scanner.nextInt();
//            multiArray[i] = new int[size];
//        }
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < multiArray[i].length; j++) {
//                System.out.print("[] ");
//            }
//            System.out.println();
//        }
//    }
//}

//11 Task
//public class main {
//    public static int[][][][] multiArray = new int[][][][]{{{{4, 8, 15}, {16}}, {{23, 42}, {}},
//            {{1}, {2}, {3}, {4, 5}}}};
//
//    public static void main(String[] args) {
//        for (int i = 0; i < multiArray.length; i++) {
//            for (int j = 0; j < multiArray[i].length; j++) {
//                for (int k = 0; k < multiArray[i][j].length; k++) {
//                    for (int l = 0; l < multiArray[i][j][k].length; l++) {
//                        System.out.print(multiArray[i][j][k][l] + " ");
//                    }
//                }
//            }
//        }
//    }
//}


//12 Task
//public class main {
//    public static int[][] array = new int[2][3];
//
//    public static void main(String[] args) {
//        array[0][0] = 1;
//        array[0][1] = 2;
//        array[0][2] = 3;
//        array[1][0] = 4;
//        array[1][1] = 5;
//        array[1][2] = 6;
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println(array[i][j]);
//            }
//        }
//    }
//}

//13 Task
//import java.util.Scanner;
//
//public class main {
//    public static int[][] array = new int[3][3];
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                array[i][j] = scanner.nextInt();
//            }
//        }
//
//        int max = array[0][0];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                }
//            }
//        }
//
//        System.out.println(max);
//    }
//}



//14 Task
//import java.util.Scanner;
//
//public class main {
//    public static int[][] array = new int[3][3];
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                array[i][j] = scanner.nextInt();
//            }
//        }
//
//        int minSum = Integer.MAX_VALUE;
//
//        for (int i = 0; i < 3; i++) {
//            int rowSum = 0;
//            int colSum = 0;
//
//            for (int j = 0; j < 3; j++) {
//                rowSum += array[i][j];
//                colSum += array[j][i];
//            }
//
//            minSum = Math.min(minSum, Math.min(rowSum, colSum));
//        }
//
//        System.out.println(minSum);
//    }
//}


//15 Task
//import java.util.Scanner;
//
//public class main {
//    public static int[][] array = new int[3][3];
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                array[i][j] = scanner.nextInt();
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = i + 1; j < 3; j++) {
//                int temp = array[i][j];
//                array[i][j] = array[j][i];
//                array[j][i] = temp;
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//Task 16
//import java.util.Scanner;
//
//public class main {
//    public static char[][] array;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int height = scanner.nextInt();
//
//        array = new char[height][height * 2 - 1];
//
//        for (int i = 0; i < height; i++) {
//            int spaces = height - i - 1;
//            int hashes = i * 2 + 1;
//
//            for (int j = 0; j < height * 2 - 1; j++) {
//                if (j >= spaces && j < spaces + hashes) {
//                    array[i][j] = '#';
//                } else {
//                    array[i][j] = ' ';
//                }
//            }
//        }
//
//        for (int i = 0; i < height; i++) {
//            System.out.println(new String(array[i]).trim());
//        }
//    }
//}


//17 Task
//public class main {
//    public static char[][] chars = {
//            {'a', 'b', 'c', 'd', 'e', 'f'},
//            {'j', 'h', 'i', 'j', 'k', 'l'},
//            {'m', 'n', 'o', 'p', 'q', 'r'},
//            {'s', 't', 'u', 'v', 'w', 'x'}
//    };
//
//    public static void main(String[] args) {
//        printArray();
//
//        for (int i = 1; i < chars.length - 1; i++) {
//            for (int j = 1; j < chars[i].length - 1; j++) {
//                chars[i][j] = '-';
//            }
//        }
//
//        printArray();
//    }
//
//    private static void printArray() {
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = 0; j < chars[i].length; j++) {
//                System.out.print(chars[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//}




//FUNCTIONS
//1 Task
//public class main {
//    public static void main(String[] args) {
//        printHydrogenInfo();
//        printJavaInfo();
//    }
//
//    public static void printHydrogenInfo() {
//        System.out.println("Hydrogen:");
//        System.out.println("This is a chemical element of the periodic system with the designation H and atomic number 1.");
//        System.out.println("Is the lightest element in the table.");
//        System.out.println("Hydrogen is used in:");
//        System.out.println("-Chemical industry;");
//        System.out.println("-Oil refining industry;");
//        System.out.println("-Aviation;");
//        System.out.println("-Electricity.");
//    }
//
//    public static void printJavaInfo() {
//        System.out.println("Java Island:");
//        System.out.println("Included in Indonesia.");
//        System.out.println("The states of Mataram, Majapahit, Demak originated on the island.");
//        System.out.println("Java is the most populated island in the world:");
//        System.out.println("The total population is 140 million people.");
//        System.out.println("Population density - 1061 people/km²");
//        System.out.println("One of the famous varieties of coffee, Kopi Luwak, is produced here.");
//    }
//}

//2 TASK
//public class main {
//    public static void main(String[] args) {
//        System.out.println("I am a poet, my name is Tsvetik.");
//        System.out.println("Hello from me to you all.");
//    }
//}


//3 TASK
//public class main {
//    public static void main(String[] args) {
//        String firstName = "Olga";
//        String lastName = "Kipriyanovna";
//        String favoriteDish = "Dumplings";
//        printPersonInfo(firstName, lastName, favoriteDish);
//    }
//
//    public static void printPersonInfo(String name, String surname, String meal) {
//        System.out.println("Brief Dossier:");
//        System.out.println("Name: " + name);
//        System.out.println("LastName: " + surname);
//        System.out.println("Favorite dish: " + meal);
//    }
//}


//4 TASK
//public class main {
//    public static void main(String[] args) {
//        String navigator = "John";
//        String pilot = "Gender";
//        String secondPilot = "George";
//        String flightEngineer = "Ringo";
//        createCrew(navigator, pilot, secondPilot, flightEngineer);
//    }
//
//    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer) {
//        System.out.println("The four to conquer space:");
//        System.out.println("Navigator: " + navigator);
//        System.out.println("Pilot: " + pilot);
//        System.out.println("Co-pilot: " + secondPilot);
//        System.out.println("Flight Engineer: " + flightEngineer);
//    }
//}


//5 TASK
//public class main {
//    public static void main(String[] args) {
//        int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
//        printArray(array);
//        reverseArray(array);
//        printArray(array);
//    }
//
//    public static void reverseArray(int[] array) {
//        int left = 0;
//        int right = array.length - 1;
//        while (left < right) {
//            int temp = array[left];
//            array[left] = array[right];
//            array[right] = temp;
//            left++;
//            right--;
//        }
//    }
//
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//    }
//}

//7 TASK
//public class main {
//    public static void main(String[] args) {
//        signIn("user");
//        signIn("Alice");
//    }
//
//    public static void signIn(String username) {
//        if (username.equals("user")) {
//            return;
//        }
//        System.out.println("Welcome " + username);
//        System.out.println("Missed you very much, " + username);
//    }
//}


//8 TASK
//public class main {
//    public static void main(String[] args) {
//        long result = cube(3);
//        System.out.println(result);
//    }
//
//    public static long cube(long number) {
//        return number * number * number;
//    }
//}


//9 TASK
//public class main {
//    public static void main(String[] args) {
//        Person person = new Person("Ivan", "Ivanov");
//        System.out.println("Dossier.");
//        System.out.println("Name: " + person.getFirstName());
//        System.out.println("LastName: " + person.getLastName());
//        System.out.println("Full name: " + person.getFullName());
//    }
//}
//
//class Person {
//    private String firstName;
//    private String lastName;
//
//    public Person(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    protected String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getFullName() {
//        return firstName + " " + lastName;
//    }
//}

//10 TASK
//public class main {
//    public static void main(String[] args) {
//        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
//        System.out.println("In array: ");
//        printArray(array);
//        System.out.println("Minimum number: " + getMinValue(array));
//        System.out.println("Maximum number: " + getMaxValue(array));
//    }
//
//    public static int getMaxValue(int[] array) {
//        int max = Integer.MIN_VALUE;
//        for (int value : array) {
//            if (value > max) {
//                max = value;
//            }
//        }
//        return max;
//    }
//
//    public static int getMinValue(int[] array) {
//        int min = Integer.MAX_VALUE;
//        for (int value : array) {
//            if (value < min) {
//                min = value;
//            }
//        }
//        return min;
//    }
//
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//}

//11 TASK
//public class main {
//    public static void main(String[] args) {
//        int[] array = {15, 64, 9, 51, 42};
//        printSqrt(array);
//    }
//
//    public static void printSqrt(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            int element = array[i];
//            double elementSqrt = Math.sqrt(element);
//            System.out.println("The square root for the number " + element + " is " + elementSqrt);
//        }
//    }
//}
