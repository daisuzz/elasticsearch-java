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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MetricAggregationBase

public abstract class MetricAggregationBase implements JsonpSerializable {
	@Nullable
	private final String field;

	@Nullable
	private final String missing;

	@Nullable
	private final Script script;

	// ---------------------------------------------------------------------------------------------

	protected MetricAggregationBase(AbstractBuilder<?> builder) {

		this.field = builder.field;
		this.missing = builder.missing;
		this.script = builder.script;

	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final String missing() {
		return this.missing;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
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

		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.missing != null) {
			generator.writeKey("missing");
			generator.write(this.missing);

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ObjectBuilderBase {
		@Nullable
		private String field;

		@Nullable
		private String missing;

		@Nullable
		private Script script;

		/**
		 * API name: {@code field}
		 */
		public final BuilderT field(@Nullable String value) {
			this.field = value;
			return self();
		}

		/**
		 * API name: {@code missing}
		 */
		public final BuilderT missing(@Nullable String value) {
			this.missing = value;
			return self();
		}

		/**
		 * API name: {@code script}
		 */
		public final BuilderT script(@Nullable Script value) {
			this.script = value;
			return self();
		}

		/**
		 * API name: {@code script}
		 */
		public final BuilderT script(Consumer<Script.Builder> fn) {
			Script.Builder builder = new Script.Builder();
			fn.accept(builder);
			return this.script(builder.build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupMetricAggregationBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(AbstractBuilder::missing, JsonpDeserializer.stringDeserializer(), "missing");
		op.add(AbstractBuilder::script, Script._DESERIALIZER, "script");

	}

}
