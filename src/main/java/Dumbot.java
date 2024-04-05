import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Dumbot - a robot by (Panos)
 */
public class Dumbot extends Robot {
  private boolean shouldMove = true;

  /**
   * run: Dumbot's default behavior
   */
  public void run() {
    // Initialization of the robot should be put here

    // After trying out your robot, try uncommenting the import at the top,
    // and the next line:

    // setColors(Color.red,Color.blue,Color.green); // body,gun,radar

    // Robot main loop
    while (true) {
      // Replace the next 4 lines with any behavior you would like
      if (shouldMove) {
        ahead(30.0);
      }
    }
  }

  /**
   * onScannedRobot: What to do when you see another robot
   */
  public void onScannedRobot(ScannedRobotEvent e) {
    this.shouldMove = false;
    this.fire(1.0);
  }

  /**
   * onHitByBullet: What to do when you're hit by a bullet
   */
  public void onHitByBullet(HitByBulletEvent e) {
    this.shouldMove = true;
    this.turnGunRight(360);
    this.turnLeft(30.0);
    this.ahead(20.0);
  }

  public void onBulletMissed(BulletMissedEvent var1) {

    turnGunRight(360);
    this.scan();

  }


  /**
   * onHitWall: What to do when you hit a wall
   */
  public void onHitWall(HitWallEvent e) {
    // Replace the next line with any behavior you would like
    this.shouldMove = true;
    back(10);
    this.turnRight(90)
  }
}
