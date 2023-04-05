import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int temperature1=25;
        String result1=goForWalk(generateRandomAge(),temperature1);
        System.out.println("Возраст:"+generateRandomAge()+"\n"+"Температура:"+temperature1+"\n"+result1+"\n");

        int temperature2=25;
        String result2=goForWalk(generateRandomAge(),temperature2);
        System.out.println("Возраст:"+generateRandomAge()+"\n"+"Температура:"+temperature2+"\n"+result2+"\n");

        int temperature3=20;
        String result3=goForWalk(generateRandomAge(),temperature3);
        System.out.println("Возраст:"+generateRandomAge()+"\n"+"Температура:"+temperature3+"\n"+result3+"\n");

        int temperature4=31;
        String result4=goForWalk(generateRandomAge(),temperature4);
        System.out.println("Возраст:"+generateRandomAge()+"\n"+"Температура:"+temperature4+"\n"+result4+"\n");

        int temperature5=-16;
        String result5=goForWalk(generateRandomAge(),temperature5);
        System.out.println("Возраст:"+generateRandomAge()+"\n"+"Температура:"+temperature5+"\n"+result5+"\n");
        //hw 3
    }

    public static String goForWalk(int age, int temperature) //hw 1
    {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        }//hw 2a
        else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        }//hw 2b
        else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        }//hw 2c
        else {
            return "Оставайтесь дома";
        }//hw 2d
    }
    public static int generateRandomAge() {
        Random random = new Random();
        int minAge = 1;
        int maxAge = 100;
        int randomAge = random.nextInt(maxAge - minAge + 1) + minAge;
        return randomAge;
    }//hw4,5

}