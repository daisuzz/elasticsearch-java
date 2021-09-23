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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.TermsSetQuery
public final class TermsSetQuery extends QueryBase implements Query {
	private final String field;

	// ---------------------------------------------------------------------------------------------

	public TermsSetQuery(Builder builder) {
		super(builder);
		this.field = Objects.requireNonNull(builder.field, "field");

	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _type() {
		return "terms_set";
	}

	/**
	 * The target field
	 * <p>
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());

		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);

		generator.writeEnd();

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermsSetQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<TermsSetQuery> {
		private String field;

		/**
		 * The target field
		 * <p>
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermsSetQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermsSetQuery build() {

			return new TermsSetQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<TermsSetQuery.Builder, TermsSetQuery.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(TermsSetQuery::setupTermsSetQueryDeserializer);

	protected static void setupTermsSetQueryDeserializer(DelegatingDeserializer<TermsSetQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);

		op.setKey(Builder::field);

	}

}