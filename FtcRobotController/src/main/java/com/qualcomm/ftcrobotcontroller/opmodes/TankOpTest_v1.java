package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Connor Chang on 9/28/2015.
 * TODO: Make new class.
 */
public class TankOpTest_v1 extends OpMode {

    DcMotor rightDrive;
    DcMotor leftDrive;

    float rightGamepad = -gamepad1.right_stick_y;
    float leftGamepad = -gamepad1.left_stick_y;

    @Override
    public void init() {

        rightDrive = hardwareMap.dcMotor.get("left_drive");
        leftDrive = hardwareMap.dcMotor.get("right_drive");

        rightDrive.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop() {

        rightDrive.setPower(rightGamepad * .5);
        leftDrive.setPower(leftGamepad * .5);

    }
}
