package ImmutableClasse;
// with immutable objects we know their state cannot be
//changed which means they are always consistent
//−Making a class final does not on its own make it immutable,
//but it does stop it being subclassed and its methods
//overridden
public final class ImmutableClass {
    private final int immutableInt;
    public ImmutableClass (int mutableIntIn){
        immutableInt = mutableIntIn;
    }//end constructor method
    private int getImmutableInt(){
        return immutableInt;
    }//end method getImmutableInt
}//end class ImmutableClass
