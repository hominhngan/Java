package Enum;

public enum Type {
    CQ ("Chính quy", 1),
    CLC ("Chất lượng cao", 2);

    public final String label;
    public int val;

    private Type(String label, int val) {
        this.label = label;
        this.val = val;
    }

    public static Type nameOfValue(int val) {
        for (Type i: values()) {
            if (i.val == val)
                return i;
        }
        return null;
    }
}

