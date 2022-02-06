package com.vlad.epam;


import com.vlad.epam.generic.StudentHelper;

public class Test {
    public static void main(String[] args) {
        Student[] array = new Student[50];
        array[0] = new Student(1, "Abdiev", "Salamat", "Rustembayevich", "1990, 9, 9", "sergeli-7", 6667606, "Ekonomicheskiy", 3, "AT-12");
        array[1] = new Student(2, "Abdullaye", "Abduhakim", "Abdurashidovich", "1991, 5, 6", "mirobod", 9277606, "OPiU", 4, "AB-177");
        array[2] = new Student(3, "Lapasov", "Furqat", "Gaybullayevich", "1992, 6, 19", "chuqursoy", 7277190, "Ekonomicheskiy", 2, "AT-12");
        array[3] = new Student(4, "Ermatov", "Anvar", "Karamlikovich", "1988, 11, 19", "chuqursoy", 6667190, "Mexanika", 3, "MF-162");
        array[4] = new Student(5, "Kashkarov", "Dalan", "Warenevich", "1932, 6, 22", "Semashka", 6637190, "Mexanika", 1, "MF-162");
        array[5] = new Student(6, "Bogdan", "Balan", "Pomidorych", "1928, 12, 11", "Voksalna", 62667190, "Mexanika", 2, "MF-162");
        array[6] = new Student(7, "Emirov", "Avatar", "Konservov", "1998, 17, 31", "Naberezhnaya", 66417190, "Mexanika", 4, "MF-162");

        StudentHelper st = new StudentHelper();
        st.searchOfGroup(array, "MF-162");
        System.out.println("-------------------------------");
        st.searchOfFak(array, "Ekonomicheskiy");




        /*String pathname = "d://temp/te8st.txt";
        String result = FileHelper.readFromFile(pathname);
        System.out.println(result);*/


//        ArrayHelper.printIntArray(new int[]{1, 22, 44});
//        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        ArrayHelper.printIntArray(array);


//        System.out.println("Second diagonal: ");
//        System.out.println(ArrayHelper.calculateSumEvenNumbers((array)));
      /*  ArrayList<Integer> cats = new ArrayList<>();
        MethodAction methodAction = new MethodAction();
        int num = 739_015_428;
        int[] res = new int[10];
        int length = methodAction.numberParser(num, res);*/
//        System.out.println(length);
//        for (int i = 0; i < length; i++) {
//            System.out.printf("%d, ",res[i]);
//
//        }
     /*   PersonService personService = new PersonService();
        Optional<Person> optionalPerson = personService.findPersonByName("Iv7an");
        optionalPerson.ifPresent(System.out::println);*/
//        personService.printFullNamePerson(new Person("Sergey", "Manko"));
//        Student student = new Student("Vlad", "Paun");
//        Student.bark();

    }
        /*
        int a = 5;
        int b = a > 5 ? a * 2 : a / 2;
        int s = a > 5 ? a + a : a * a;

        char [] array = {'a','b','c'};
        for (char c : array) {
            c += c;
        }
        System.out.println(Arrays.toString(array));
*/
    /**Выводит на экран таблицу умножения до 10**/
        /*int i, j;
        for (i = 1; i < 10; i++)
        for (i = 1; i < 10; i++) {
            for (j = 1; j < 10; j++)
                System.out.printf("%2d ", i * j);
            System.out.printf("\n");
        }*/
       /*int [] array = new int[] {3,4,6,9,11,12};
        for (int i = 0; i < array.length; i++) {
            if(array[i]%3 == 0){
                System.out.print(array[i] +" ");
            }

        }*/
//        String [] months = {"January", "February","March","April","May","June","July","August","September","October","November","December"};
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input number: ");
//        int month = scanner.nextInt();
//        if(month >= 1 && month <= 12){
//            System.out.println(months[month-1]);
//        }else {
//            System.out.println("Incorrect number");
//        }

}


