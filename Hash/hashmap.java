import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        //key value pair
        HashMap<String, Integer>  map = new HashMap<>();


        //insertion
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map);
        map.put("one", 4);
        System.out.println(map);

        // //  search
        // // .contains give values in true and false
        // if (map.containsKey("one")){
        //     System.out.println("Found key");
        // }
        // if(map.containsValue(3)){
        //     System.out.println("Found value");
        // }

        // System.out.println(map.get("two"));
        // System.out.println(map.get("four"));


// .............................................******................................................
        //Iteration in HashMap 
        
        // for(int value: arr){ // we use this loop on collectons 
        //     System.out.println(value + "");
        // }


        


        


    }
}
