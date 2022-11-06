public class Main {
    public static void main(String[] args) {

       // task 1
        byte variableOfTypeByte = 127;
        short variableOfTypeShort = 32767;
        int variableOfTypeInteger = 2147483647;
        long variableOfTypeLong = 9223372036854775807L;
        float variableOfTypeFlout = 1.3f;
        double variableOfTypeDouble = 1.65424525551555515151554;
        char variableOfTypeShar = 'C';
        boolean variableOfTypeBoolean = true;

        // task 2
        float weightFirstFighter = 78.2f;
        float weightSecondFighter = 82.7f;
        float totalWeightFighters = weightFirstFighter + weightSecondFighter;
        float weightDifference = weightSecondFighter - weightFirstFighter;
        System.out.println("Общий вес двух бойцов = " + totalWeightFighters + " кг" +
                "\nРазница в весе бойцов = " + weightDifference+" кг");

        // task 3
        float breakfastWeight = 5*80 + 2*105 + 2*100 + 4*70;
        System.out.println("Вес завтрака = "+breakfastWeight/1000f + " кг");

        // task 4
        float excessWeight = 7;
        float weightLossMin = 0.250f;
        float weightLossMax = 0.500f;
        float weigtLossMedium = 0.375f;
        System.out.println("Если боксер будет худень по 250гр/день то ему понадобиться " + сalculateNumberDays(excessWeight,weightLossMin) + " дней" +
                "\nЕсли Если боксер будет худень по 375гр/день то ему понадобиться " + сalculateNumberDays(excessWeight,weigtLossMedium)+ " дней" +
                "\nЕсли Если боксер будет худень по 500гр/день то ему понадобиться " + сalculateNumberDays(excessWeight,weightLossMax) + " дней");

        // task 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        System.out.println("Маша теперь получает: " + salaryMasha*1.1 +  " рублей. Годовой доход вырос на " + salaryMasha*12*0.1 + " рублей" +
                "\nДенис теперь получает: " + salaryDenis*1.1 + " рублей. Годовой доход вырос на " + salaryDenis*12*0.1 + " рублей" +
                "\nКристина теперь получает: " + salaryKristina*1.1 + " рублей. Годовой доход вырос на " + salaryKristina*12*0.1 + " рублей");

        // task 6
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println(result);

        //task 7
        int a1 = 5, b1 = 7;
        a1 = b1 - a1; //2
        b1 = b1 - a1; //5
        a1 = a1 + b1; //7


        //task 8
        int a2 = 532;
        int b2 = a2/10%10;
        System.out.println(b2);

    }

    //task 4
    public static int сalculateNumberDays(float excessWeight, float weightLoss) {
        int countDays;
        if (excessWeight%weightLoss==0) countDays = (int) (excessWeight/weightLoss);
        else countDays = 1 + (int) (excessWeight/weightLoss);
        return countDays;
    }
}
