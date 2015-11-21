package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Connor Chang on 10/19/2015.
 */

    public class AutonomousMode extends LinearOpMode {

        //Motor Definitions:
        DcMotor left_drive;
        DcMotor right_drive;


    @Override
    public void runOpMode() throws InterruptedException {
        left_drive = hardwareMap.dcMotor.get("left_drive");
        right_drive = hardwareMap.dcMotor.get("right_drive");

        waitForStart();

        left_drive.setPower(1);
        right_drive.setPower(1);

        sleep(1333);

        left_drive.setPower(0);
        right_drive.setPower(0);
    }
}