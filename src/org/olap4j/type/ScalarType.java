/*
// $Id: //open/mondrian/src/main/org.olap4j.type/ScalarType.java#3 $
// This software is subject to the terms of the Common Public License
// Agreement, available at the following URL:
// http://www.opensource.org/licenses/cpl.html.
// Copyright (C) 2005-2005 Julian Hyde
// All Rights Reserved.
// You must accept the terms of that agreement to use this software.
*/
package org.olap4j.type;

import org.olap4j.metadata.Dimension;
import org.olap4j.metadata.Hierarchy;
import org.olap4j.metadata.Level;

/**
 * Base class for types which represent scalar values.
 *
 * <p>An instance of this class means a scalar value of unknown type.
 * Usually one of the derived classes {@link NumericType},
 * {@link StringType}, {@link BooleanType} is used instead.
 *
 * @author jhyde
 * @since Feb 17, 2005
 * @version $Id: //open/mondrian/src/main/org.olap4j.type/ScalarType.java#3 $
 */
public class ScalarType implements Type {
    public boolean usesDimension(Dimension dimension, boolean maybe) {
        return false;
    }

    public Hierarchy getHierarchy() {
        return null;
    }

    public Level getLevel() {
        return null;
    }

    public Dimension getDimension() {
        return null;
    }
}

// End ScalarType.java