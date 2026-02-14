// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrain;

/** Simple autonomous command that drives forward for a fixed time then stops. */
public class Auto extends Command {
  private final DriveTrain m_drive;
  private final Timer m_timer = new Timer();

  /** Drive forward for three seconds at half speed. */
  public Auto(DriveTrain drive) {
    m_drive = drive;
    addRequirements(drive);
  }

  @Override
  public void initialize() {
    m_timer.reset();
    m_timer.start();
  }

  @Override
  public void execute() {
    if (m_timer.get() < 3.0) {
      m_drive.setLeftMotors(0.5);
      m_drive.setRightMotors(0.5);
    } else {
      m_drive.setLeftMotors(0);
      m_drive.setRightMotors(0);
    }
  }

  @Override
  public void end(boolean interrupted) {
    m_timer.stop();
    m_drive.setLeftMotors(0);
    m_drive.setRightMotors(0);
  }

  @Override
  public boolean isFinished() {
    return m_timer.get() >= 3.0;
  }
}
