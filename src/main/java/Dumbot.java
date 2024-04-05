import robocode.*;
//import java.awt.Color;
import static robocode.util.Utils.normalRelativeAngleDegrees;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Dumbot - a robot by (Panos)
 */
public class Dumbot extends Robot {
  private boolean shouldMove = false;

  /**
   * run: Dumbot's default behavior
   */
  public void run() {
    // Initialization of the robot should be put here

    turnRight(normalRelativeAngleDegrees(0 - getHeading()));
    ahead(5000);
    turnLeft(90);
    // After trying out your robot, try uncommenting the import at the top,
    // and the next line:

    // setColors(Color.red,Color.blue,Color.green); // body,gun,radar

    // Robot main loop
//    while (true) {
      // Replace the next 4 lines with any behavior you would like
//      if (shouldMove) {
//        ahead(30.0);
//      }
//    }
  }

  /**
   * onScannedRobot: What to do when you see another robot
   */
  public void onScannedRobot(ScannedRobotEvent e) {
    if (robotDistance > 400) {
      return;
    }
    this.fire(1.0);
  }

  /**
   * onHitByBullet: What to do when you're hit by a bullet
   */
  public void onHitByBullet(HitByBulletEvent e) {
    ahead(5000);
    turnLeft(90);
  }

  public void onBulletMissed(BulletMissedEvent var1) {
    this.scan();
  }


  /**
   * onHitWall: What to do when you hit a wall
   */
  public void onHitWall(HitWallEvent e) {
    // Replace the next line with any behavior you would like
//    back(10);
//    this.turnRight(90)
  }
}
