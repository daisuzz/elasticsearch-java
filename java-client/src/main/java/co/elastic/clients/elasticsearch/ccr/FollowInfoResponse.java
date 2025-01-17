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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.elasticsearch.ccr.follow_info.FollowerIndex;
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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.follow_info.Response
@JsonpDeserializable
public class FollowInfoResponse implements JsonpSerializable {
	private final List<FollowerIndex> followerIndices;

	// ---------------------------------------------------------------------------------------------

	private FollowInfoResponse(Builder builder) {

		this.followerIndices = ModelTypeHelper.unmodifiableRequired(builder.followerIndices, this, "followerIndices");

	}

	public static FollowInfoResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code follower_indices}
	 */
	public final List<FollowerIndex> followerIndices() {
		return this.followerIndices;
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

		if (ModelTypeHelper.isDefined(this.followerIndices)) {
			generator.writeKey("follower_indices");
			generator.writeStartArray();
			for (FollowerIndex item0 : this.followerIndices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowInfoResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FollowInfoResponse> {
		private List<FollowerIndex> followerIndices;

		/**
		 * Required - API name: {@code follower_indices}
		 */
		public final Builder followerIndices(List<FollowerIndex> value) {
			this.followerIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_indices}
		 */
		public final Builder followerIndices(FollowerIndex... value) {
			this.followerIndices = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code follower_indices}
		 */
		public final Builder followerIndices(
				Function<ListBuilder<FollowerIndex, FollowerIndex.Builder>, ObjectBuilder<List<FollowerIndex>>> fn) {
			return followerIndices(fn.apply(new ListBuilder<>(FollowerIndex.Builder::new)).build());
		}

		/**
		 * Builds a {@link FollowInfoResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowInfoResponse build() {
			_checkSingleUse();

			return new FollowInfoResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowInfoResponse}
	 */
	public static final JsonpDeserializer<FollowInfoResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FollowInfoResponse::setupFollowInfoResponseDeserializer);

	protected static void setupFollowInfoResponseDeserializer(ObjectDeserializer<FollowInfoResponse.Builder> op) {

		op.add(Builder::followerIndices, JsonpDeserializer.arrayDeserializer(FollowerIndex._DESERIALIZER),
				"follower_indices");

	}

}
