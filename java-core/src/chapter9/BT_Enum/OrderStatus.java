package chapter9.BT_Enum;

public enum OrderStatus {
    PENDING("Cho xac nhan"),
    SHIPPED("Dan giao hang"),
    DELIVERED("Da giao"),
    CANCELLED("Da huy");

    private final String status;

    private OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean hasFinal() {
        if (this == DELIVERED || this == CANCELLED) return true;
        return false;
    }
}
