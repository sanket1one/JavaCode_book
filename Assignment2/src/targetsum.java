import java.util.Scanner;

public class targetsum {
    
    public static boolean areDistinct(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
	// write your code here
        int num,array[],targetSum[],sum,temp;
        Scanner sc = new Scanner(System. in);
        System.out.print("Number of elements in array: ");
        num = sc.nextInt();
        array = new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Element "+(i+1)+" = ");
            array[i] = sc.nextInt();
        }

        if (areDistinct(array)){
            System.out.println("All Elements are Distinct");
            System.out.print("Enter the target sum: ");
            sum = sc.nextInt();
            for(int i=0;i<array.length;i++){
                for (int j = i+1;j<array.length;j++){
                    temp = array[i] + array[j];
                    if(temp==sum){
                        targetSum = new int[2];
                        targetSum[0] = array[i];
                        targetSum[1] = array[j];
                        System.out.print("The two numbers are: [ ");
                        for(int element : targetSum){
                            System.out.print(element+" ");
                        }
                        System.out.println("]");
                        break;
                    }
                    else{
                        targetSum = new int[0];
                        for(int element : targetSum){
                            System.out.println(element);
                        }
                    }
                }
            }
        }

        else {
            System.out.println("Not all Elements are Distinct! Try Again!");
        }

    }
}

