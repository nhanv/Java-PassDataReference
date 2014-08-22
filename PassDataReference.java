public class PassDataReference {
    private int number;

    public PassDataReference (int number){
        this.number = number;
    }

    public void setNumber (int number){
        this.number = number;
    }

    public int getNumber (){
        return this.number;
    }
    
    public static void swapNumber (int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swapNumberic (PassDataReference a, PassDataReference b){
        int temp = a.getNumber();
        a.setNumber(b.getNumber());
        b.setNumber(temp);
    }

    public static void main (String [] args)
    {
        int a = 10;
        int b = 15;
        PassDataReference x = new PassDataReference(a);
        PassDataReference y = new PassDataReference(b);

        System.out.println ("Truoc swap: " + a + " - " + b);
        swapNumber(a, b);
        System.out.println ("Sau swap: " + a + " -- " + b);
        
        System.out.println ("Truoc swap: " + x.getNumber() + " - " + y.getNumber());
        swapNumberic(x, y);
        System.out.println ("Sau swap: " + x.getNumber() + " -- " + y.getNumber());
    }
} 
