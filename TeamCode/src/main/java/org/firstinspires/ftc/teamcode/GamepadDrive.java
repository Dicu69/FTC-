package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcontroller.external.samples.BasicOpMode_Iterative;

@TeleOp(name="GamepadDrive", group="Iterative Opmode")
@Disabled
public class GamepadDrive extends OpMode {

    DcMotor leftWheel;
    DcMotor rightWheel;

    double leftWheelPower;
    double rightWheelPower;

    @Override
    public void init() {

        leftWheel=hardwareMap.dcMotor.get("left_wheel");
        rightWheel=hardwareMap.dcMotor.get("right_wheel");

        rightWheel.setDirection(DcMotor.Direction.REVERSE);

    }


    @Override
    public void loop() {
        //gamepad1 este gamepad-ul care incepe jocul cu start a
        leftWheelPower = gamepad1.left_stick_y;
        rightWheelPower = gamepad1.right_stick_y;


        leftWheel.setPower(leftWheelPower);
        rightWheel.setPower(rightWheelPower);

    }
}
