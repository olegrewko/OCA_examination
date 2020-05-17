package IgorDolgov.ippodrom;

//public class Ippodrom {
//    private static int[] sortMaxMin (int[] array) {
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] < array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        return array;
//    }
//
//    private static int[] randomArrayGenerator (int arrayLength, int upperBound) {
//        int[] array = new int[arrayLength];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(upperBound);
//        }
//        return array;
//    }

//public void IppodromPlay(){
//private static int[]sortMaxMin(int[]array){
//        for(int i=0;i<array.length-1;i++){
//        for(int j=i+1;j<array.length;j++){
//        if(array[i]<array[j]){
//        int temp=array[i];
//        array[i]=array[j];
//        array[j]=temp;
//        }
//        }
//        }
//        return array;
//        }
//
//private static int[]randomArrayGenerator(int arrayLength,int upperBound){
//        int[]array=new int[arrayLength];
//        Random random=new Random();
//        for(int i=0;i<array.length;i++){
//        array[i]=random.nextInt(upperBound);
//        }
//        return array;
//        }
//
//
////Метод randomArrayGenerator(n, m); выводит n-ое кол-во случайных чисел от 0 до m
////racetrack - кол-во заездов на ипподроме
//        int racetrack=10;
//        int numOfHorses=5;//Кол-во лошадей в забеге фиксированная величина для увеличения добавить переменные a, b и hint_a
//        for(int n=0;n<racetrack; n++){
//        int[]array01=randomArrayGenerator(numOfHorses,1750);
////            System.out.println(Arrays.toString(array01));
//        ArrayList<Integer> arrayL1=new ArrayList<>();
//        for(int i=0;i<numOfHorses; i++){
//        arrayL1.add(array01[i]);
//        }
////            System.out.println(arrayL1);
//        int[]sortedArray01=sortMaxMin(array01);
////            System.out.println(Arrays.toString(sortedArray01));
//        ArrayList<Integer> arrayLsorted01=new ArrayList<>();
//        for(int i=0;i< 5;i++){
//        arrayLsorted01.add(sortedArray01[i]);
//        }
////            System.out.println(arrayLsorted01);
//        int a=arrayLsorted01.get(0);
//        int b=arrayLsorted01.get(1);
//        int c=arrayLsorted01.get(2);
//        int d=arrayLsorted01.get(3);
//        int e=arrayLsorted01.get(4);
//        int hint_a=arrayL1.indexOf(a);
//        int hint_b=arrayL1.indexOf(b);
//        int hint_c=arrayL1.indexOf(c);
//        int hint_d=arrayL1.indexOf(d);
//        int hint_e=arrayL1.indexOf(e);
//        int[]hintArray=new int[]{hint_a,hint_b,hint_c,hint_d,hint_e};
//
//
////            System.out.println("---------Результат " + n + " заезда---------");
////            System.out.println(hint_a + " " + hint_b + " " + hint_c + " " + hint_d + " " + hint_e);
//        System.out.println(Arrays.toString(hintArray)+" --------- Результат "+n+" заезда");
//        }




