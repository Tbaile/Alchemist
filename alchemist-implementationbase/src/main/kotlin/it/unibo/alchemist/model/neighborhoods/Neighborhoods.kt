/*
 * Copyright (C) 2010-2023, Danilo Pianini and contributors
 * listed, for each module, in the respective subproject's build.gradle.kts file.
 *
 * This file is part of Alchemist, and is distributed under the terms of the
 * GNU General Public License, with a linking exception,
 * as described in the file LICENSE in the Alchemist distribution's top directory.
 */
package it.unibo.alchemist.model.neighborhoods

import it.unibo.alchemist.model.Environment
import it.unibo.alchemist.model.Node
import it.unibo.alchemist.model.Position

/**
 * Contains utility functions for neighborhoods.
 */
object Neighborhoods {
    /**
     * Creates a [SimpleNeighborhood].
     *
     * @param environment The environment of the neighborhood.
     * @param center The center of the neighborhood.
     * @param neighbors The neighbors in the neighborhood, defaults to empty.
     *
     * @return The newly created [SimpleNeighborhood].
     */
    @JvmStatic @JvmOverloads
    fun <T, P : Position<P>> make(
        environment: Environment<T, P>,
        center: Node<T>,
        neighbors: Iterable<Node<T>> = emptyList(),
    ) = SimpleNeighborhood(environment, center, neighbors)
}
