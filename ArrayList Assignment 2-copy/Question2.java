import java.util.ArrayList;
import java.util.Scanner;

class Question2 {

    public static ArrayList<Integer> Erasthones( ArrayList<Integer> myList,int num ) {
        // ArrayList<Integer> nums2 = new ArrayList<Integer>(100);
        ArrayList<Integer> nums = new ArrayList<Integer>();

        int x =0;
        for (int i=2;i<myList.size();i++){
            x=i+i;
            for (int j=0;j<myList.size();j++){
                if(myList.indexOf(x)>=0&&x== myList.get(myList.indexOf(x))){
                    myList.remove(myList.indexOf(x));
                }
                x=x+i;
            }
        }
        for(int y=0;y<100;y++){
            if (num % myList.get(y)==0){
                nums.add(myList.get(y));
                nums.add(num-myList.get(y));
                y=100;
            }
        }
        return nums;
    }

    public static void main () {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner myObj = new Scanner(System.in); 
        System.out.println("what even number do you want the sum of in prime numbers?");
        int num = myObj.nextInt(); 
        int n=100;
        int p=2;
        for (int i=p;i<n;i++){
            nums.add(i);
        }
        System.out.println("sum"+num+"="+Erasthones(nums,num));
    }

}
