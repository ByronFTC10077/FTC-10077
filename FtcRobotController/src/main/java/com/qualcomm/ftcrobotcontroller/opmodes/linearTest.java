package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class linearTest extends OpMode {

    final double LEFT_OPEN_POSITION = 0.0;
    final double LEFT_CLOSED_POSITION = 0.5;
    final double RIGHT_OPEN_POSITION = 1.0;
    final double RIGHT_CLOSED_POSITION = 0.5;

    DcMotor leftDrive;
    DcMotor rightDrive;

    DcMotor armX;
    DcMotor armY;

    Servo leftGrip;
    Servo rightGrip;

    @Override
    public void init() {

        leftDrive = hardwareMap.dcMotor.get("left_drive");
        rightDrive = hardwareMap.dcMotor.get("right_drive");

        armX = hardwareMap.dcMotor.get("arm_one");
        armY = hardwareMap.dcMotor.get("arm_two");

        leftGrip = hardwareMap.servo.get("grip_left");
        rightGrip = hardwareMap.servo.get("grip_right");

        rightDrive.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop() {

        float leftY = gamepad1.left_stick_y;
        float leftX = gamepad1.left_stick_x;
/*      float rightY = gamepad1.right_stick_y;
        float rightX = gamepad1.right_stick_x;

        float r = gamepad1.right_trigger;

*/      float lp = leftY + leftX;
        float rp = leftY - leftX;

        lp = Range.clip(lp, -1, 1);
        rp = Range.clip(rp, -1, 1);

        /**
         * Arcade Drive functions
         */

            leftDrive.setPower(lp);
            rightDrive.setPower(rp);

/*      /**
         * Arm functions
         */
/*
            armY.setPower(rightY);
            armX.setPower(leftX);

        /**
         * Gripper functions
         */

/*          if(r == -1) {

                leftGrip.setPosition(LEFT_CLOSED_POSITION);
                rightGrip.setPosition(RIGHT_CLOSED_POSITION);

            }
            else {

                leftGrip.setPosition(LEFT_OPEN_POSITION);
                rightGrip.setPosition(RIGHT_OPEN_POSITION);

            }
*/
    }
}