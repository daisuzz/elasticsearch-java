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

package co.elastic.clients.elasticsearch._types.query_dsl;

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

// typedef: _types.query_dsl.Like
// union type: Union[]
@JsonpDeserializable
public class Like implements TaggedUnion<Like.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Document, Text

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

	public Like(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private Like(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Like of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code document}?
	 */
	public boolean isDocument() {
		return _kind == Kind.Document;
	}

	/**
	 * Get the {@code document} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code document} kind.
	 */
	public LikeDocument document() {
		return TaggedUnionUtils.get(this, Kind.Document);
	}

	/**
	 * Is this variant instance of kind {@code text}?
	 */
	public boolean isText() {
		return _kind == Kind.Text;
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public String text() {
		return TaggedUnionUtils.get(this, Kind.Text);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Text :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Like> {
		private Kind _kind;
		private Object _value;

		public Builder document(LikeDocument v) {
			this._kind = Kind.Document;
			this._value = v;
			return this;
		}

		public Builder document(Consumer<LikeDocument.Builder> fn) {
			LikeDocument.Builder builder = new LikeDocument.Builder();
			fn.accept(builder);
			return this.document(builder.build());
		}

		public Builder text(String v) {
			this._kind = Kind.Text;
			this._value = v;
			return this;
		}

		public Like build() {
			_checkSingleUse();
			return new Like(this);
		}

	}

	private static JsonpDeserializer<Like> buildLikeDeserializer() {
		return new UnionDeserializer.Builder<Like, Kind, Object>(Like::new, false)
				.addMember(Kind.Document, LikeDocument._DESERIALIZER)
				.addMember(Kind.Text, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<Like> _DESERIALIZER = JsonpDeserializer.lazy(Like::buildLikeDeserializer);
}
