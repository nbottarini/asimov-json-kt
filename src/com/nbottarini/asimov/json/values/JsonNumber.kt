package com.nbottarini.asimov.json.values

import com.nbottarini.asimov.json.writer.JsonWriter
import com.nbottarini.asimov.json.writer.MinimalJsonWriter

class JsonNumber internal constructor (private val value: String): JsonValue() {
    override val isNumber get() = true

    override fun asInt() = value.toIntOrNull()

    override fun asLong() = value.toLongOrNull()

    override fun asFloat() = value.toFloatOrNull()

    override fun asDouble() = value.toDoubleOrNull()

    override fun asString() = value

    override fun hashCode() = value.hashCode()

    override fun equals(other: Any?) = other is JsonNumber && other.value == value

    override fun toString() = value

    override fun write(writer: JsonWriter) {
        writer.writeNumber(value)
    }
}
