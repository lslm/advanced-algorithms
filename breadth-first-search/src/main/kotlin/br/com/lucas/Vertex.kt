package br.com.lucas

data class Vertex(
    var data: Int,
    var visited: Boolean = false,
    var neighbourVertexes: ArrayList<Vertex> = ArrayList()
) {

    fun addNeighbourVertex(vertex: Vertex) {
        neighbourVertexes.add(vertex)
    }

    override fun toString(): String = this.data.toString()
}
