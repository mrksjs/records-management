/*
 * Copyright (C) 2005-2016 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfresco.util;

import org.alfresco.error.AlfrescoRuntimeException;

/**
 * Enumeration for sort direction.
 *
 * @author Tuna Aksoy
 * @since 2.5
 */
public enum SortDirection
{
    ASC ("asc"),
    DESC ("desc");

    /** A string representation of the sort direction. */
    private final String sortDirection;

    private SortDirection(String sortDirection)
    {
        this.sortDirection = sortDirection;
    }

    /**
     * Get the appropriate {@code SortDirection} from a string representation.
     *
     * @param sortDirectionString A string representation (case will be ignored).
     * @return The {@code SortDirection} value.
     */
    public static SortDirection getSortDirection(String sortDirectionString)
    {
        SortDirection sortDirection = null;

        for (SortDirection value : values())
        {
            if (value.sortDirection.equalsIgnoreCase(sortDirectionString))
            {
                sortDirection = value;
                break;
            }
        }

        if (sortDirection == null)
        {
            throw new AlfrescoRuntimeException("Sort direction '" + sortDirection +"' unknown.");
        }

        return sortDirection;
    }
}