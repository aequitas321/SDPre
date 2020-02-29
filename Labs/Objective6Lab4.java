public class Objective6Lab4{
    public static void main(String[] args){
        int count = 0;
        int sum = 0;

        while(count <= 20){
            sum+= count;
            count = count + 1;
        }
        System.out.println(sum);
    }
}