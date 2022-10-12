public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++ ){
            System.out.println(i);
        }
        System.out.println();
        for(int i = 10; i > 0; i-- ){
            System.out.println(i);
        }
        System.out.println();
        for(int i = 1; i <= 16; i++ ){
            if(i%2==0) {
                System.out.println(i);
            }
        }
        System.out.println();
        for(int i = 10; i >= -10; i-- ){
            System.out.println(i);
        }
        System.out.println("Задание 1 Высокосный год ");
        for(int i = 1904; i <= 2096; i+=4 ) {

            System.out.println(i + " высокосный год");
        }
        System.out.println("Задание 2 семерки ");
        for(int i = 7; i <= 98; i+=7 ) {

            System.out.println(i);

        }
        System.out.println("Задание 3 Высокосный год ");
        for(int i = 1; i <= 512; i*=2 ) {

            System.out.println(i);
        }
        System.out.println("Задание 4 годовые накопления");
        int montlyFee = 29000;
        int yearSave = 0;
        for(int i = 1;i <= 12; i++){
            yearSave+=montlyFee;
            System.out.println("Месяц " + i + " сумма равна " + yearSave);
        }
        System.out.println("Задание 5 годовые накопления c %");
        montlyFee = 29000;
        yearSave = 0;
        for(int i = 1;i <= 12; i++){
            yearSave+=montlyFee + montlyFee*12/100;
            System.out.println("Месяц " + i + " сумма равна " + yearSave);
        }
    }
}