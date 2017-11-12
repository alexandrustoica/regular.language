package automaton.regular.domain

/**
 * @author Alexandru Stoica
 * @version 1.0
 */

interface Symbol {
    val value: String
    val type: SymbolType
    fun toState() = State(value)
}