package chapter9.Lab07;

public enum OrderStatus {
    PENDING("Cho xac nhan"),
    SHIPPED("Dan giao hang"),
    DELIVERED("Da giao"),
    CANCELLED("Da huy");

    private final String description;

    private OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean hasFinal() {
        if (this == DELIVERED || this == CANCELLED) return true;
        return false;
    }

}
