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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: xpack.usage.WatcherWatchTriggerSchedule
@JsonpDeserializable
public class WatcherWatchTriggerSchedule extends Counter {
	private final Counter cron;

	private final Counter all;

	// ---------------------------------------------------------------------------------------------

	private WatcherWatchTriggerSchedule(Builder builder) {
		super(builder);

		this.cron = ModelTypeHelper.requireNonNull(builder.cron, this, "cron");
		this.all = ModelTypeHelper.requireNonNull(builder.all, this, "all");

	}

	public static WatcherWatchTriggerSchedule of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code cron}
	 */
	public final Counter cron() {
		return this.cron;
	}

	/**
	 * Required - API name: {@code _all}
	 */
	public final Counter all() {
		return this.all;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("cron");
		this.cron.serialize(generator, mapper);

		generator.writeKey("_all");
		this.all.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherWatchTriggerSchedule}.
	 */
	public static class Builder extends Counter.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WatcherWatchTriggerSchedule> {
		private Counter cron;

		private Counter all;

		/**
		 * Required - API name: {@code cron}
		 */
		public final Builder cron(Counter value) {
			this.cron = value;
			return this;
		}

		/**
		 * Required - API name: {@code cron}
		 */
		public final Builder cron(Consumer<Counter.Builder> fn) {
			Counter.Builder builder = new Counter.Builder();
			fn.accept(builder);
			return this.cron(builder.build());
		}

		/**
		 * Required - API name: {@code _all}
		 */
		public final Builder all(Counter value) {
			this.all = value;
			return this;
		}

		/**
		 * Required - API name: {@code _all}
		 */
		public final Builder all(Consumer<Counter.Builder> fn) {
			Counter.Builder builder = new Counter.Builder();
			fn.accept(builder);
			return this.all(builder.build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WatcherWatchTriggerSchedule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherWatchTriggerSchedule build() {
			_checkSingleUse();

			return new WatcherWatchTriggerSchedule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatcherWatchTriggerSchedule}
	 */
	public static final JsonpDeserializer<WatcherWatchTriggerSchedule> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WatcherWatchTriggerSchedule::setupWatcherWatchTriggerScheduleDeserializer);

	protected static void setupWatcherWatchTriggerScheduleDeserializer(
			ObjectDeserializer<WatcherWatchTriggerSchedule.Builder> op) {
		Counter.setupCounterDeserializer(op);
		op.add(Builder::cron, Counter._DESERIALIZER, "cron");
		op.add(Builder::all, Counter._DESERIALIZER, "_all");

	}

}
