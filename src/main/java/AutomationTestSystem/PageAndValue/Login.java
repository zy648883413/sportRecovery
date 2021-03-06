package AutomationTestSystem.PageAndValue;

public enum Login {
    LOGINNAME("login_button", "resource-id=com.hsrg.proc:id/loginBtn");

    private String type;

    private String desc;

    private Login(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static String getValue(String type) {
        Login[] carTypeEnums = values();
        for (Login carTypeEnum : carTypeEnums) {
            if (carTypeEnum.type().equals(type)) {
                return carTypeEnum.desc();
            }
        }
        return null;
    }

    private String type() {
        return this.type;
    }

    private String desc() {
        return this.desc;
    }
}
