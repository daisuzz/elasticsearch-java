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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: slm._types.Invocation
@JsonpDeserializable
public class Invocation implements JsonpSerializable {
	private final String snapshotName;

	private final String time;

	// ---------------------------------------------------------------------------------------------

	private Invocation(Builder builder) {

		this.snapshotName = ModelTypeHelper.requireNonNull(builder.snapshotName, this, "snapshotName");
		this.time = ModelTypeHelper.requireNonNull(builder.time, this, "time");

	}

	public static Invocation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code snapshot_name}
	 */
	public final String snapshotName() {
		return this.snapshotName;
	}

	/**
	 * Required - API name: {@code time}
	 */
	public final String time() {
		return this.time;
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

		generator.writeKey("snapshot_name");
		generator.write(this.snapshotName);

		generator.writeKey("time");
		generator.write(this.time);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Invocation}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Invocation> {
		private String snapshotName;

		private String time;

		/**
		 * Required - API name: {@code snapshot_name}
		 */
		public final Builder snapshotName(String value) {
			this.snapshotName = value;
			return this;
		}

		/**
		 * Required - API name: {@code time}
		 */
		public final Builder time(String value) {
			this.time = value;
			return this;
		}

		/**
		 * Builds a {@link Invocation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Invocation build() {
			_checkSingleUse();

			return new Invocation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Invocation}
	 */
	public static final JsonpDeserializer<Invocation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Invocation::setupInvocationDeserializer);

	protected static void setupInvocationDeserializer(ObjectDeserializer<Invocation.Builder> op) {

		op.add(Builder::snapshotName, JsonpDeserializer.stringDeserializer(), "snapshot_name");
		op.add(Builder::time, JsonpDeserializer.stringDeserializer(), "time");

	}

}
