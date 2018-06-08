package com.cambeeler;

class Engine{
    private int cylinders;
    private double displacement;

    public Engine(int cylinders, double displacement){
        this.cylinders = cylinders;
        this.displacement = displacement;
        System.out.println("Engine:Constructor, cylinders = "+ this.cylinders+ ", displacement = " + this.displacement);
    }

    public String ClassName(){
        return getClass().getSimpleName();
    }
}
