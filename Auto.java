package com.cambeeler;

class Auto{
    private Engine engine; // remember these are only definitions of types that will be store in the object

    public Auto(Engine engine) { // the composition is only be definition here...it will be
        this.engine = engine; // declared in avance of constructing the object
        System.out.println("Auto:Constructor, engine = " + engine);
    }
    public String ClassName(){
        return getClass().getSimpleName();
    }
}
