import java.util.ArrayList;

class Question1 {
    
    public static ArrayList<Integer> Erasthones( ArrayList<Integer> myList ) {
    
        
       // ArrayList<Integer> nums2 = new ArrayList<Integer>(100);
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
        

      return myList;
    }
    
    public static void main () {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int n=100;
        int p=2;
        for (int i=p;i<n;i++){
        nums.add(i);
    }
    System.out.println("prime:"+Erasthones(nums));
    }
    
    
}
