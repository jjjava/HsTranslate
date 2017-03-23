/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readurl;

/**
 *
 * @author hudson
 */
public enum EnumFrom {

    EN(0, "en"),
    FR(1, "fr"),
    DE(2, "de"),
    PT(3, "pt");

    private int index;
    private String value;

    EnumFrom(int index, String value) {
        this.index = index;
        this.value = value;
    }

    public static String getValueByID(int i) {
        switch (i) {
            case 0:
                return EnumFrom.EN.value;
            case 1:
                return EnumFrom.FR.value;
            case 2:
                return EnumFrom.DE.value;
            case 3:
                return EnumFrom.PT.value;
            default:
                break;
        }
        return null;
    }

    public int getIndex() {
        return index;
    }

    public String getValue() {
        return value;
    }
}
