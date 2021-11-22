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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.search.SortOptions;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.query_watches.Request
@JsonpDeserializable
public class QueryWatchesRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Integer from;

	@Nullable
	private final Query query;

	private final List<String> searchAfter;

	@Nullable
	private final Integer size;

	private final List<SortOptions> sort;

	// ---------------------------------------------------------------------------------------------

	private QueryWatchesRequest(Builder builder) {

		this.from = builder.from;
		this.query = builder.query;
		this.searchAfter = ModelTypeHelper.unmodifiable(builder.searchAfter);
		this.size = builder.size;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);

	}

	public static QueryWatchesRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * The offset from the first result to fetch. Needs to be non-negative.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * Optional, query filter watches to be returned.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Optional search After to do pagination using last hit’s sort values.
	 * <p>
	 * API name: {@code search_after}
	 */
	public final List<String> searchAfter() {
		return this.searchAfter;
	}

	/**
	 * The number of hits to return. Needs to be non-negative.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Optional sort definition.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
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

		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.searchAfter)) {
			generator.writeKey("search_after");
			generator.writeStartArray();
			for (String item0 : this.searchAfter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (ModelTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryWatchesRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<QueryWatchesRequest> {
		@Nullable
		private Integer from;

		@Nullable
		private Query query;

		@Nullable
		private List<String> searchAfter;

		@Nullable
		private Integer size;

		@Nullable
		private List<SortOptions> sort;

		/**
		 * The offset from the first result to fetch. Needs to be non-negative.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Optional, query filter watches to be returned.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Optional, query filter watches to be returned.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Consumer<Query.Builder> fn) {
			Query.Builder builder = new Query.Builder();
			fn.accept(builder);
			return this.query(builder.build());
		}

		/**
		 * Optional search After to do pagination using last hit’s sort values.
		 * <p>
		 * API name: {@code search_after}
		 */
		public final Builder searchAfter(@Nullable List<String> value) {
			this.searchAfter = value;
			return this;
		}

		/**
		 * Optional search After to do pagination using last hit’s sort values.
		 * <p>
		 * API name: {@code search_after}
		 */
		public final Builder searchAfter(String... value) {
			this.searchAfter = Arrays.asList(value);
			return this;
		}

		/**
		 * The number of hits to return. Needs to be non-negative.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Optional sort definition.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable List<SortOptions> value) {
			this.sort = value;
			return this;
		}

		/**
		 * Optional sort definition.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(SortOptions... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Optional sort definition.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(
				Function<ListBuilder<SortOptions, SortOptions.Builder>, ObjectBuilder<List<SortOptions>>> fn) {
			return sort(fn.apply(new ListBuilder<>(SortOptions.Builder::new)).build());
		}

		/**
		 * Builds a {@link QueryWatchesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryWatchesRequest build() {
			_checkSingleUse();

			return new QueryWatchesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryWatchesRequest}
	 */
	public static final JsonpDeserializer<QueryWatchesRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryWatchesRequest::setupQueryWatchesRequestDeserializer);

	protected static void setupQueryWatchesRequestDeserializer(ObjectDeserializer<QueryWatchesRequest.Builder> op) {

		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::searchAfter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"search_after");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.query_watches}".
	 */
	public static final Endpoint<QueryWatchesRequest, QueryWatchesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_watcher/_query/watches";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, QueryWatchesResponse._DESERIALIZER);
}
