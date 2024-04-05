import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Dumbot - a robot by (Panos)
 */
public class Dumbot extends Robot
{
	/**
	 * run: Dumbot's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like

			turnRight(10.0);
			ahead(30.0);
//			ahead(100);
//			turnGunRight(360);
//			back(100);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		if (e.getDistance() > 100.0) {
			this.fire(1.0);
		} else {
			this.fire(2.0);
		}
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		this.turnLeft(30.0);
		this.ahead(20.0);
	}

	public void onBulletMissed(BulletMissedEvent var1) {
		this.scan();
	}


	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
