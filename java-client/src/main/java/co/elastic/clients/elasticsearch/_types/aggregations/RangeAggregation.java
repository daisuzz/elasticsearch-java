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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.RangeAggregation
@JsonpDeserializable
public class RangeAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final String field;

	@Nullable
	private final Integer missing;

	private final List<AggregationRange> ranges;

	@Nullable
	private final Script script;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	private RangeAggregation(Builder builder) {
		super(builder);

		this.field = builder.field;
		this.missing = builder.missing;
		this.ranges = ModelTypeHelper.unmodifiable(builder.ranges);
		this.script = builder.script;
		this.keyed = builder.keyed;

	}

	public static RangeAggregation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Range;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final Integer missing() {
		return this.missing;
	}

	/**
	 * API name: {@code ranges}
	 */
	public final List<AggregationRange> ranges() {
		return this.ranges;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * API name: {@code keyed}
	 */
	@Nullable
	public final Boolean keyed() {
		return this.keyed;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.missing != null) {
			generator.writeKey("missing");
			generator.write(this.missing);

		}
		if (ModelTypeHelper.isDefined(this.ranges)) {
			generator.writeKey("ranges");
			generator.writeStartArray();
			for (AggregationRange item0 : this.ranges) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.keyed != null) {
			generator.writeKey("keyed");
			generator.write(this.keyed);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RangeAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RangeAggregation> {
		@Nullable
		private String field;

		@Nullable
		private Integer missing;

		@Nullable
		private List<AggregationRange> ranges;

		@Nullable
		private Script script;

		@Nullable
		private Boolean keyed;

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable Integer value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public final Builder ranges(@Nullable List<AggregationRange> value) {
			this.ranges = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public final Builder ranges(AggregationRange... value) {
			this.ranges = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public final Builder ranges(
				Function<ListBuilder<AggregationRange, AggregationRange.Builder>, ObjectBuilder<List<AggregationRange>>> fn) {
			return ranges(fn.apply(new ListBuilder<>(AggregationRange.Builder::new)).build());
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(Consumer<Script.Builder> fn) {
			Script.Builder builder = new Script.Builder();
			fn.accept(builder);
			return this.script(builder.build());
		}

		/**
		 * API name: {@code keyed}
		 */
		public final Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RangeAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RangeAggregation build() {
			_checkSingleUse();

			return new RangeAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RangeAggregation}
	 */
	public static final JsonpDeserializer<RangeAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RangeAggregation::setupRangeAggregationDeserializer);

	protected static void setupRangeAggregationDeserializer(ObjectDeserializer<RangeAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::missing, JsonpDeserializer.integerDeserializer(), "missing");
		op.add(Builder::ranges, JsonpDeserializer.arrayDeserializer(AggregationRange._DESERIALIZER), "ranges");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}
