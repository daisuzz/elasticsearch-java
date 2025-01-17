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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _global.search._types.CompletionSuggester
@JsonpDeserializable
public class CompletionSuggester extends SuggesterBase implements FieldSuggesterVariant {
	private final Map<String, List<CompletionContext>> contexts;

	@Nullable
	private final SuggestFuzziness fuzzy;

	@Nullable
	private final String prefix;

	@Nullable
	private final String regex;

	@Nullable
	private final Boolean skipDuplicates;

	// ---------------------------------------------------------------------------------------------

	private CompletionSuggester(Builder builder) {
		super(builder);

		this.contexts = ModelTypeHelper.unmodifiable(builder.contexts);
		this.fuzzy = builder.fuzzy;
		this.prefix = builder.prefix;
		this.regex = builder.regex;
		this.skipDuplicates = builder.skipDuplicates;

	}

	public static CompletionSuggester of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * FieldSuggester variant kind.
	 */
	@Override
	public FieldSuggester.Kind _fieldSuggesterKind() {
		return FieldSuggester.Kind.Completion;
	}

	/**
	 * API name: {@code contexts}
	 */
	public final Map<String, List<CompletionContext>> contexts() {
		return this.contexts;
	}

	/**
	 * API name: {@code fuzzy}
	 */
	@Nullable
	public final SuggestFuzziness fuzzy() {
		return this.fuzzy;
	}

	/**
	 * API name: {@code prefix}
	 */
	@Nullable
	public final String prefix() {
		return this.prefix;
	}

	/**
	 * API name: {@code regex}
	 */
	@Nullable
	public final String regex() {
		return this.regex;
	}

	/**
	 * API name: {@code skip_duplicates}
	 */
	@Nullable
	public final Boolean skipDuplicates() {
		return this.skipDuplicates;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.contexts)) {
			generator.writeKey("contexts");
			generator.writeStartObject();
			for (Map.Entry<String, List<CompletionContext>> item0 : this.contexts.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (CompletionContext item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.fuzzy != null) {
			generator.writeKey("fuzzy");
			this.fuzzy.serialize(generator, mapper);

		}
		if (this.prefix != null) {
			generator.writeKey("prefix");
			generator.write(this.prefix);

		}
		if (this.regex != null) {
			generator.writeKey("regex");
			generator.write(this.regex);

		}
		if (this.skipDuplicates != null) {
			generator.writeKey("skip_duplicates");
			generator.write(this.skipDuplicates);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompletionSuggester}.
	 */
	public static class Builder extends SuggesterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CompletionSuggester> {
		@Nullable
		private Map<String, List<CompletionContext>> contexts;

		@Nullable
		private SuggestFuzziness fuzzy;

		@Nullable
		private String prefix;

		@Nullable
		private String regex;

		@Nullable
		private Boolean skipDuplicates;

		/**
		 * API name: {@code contexts}
		 */
		public final Builder contexts(@Nullable Map<String, List<CompletionContext>> value) {
			this.contexts = value;
			return this;
		}

		/**
		 * API name: {@code fuzzy}
		 */
		public final Builder fuzzy(@Nullable SuggestFuzziness value) {
			this.fuzzy = value;
			return this;
		}

		/**
		 * API name: {@code fuzzy}
		 */
		public final Builder fuzzy(Consumer<SuggestFuzziness.Builder> fn) {
			SuggestFuzziness.Builder builder = new SuggestFuzziness.Builder();
			fn.accept(builder);
			return this.fuzzy(builder.build());
		}

		/**
		 * API name: {@code prefix}
		 */
		public final Builder prefix(@Nullable String value) {
			this.prefix = value;
			return this;
		}

		/**
		 * API name: {@code regex}
		 */
		public final Builder regex(@Nullable String value) {
			this.regex = value;
			return this;
		}

		/**
		 * API name: {@code skip_duplicates}
		 */
		public final Builder skipDuplicates(@Nullable Boolean value) {
			this.skipDuplicates = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompletionSuggester}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionSuggester build() {
			_checkSingleUse();

			return new CompletionSuggester(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompletionSuggester}
	 */
	public static final JsonpDeserializer<CompletionSuggester> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompletionSuggester::setupCompletionSuggesterDeserializer);

	protected static void setupCompletionSuggesterDeserializer(ObjectDeserializer<CompletionSuggester.Builder> op) {
		SuggesterBase.setupSuggesterBaseDeserializer(op);
		op.add(Builder::contexts, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(CompletionContext._DESERIALIZER)), "contexts");
		op.add(Builder::fuzzy, SuggestFuzziness._DESERIALIZER, "fuzzy");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::regex, JsonpDeserializer.stringDeserializer(), "regex");
		op.add(Builder::skipDuplicates, JsonpDeserializer.booleanDeserializer(), "skip_duplicates");

	}

}
