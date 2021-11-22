/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml._types.CategorizationAnalyzer
// union type: Union[]
@JsonpDeserializable
public class CategorizationAnalyzer implements TaggedUnion<CategorizationAnalyzer.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Name, Definition

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public CategorizationAnalyzer(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private CategorizationAnalyzer(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static CategorizationAnalyzer of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code name}?
	 */
	public boolean isName() {
		return _kind == Kind.Name;
	}

	/**
	 * Get the {@code name} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code name} kind.
	 */
	public String name() {
		return TaggedUnionUtils.get(this, Kind.Name);
	}

	/**
	 * Is this variant instance of kind {@code definition}?
	 */
	public boolean isDefinition() {
		return _kind == Kind.Definition;
	}

	/**
	 * Get the {@code definition} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code definition} kind.
	 */
	public CategorizationAnalyzerDefinition definition() {
		return TaggedUnionUtils.get(this, Kind.Definition);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Name :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CategorizationAnalyzer> {
		private Kind _kind;
		private Object _value;

		public Builder name(String v) {
			this._kind = Kind.Name;
			this._value = v;
			return this;
		}

		public Builder definition(CategorizationAnalyzerDefinition v) {
			this._kind = Kind.Definition;
			this._value = v;
			return this;
		}

		public Builder definition(Consumer<CategorizationAnalyzerDefinition.Builder> fn) {
			CategorizationAnalyzerDefinition.Builder builder = new CategorizationAnalyzerDefinition.Builder();
			fn.accept(builder);
			return this.definition(builder.build());
		}

		public CategorizationAnalyzer build() {
			_checkSingleUse();
			return new CategorizationAnalyzer(this);
		}

	}

	private static JsonpDeserializer<CategorizationAnalyzer> buildCategorizationAnalyzerDeserializer() {
		return new UnionDeserializer.Builder<CategorizationAnalyzer, Kind, Object>(CategorizationAnalyzer::new, false)
				.addMember(Kind.Name, JsonpDeserializer.stringDeserializer())
				.addMember(Kind.Definition, CategorizationAnalyzerDefinition._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<CategorizationAnalyzer> _DESERIALIZER = JsonpDeserializer
			.lazy(CategorizationAnalyzer::buildCategorizationAnalyzerDeserializer);
}
