package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Connor Chang on 11/9/2015.
 */

public class armControl extends OpMode {

    //Definitions:

        //Drive Motors(gamepad1)
            DcMotor leftDrive;
            DcMotor rightDrive;

        //Arm Motors(gamepad2)
            DcMotor armRotate;
            DcMotor armBend1;
            DcMotor armBend2;

    @Override
    public void init() {

        leftDrive = hardwareMap.dcMotor.get("left_drive");
        rightDrive = hardwareMap.dcMotor.get("right_drive");
        armRotate = hardwareMap.dcMotor.get("arm_rotate");
        armBend1 = hardwareMap.dcMotor.get("arm_lift1");
        armBend2 = hardwareMap.dcMotor.get("arm_lift2");

    }

    @Override
    public void loop() {

        //Gamepad 1
        float leftY1 = gamepad1.left_stick_y;
        float leftX1 = gamepad1.left_stick_x;
        float rightY1 = -gamepad1.right_stick_y;
        float rightX1 = gamepad1.right_stick_x;

        //Gamepad 2
        float leftY2 = gamepad2.left_stick_y;
        float leftX2 = gamepad2.left_stick_x;
        float rightY2 = gamepad2.right_stick_y;
        float rightX2 = gamepad2.right_stick_x;

        //Drive Controls:
        leftDrive.setPower(leftY1);
        rightDrive.setPower(rightY1);

        //Arm Controls:
        armBend1.setPower(leftY2);
        armBend2.setPower(rightY2);
        armRotate.setPower(leftX2);

    }
}
