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

package co.elastic.clients.elasticsearch.indices.resolve_index;

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
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: indices.resolve_index.ResolveIndexItem
@JsonpDeserializable
public class ResolveIndexItem implements JsonpSerializable {
	private final String name;

	private final List<String> aliases;

	private final List<String> attributes;

	@Nullable
	private final String dataStream;

	// ---------------------------------------------------------------------------------------------

	private ResolveIndexItem(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.attributes = ModelTypeHelper.unmodifiableRequired(builder.attributes, this, "attributes");
		this.dataStream = builder.dataStream;

	}

	public static ResolveIndexItem of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code aliases}
	 */
	public final List<String> aliases() {
		return this.aliases;
	}

	/**
	 * Required - API name: {@code attributes}
	 */
	public final List<String> attributes() {
		return this.attributes;
	}

	/**
	 * API name: {@code data_stream}
	 */
	@Nullable
	public final String dataStream() {
		return this.dataStream;
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

		generator.writeKey("name");
		generator.write(this.name);

		if (ModelTypeHelper.isDefined(this.aliases)) {
			generator.writeKey("aliases");
			generator.writeStartArray();
			for (String item0 : this.aliases) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartArray();
			for (String item0 : this.attributes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.dataStream != null) {
			generator.writeKey("data_stream");
			generator.write(this.dataStream);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResolveIndexItem}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ResolveIndexItem> {
		private String name;

		@Nullable
		private List<String> aliases;

		private List<String> attributes;

		@Nullable
		private String dataStream;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public final Builder aliases(@Nullable List<String> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public final Builder aliases(String... value) {
			this.aliases = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code attributes}
		 */
		public final Builder attributes(List<String> value) {
			this.attributes = value;
			return this;
		}

		/**
		 * Required - API name: {@code attributes}
		 */
		public final Builder attributes(String... value) {
			this.attributes = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(@Nullable String value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * Builds a {@link ResolveIndexItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResolveIndexItem build() {
			_checkSingleUse();

			return new ResolveIndexItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ResolveIndexItem}
	 */
	public static final JsonpDeserializer<ResolveIndexItem> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ResolveIndexItem::setupResolveIndexItemDeserializer);

	protected static void setupResolveIndexItemDeserializer(ObjectDeserializer<ResolveIndexItem.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::aliases, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"aliases");
		op.add(Builder::attributes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::dataStream, JsonpDeserializer.stringDeserializer(), "data_stream");

	}

}
