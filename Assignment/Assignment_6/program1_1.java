class Logic
{
    void ProductOfDigits(int num)
    {
        int iDigit = 0;
        int Product = 1;

        while(num !=0)
        {
            iDigit = num % 10;
            Product =  Product*iDigit;
            num = num / 10;

        }
        System.out.println("Thr product of digit is :"+Product);
    }
}

class program1_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.ProductOfDigits(234);
    }
}