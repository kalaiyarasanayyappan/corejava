package edu.chainsys.collections;

import java.io.Serializable;

public class Emp  implements Serializable
{
    private final int id;
    public String Name;
    public Emp(int v1)
    {
        id=v1;
    }
    public int getID()
    {
        return id;
    }
    @Override
    public boolean equals(Object obj)
    {
        Class c1=obj.getClass();//provide metadata about the class
        boolean flag=false;
        if(c1==this.getClass())
        {
            Emp other=(Emp) obj;
            if(this.hashCode()==other.hashCode())
                flag=true;
        }
        return flag;
    }
   // public int hashcode()
   // {
   //     return this.id;
   // }
}