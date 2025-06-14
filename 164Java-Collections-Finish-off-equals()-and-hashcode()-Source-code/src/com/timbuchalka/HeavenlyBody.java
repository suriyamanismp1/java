package com.timbuchalka;
import java.util.HashSet;
import java.util.Set;
/**
 * Created by dev on 12/01/2016.
 */
public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }
    public String getName() {
        return name;
    }
    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
    @Override
    public boolean equals(Object obj) {
//        if(this == obj) {
//            System.out.println("j");
//            return true;
//
//        }
//
//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
//        if ((obj == null) || (obj.getClass() != this.getClass())) {
//
//            System.out.println("j");
//            return false;
//        }

        String objName = ((HeavenlyBody) obj).getName();

//        System.out.println("equals is called"+ this+ obj);
        return this.name.equals(objName);
    }
    @Override
    public int hashCode() {
//        System.out.println("hashcode called  "+ this.name.hashCode());
        return this.name.hashCode() ;
    }

    @Override
    public String toString() {
        return "HeavenlyBody{" +
                "name='" + name + '\'' +
                ", orbitalPeriod=" + orbitalPeriod +
                ", satellites=" + satellites +
                '}';
    }
}

