package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class GTADrive extends Command {
    private final DriveTrain m_drive;

    public GTADrive(DriveTrain drive) {
      m_drive = drive;
      addRequirements(m_drive);
    }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double steering = RobotContainer.m_driverController.getLeftX();
    double rightTrigger = RobotContainer.m_driverController.getRightTriggerAxis();
    double leftTrigger = RobotContainer.m_driverController.getLeftTriggerAxis();
    double speed = (leftTrigger * (Math.abs(leftTrigger) > Constants.OperatorConstants.DEADBAND ? 1 : 0) - rightTrigger * (Math.abs(rightTrigger) > Constants.OperatorConstants.DEADBAND ? 1 : 0))/2;

    m_drive.setLeftMotors(speed - steering * Math.abs(steering) * (Math.abs(steering) > Constants.OperatorConstants.DEADBAND ? 1 : 0));
    m_drive.setRightMotors(speed + steering * Math.abs(steering) * (Math.abs(steering) > Constants.OperatorConstants.DEADBAND ? 1 : 0));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drive.setLeftMotors(0);
    m_drive.setRightMotors(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
