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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Sql
@JsonpDeserializable
public class Sql extends Base {
	private final Map<String, Integer> features;

	private final Map<String, XpackUsageQuery> queries;

	// ---------------------------------------------------------------------------------------------

	private Sql(Builder builder) {
		super(builder);

		this.features = ModelTypeHelper.unmodifiableRequired(builder.features, this, "features");
		this.queries = ModelTypeHelper.unmodifiableRequired(builder.queries, this, "queries");

	}

	public static Sql of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code features}
	 */
	public final Map<String, Integer> features() {
		return this.features;
	}

	/**
	 * Required - API name: {@code queries}
	 */
	public final Map<String, XpackUsageQuery> queries() {
		return this.queries;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.features)) {
			generator.writeKey("features");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.features.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.queries)) {
			generator.writeKey("queries");
			generator.writeStartObject();
			for (Map.Entry<String, XpackUsageQuery> item0 : this.queries.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Sql}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Sql> {
		private Map<String, Integer> features;

		private Map<String, XpackUsageQuery> queries;

		/**
		 * Required - API name: {@code features}
		 */
		public final Builder features(Map<String, Integer> value) {
			this.features = value;
			return this;
		}

		/**
		 * Required - API name: {@code queries}
		 */
		public final Builder queries(Map<String, XpackUsageQuery> value) {
			this.queries = value;
			return this;
		}

		public final Builder queries(
				Function<MapBuilder<String, XpackUsageQuery, XpackUsageQuery.Builder>, ObjectBuilder<Map<String, XpackUsageQuery>>> fn) {
			return queries(fn.apply(new MapBuilder<>(XpackUsageQuery.Builder::new)).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Sql}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Sql build() {
			_checkSingleUse();

			return new Sql(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Sql}
	 */
	public static final JsonpDeserializer<Sql> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Sql::setupSqlDeserializer);

	protected static void setupSqlDeserializer(ObjectDeserializer<Sql.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::features, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"features");
		op.add(Builder::queries, JsonpDeserializer.stringMapDeserializer(XpackUsageQuery._DESERIALIZER), "queries");

	}

}
