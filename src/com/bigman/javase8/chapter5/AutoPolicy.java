package com.bigman.javase8.chapter5;

/**
 * Created by amcclay on 1/2/16.
 */
public class AutoPolicy {



    private int policyNumber;
    private String makeModel;
    private String state;


    public AutoPolicy(int policyNumber, String makeModel, String state) {
        this.policyNumber = policyNumber;
        this.makeModel = makeModel;
        this.state = state;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isNoFault() {

        boolean noFaultState;
        switch ( this.getState()) {
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
        }  // end-switch

        return noFaultState;
    }  // end isNoFault


    @Override
    public String toString() {
        return "AutoPolicy{" +
                "policyNumber= " + policyNumber +
                ", makeModel= '" + makeModel + '\'' +
                ", state= '" + state + '\'' +
                ", isNoFault= '" + this.isNoFault() + '\'' +
                '}';
    }
}  // end-AutoPolicy
