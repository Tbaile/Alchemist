/*
 * Copyright (C) 2010-2020, Danilo Pianini and contributors
 * listed in the main project's alchemist/build.gradle.kts file.
 *
 * This file is part of Alchemist, and is distributed under the terms of the
 * GNU General Public License, with a linking exception,
 * as described in the file LICENSE in the Alchemist distribution's top directory.
 */

package it.unibo.alchemist.model.interfaces

import it.unibo.alchemist.model.interfaces.geometry.Vector
import java.io.Serializable

/**
 * A generic obstacle in a vector space.
 *
 * @param V the vector type for the space in which this obstacle is placed.
 */
interface Obstacle<V : Vector<V>> : Serializable {

    /**
     * The id for this obstacle.
     */
    val id: Int
}
