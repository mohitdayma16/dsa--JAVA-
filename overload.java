// Function overloading 

//This happens when two or more same name functions exists
//they can have same name but different arguments 
//while you use function overloading if you leave any call of the function empty means without arguments it gives error which is known as ambiguity

public class overload {
    public static void main(String[] args) {
        fun(2);
        fun("Radhe Radhe");
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.println(b);
    }    
    
}
