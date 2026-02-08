package chapter9.them_thuoc_tinh_va_phuong_thuc_vao_enum;

public enum Level {
    HARD("Level kho", 3),
    MEDIUM("Level trung binh", 2),
    EASY("Level de", 1);

    private final String description; //NO SETTER
    private final int count; //NO SETTER

    private Level(String description, int count) {
        this.count = count;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }
}
