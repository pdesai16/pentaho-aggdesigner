/*
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU General Public License, version 2 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/gpl-2.0.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU General Public License for more details.
*
*
* Copyright 2006 - 2013 Pentaho Corporation.  All rights reserved.
*/

package org.pentaho.aggdes.model;

import java.util.List;


/**
 * Aggregate, also known as an aggregate table, or summary table.
 * Generated by the algorithm.
 */
public interface Aggregate {

    /**
     * Returns a suggestion for the name of a table in which to store this 
     * aggregate.
     *
     * <p>The suggestion does not need to be unique within the db schema or
     * less than the database's table name limit, but the implementation should
     * try to generate a name that is likely to be unique and descriptive in
     * the first 20 or so characters.
     *
     * @return candidate table name
     */
    String getCandidateTableName();
    
    /**
     * Returns a text description of this aggregate
     * 
     * @return description of aggregate
     */
    public String getDescription();
    
    /**
     * Returns a list of attributes in this aggregate table.
     *
     * @return list of attributes in this aggregate table
     */
    List<Attribute> getAttributes();

    /**
     * Returns a list of measures in this aggregate table.
     *
     * @return list of measures in this aggregate table
     */
    List<Measure> getMeasures();

    /**
     * Returns an estimate of the number of distinct values in this
     * Aggregate.
     *
     * @return estimated number of distinct values
     */
    double estimateRowCount();

    /**
     * Returns an estimate of the amount of space (in bytes) required to
     * store this Aggregate.
     *
     * @return estimated space in bytes
     */
    double estimateSpace();
}

// End Aggregate.java
