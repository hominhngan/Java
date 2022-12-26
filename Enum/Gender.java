package Enum;

public enum Gender {
    MALE ("Nam", 1),
    FEMALE ("Nữ", 2),
    OTHER ("Khác", 3);

    public final String label;
    public int val;

    private Gender(String label, int val) {
        this.label = label;
        this.val = val;
    }

    public static Gender nameOfValue (int val) {
        for (Gender e : values()) {
            if(e.val == val)
                return e;
        }
        return null;
    }

}

