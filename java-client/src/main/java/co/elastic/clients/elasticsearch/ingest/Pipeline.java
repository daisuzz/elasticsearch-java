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

package co.elastic.clients.elasticsearch.ingest;

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
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.Pipeline
@JsonpDeserializable
public class Pipeline implements JsonpSerializable {
	@Nullable
	private final String description;

	private final List<Processor> onFailure;

	private final List<Processor> processors;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	private Pipeline(Builder builder) {

		this.description = builder.description;
		this.onFailure = ModelTypeHelper.unmodifiable(builder.onFailure);
		this.processors = ModelTypeHelper.unmodifiable(builder.processors);
		this.version = builder.version;

	}

	public static Pipeline of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * API name: {@code on_failure}
	 */
	public final List<Processor> onFailure() {
		return this.onFailure;
	}

	/**
	 * API name: {@code processors}
	 */
	public final List<Processor> processors() {
		return this.processors;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
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

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (ModelTypeHelper.isDefined(this.onFailure)) {
			generator.writeKey("on_failure");
			generator.writeStartArray();
			for (Processor item0 : this.onFailure) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.processors)) {
			generator.writeKey("processors");
			generator.writeStartArray();
			for (Processor item0 : this.processors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Pipeline}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Pipeline> {
		@Nullable
		private String description;

		@Nullable
		private List<Processor> onFailure;

		@Nullable
		private List<Processor> processors;

		@Nullable
		private Long version;

		/**
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code on_failure}
		 */
		public final Builder onFailure(@Nullable List<Processor> value) {
			this.onFailure = value;
			return this;
		}

		/**
		 * API name: {@code on_failure}
		 */
		public final Builder onFailure(Processor... value) {
			this.onFailure = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code on_failure}
		 */
		public final Builder onFailure(
				Function<ListBuilder<Processor, Processor.Builder>, ObjectBuilder<List<Processor>>> fn) {
			return onFailure(fn.apply(new ListBuilder<>(Processor.Builder::new)).build());
		}

		/**
		 * API name: {@code processors}
		 */
		public final Builder processors(@Nullable List<Processor> value) {
			this.processors = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public final Builder processors(Processor... value) {
			this.processors = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public final Builder processors(
				Function<ListBuilder<Processor, Processor.Builder>, ObjectBuilder<List<Processor>>> fn) {
			return processors(fn.apply(new ListBuilder<>(Processor.Builder::new)).build());
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link Pipeline}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Pipeline build() {
			_checkSingleUse();

			return new Pipeline(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Pipeline}
	 */
	public static final JsonpDeserializer<Pipeline> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Pipeline::setupPipelineDeserializer);

	protected static void setupPipelineDeserializer(ObjectDeserializer<Pipeline.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::onFailure, JsonpDeserializer.arrayDeserializer(Processor._DESERIALIZER), "on_failure");
		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(Processor._DESERIALIZER), "processors");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

}
