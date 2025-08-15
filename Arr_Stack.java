//public package Stack_Using_Array;
import java.util.Scanner;

class Stack{
    private int[] arr = new int[5];
    private int top = 0;

    //Push Function
    void push(int data){
        if(IsFull()){
              System.out.println("Stack Is Full");
        }
        else{
           arr[top++] = data;
           System.out.println("Push Sccessfully");
        }
      }
      //pop Element
    void pop(){
        if(IsEmpty()){
          System.out.println("Stack Is Empty");
        }
          
        else{
            System.out.println("The Pop Element Is : "+arr[top-1]);
            arr[top-1] = 0;
            top--;
        }
           
       }

      //To see peek Element
      void peek(){
          if(IsEmpty())
            System.out.println("The Stack Is Empty");
        else 
           System.out.println("Peek Element Is : "+arr[top-1]); //Top Is Pointing Current Element Position So, Peek element pesent In top-1 indx
      }

      //Display Stack
      void display(){
        if(IsEmpty())
           System.out.println("Stack Is Empty");
        else{
           System.out.print("The Stack Element Is : ");
           for(int i = 0;i<top;i++)
             System.out.print(arr[i]+" ");
        }
        System.out.println();
      }

      //Return Size Of Stack
      int size(){
        return top;
      }
     //IsEmpty
     boolean IsEmpty(){ 
        if(top == 0)
            return true;
        return false;
     }

     //isFull
     boolean IsFull(){
        if(arr.length==top)
          return true;
        return false;
     }
}
public class Arr_Stack{
     public static void main(String[] args){
        System.out.println("press 1 :- push Element || press 2 :- pop Element ||  press 3 :- peek Element ||  press 4 :- Size Of Stack || press 5 :- Display Stack || press 6 :-Chack Stack Is Empty Or Not || press 7 :- Chack Is full Or Not || press 8 : for exit");
        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("Enter Your Choice : ");
        int n = sc.nextInt();
        

        if(n == 1){
            System.out.print("Enter A Number : ");
            int data = sc.nextInt();
             st.push(data);
        }
        else if(n == 2)
            st.pop();
        else if(n == 3)
            st.peek();
        else if(n == 4)
            System.out.println("The Size Of Stack Is : "+st.size());
        else if(n == 5)
            st.display();
        else if(n == 6)
             System.out.println("Stack Is Empty : "+st.IsEmpty());
        else if(n == 7)
             System.out.println("Stack Is Full  : "+st.IsFull());
        else if(n == 8)
          flag = false;
        else 
            System.out.println("Enter A Valid Choice");
        }
        
        System.out.println("****Have A Nice Day****");
    
        sc.close();
    }
}

