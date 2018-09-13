package omatohjelmat;

public class kickerNumbers {

//    public static void main(String[] args) {
//        int[] kickerNumbers = new int[50];
//        for (int i = 0; i < kickerNumbers.length; i++) {
//            kickerNumbers[i] = randomRange(0, 1000);
//        }
//        int kickerPowerball = randomRange(0, 50);
//        
//        for (int i = 0; i < kickerNumbers.length; i++) {
//                    System.out.println(kickerNumbers[i]);
//        }
//
//    }
//
//    public static int randomRange(int min, int max) {
//        return (int) Math.round(((Math.random() * (max - min)) + min));
//    }
    public static void main(String[] args) {
        java.util.Random r = new java.util.Random();
        int[] kickerNumbers = r.ints(0, 100).limit(20).toArray();
        
        for(int i=0; i < kickerNumbers.length; i++){
            System.out.println(kickerNumbers[i]);
        }
    }

}
