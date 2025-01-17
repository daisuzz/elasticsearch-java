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

package co.elastic.clients.elasticsearch.indices.stats;

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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.stats.ShardRetentionLeases
@JsonpDeserializable
public class ShardRetentionLeases implements JsonpSerializable {
	private final long primaryTerm;

	private final long version;

	private final List<ShardLease> leases;

	// ---------------------------------------------------------------------------------------------

	private ShardRetentionLeases(Builder builder) {

		this.primaryTerm = ModelTypeHelper.requireNonNull(builder.primaryTerm, this, "primaryTerm");
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");
		this.leases = ModelTypeHelper.unmodifiableRequired(builder.leases, this, "leases");

	}

	public static ShardRetentionLeases of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code primary_term}
	 */
	public final long primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final long version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code leases}
	 */
	public final List<ShardLease> leases() {
		return this.leases;
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

		generator.writeKey("primary_term");
		generator.write(this.primaryTerm);

		generator.writeKey("version");
		generator.write(this.version);

		if (ModelTypeHelper.isDefined(this.leases)) {
			generator.writeKey("leases");
			generator.writeStartArray();
			for (ShardLease item0 : this.leases) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardRetentionLeases}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardRetentionLeases> {
		private Long primaryTerm;

		private Long version;

		private List<ShardLease> leases;

		/**
		 * Required - API name: {@code primary_term}
		 */
		public final Builder primaryTerm(long value) {
			this.primaryTerm = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code leases}
		 */
		public final Builder leases(List<ShardLease> value) {
			this.leases = value;
			return this;
		}

		/**
		 * Required - API name: {@code leases}
		 */
		public final Builder leases(ShardLease... value) {
			this.leases = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code leases}
		 */
		public final Builder leases(
				Function<ListBuilder<ShardLease, ShardLease.Builder>, ObjectBuilder<List<ShardLease>>> fn) {
			return leases(fn.apply(new ListBuilder<>(ShardLease.Builder::new)).build());
		}

		/**
		 * Builds a {@link ShardRetentionLeases}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardRetentionLeases build() {
			_checkSingleUse();

			return new ShardRetentionLeases(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardRetentionLeases}
	 */
	public static final JsonpDeserializer<ShardRetentionLeases> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardRetentionLeases::setupShardRetentionLeasesDeserializer);

	protected static void setupShardRetentionLeasesDeserializer(ObjectDeserializer<ShardRetentionLeases.Builder> op) {

		op.add(Builder::primaryTerm, JsonpDeserializer.longDeserializer(), "primary_term");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::leases, JsonpDeserializer.arrayDeserializer(ShardLease._DESERIALIZER), "leases");

	}

}
