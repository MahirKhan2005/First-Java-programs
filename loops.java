public class loops {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10) {
            System.out.print(i + " ");
            i++;
        }
        
        do{
            System.out.print("\n" + i + "\n");
            i++;
        }while(i>100);
        
        for(int j=1;j<=10;j++){
            System.out.print(j + " ");
        }
        System.out.println();
        // for each loop
        int[] marks = {1,2,3,4,5,6,7,8,9};
        for (int num : marks) {
            System.out.println(num);
        }
    }
}
