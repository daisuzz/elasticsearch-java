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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MovingAverageAggregation
// union type: InternalTag[tag=model]
@JsonpDeserializable
public class MovingAverageAggregation
		implements
			TaggedUnion<MovingAverageAggregation.Kind, MovingAverageAggregationVariant>,
			JsonpSerializable {

	/**
	 * {@link MovingAverageAggregation} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Ewma("ewma"),

		Holt("holt"),

		HoltWinters("holt_winters"),

		Linear("linear"),

		Simple("simple"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final MovingAverageAggregationVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final MovingAverageAggregationVariant _get() {
		return _value;
	}

	public MovingAverageAggregation(MovingAverageAggregationVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._movingAverageAggregationKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private MovingAverageAggregation(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static MovingAverageAggregation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code ewma}?
	 */
	public boolean isEwma() {
		return _kind == Kind.Ewma;
	}

	/**
	 * Get the {@code ewma} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ewma} kind.
	 */
	public EwmaMovingAverageAggregation ewma() {
		return TaggedUnionUtils.get(this, Kind.Ewma);
	}

	/**
	 * Is this variant instance of kind {@code holt}?
	 */
	public boolean isHolt() {
		return _kind == Kind.Holt;
	}

	/**
	 * Get the {@code holt} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code holt} kind.
	 */
	public HoltMovingAverageAggregation holt() {
		return TaggedUnionUtils.get(this, Kind.Holt);
	}

	/**
	 * Is this variant instance of kind {@code holt_winters}?
	 */
	public boolean isHoltWinters() {
		return _kind == Kind.HoltWinters;
	}

	/**
	 * Get the {@code holt_winters} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code holt_winters} kind.
	 */
	public HoltWintersMovingAverageAggregation holtWinters() {
		return TaggedUnionUtils.get(this, Kind.HoltWinters);
	}

	/**
	 * Is this variant instance of kind {@code linear}?
	 */
	public boolean isLinear() {
		return _kind == Kind.Linear;
	}

	/**
	 * Get the {@code linear} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code linear} kind.
	 */
	public LinearMovingAverageAggregation linear() {
		return TaggedUnionUtils.get(this, Kind.Linear);
	}

	/**
	 * Is this variant instance of kind {@code simple}?
	 */
	public boolean isSimple() {
		return _kind == Kind.Simple;
	}

	/**
	 * Get the {@code simple} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple} kind.
	 */
	public SimpleMovingAverageAggregation simple() {
		return TaggedUnionUtils.get(this, Kind.Simple);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MovingAverageAggregation> {
		private Kind _kind;
		private MovingAverageAggregationVariant _value;

		public ObjectBuilder<MovingAverageAggregation> ewma(EwmaMovingAverageAggregation v) {
			this._kind = Kind.Ewma;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MovingAverageAggregation> ewma(Consumer<EwmaMovingAverageAggregation.Builder> fn) {
			EwmaMovingAverageAggregation.Builder builder = new EwmaMovingAverageAggregation.Builder();
			fn.accept(builder);
			return this.ewma(builder.build());
		}

		public ObjectBuilder<MovingAverageAggregation> holt(HoltMovingAverageAggregation v) {
			this._kind = Kind.Holt;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MovingAverageAggregation> holt(Consumer<HoltMovingAverageAggregation.Builder> fn) {
			HoltMovingAverageAggregation.Builder builder = new HoltMovingAverageAggregation.Builder();
			fn.accept(builder);
			return this.holt(builder.build());
		}

		public ObjectBuilder<MovingAverageAggregation> holtWinters(HoltWintersMovingAverageAggregation v) {
			this._kind = Kind.HoltWinters;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MovingAverageAggregation> holtWinters(
				Consumer<HoltWintersMovingAverageAggregation.Builder> fn) {
			HoltWintersMovingAverageAggregation.Builder builder = new HoltWintersMovingAverageAggregation.Builder();
			fn.accept(builder);
			return this.holtWinters(builder.build());
		}

		public ObjectBuilder<MovingAverageAggregation> linear(LinearMovingAverageAggregation v) {
			this._kind = Kind.Linear;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MovingAverageAggregation> linear(Consumer<LinearMovingAverageAggregation.Builder> fn) {
			LinearMovingAverageAggregation.Builder builder = new LinearMovingAverageAggregation.Builder();
			fn.accept(builder);
			return this.linear(builder.build());
		}

		public ObjectBuilder<MovingAverageAggregation> simple(SimpleMovingAverageAggregation v) {
			this._kind = Kind.Simple;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MovingAverageAggregation> simple(Consumer<SimpleMovingAverageAggregation.Builder> fn) {
			SimpleMovingAverageAggregation.Builder builder = new SimpleMovingAverageAggregation.Builder();
			fn.accept(builder);
			return this.simple(builder.build());
		}

		public MovingAverageAggregation build() {
			_checkSingleUse();
			return new MovingAverageAggregation(this);
		}

	}

	protected static void setupMovingAverageAggregationDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::ewma, EwmaMovingAverageAggregation._DESERIALIZER, "ewma");
		op.add(Builder::holt, HoltMovingAverageAggregation._DESERIALIZER, "holt");
		op.add(Builder::holtWinters, HoltWintersMovingAverageAggregation._DESERIALIZER, "holt_winters");
		op.add(Builder::linear, LinearMovingAverageAggregation._DESERIALIZER, "linear");
		op.add(Builder::simple, SimpleMovingAverageAggregation._DESERIALIZER, "simple");

		op.setTypeProperty("model", null);

	}

	public static final JsonpDeserializer<MovingAverageAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MovingAverageAggregation::setupMovingAverageAggregationDeserializer, Builder::build);
}
