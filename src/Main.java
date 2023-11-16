public class Main{
    //Scrivere una funzione che accetti in input 2 int e ne stampi la somma
    //Scrivere una funzione che accetti in input 1 char lo stampi
    //Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
    //Scrivere una funzione che accetti in input 1 Character lo stampi
    //Scrivere un un valore primitivo per int, double e char e fare autoboxing
    //Scrivere un oggetto per Integer, Double e Character e fare Unboxing
    //Usare le funzioni scritte con i valori creati
    public static void main(String[] args){
        int num1 = 2;
        double doub1 = 12.3;
        char char1 = 'c';
        Integer num2 = num1;
        Double doub2 = doub1;
        Character char2 = char1;
        int num3 = num2;
        double doub3 = doub2;
        char char3 = char2;
        sum(num1, num3);
        stamp(char1);
        sumObj(num2, num1);
        stampObj(char3);
    }
    static void sum(int num1, int num2){
        int result = num1+num2;
        System.out.println(result);
    }
    static void stamp(char char1){
        System.out.println(char1);
    }
    static void sumObj(Integer num1, Integer num2){
        Integer result = num1+num2;
        System.out.println(result);
    }
    static void stampObj(Character char1){
        System.out.println(char1);
    }
}