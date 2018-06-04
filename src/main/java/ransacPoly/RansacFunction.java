package ransacPoly;

import java.util.ArrayList;

import ransac.PointFunctionMatch.PointFunctionMatch;

public class RansacFunction {

	
	public final QuadraticFunction function;

	public final ArrayList<PointFunctionMatch> inliers;
	
	public final ArrayList<PointFunctionMatch> candidates;
	
	/**
	 * 
	 * A ransac function output containing a quadratic function if one was found else it would fit a linear function if there are atleast two points to fit it on to
	 * @param function
	 * @param linearfunction
	 * @param inliers
	 */
	public RansacFunction(final QuadraticFunction function, ArrayList<PointFunctionMatch> inliers,  ArrayList<PointFunctionMatch> candidates ) {
		
		
		this.function = function;

		this.inliers = inliers;
		
		this.candidates = candidates;
		
	}


    
}
