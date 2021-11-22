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

package co.elastic.clients.elasticsearch.enrich;

import co.elastic.clients.elasticsearch.enrich.execute_policy.ExecuteEnrichPolicyStatus;
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

// typedef: enrich.execute_policy.Response
@JsonpDeserializable
public class ExecutePolicyResponse implements JsonpSerializable {
	private final ExecuteEnrichPolicyStatus status;

	@Nullable
	private final String taskId;

	// ---------------------------------------------------------------------------------------------

	private ExecutePolicyResponse(Builder builder) {

		this.status = ModelTypeHelper.requireNonNull(builder.status, this, "status");
		this.taskId = builder.taskId;

	}

	public static ExecutePolicyResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ExecuteEnrichPolicyStatus status() {
		return this.status;
	}

	/**
	 * API name: {@code task_id}
	 */
	@Nullable
	public final String taskId() {
		return this.taskId;
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

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		if (this.taskId != null) {
			generator.writeKey("task_id");
			generator.write(this.taskId);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutePolicyResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExecutePolicyResponse> {
		private ExecuteEnrichPolicyStatus status;

		@Nullable
		private String taskId;

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(ExecuteEnrichPolicyStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(Consumer<ExecuteEnrichPolicyStatus.Builder> fn) {
			ExecuteEnrichPolicyStatus.Builder builder = new ExecuteEnrichPolicyStatus.Builder();
			fn.accept(builder);
			return this.status(builder.build());
		}

		/**
		 * API name: {@code task_id}
		 */
		public final Builder taskId(@Nullable String value) {
			this.taskId = value;
			return this;
		}

		/**
		 * Builds a {@link ExecutePolicyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutePolicyResponse build() {
			_checkSingleUse();

			return new ExecutePolicyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutePolicyResponse}
	 */
	public static final JsonpDeserializer<ExecutePolicyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutePolicyResponse::setupExecutePolicyResponseDeserializer);

	protected static void setupExecutePolicyResponseDeserializer(ObjectDeserializer<ExecutePolicyResponse.Builder> op) {

		op.add(Builder::status, ExecuteEnrichPolicyStatus._DESERIALIZER, "status");
		op.add(Builder::taskId, JsonpDeserializer.stringDeserializer(), "task_id");

	}

}
