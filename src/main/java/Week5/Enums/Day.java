package Week5.Enums;

public enum Day {
    SUNDAY("Not working"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("10:00 - 14:00");

    private final String workHours;

    Day(String workHours) {
        this.workHours = workHours;
    }

    public String getWorkHours() {
        return workHours;
    }
}