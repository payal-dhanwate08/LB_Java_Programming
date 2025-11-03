class Logic
{
    void CheckPrime(int num)
    {
        int iCnt = 0;
        int iFrequency = 0;
        for(iCnt = 2 ;iCnt<=(num/2) ; iCnt++)
        {
            if(num%iCnt==0)
            {
                iFrequency++;
                break;
            }
        }

        if(iFrequency == 0)
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+" is a prime number");
        }
    }
}

class program1_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckPrime(11);
    }
}