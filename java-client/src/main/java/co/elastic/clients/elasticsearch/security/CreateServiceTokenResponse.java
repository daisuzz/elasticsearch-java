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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch.security.create_service_token.Token;
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
import javax.annotation.Nullable;

// typedef: security.create_service_token.Response
@JsonpDeserializable
public class CreateServiceTokenResponse implements JsonpSerializable {
	private final boolean created;

	private final Token token;

	// ---------------------------------------------------------------------------------------------

	private CreateServiceTokenResponse(Builder builder) {

		this.created = ModelTypeHelper.requireNonNull(builder.created, this, "created");
		this.token = ModelTypeHelper.requireNonNull(builder.token, this, "token");

	}

	public static CreateServiceTokenResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code created}
	 */
	public final boolean created() {
		return this.created;
	}

	/**
	 * Required - API name: {@code token}
	 */
	public final Token token() {
		return this.token;
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

		generator.writeKey("created");
		generator.write(this.created);

		generator.writeKey("token");
		this.token.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateServiceTokenResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CreateServiceTokenResponse> {
		private Boolean created;

		private Token token;

		/**
		 * Required - API name: {@code created}
		 */
		public final Builder created(boolean value) {
			this.created = value;
			return this;
		}

		/**
		 * Required - API name: {@code token}
		 */
		public final Builder token(Token value) {
			this.token = value;
			return this;
		}

		/**
		 * Required - API name: {@code token}
		 */
		public final Builder token(Consumer<Token.Builder> fn) {
			Token.Builder builder = new Token.Builder();
			fn.accept(builder);
			return this.token(builder.build());
		}

		/**
		 * Builds a {@link CreateServiceTokenResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateServiceTokenResponse build() {
			_checkSingleUse();

			return new CreateServiceTokenResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreateServiceTokenResponse}
	 */
	public static final JsonpDeserializer<CreateServiceTokenResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CreateServiceTokenResponse::setupCreateServiceTokenResponseDeserializer);

	protected static void setupCreateServiceTokenResponseDeserializer(
			ObjectDeserializer<CreateServiceTokenResponse.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.booleanDeserializer(), "created");
		op.add(Builder::token, Token._DESERIALIZER, "token");

	}

}
