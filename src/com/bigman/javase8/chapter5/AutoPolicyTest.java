package com.bigman.javase8.chapter5;

/**
 * Created by amcclay on 1/2/16.
 */
public class AutoPolicyTest {

    public static void main (String[] args) {


        AutoPolicy policy1 = new AutoPolicy(12345, "Chevy Camaro", "FL");
        AutoPolicy policy2 = new AutoPolicy(98765, "Saturn Volt", "PA");

        policyInNoFaultState(policy1);;
        policyInNoFaultState(policy2);;


    }



    public static void policyInNoFaultState(AutoPolicy policy){

        System.out.println(policy.toString());
    }


}
