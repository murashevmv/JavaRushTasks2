/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.javarush.task.task13.task1328;

public class Robot extends AbstractRobot {
   // private static int hitCount;
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public BodyPart attack() {
//        BodyPart attackedBodyPart = null;
//        hitCount = hitCount + 1;
//
//        if (hitCount == 1) {
//            attackedBodyPart = BodyPart.ARM;
//        } else if (hitCount == 2) {
//            attackedBodyPart = BodyPart.HEAD;
//        } else if (hitCount == 3) {
//            hitCount = 0;
//            attackedBodyPart = BodyPart.LEG;
//        }
//        return attackedBodyPart;
//    }
//
//    public BodyPart defense() {
//        BodyPart defendedBodyPart = null;
//        hitCount = hitCount + 2;
//
//        if (hitCount == 1) {
//            defendedBodyPart = BodyPart.HEAD;
//        } else if (hitCount == 2) {
//            defendedBodyPart = BodyPart.LEG;
//        } else if (hitCount == 3) {
//            hitCount = 0;
//            defendedBodyPart = BodyPart.ARM;
//        }
//        return defendedBodyPart;
//    }
}
