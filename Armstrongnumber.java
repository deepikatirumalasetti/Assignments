
package com.company;

class Main {
    public static void main(String[] args) {
        class ArmstrongNumber{
            public void main (String[] args) {
                int digit1;
                int digit2;
                int digit3;
                int result;
                int temp;
                for(int number = 100; number <= 999; number++)
                {
                    temp = number;
                    digit3=temp%10;
                    temp=temp/10;

                    digit2=temp%10;
                    temp=temp/10;

                    digit1=temp%10;
                    result=(digit1 * digit1 * digit1)+( digit2 * digit2 * digit2)+(digit3 * digit3 * digit3);

                    if(number==result){
                        System.getLogger(number + " is armstrong Number");
                    }
                }
            }
        }

    }
}
