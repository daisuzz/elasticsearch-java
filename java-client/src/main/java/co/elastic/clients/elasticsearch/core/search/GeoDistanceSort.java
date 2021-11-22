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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch._types.DistanceUnit;
import co.elastic.clients.elasticsearch._types.GeoDistanceType;
import co.elastic.clients.elasticsearch._types.GeoLocation;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.GeoDistanceSort
@JsonpDeserializable
public class GeoDistanceSort implements SortOptionsVariant, JsonpSerializable {
	private final String field;

	private final List<GeoLocation> value;

	@Nullable
	private final SortMode mode;

	@Nullable
	private final GeoDistanceType distanceType;

	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final SortOrder order;

	@Nullable
	private final DistanceUnit unit;

	// ---------------------------------------------------------------------------------------------

	private GeoDistanceSort(Builder builder) {

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.value = ModelTypeHelper.unmodifiableRequired(builder.value, this, "value");

		this.mode = builder.mode;
		this.distanceType = builder.distanceType;
		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.order = builder.order;
		this.unit = builder.unit;

	}

	public static GeoDistanceSort of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * SortOptions variant kind.
	 */
	@Override
	public SortOptions.Kind _sortOptionsKind() {
		return SortOptions.Kind.GeoDistance;
	}

	/**
	 * Required -
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required -
	 */
	public final List<GeoLocation> value() {
		return this.value;
	}

	/**
	 * API name: {@code mode}
	 */
	@Nullable
	public final SortMode mode() {
		return this.mode;
	}

	/**
	 * API name: {@code distance_type}
	 */
	@Nullable
	public final GeoDistanceType distanceType() {
		return this.distanceType;
	}

	/**
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public final Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	/**
	 * API name: {@code order}
	 */
	@Nullable
	public final SortOrder order() {
		return this.order;
	}

	/**
	 * API name: {@code unit}
	 */
	@Nullable
	public final DistanceUnit unit() {
		return this.unit;
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
		generator.writeKey(this.field);
		generator.writeStartArray();
		for (GeoLocation item0 : this.value) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.mode != null) {
			generator.writeKey("mode");
			this.mode.serialize(generator, mapper);
		}
		if (this.distanceType != null) {
			generator.writeKey("distance_type");
			this.distanceType.serialize(generator, mapper);
		}
		if (this.ignoreUnmapped != null) {
			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}
		if (this.order != null) {
			generator.writeKey("order");
			this.order.serialize(generator, mapper);
		}
		if (this.unit != null) {
			generator.writeKey("unit");
			this.unit.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoDistanceSort}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoDistanceSort> {
		private String field;

		private List<GeoLocation> value;

		/**
		 * Required -
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder value(List<GeoLocation> value) {
			this.value = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder value(GeoLocation... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder value(
				Function<ListBuilder<GeoLocation, GeoLocation.Builder>, ObjectBuilder<List<GeoLocation>>> fn) {
			return value(fn.apply(new ListBuilder<>(GeoLocation.Builder::new)).build());
		}

		@Nullable
		private SortMode mode;

		@Nullable
		private GeoDistanceType distanceType;

		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private SortOrder order;

		@Nullable
		private DistanceUnit unit;

		/**
		 * API name: {@code mode}
		 */
		public final Builder mode(@Nullable SortMode value) {
			this.mode = value;
			return this;
		}

		/**
		 * API name: {@code distance_type}
		 */
		public final Builder distanceType(@Nullable GeoDistanceType value) {
			this.distanceType = value;
			return this;
		}

		/**
		 * API name: {@code ignore_unmapped}
		 */
		public final Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public final Builder order(@Nullable SortOrder value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code unit}
		 */
		public final Builder unit(@Nullable DistanceUnit value) {
			this.unit = value;
			return this;
		}

		/**
		 * Builds a {@link GeoDistanceSort}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoDistanceSort build() {
			_checkSingleUse();

			return new GeoDistanceSort(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoDistanceSort}
	 */
	public static final JsonpDeserializer<GeoDistanceSort> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoDistanceSort::setupGeoDistanceSortDeserializer);

	protected static void setupGeoDistanceSortDeserializer(ObjectDeserializer<GeoDistanceSort.Builder> op) {

		op.add(Builder::mode, SortMode._DESERIALIZER, "mode");
		op.add(Builder::distanceType, GeoDistanceType._DESERIALIZER, "distance_type");
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");
		op.add(Builder::order, SortOrder._DESERIALIZER, "order");
		op.add(Builder::unit, DistanceUnit._DESERIALIZER, "unit");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.value(JsonpDeserializer.arrayDeserializer(GeoLocation._DESERIALIZER).deserialize(parser, mapper));
		});

	}

}
