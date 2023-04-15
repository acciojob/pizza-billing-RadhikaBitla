package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int totalBill=0;

    protected int cheesePrice=80;

    private int cheeseBill=0;
    private int toppingsBill=0;

    protected int ToppingsPrice=120;

    private boolean takeAway=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true)
        {
            this.price=300;
            this.ToppingsPrice=70;
        }
        else {
            this.price=400;
            this.ToppingsPrice=120;
        }
    }

    public int getPrice()
    {
        return this.price;
    }

    public void addExtraCheese()
    {
        cheeseBill+=this.cheesePrice;
    }

    public void addExtraToppings()
    {
        toppingsBill+=this.ToppingsPrice;
    //    System.out.println(ToppingsPrice);
    }

    public void addTakeaway()
    {
        takeAway=true;
    }

    public String getBill(){
        this.bill=doBilling();
        return this.bill;
    }
    public String doBilling()
    {
        int totalBill=0;
        String result="";
        totalBill+=price;
        result=result+"Base Price Of The Pizza: "+String.valueOf(this.price)+"\n";
            if(this.cheeseBill!=0)
            {
                totalBill+=this.cheeseBill;
                result=result+"Extra Cheese Added: "+String.valueOf(this.cheeseBill)+"\n";
            }
            if(this.toppingsBill!=0)
            {
                totalBill+=this.toppingsBill;
                result=result+"Extra Toppings Added: "+String.valueOf(this.toppingsBill)+"\n";
            }
            if(takeAway==true)
            {
                totalBill+=20;
                result=result+"Paperbag Added: "+String.valueOf(20)+"\n";
            }
            result=result+"Total Price: "+String.valueOf(totalBill);
            return result;
    }
}
/*
Base Price Of The Pizza: 300
Extra Cheese Added: 80
Extra Toppings Added: 70
Paperbag Added: 20
Total Price: 470
*/
