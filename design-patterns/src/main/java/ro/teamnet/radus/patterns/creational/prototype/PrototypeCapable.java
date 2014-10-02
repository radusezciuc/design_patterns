package ro.teamnet.radus.patterns.creational.prototype;


public interface PrototypeCapable extends Cloneable{
    public PrototypeCapable clone() throws CloneNotSupportedException;
}
