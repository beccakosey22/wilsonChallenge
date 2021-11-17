// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class driveTrainSubsystem extends SubsystemBase {


  private WPI_TalonSRX leftLeader = new WPI_TalonSRX(3); 
  private WPI_VictorSPX left2 = new WPI_VictorSPX(4); 
  private WPI_VictorSPX left3 = new WPI_VictorSPX(5);

  private WPI_TalonSRX rightLeader = new WPI_TalonSRX(0); 
  private WPI_VictorSPX right2 = new WPI_VictorSPX(1); 
  private WPI_VictorSPX right3 = new WPI_VictorSPX(2);
  private DifferentialDrive movement; 
  public driveTrainSubsystem() {
    super();

    left2.follow(leftLeader);
    left3.follow(leftLeader);

    right2.follow(rightLeader);
    right3.follow(rightLeader);
    movement = new DifferentialDrive(leftLeader, rightLeader);
  }
  public void drive(double xSpeed, double zRotation) {
    movement.arcadeDrive(xSpeed, zRotation);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
