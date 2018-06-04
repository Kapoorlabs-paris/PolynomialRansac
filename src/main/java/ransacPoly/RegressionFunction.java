package ransacPoly;

import java.util.ArrayList;

import ransac.PointFunctionMatch.PointFunctionMatch;
import ransacPoly.AbstractFunction2D;
import ransacPoly.QuadraticFunction;

public class RegressionFunction {

	
	public final Threepointfit regression;
	
	public final QuadraticFunction quad;
	
	public final LinearFunction back;
	
	public final MixedPolynomialFunction <LinearFunction, QuadraticFunction,MixedPolynomial<LinearFunction, QuadraticFunction> > mixedfunction;
	
	public final ArrayList<double[]> Curvaturepoints;
	
	public final ArrayList<PointFunctionMatch> inliers;
	
	public final ArrayList<PointFunctionMatch> candidates;
	
	/**
	 * 
	 * Constructor choice for regression
	 * @param regression
	 * @param Curvaturepoints
	 * @param perimeter
	 */
	public RegressionFunction (final Threepointfit regression, final ArrayList<double[]> Curvaturepoints) {
		
		
		this.regression = regression;
		
		this.quad = null;
		
		this.back = null;
		
		this.mixedfunction = null;
		
		this.Curvaturepoints = Curvaturepoints;
		
		this.inliers = null;
		
		this.candidates = null;
		
	}
	
	/**
	 * 
	 * Constructor choice for Ransac
	 * 
	 * @param quad
	 * @param Curvaturepoints
	 * @param perimeter
	 */
    public RegressionFunction (final QuadraticFunction quad, final ArrayList<double[]> Curvaturepoints, final ArrayList<PointFunctionMatch> inliers,
    		final ArrayList<PointFunctionMatch> candidates) {
		
		
		this.regression = null;
		
		this.back = null;
		
		this.quad = quad;
		
		this.mixedfunction = null;
		
		this.Curvaturepoints = Curvaturepoints;
		
		this.inliers = inliers;
		
		this.candidates = candidates;
		
	}
    
    /**
	 * 
	 * Constructor choice for Ransac
	 * 
	 * @param quad
	 * @param Curvaturepoints
	 * @param perimeter
	 */
    public RegressionFunction (final LinearFunction back, final ArrayList<double[]> Curvaturepoints, final ArrayList<PointFunctionMatch> inliers,
    		final ArrayList<PointFunctionMatch> candidates) {
		
		
		this.regression = null;
		
		this.back = back;
		
		this.quad = null;
		
		this.mixedfunction = null;
		
		this.Curvaturepoints = Curvaturepoints;
		
		this.inliers = inliers;
		
		this.candidates = candidates;
		
	}
    
    public RegressionFunction (final MixedPolynomialFunction<LinearFunction, QuadraticFunction,MixedPolynomial<LinearFunction, QuadraticFunction> >  mixedfunction, final ArrayList<double[]> Curvaturepoints, final ArrayList<PointFunctionMatch> inliers,
    		final ArrayList<PointFunctionMatch> candidates) {
		
		
		this.regression = null;
		
		this.mixedfunction = mixedfunction;
		
		this.quad = null;
		
		this.back = null;
		
		this.Curvaturepoints = Curvaturepoints;
		
		this.inliers = inliers;
		
		this.candidates = candidates;
		
	}
	
}
