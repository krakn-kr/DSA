package CHALLENGE.day28;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstUnique {
    private Queue<Integer> queue;
    private HashMap<Integer,Integer> frequency;
    public FirstUnique(int[] nums){
        queue = new LinkedList<>();
        frequency = new HashMap<>();
        for(int num:nums){
            add(num);
        }
    }
    public void add(int value){
        frequency.put(value,frequency.getOrDefault(value,0)+1);
        queue.offer(value);
    }
    public int showFirstUnique(){
        while(!queue.isEmpty()){
            int num=queue.peek();
            if(frequency.get(num)==1){
                return num;
            }else{
                queue.poll();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    FirstUnique firstUnique=new FirstUnique(new int[]{2,3,5,3});
        System.out.println(firstUnique.showFirstUnique());
    }
}
