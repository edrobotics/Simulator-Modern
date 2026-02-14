// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.apriltag.AprilTagFieldLayout;
import edu.wpi.first.apriltag.AprilTagFields;

import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
      // Deadband for joystick inputs, prevents unwanted small movements
    public static final double DEADBAND = 0.15;
  }

  public static class DriveConstants {
    public static final double MAX_SPEED = Units.feetToMeters(15);
  }
  
  // Photon camera constants removed (vision system disabled)

  public static class LimelightConstants {
    public static final String leftCamName = "left";
    public static double kStdDevs = 0.800000;
  }

  public static class VisionConstants {
    // Contains the stored position of each April Tag on the field. This varies between seasons.
    public static final AprilTagFieldLayout aprilTagFieldLayout = AprilTagFieldLayout.loadField(AprilTagFields.k2026RebuiltWelded);
    public static final String kCameraName = null;
  }
  // Xbox controller IDs and axis mappings
  public static final int CONTROL_1_ID = 0;
  public static final int LEFT_STICK_Y = 1;
  public static final int RIGHT_STICK_Y = 5;
  // Trigger axes for GTA-style driving
  public static final int LEFT_TRIGGER = 3;
  public static final int RIGHT_TRIGGER = 4;
  // Left joystick axes
  public static final int LEFT_STICK_X = 0;
  
  // Hardware configuration for intake and climb (teams: set these to your CAN IDs)
  // Default values are placeholders; set to the correct IDs for your robot.
  public static final int intakeMotorId = 3;
  public static final boolean intakeConnected = false;

  public static final int CLIMB_MOTOR_ID = 4;
  public static final boolean CLIMB_CONNECTED = false;
}
