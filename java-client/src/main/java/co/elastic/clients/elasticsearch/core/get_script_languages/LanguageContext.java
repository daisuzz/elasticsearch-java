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

package co.elastic.clients.elasticsearch.core.get_script_languages;

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

// typedef: _global.get_script_languages.LanguageContext
@JsonpDeserializable
public class LanguageContext implements JsonpSerializable {
	private final List<String> contexts;

	private final String language;

	// ---------------------------------------------------------------------------------------------

	private LanguageContext(Builder builder) {

		this.contexts = ModelTypeHelper.unmodifiableRequired(builder.contexts, this, "contexts");
		this.language = ModelTypeHelper.requireNonNull(builder.language, this, "language");

	}

	public static LanguageContext of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code contexts}
	 */
	public final List<String> contexts() {
		return this.contexts;
	}

	/**
	 * Required - API name: {@code language}
	 */
	public final String language() {
		return this.language;
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

		if (ModelTypeHelper.isDefined(this.contexts)) {
			generator.writeKey("contexts");
			generator.writeStartArray();
			for (String item0 : this.contexts) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("language");
		generator.write(this.language);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LanguageContext}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<LanguageContext> {
		private List<String> contexts;

		private String language;

		/**
		 * Required - API name: {@code contexts}
		 */
		public final Builder contexts(List<String> value) {
			this.contexts = value;
			return this;
		}

		/**
		 * Required - API name: {@code contexts}
		 */
		public final Builder contexts(String... value) {
			this.contexts = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code language}
		 */
		public final Builder language(String value) {
			this.language = value;
			return this;
		}

		/**
		 * Builds a {@link LanguageContext}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LanguageContext build() {
			_checkSingleUse();

			return new LanguageContext(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LanguageContext}
	 */
	public static final JsonpDeserializer<LanguageContext> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LanguageContext::setupLanguageContextDeserializer);

	protected static void setupLanguageContextDeserializer(ObjectDeserializer<LanguageContext.Builder> op) {

		op.add(Builder::contexts, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"contexts");
		op.add(Builder::language, JsonpDeserializer.stringDeserializer(), "language");

	}

}
