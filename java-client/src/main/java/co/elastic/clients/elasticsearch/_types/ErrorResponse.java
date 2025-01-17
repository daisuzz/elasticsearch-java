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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.ErrorResponseBase
@JsonpDeserializable
public class ErrorResponse implements JsonpSerializable {
	private final ErrorCause error;

	private final int status;

	// ---------------------------------------------------------------------------------------------

	private ErrorResponse(Builder builder) {

		this.error = ModelTypeHelper.requireNonNull(builder.error, this, "error");
		this.status = ModelTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static ErrorResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code error}
	 */
	public final ErrorCause error() {
		return this.error;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final int status() {
		return this.status;
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

		generator.writeKey("error");
		this.error.serialize(generator, mapper);

		generator.writeKey("status");
		generator.write(this.status);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ErrorResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ErrorResponse> {
		private ErrorCause error;

		private Integer status;

		/**
		 * Required - API name: {@code error}
		 */
		public final Builder error(ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * Required - API name: {@code error}
		 */
		public final Builder error(Consumer<ErrorCause.Builder> fn) {
			ErrorCause.Builder builder = new ErrorCause.Builder();
			fn.accept(builder);
			return this.error(builder.build());
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(int value) {
			this.status = value;
			return this;
		}

		/**
		 * Builds a {@link ErrorResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ErrorResponse build() {
			_checkSingleUse();

			return new ErrorResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ErrorResponse}
	 */
	public static final JsonpDeserializer<ErrorResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ErrorResponse::setupErrorResponseDeserializer);

	protected static void setupErrorResponseDeserializer(ObjectDeserializer<ErrorResponse.Builder> op) {

		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");
		op.add(Builder::status, JsonpDeserializer.integerDeserializer(), "status");

	}

}
