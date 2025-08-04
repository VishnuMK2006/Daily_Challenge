class Solution {
    public String defangIPaddr(String add) {
        return add.replace(".","[.]");
    }
}