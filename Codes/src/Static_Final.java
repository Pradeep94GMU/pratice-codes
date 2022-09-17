public class Static_Final {
//    Define: The static modifier causes the variable to be available without an instance of it’s defining class being loaded
//    Define: The final modifier makes the variable unchangeable

    //Here i have created class-varibale as (static and final) which can be access by "class method" without its instance(object)
    static final int A = 20;
    //Here i have created another class-varibale, which can not be access by "class method" without its instance(object).
    int X = 10;
    public static void main(String[] args) {
        //This way we create class instance(object) to access Class-variable and Class-method
        Static_Final obj = new Static_Final();
        //accesing Variable without using class-instance
        System.out.println("Accesed Class-varible without class-instance "+A);
        //accesing Variable  using class-instance
        System.out.println("Accesed Class-varible with class-instance "+obj.X);


    }
}
