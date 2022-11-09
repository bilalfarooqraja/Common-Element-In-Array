import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        String[] array={"1","2","3","4","5"};
        String[] arrayb={"6","1","2","3","4"};


        Hashtable<Integer, String> hash_table =
                new Hashtable<Integer, String>();
        Hashtable<Integer, String> hash_table2 =
                new Hashtable<Integer, String>();
        int length= array.length;
        length=length+ arrayb.length;


      int temp=0;

        for(int a=0;a< array.length;a++){
            hash_table.put(a, array[a]);
        }
        
       for(int a=0;a< arrayb.length;a++){
           if(hash_table.containsValue(arrayb[a])){
               System.out.println(arrayb[a]);
           }
       }
    }
}