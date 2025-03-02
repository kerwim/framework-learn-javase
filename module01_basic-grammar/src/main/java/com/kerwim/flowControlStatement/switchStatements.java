package com.kerwim.flowControlStatement;

/**
 * switch 语句
 */
public class switchStatements {

    public static void main(String[] args) {
        demo01();
        demo03(PlayerTypes.BASKETBALL);
    }

    public static void demo01(){
        int age = 20;
        switch (age) {
            case 20 :
                System.out.println("上学");
                break;
            case 24 :
                System.out.println("工作");
                break;
            case 30 :
                System.out.println("结婚");
                break;
            default:
                System.out.println("未知");
                break; // 可省略
        }
    }

    public static void demo02(){
        String name = "kerwim";
        switch (name) {
            case "姚明":
                System.out.println("篮球运动员");
                break;
            case "C罗":
                System.out.println("足球运动员");
                break;
            case "kerwim":
            case "kevin":
                System.out.println("睡觉运动员");
                break;
            default:
                throw new IllegalArgumentException(
                        "名字没有匹配项");

        }
    }


    public enum PlayerTypes {
        TENNIS,
        FOOTBALL,
        BASKETBALL,
        UNKNOWN
    }


    public static String demo03(PlayerTypes playerType){
        switch (playerType) {
            case TENNIS:
                return "网球运动员费德勒";
            case FOOTBALL:
                return "足球运动员C罗";
            case BASKETBALL:
                return "篮球运动员姚明";
            case UNKNOWN:
                throw new IllegalArgumentException("未知");
            default:
                throw new IllegalArgumentException(
                        "运动员类型: " + playerType);

        }
    }
}
