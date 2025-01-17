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

package co.elastic.clients.elasticsearch.indices.recovery;

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

// typedef: indices.recovery.RecoveryFiles
@JsonpDeserializable
public class RecoveryFiles implements JsonpSerializable {
	private final List<FileDetails> details;

	private final String percent;

	private final long recovered;

	private final long reused;

	private final long total;

	// ---------------------------------------------------------------------------------------------

	private RecoveryFiles(Builder builder) {

		this.details = ModelTypeHelper.unmodifiable(builder.details);
		this.percent = ModelTypeHelper.requireNonNull(builder.percent, this, "percent");
		this.recovered = ModelTypeHelper.requireNonNull(builder.recovered, this, "recovered");
		this.reused = ModelTypeHelper.requireNonNull(builder.reused, this, "reused");
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");

	}

	public static RecoveryFiles of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code details}
	 */
	public final List<FileDetails> details() {
		return this.details;
	}

	/**
	 * Required - API name: {@code percent}
	 */
	public final String percent() {
		return this.percent;
	}

	/**
	 * Required - API name: {@code recovered}
	 */
	public final long recovered() {
		return this.recovered;
	}

	/**
	 * Required - API name: {@code reused}
	 */
	public final long reused() {
		return this.reused;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
		return this.total;
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

		if (ModelTypeHelper.isDefined(this.details)) {
			generator.writeKey("details");
			generator.writeStartArray();
			for (FileDetails item0 : this.details) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("percent");
		generator.write(this.percent);

		generator.writeKey("recovered");
		generator.write(this.recovered);

		generator.writeKey("reused");
		generator.write(this.reused);

		generator.writeKey("total");
		generator.write(this.total);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryFiles}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RecoveryFiles> {
		@Nullable
		private List<FileDetails> details;

		private String percent;

		private Long recovered;

		private Long reused;

		private Long total;

		/**
		 * API name: {@code details}
		 */
		public final Builder details(@Nullable List<FileDetails> value) {
			this.details = value;
			return this;
		}

		/**
		 * API name: {@code details}
		 */
		public final Builder details(FileDetails... value) {
			this.details = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code details}
		 */
		public final Builder details(
				Function<ListBuilder<FileDetails, FileDetails.Builder>, ObjectBuilder<List<FileDetails>>> fn) {
			return details(fn.apply(new ListBuilder<>(FileDetails.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code percent}
		 */
		public final Builder percent(String value) {
			this.percent = value;
			return this;
		}

		/**
		 * Required - API name: {@code recovered}
		 */
		public final Builder recovered(long value) {
			this.recovered = value;
			return this;
		}

		/**
		 * Required - API name: {@code reused}
		 */
		public final Builder reused(long value) {
			this.reused = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(long value) {
			this.total = value;
			return this;
		}

		/**
		 * Builds a {@link RecoveryFiles}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryFiles build() {
			_checkSingleUse();

			return new RecoveryFiles(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryFiles}
	 */
	public static final JsonpDeserializer<RecoveryFiles> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RecoveryFiles::setupRecoveryFilesDeserializer);

	protected static void setupRecoveryFilesDeserializer(ObjectDeserializer<RecoveryFiles.Builder> op) {

		op.add(Builder::details, JsonpDeserializer.arrayDeserializer(FileDetails._DESERIALIZER), "details");
		op.add(Builder::percent, JsonpDeserializer.stringDeserializer(), "percent");
		op.add(Builder::recovered, JsonpDeserializer.longDeserializer(), "recovered");
		op.add(Builder::reused, JsonpDeserializer.longDeserializer(), "reused");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");

	}

}
