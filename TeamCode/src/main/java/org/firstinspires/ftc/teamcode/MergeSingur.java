package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="Merge fata pana stop", group="Exercitii")
@Disabled
public class MergeSingur extends OpMode {

    private DcMotor rightWheelforward = null;
    private DcMotor leftWheelforward = null;
    private DcMotor leftWheelback = null;
    private DcMotor rightWheelback = null;
    double drivePower = .2;

    @Override
    public void init() {

        leftWheelforward=hardwareMap.dcMotor.get("left_wheel_forward");
        rightWheelforward=hardwareMap.dcMotor.get("right_wheel_forward");
        leftWheelback=hardwareMap.dcMotor.get("left_wheel_back");
        rightWheelback=hardwareMap.dcMotor.get("right_wheel_back");

        rightWheelforward.setDirection(DcMotor.Direction.REVERSE);
        rightWheelback.setDirection(DcMotor.Direction.REVERSE);
        leftWheelforward.setDirection(DcMotor.Direction.FORWARD);
        leftWheelback.setDirection(DcMotor.Direction.FORWARD);

    }


    @Override
    public void loop() {
        leftWheelforward.setPower(drivePower);
        rightWheelforward.setPower(drivePower);
        rightWheelback.setPower(drivePower);
        leftWheelback.setPower(drivePower);

    }

}

