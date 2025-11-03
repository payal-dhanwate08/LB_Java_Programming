class Logic
{
    void CalculatePower(int base , int exp)
    {
        int iResult = 1;
        int iCnt = 0;
        for(iCnt = 1; iCnt<=exp; iCnt++)
        {
            iResult = iResult *base;
        }
        System.out.println(base+" raised to the power "+exp+ " is :" +iResult);

    }
}

class program1_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CalculatePower(2 , 5);
    }
}