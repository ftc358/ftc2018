package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

@TeleOp

public class Model_DriveTrain extends LinearOpMode{

    DcMotor lM;
    DcMotor rM;

    @Override
    public void runOpMode() throws InterruptedException
    {
    lM = hardwareMap.dcMotor.get("leftMotor");
    rM = hardwareMap.dcMotor.get("rightMotor");

    lM.setDirection(DcMotor.Direction.REVERSE);
    rM.setDirection(DcMotor.Direction.REVERSE);

    }
    waitForStart();

        while(opModeIsActive()) {
    }
}
