/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.homematic.internal.converter;

/**
 * Exception if converting between two types is not possible due wrong item type or command.
 *
 * @author Gerhard Riegler - Initial contribution
 */
public class ConverterTypeException extends ConverterException {
    private static final long serialVersionUID = 7114173349077221055L;

    public ConverterTypeException(String message) {
        super(message);
    }

}
