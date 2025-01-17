package coordinate;

/******************************************************************
 * <p>
 * A Point representing a location (x, y) in coordinate space, specified with
 * integer precision.
 ******************************************************************/

public class Point {

	/****************************************************
	 * data fields stores the (x, y) location of the current point
	 ****************************************************/
	private int x;
	private int y;

	/**********************************************************
	 * constructs and initializes the current point at the origin (0,0) of the
	 * coordinate plane.
	 **********************************************************/
	public Point() {
		x = 0;
		y = 0;
	}

	/**********************************************************
	 * constructs and initializes the current point to the location specified by the
	 * other Point passed.
	 * 
	 * @param other point object.
	 **********************************************************/
	public Point(Point other) {
		this.x = other.x;
		this.y = other.y;
	}

	/***********************************************************
	 * constructs and initializes the current point to the specified (x,y) location.
	 * 
	 * @param x the x coordinate of point to construct.
	 * @param y the y coordinate of point to construct.
	 ***********************************************************/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/***********************************************************
	 * returns the distance from the current Point object to the origin in
	 * coordinate space.
	 * 
	 * @return distance between two points.
	 ***********************************************************/
	public double distanceFromOrigin() {
		return distance(new Point());
	}

	/***********************************************************
	 * returns the distance between the current Point object and the other specified
	 * Point object in coordinate space.
	 * 
	 * @param other point object.
	 * @return distance between two points.
	 ***********************************************************/
	public double distance(Point other) {
		int dx = x - other.x;
		int dy = y - other.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	/***************************************************************
	 * compares the contents of the current object to the passed object. Returns
	 * true if they have the same (x,y) position.
	 * 
	 * @param object Object
	 * @return result of content evaluation.
	 ***************************************************************/
	public boolean equals(Object object) {
		
		if(object instanceof Point) {
			Point other = (Point)object;
			return this.x == other.getX() && this.y == other.getY();
		}
		return false;
	}
		

	/*****************************************************************
	 * negates and flips the (x, y) coordinates of the current Point object.
	 *****************************************************************/
	public void flip() {
		int x1 = this.x;
		int y1 = this.y;
		this.y = -1 * x1;
		this.x = -1 * y1;
	}

	/***************************************************************
	 * returns the x coordinate of the point in integer precision.
	 * 
	 * @return x the x coordinate of point object.
	 ***************************************************************/
	public int getX() {
		return x;
	}

	/***************************************************************
	 * returns the y coordinate of the point in integer precision.
	 * 
	 * @return y the y coordinate of point object.
	 ***************************************************************/
	public int getY() {
		return y;
	}

	/***************************************************************
	 * returns the default memory address for the object converted into an integer
	 * value (called a hash code).
	 * 
	 * @return y the y coordinate of point object.
	 ***************************************************************/
	public int hashCode() {
		return 31337 * y + x;
	}

	/********************************************************************
	 * returns true if the slope is the same for each pair of points specified. The
	 * base case of all x or y values being the same is also managed. Slope
	 * tolerance to within 4 decimal places.
	 * 
	 * @param p1 second point
	 * @param p2 third point
	 * @return result if point is collinear with points on a Line.
	 ********************************************************************/
	public boolean isCollinear(Point p1, Point p2) {

		if ((this.x == p1.x && this.x == p2.x) || (this.y == p1.y && this.y == p2.y)) {
			return true;
		} else {
			double slope1 = (double) (this.y - p1.y) / (double) (this.x - p1.x);
			double slope2 = (double) (this.y - p2.y) / (double) (this.x - p2.x);
			slope1 = Math.round(slope1 * 10000.0) / 1000.0;
			slope2 = Math.round(slope2 * 10000.0) / 1000.0;
			return slope1 == slope2;
		}
	}

	/********************************************************************
	 * returns true if the specified point lines up vertically with the current
	 * Point (x coordinates are the same).
	 * 
	 * @param other point
	 * @return result if points are vertical.
	 ********************************************************************/
	public boolean isVertical(Point other) {
		return this.x == other.x;
	}

	/*****************************************************************
	 * returns which quadrant of the coordinate plane the current object falls in.
	 * 
	 * @return quadrant where point is located.
	 *****************************************************************/
	public int quadrant() {

		if (x > 0 && y > 0) {
			return 1;
		} else if (x < 0 && y > 0) {
			return 2;
		} else if (x < 0 && y < 0) {
			return 3;
		} else if (x > 0 && y < 0) {
			return 4;
		} else {
			return 0;
		}

	}

	/*****************************************************************
	 * changes the location of the point in the coordinate plane to the location
	 * specified by the values (x, y).
	 * 
	 * @param x the specified x coordinate value.
	 * @param y the specified y coordinate value.
	 *****************************************************************/
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/********************************************************************
	 * returns the slope is the same for each pair of points specified.
	 * 
	 * @param other point
	 * @return slope of two points.
	 * @throws IllegalArgumentException if change in x is zero.
	 ********************************************************************/
	public double slope(Point other) {

		if (other.x == this.x) {
			throw new IllegalArgumentException();
		}

		return ((double) (other.y - y) / (other.x - x));
	}

	/***************************************************************
	 * returns string representation of a point.
	 * 
	 * @return point (x, y) coordinates.
	 **************************************************************/
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}

	/***************************************************************
	 * shifts the current point's (x,y) location by dx along the x-axis and dy along
	 * the y-axis, giving (x + dx, y + dy).
	 * 
	 * @param dx the specified x coordinate value.
	 * @param dy the specified y coordinate value.
	 ***************************************************************/
	public void translate(int dx, int dy) {
		x += dx; // x = x + dx
		y += dy; // y = y + dy
	}

}
