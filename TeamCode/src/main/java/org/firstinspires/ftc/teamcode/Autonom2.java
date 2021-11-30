package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

//Asta nu e autonom e doar modul prin care controlez robotul cu controller, facut cu ajutoru la sample

@TeleOp(name="Autonom2", group="Linear Opmode")

public class Autonom2 extends LinearOpMode {

    // Declaram ce are el
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftDriveforward = null;
    private DcMotor rightDriveforward = null;
    private DcMotor leftDriveback = null;
    private DcMotor rightDriveback = null;

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Pornit");
        telemetry.update();

        // Aici punem variabilele
        // Trebuie schimbate peste tot
        // .
        leftDriveforward  = hardwareMap.get(DcMotor.class, "left_drive_forward");
        rightDriveforward = hardwareMap.get(DcMotor.class, "right_drive_forward");
        leftDriveback = hardwareMap.get(DcMotor.class, "left_drive_back");
        rightDriveback = hardwareMap.get(DcMotor.class, "right_drive_back");

        // motoru de pe o parte trebuie rezervat sa mearga in fata
        // Rezervam motorul de langa bateri () ca sa mearga in spate
        leftDriveforward.setDirection(DcMotor.Direction.FORWARD);
        rightDriveforward.setDirection(DcMotor.Direction.REVERSE);
        leftDriveback.setDirection(DcMotor.Direction.FORWARD);
        rightDriveback.setDirection(DcMotor.Direction.REVERSE);

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            if gamepad1.right_bumper(Range.clip(-0.5, 0.5))



            double leftPower;
            double rightPower;

            double drive = -gamepad1.left_stick_y;
            double turn  =  gamepad1.right_stick_x;
            double
            leftPower    = Range.clip(drive + turn, -1.0, 1.0) ;
            rightPower   = Range.clip(drive - turn, -1.0, 1.0) ;



            // Trimite putere(vroom vroom ) spre roti
            leftDriveforward.setPower(leftPower);
            leftDriveback.setPower(leftPower);
            rightDriveforward.setPower(rightPower);
            rightDriveback.setPower(rightPower);

            // Aici arata cat timp a fost gametime ul si cata putere au rotile.
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("Motors", "left (%.2f), right (%.2f)", leftPower, rightPower);
            telemetry.update();

            if gamepad1.right_bumper  = Range.clip(drive + turn, -0.5, 0.5)
        }
    }
}