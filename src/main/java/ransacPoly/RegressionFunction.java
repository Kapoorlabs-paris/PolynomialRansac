package ransacPoly;

import java.util.ArrayList;

import net.imglib2.algorithm.ransac.RansacModels.Circle;
import net.imglib2.algorithm.ransac.RansacModels.Ellipsoid;
import ransac.PointFunctionMatch.PointFunctionMatch;

public class RegressionFunction {

	
	public final Threepointfit regression;
	
	public final Circle ellipse;
	
	public final HigherOrderPolynomialFunction higherorder;
	
	public final LinearFunction back;
	
	public final MixedPolynomialFunction <HigherOrderPolynomialFunction, HigherOrderPolynomialFunction,MixedPolynomial<HigherOrderPolynomialFunction, HigherOrderPolynomialFunction> > mixedfunction;
	
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
		
		this.higherorder = null;
		
		this.back = null;
		
		this.mixedfunction = null;
		
		this.Curvaturepoints = Curvaturepoints;
		
		this.inliers = null;
		
		this.candidates = null;
		
		this.ellipse = null;
		
	}
	
public RegressionFunction (final Circle ellipse, final ArrayList<double[]> Curvaturepoints) {
		
		
		this.regression = null;
		
		this.higherorder = null;
		
		this.back = null;
		
		this.mixedfunction = null;
		
		this.Curvaturepoints = Curvaturepoints;
		
		this.inliers = null;
		
		this.candidates = null;
		
		this.ellipse = ellipse;
		
	}
	
	/**
	 * 
	 * Constructor choice for Ransac
	 * 
	 * @param higherorder
	 * @param Curvaturepoints
	 * @param perimeter
	 */
    public RegressionFunction (final HigherOrderPolynomialFunction higherorder, final ArrayList<double[]> Curvaturepoints, final ArrayList<PointFunctionMatch> inliers,
    		final ArrayList<PointFunctionMatch> candidates) {
		
		
		this.regression = null;
		
		this.back = null;
		
		this.higherorder = higherorder;
		
		this.mixedfunction = null;
		
		this.Curvaturepoints = Curvaturepoints;
		
		this.inliers = inliers;
		
		this.candidates = candidates;
		
		this.ellipse = null;
		
	}
    
    /**
	 * 
	 * Constructor choice for Ransac
	 * 
	 * @param higherorder
	 * @param Curvaturepoints
	 * @param perimeter
	 */
    public RegressionFunction (final LinearFunction back, final ArrayList<double[]> Curvaturepoints, final ArrayList<PointFunctionMatch> inliers,
    		final ArrayList<PointFunctionMatch> candidates) {
		
		
		this.regression = null;
		
		this.back = back;
		
		this.higherorder = null;
		
		this.mixedfunction = null;
		
		this.Curvaturepoints = Curvaturepoints;
		
		this.inliers = inliers;
		
		this.candidates = candidates;
		
		this.ellipse = null;
		
	}
    
    public RegressionFunction (final MixedPolynomialFunction<HigherOrderPolynomialFunction, HigherOrderPolynomialFunction,MixedPolynomial<HigherOrderPolynomialFunction, HigherOrderPolynomialFunction> >  mixedfunction, final ArrayList<double[]> Curvaturepoints, final ArrayList<PointFunctionMatch> inliers,
    		final ArrayList<PointFunctionMatch> candidates) {
		
		
		this.regression = null;
		
		this.mixedfunction = mixedfunction;
		
		this.higherorder = null;
		
		this.back = null;
		
		this.Curvaturepoints = Curvaturepoints;
		
		this.inliers = inliers;
		
		this.candidates = candidates;
		
		this.ellipse = null;
		
	}
	
}
