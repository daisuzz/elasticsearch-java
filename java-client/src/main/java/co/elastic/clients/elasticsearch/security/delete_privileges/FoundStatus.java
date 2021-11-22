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

package co.elastic.clients.elasticsearch.security.delete_privileges;

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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Consumer;

// typedef: security.delete_privileges.FoundStatus
@JsonpDeserializable
public class FoundStatus implements JsonpSerializable {
	private final boolean found;

	// ---------------------------------------------------------------------------------------------

	private FoundStatus(Builder builder) {

		this.found = ModelTypeHelper.requireNonNull(builder.found, this, "found");

	}

	public static FoundStatus of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code found}
	 */
	public final boolean found() {
		return this.found;
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

		generator.writeKey("found");
		generator.write(this.found);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FoundStatus}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FoundStatus> {
		private Boolean found;

		/**
		 * Required - API name: {@code found}
		 */
		public final Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Builds a {@link FoundStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FoundStatus build() {
			_checkSingleUse();

			return new FoundStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FoundStatus}
	 */
	public static final JsonpDeserializer<FoundStatus> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FoundStatus::setupFoundStatusDeserializer);

	protected static void setupFoundStatusDeserializer(ObjectDeserializer<FoundStatus.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");

	}

}
