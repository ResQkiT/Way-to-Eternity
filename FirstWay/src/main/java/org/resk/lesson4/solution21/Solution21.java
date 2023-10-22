package org.resk.lesson4.solution21;
public class Solution21{
    public static void main(String[] args) {
        Bridge b1 = new WaterBridge();
        Bridge b2 = new SuspensionBridge();
        println(b1);
        println(b2);
    }
    public static void println(Bridge bridge){
        System.out.println("На мосту: " + bridge.getCarrCounts());
    }
}
interface Bridge{int getCarrCounts();}
class WaterBridge implements Bridge{
    @Override
    public int getCarrCounts() {
        return 19;
    }
}
class SuspensionBridge implements Bridge{
    @Override
    public int getCarrCounts() {
        return 58;
    }
}
