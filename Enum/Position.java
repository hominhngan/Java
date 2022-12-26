package Enum;

public enum Position {
    WORKER ("Nhân viên", 1),
    TEACHER ("Giảng viên", 2),
    STUDENT ("Sinh viên", 3);

    public final String label;
    public int val;

    private Position(String label, int val) {
        this.label = label;
        this.val = val;
    }

    public static Position nameOfValue (int val) {
        for (Position i : values()) {
            if (i.val == val)
                return i;
        }
        return null;
    }
}

