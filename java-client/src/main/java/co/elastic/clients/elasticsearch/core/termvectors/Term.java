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

package co.elastic.clients.elasticsearch.core.termvectors;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Integer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.termvectors.Term
@JsonpDeserializable
public class Term implements JsonpSerializable {
	@Nullable
	private final Integer docFreq;

	@Nullable
	private final Double score;

	private final int termFreq;

	private final List<Token> tokens;

	@Nullable
	private final Integer ttf;

	// ---------------------------------------------------------------------------------------------

	private Term(Builder builder) {

		this.docFreq = builder.docFreq;
		this.score = builder.score;
		this.termFreq = ModelTypeHelper.requireNonNull(builder.termFreq, this, "termFreq");
		this.tokens = ModelTypeHelper.unmodifiableRequired(builder.tokens, this, "tokens");
		this.ttf = builder.ttf;

	}

	public static Term of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code doc_freq}
	 */
	@Nullable
	public final Integer docFreq() {
		return this.docFreq;
	}

	/**
	 * API name: {@code score}
	 */
	@Nullable
	public final Double score() {
		return this.score;
	}

	/**
	 * Required - API name: {@code term_freq}
	 */
	public final int termFreq() {
		return this.termFreq;
	}

	/**
	 * Required - API name: {@code tokens}
	 */
	public final List<Token> tokens() {
		return this.tokens;
	}

	/**
	 * API name: {@code ttf}
	 */
	@Nullable
	public final Integer ttf() {
		return this.ttf;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.docFreq != null) {
			generator.writeKey("doc_freq");
			generator.write(this.docFreq);

		}
		if (this.score != null) {
			generator.writeKey("score");
			generator.write(this.score);

		}
		generator.writeKey("term_freq");
		generator.write(this.termFreq);

		if (ModelTypeHelper.isDefined(this.tokens)) {
			generator.writeKey("tokens");
			generator.writeStartArray();
			for (Token item0 : this.tokens) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.ttf != null) {
			generator.writeKey("ttf");
			generator.write(this.ttf);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Term}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Term> {
		@Nullable
		private Integer docFreq;

		@Nullable
		private Double score;

		private Integer termFreq;

		private List<Token> tokens;

		@Nullable
		private Integer ttf;

		/**
		 * API name: {@code doc_freq}
		 */
		public final Builder docFreq(@Nullable Integer value) {
			this.docFreq = value;
			return this;
		}

		/**
		 * API name: {@code score}
		 */
		public final Builder score(@Nullable Double value) {
			this.score = value;
			return this;
		}

		/**
		 * Required - API name: {@code term_freq}
		 */
		public final Builder termFreq(int value) {
			this.termFreq = value;
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 */
		public final Builder tokens(List<Token> value) {
			this.tokens = value;
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 */
		public final Builder tokens(Token... value) {
			this.tokens = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 */
		public final Builder tokens(Function<ListBuilder<Token, Token.Builder>, ObjectBuilder<List<Token>>> fn) {
			return tokens(fn.apply(new ListBuilder<>(Token.Builder::new)).build());
		}

		/**
		 * API name: {@code ttf}
		 */
		public final Builder ttf(@Nullable Integer value) {
			this.ttf = value;
			return this;
		}

		/**
		 * Builds a {@link Term}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Term build() {
			_checkSingleUse();

			return new Term(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Term}
	 */
	public static final JsonpDeserializer<Term> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Term::setupTermDeserializer);

	protected static void setupTermDeserializer(ObjectDeserializer<Term.Builder> op) {

		op.add(Builder::docFreq, JsonpDeserializer.integerDeserializer(), "doc_freq");
		op.add(Builder::score, JsonpDeserializer.doubleDeserializer(), "score");
		op.add(Builder::termFreq, JsonpDeserializer.integerDeserializer(), "term_freq");
		op.add(Builder::tokens, JsonpDeserializer.arrayDeserializer(Token._DESERIALIZER), "tokens");
		op.add(Builder::ttf, JsonpDeserializer.integerDeserializer(), "ttf");

	}

}
