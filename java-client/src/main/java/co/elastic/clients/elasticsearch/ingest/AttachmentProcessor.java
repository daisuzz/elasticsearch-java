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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ingest._types.AttachmentProcessor
@JsonpDeserializable
public class AttachmentProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	@Nullable
	private final Long indexedChars;

	@Nullable
	private final String indexedCharsField;

	private final List<String> properties;

	@Nullable
	private final String targetField;

	@Nullable
	private final String resourceName;

	// ---------------------------------------------------------------------------------------------

	private AttachmentProcessor(Builder builder) {
		super(builder);

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.indexedChars = builder.indexedChars;
		this.indexedCharsField = builder.indexedCharsField;
		this.properties = ModelTypeHelper.unmodifiable(builder.properties);
		this.targetField = builder.targetField;
		this.resourceName = builder.resourceName;

	}

	public static AttachmentProcessor of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Attachment;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * API name: {@code indexed_chars}
	 */
	@Nullable
	public final Long indexedChars() {
		return this.indexedChars;
	}

	/**
	 * API name: {@code indexed_chars_field}
	 */
	@Nullable
	public final String indexedCharsField() {
		return this.indexedCharsField;
	}

	/**
	 * API name: {@code properties}
	 */
	public final List<String> properties() {
		return this.properties;
	}

	/**
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * API name: {@code resource_name}
	 */
	@Nullable
	public final String resourceName() {
		return this.resourceName;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		if (this.indexedChars != null) {
			generator.writeKey("indexed_chars");
			generator.write(this.indexedChars);

		}
		if (this.indexedCharsField != null) {
			generator.writeKey("indexed_chars_field");
			generator.write(this.indexedCharsField);

		}
		if (ModelTypeHelper.isDefined(this.properties)) {
			generator.writeKey("properties");
			generator.writeStartArray();
			for (String item0 : this.properties) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (this.resourceName != null) {
			generator.writeKey("resource_name");
			generator.write(this.resourceName);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AttachmentProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AttachmentProcessor> {
		private String field;

		@Nullable
		private Boolean ignoreMissing;

		@Nullable
		private Long indexedChars;

		@Nullable
		private String indexedCharsField;

		@Nullable
		private List<String> properties;

		@Nullable
		private String targetField;

		@Nullable
		private String resourceName;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * API name: {@code indexed_chars}
		 */
		public final Builder indexedChars(@Nullable Long value) {
			this.indexedChars = value;
			return this;
		}

		/**
		 * API name: {@code indexed_chars_field}
		 */
		public final Builder indexedCharsField(@Nullable String value) {
			this.indexedCharsField = value;
			return this;
		}

		/**
		 * API name: {@code properties}
		 */
		public final Builder properties(@Nullable List<String> value) {
			this.properties = value;
			return this;
		}

		/**
		 * API name: {@code properties}
		 */
		public final Builder properties(String... value) {
			this.properties = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * API name: {@code resource_name}
		 */
		public final Builder resourceName(@Nullable String value) {
			this.resourceName = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AttachmentProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AttachmentProcessor build() {
			_checkSingleUse();

			return new AttachmentProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AttachmentProcessor}
	 */
	public static final JsonpDeserializer<AttachmentProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AttachmentProcessor::setupAttachmentProcessorDeserializer);

	protected static void setupAttachmentProcessorDeserializer(ObjectDeserializer<AttachmentProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::indexedChars, JsonpDeserializer.longDeserializer(), "indexed_chars");
		op.add(Builder::indexedCharsField, JsonpDeserializer.stringDeserializer(), "indexed_chars_field");
		op.add(Builder::properties, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"properties");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::resourceName, JsonpDeserializer.stringDeserializer(), "resource_name");

	}

}
