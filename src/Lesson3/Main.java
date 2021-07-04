package Lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //1
        String[] arr = {"заинтересовать","больной","база","лодка","лагерь",
                "заинтересовать","шахта","житель","база","каблук","юмор","ядро","ярлык","ячмень"};

        Map<String,Integer> words = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(words.get(arr[i]) == null){
                words.put(arr[i],1);
            }else{
               words.put(arr[i],words.get(arr[i])+1);
            }
        }

        System.out.println(words);


        //2

        TelephoneList.add("Ivan",88005888);
        TelephoneList.add("Ivan",17878787);
        TelephoneList.get("Ivan");
    }
}

class TelephoneList{
    static Map<String,ArrayList<Integer>> namePhone = new HashMap<>();



    public static void get(String name){
        System.out.println(name + " " + namePhone.get(name));
    }

   public static void add(String name, int phone){

        if (namePhone.get(name) == null){
            ArrayList<Integer> phones = new ArrayList<>();
            phones.add(phone);

            namePhone.put(name, phones);
        }else{
            namePhone.get(name).add(phone);
        }
   }
}
