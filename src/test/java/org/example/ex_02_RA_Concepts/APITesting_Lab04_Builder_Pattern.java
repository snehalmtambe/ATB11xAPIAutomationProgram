package org.example.ex_02_RA_Concepts;

public class APITesting_Lab04_Builder_Pattern {

    public APITesting_Lab04_Builder_Pattern step1(){
        System.out.println("Step1");
        return this;
    }
    public APITesting_Lab04_Builder_Pattern step2(){
        System.out.println("Step2");
        return this;
    }
    public APITesting_Lab04_Builder_Pattern step3(String par){
        System.out.println("Step 3 with parameter: "+par);
        return  this;
    }

    public static void main(String[] args) {
        APITesting_Lab04_Builder_Pattern abp = new APITesting_Lab04_Builder_Pattern();
        abp.step1().step2().step3("Johnsmith");
    }

}
