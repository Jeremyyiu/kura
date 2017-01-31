/*******************************************************************************
 * Copyright (c) 2016, 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Eurotech
 *  Amit Kumar Mondal
 *
 *******************************************************************************/
package org.eclipse.kura.wire;

import org.osgi.service.wireadmin.BasicEnvelope;
import org.osgi.service.wireadmin.Envelope;

/**
 * The Class WireEnvelope represents a composite envelope to be used as an
 * abstract data to be transmitted between the wire emitter and the wire
 * receiver
 *
 * @see Envelope
 * @see BasicEnvelope
 *
 * @noextend This class is not intended to be extended by clients.
 */
public class WireEnvelope extends BasicEnvelope {

    /**
     * The scope as agreed by the composite producer and consumer. This remains
     * same for all the Kura Wires communications.
     */
    private static final String SCOPE = "WIRES";

    /**
     * Instantiates a new WireEnvelope.
     *
     * @param emitterPid
     *            the wire emitter PID
     * @param wireRecords
     *            the wire records
     */
    public WireEnvelope(String emitterPid, WireRecord wireRecord) {
        super(wireRecord, emitterPid, SCOPE);
    }

    /**
     * Gets the wire emitter PID.
     *
     * @return the wire emitter PID
     */
    public String getEmitterPid() {
        return (String) getIdentification();
    }

    /**
     * Gets the wire records.
     *
     * @return the wire records
     */
    public WireRecord getRecord() {
        return (WireRecord) getValue();
    }

}
