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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml.get_calendar_events.Response
@JsonpDeserializable
public class GetCalendarEventsResponse implements JsonpSerializable {
	private final long count;

	private final List<CalendarEvent> events;

	// ---------------------------------------------------------------------------------------------

	private GetCalendarEventsResponse(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.events = ModelTypeHelper.unmodifiableRequired(builder.events, this, "events");

	}

	public static GetCalendarEventsResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code events}
	 */
	public final List<CalendarEvent> events() {
		return this.events;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ModelTypeHelper.isDefined(this.events)) {
			generator.writeKey("events");
			generator.writeStartArray();
			for (CalendarEvent item0 : this.events) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCalendarEventsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetCalendarEventsResponse> {
		private Long count;

		private List<CalendarEvent> events;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code events}
		 */
		public final Builder events(List<CalendarEvent> value) {
			this.events = value;
			return this;
		}

		/**
		 * Required - API name: {@code events}
		 */
		public final Builder events(CalendarEvent... value) {
			this.events = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code events}
		 */
		public final Builder events(
				Function<ListBuilder<CalendarEvent, CalendarEvent.Builder>, ObjectBuilder<List<CalendarEvent>>> fn) {
			return events(fn.apply(new ListBuilder<>(CalendarEvent.Builder::new)).build());
		}

		/**
		 * Builds a {@link GetCalendarEventsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCalendarEventsResponse build() {
			_checkSingleUse();

			return new GetCalendarEventsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetCalendarEventsResponse}
	 */
	public static final JsonpDeserializer<GetCalendarEventsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetCalendarEventsResponse::setupGetCalendarEventsResponseDeserializer);

	protected static void setupGetCalendarEventsResponseDeserializer(
			ObjectDeserializer<GetCalendarEventsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::events, JsonpDeserializer.arrayDeserializer(CalendarEvent._DESERIALIZER), "events");

	}

}
