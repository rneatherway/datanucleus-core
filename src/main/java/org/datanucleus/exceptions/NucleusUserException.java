/**********************************************************************
Copyright (c) 2006 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
    ...
**********************************************************************/
package org.datanucleus.exceptions;

/**
 * Exception thrown when a user error occurs.
 */
public class NucleusUserException extends NucleusException
{
    private static final long serialVersionUID = 3656872982168776107L;

    /**
     * Constructs a new exception without a detail message.
     */
    public NucleusUserException()
    {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.
     * @param msg the detail message.
     */
    public NucleusUserException(String msg)
    {
        super(msg);
    }

    /**
     * Constructs a new exception with the specified detail message and nested <code>Throwable</code>s.
     * @param msg the detail message.
     * @param nested the nested <code>Throwable[]</code>.
     */
    public NucleusUserException(String msg, Throwable[] nested)
    {
        super(msg, nested);
    }

    /**
     * Constructs a new exception with the specified detail message and nested <code>Throwable</code>.
     * @param msg the detail message.
     * @param nested the nested <code>Throwable</code>.
     */
    public NucleusUserException(String msg, Throwable nested)
    {
        super(msg, nested);
    }

    /**
     * Constructs a new exception with the specified detail message and failed object.
     * @param msg the detail message.
     * @param failed the failed object.
     */
    public NucleusUserException(String msg, Object failed)
    {
        super(msg, failed);
    }

    /**
     * Constructs a new exception with the specified detail
     * message, nested <code>Throwable</code>s, and failed object.
     * @param msg the detail message.
     * @param nested the nested <code>Throwable[]</code>.
     * @param failed the failed object.
     */
    public NucleusUserException(String msg, Throwable[] nested, Object failed)
    {
        super(msg, nested, failed);
    }

    /**
     * Constructs a new exception with the specified detail message, nested <code>Throwable</code>,
     * and failed object.
     * @param msg the detail message.
     * @param nested the nested <code>Throwable</code>.
     * @param failed the failed object.
     */
    public NucleusUserException(String msg, Throwable nested, Object failed)
    {
        super(msg, nested, failed);
    }
}