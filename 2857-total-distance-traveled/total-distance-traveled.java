class Solution {
    public int distanceTraveled(int mt, int at) {
        int min= Math.min(at, ((mt-1)/4));
        return (mt+min)*10;
    }
}