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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.endpoints.DictionaryResponse;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

// typedef: security.put_privileges.Response
@JsonpDeserializable
public class PutPrivilegesResponse extends DictionaryResponse<String, Map<String, CreatedStatus>> {
	// ---------------------------------------------------------------------------------------------

	private PutPrivilegesResponse(Builder builder) {
		super(builder);

	}

	public static PutPrivilegesResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutPrivilegesResponse}.
	 */
	public static class Builder extends DictionaryResponse.AbstractBuilder<String, Map<String, CreatedStatus>, Builder>
			implements
				ObjectBuilder<PutPrivilegesResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutPrivilegesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutPrivilegesResponse build() {
			_checkSingleUse();
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new PutPrivilegesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutPrivilegesResponse}
	 */
	public static final JsonpDeserializer<PutPrivilegesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutPrivilegesResponse::setupPutPrivilegesResponseDeserializer);

	protected static void setupPutPrivilegesResponseDeserializer(ObjectDeserializer<PutPrivilegesResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				JsonpDeserializer.stringMapDeserializer(CreatedStatus._DESERIALIZER));

	}

}
