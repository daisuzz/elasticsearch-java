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
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoBoundingBoxQuery
public final class GeoBoundingBoxQuery extends QueryBase implements Query {
	@Nullable
	private final GeoExecution type;

	@Nullable
	private final GeoValidationMethod validationMethod;

	@Nullable
	private final Boolean ignoreUnmapped;

	// ---------------------------------------------------------------------------------------------

	public GeoBoundingBoxQuery(Builder builder) {
		super(builder);

		this.type = builder.type;
		this.validationMethod = builder.validationMethod;
		this.ignoreUnmapped = builder.ignoreUnmapped;

	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _type() {
		return "geo_bounding_box";
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public GeoExecution type() {
		return this.type;
	}

	/**
	 * API name: {@code validation_method}
	 */
	@Nullable
	public GeoValidationMethod validationMethod() {
		return this.validationMethod;
	}

	/**
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());

		super.serializeInternal(generator, mapper);
		if (this.type != null) {

			generator.writeKey("type");
			this.type.serialize(generator, mapper);
		}
		if (this.validationMethod != null) {

			generator.writeKey("validation_method");
			this.validationMethod.serialize(generator, mapper);
		}
		if (this.ignoreUnmapped != null) {

			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoBoundingBoxQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoBoundingBoxQuery> {
		@Nullable
		private GeoExecution type;

		@Nullable
		private GeoValidationMethod validationMethod;

		@Nullable
		private Boolean ignoreUnmapped;

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable GeoExecution value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code validation_method}
		 */
		public Builder validationMethod(@Nullable GeoValidationMethod value) {
			this.validationMethod = value;
			return this;
		}

		/**
		 * API name: {@code ignore_unmapped}
		 */
		public Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoBoundingBoxQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoBoundingBoxQuery build() {

			return new GeoBoundingBoxQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<GeoBoundingBoxQuery.Builder, GeoBoundingBoxQuery.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(GeoBoundingBoxQuery::setupGeoBoundingBoxQueryDeserializer);

	protected static void setupGeoBoundingBoxQueryDeserializer(DelegatingDeserializer<GeoBoundingBoxQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::type, GeoExecution.DESERIALIZER, "type");
		op.add(Builder::validationMethod, GeoValidationMethod.DESERIALIZER, "validation_method");
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");

	}

}