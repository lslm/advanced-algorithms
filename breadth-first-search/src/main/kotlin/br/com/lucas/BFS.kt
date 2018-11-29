package br.com.lucas

import java.util.*

object BFS {
    fun bfs(root: Vertex) {
        var queue: Queue<Vertex> = LinkedList()

        root.visited = true
        queue.add(root)

        while (queue.isNotEmpty()) {
            val actualVertex: Vertex = queue.remove()

            println(actualVertex)

            actualVertex.neighbourVertexes.forEach {
                if (!it.visited) {
                    it.visited = true
                    queue.add(it)
                }
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var v1 = Vertex(data = 1)
        var v2 = Vertex(data = 2)
        var v3 = Vertex(data = 3)
        var v4 = Vertex(data = 4)
        var v5 = Vertex(data = 5)

        v1.addNeighbourVertex(v2)
        v1.addNeighbourVertex(v4)
        v4.addNeighbourVertex(v5)
        v2.addNeighbourVertex(v3)

        bfs(v1)
    }
}
