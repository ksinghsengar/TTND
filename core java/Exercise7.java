class Exercise7
{   
    static String firstName ;
    static String lastName ="Code Studio";
    
        static{
            firstName = "Visual";
        }

        static void last(){
            System.out.println("Last Name: "+lastName);
        }

        static int age = 7;

        public static void main(String args[]){
        System.out.println("First Name: "+firstName);
        last();
        System.out.println("Age: "+Exercise7.age);

        
    }
}