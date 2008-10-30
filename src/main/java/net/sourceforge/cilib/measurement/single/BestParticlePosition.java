/*
 * Copyright (C) 2003 - 2008
 * Computational Intelligence Research Group (CIRG@UP)
 * Department of Computer Science
 * University of Pretoria
 * South Africa
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.cilib.measurement.single;

import net.sourceforge.cilib.algorithm.Algorithm;
import net.sourceforge.cilib.measurement.Measurement;
import net.sourceforge.cilib.type.types.StringType;
import net.sourceforge.cilib.type.types.Type;
import net.sourceforge.cilib.type.types.container.Vector;

/**
 * Print the position of the best particle in the swarm.
 * 
 * @author Gary Pampara
 */
public class BestParticlePosition implements Measurement { 
	private static final long serialVersionUID = 5808686984197365658L;

	/**
	 * Create a nw instance of {@linkplain BestParticlePosition}.
	 */
	public BestParticlePosition() {
    }
	
	/**
	 * Copy the provided instance.
	 * @param copy The instance to copy.
	 */
	public BestParticlePosition(BestParticlePosition copy) {
		
	}

	/**
	 * {@inheritDoc}
	 */
	public BestParticlePosition getClone() {
		return new BestParticlePosition(this);
	}

	/**
	 * {@inheritDoc}
	 */
    public String getDomain() {
    	return "T";
    }
    
    /**
     * {@inheritDoc}
     */
    public Type getValue(Algorithm algorithm) {
        Vector solution = (Vector) algorithm.getBestSolution().getPosition();
        
        StringType t = new StringType();
        t.setString(solution.toString());
        
        return t;    	
    }

}
