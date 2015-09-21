package com.otherPrgrms;


//Immutable class
public class Contacts {
	
	private final String NAME;
    private final String SSN;

    public Contacts(String NAME, String SSN) {
        this.NAME = NAME;
        this.SSN = SSN;
    }
  
    public String getNAME(){
        return NAME;
    }
  
    public String getMobile(){
        return SSN;
    }

}
