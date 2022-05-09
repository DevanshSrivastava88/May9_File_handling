//Q4


package ninthmay;

import java.util.ArrayList;
import java.util.List;


	class MyQueue {
	    List<Integer> list;
	    /** Initialize your data structure here. */
	    public MyQueue() {
	        list = new ArrayList<>();
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        list.add(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        int res = list.get(0);
	        list.remove(0);
	        return res;
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	        return list.get(0);
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return list.size() == 0;
	    }
	    
	    public void print() {
	    	System.out.println(list);
	    }
	    
	    //using arraylist's remove method
	    public void delete(int n) {
	    	if(n<list.size())
	    	list.remove(n);
	    	
	    }
	    
	    
	    
	    
	    
	    
	  public static void main(String[] args) {
		  MyQueue m=new MyQueue();
		  m.push(100);
		  m.push(0);
		  m.push(123);
		  System.out.println(m.peek());
		  
		  m.pop();

		  System.out.println(m.peek());
		  m.push(1238);
		  m.push(1273);
		  m.delete(2);
		  m.print();
		  
		
	}
	    
	    
	}
	
