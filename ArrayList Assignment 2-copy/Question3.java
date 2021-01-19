import java.util.ArrayList;
import java.util.Scanner;

class Question3 {

    public static ArrayList<Integer> add( ArrayList <Integer> b3,ArrayList <Integer>b4 ) {
        // ArrayList<Integer> nums2 = new ArrayList<Integer>(100);

        ArrayList<Integer> added = new ArrayList<Integer>();
        boolean carry = false;
        for(int i=0;i<b3.size();i++){
                if(carry){
                    if((b3.get(b3.size()-1-i)+b4.get(b4.size()-1-i))<=8){
                    added.add(0,(b3.get(b3.size()-1-i)+b4.get(b4.size()-1-i))+1);
                    carry =false;
                }else
                if((b3.get(b3.size()-1-i)+b4.get(b4.size()-1-i))>8){
                    added.add(0,b3.get(b3.size()-1-i)+b4.get(b4.size()-1-i)%10+1);
                    carry=true;
                }
                }else{
                if((b3.get(b3.size()-1-i)+b4.get(b4.size()-1-i))<=9){
                    added.add(0,b3.get(b3.size()-1-i)+b4.get(b4.size()-1-i));
                    carry =false;
                }else
                if((b3.get(b3.size()-1-i)+b4.get(b4.size()-1-i))>9){
                    added.add(0,(b3.get(b3.size()-1-i)+b4.get(b4.size()-1-i))%10);
                    carry=true;
                }
            }
        }
        
        return added;
    }
    
    public static void main () {
        ArrayList<Integer> b1 = new ArrayList<Integer>();
        ArrayList<Integer> b2 = new ArrayList<Integer>();
        b1.add(2);
        b1.add(5);
        b1.add(7);
        b1.add(2);
        b1.add(9);
        b1.add(5);
        b1.add(6);
        b2.add(2);
        b2.add(5);
        b2.add(7);
        b2.add(2);
        b2.add(9);
        b2.add(5);
        b2.add(6);
        System.out.println("added they equal");
        System.out.println(add(b1,b2));
    }

}
