// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot.commands;

// import java.io.File;

// import edu.wpi.first.wpilibj.Filesystem;
// import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// import edu.wpi.first.wpilibj2.command.Command;
// import frc.robot.subsystems.SwerveSubsystem;

// public class DriveBack extends Command {
//   /** Creates a new DriveBack. */
// private final SwerveSubsystem drivebase = new SwerveSubsystem(new File(Filesystem.getDeployDirectory(),
//                                                                          "neo"));
//   public DriveBack() {
//     // Use addRequirements() here to declare subsystem dependencies.
//     addRequirements(drivebase);
//   }

//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {}

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {}

//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {}

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     return false;
//   }
// }
