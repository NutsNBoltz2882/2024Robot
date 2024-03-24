// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import java.util.function.Supplier;

import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  private final CANSparkMax frontLeft;
  private final CANSparkMax frontRight;
  private final CANSparkMax backLeft;
  private final CANSparkMax backRight;
  
  private final DifferentialDrive drivetrain;

  /** Creates a new Drivetrain. */
  public Drivetrain(int fl, int fr, int bl, int br) {
    frontLeft = new CANSparkMax(fl, MotorType.kBrushless);
    frontRight = new CANSparkMax(fr, MotorType.kBrushless);
    backLeft = new CANSparkMax(bl, MotorType.kBrushless);
    backRight = new CANSparkMax(br, MotorType.kBrushless);
    
    backLeft.follow(frontLeft);
    backRight.follow(frontRight);
    
    frontRight.setInverted(false);
    frontLeft.setInverted(true);
    drivetrain = new DifferentialDrive(frontLeft, frontRight);

  }

  public Command arcadeDriveCommand(Supplier<Double> speed, Supplier<Double> rotation) {
    return run(
        () -> {
          drivetrain.arcadeDrive(speed.get(), rotation.get());
        });
  }
  public Command driveForwardAuto(){
    return run(
      () -> {
        drivetrain.arcadeDrive(.8, 0);
      }
    );
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
