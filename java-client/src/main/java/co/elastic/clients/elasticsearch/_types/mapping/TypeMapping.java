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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.TypeMapping
@JsonpDeserializable
public class TypeMapping implements JsonpSerializable {
	@Nullable
	private final AllField allField;

	@Nullable
	private final Boolean dateDetection;

	@Nullable
	private final DynamicMapping dynamic;

	private final List<String> dynamicDateFormats;

	private final List<Map<String, DynamicTemplate>> dynamicTemplates;

	@Nullable
	private final FieldNamesField fieldNames;

	@Nullable
	private final IndexField indexField;

	private final Map<String, JsonData> meta;

	@Nullable
	private final Boolean numericDetection;

	private final Map<String, Property> properties;

	@Nullable
	private final RoutingField routing;

	@Nullable
	private final SizeField size;

	@Nullable
	private final SourceField source;

	private final Map<String, RuntimeField> runtime;

	@Nullable
	private final Boolean enabled;

	// ---------------------------------------------------------------------------------------------

	private TypeMapping(Builder builder) {

		this.allField = builder.allField;
		this.dateDetection = builder.dateDetection;
		this.dynamic = builder.dynamic;
		this.dynamicDateFormats = ModelTypeHelper.unmodifiable(builder.dynamicDateFormats);
		this.dynamicTemplates = ModelTypeHelper.unmodifiable(builder.dynamicTemplates);
		this.fieldNames = builder.fieldNames;
		this.indexField = builder.indexField;
		this.meta = ModelTypeHelper.unmodifiable(builder.meta);
		this.numericDetection = builder.numericDetection;
		this.properties = ModelTypeHelper.unmodifiable(builder.properties);
		this.routing = builder.routing;
		this.size = builder.size;
		this.source = builder.source;
		this.runtime = ModelTypeHelper.unmodifiable(builder.runtime);
		this.enabled = builder.enabled;

	}

	public static TypeMapping of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code all_field}
	 */
	@Nullable
	public final AllField allField() {
		return this.allField;
	}

	/**
	 * API name: {@code date_detection}
	 */
	@Nullable
	public final Boolean dateDetection() {
		return this.dateDetection;
	}

	/**
	 * API name: {@code dynamic}
	 */
	@Nullable
	public final DynamicMapping dynamic() {
		return this.dynamic;
	}

	/**
	 * API name: {@code dynamic_date_formats}
	 */
	public final List<String> dynamicDateFormats() {
		return this.dynamicDateFormats;
	}

	/**
	 * API name: {@code dynamic_templates}
	 */
	public final List<Map<String, DynamicTemplate>> dynamicTemplates() {
		return this.dynamicTemplates;
	}

	/**
	 * API name: {@code _field_names}
	 */
	@Nullable
	public final FieldNamesField fieldNames() {
		return this.fieldNames;
	}

	/**
	 * API name: {@code index_field}
	 */
	@Nullable
	public final IndexField indexField() {
		return this.indexField;
	}

	/**
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code numeric_detection}
	 */
	@Nullable
	public final Boolean numericDetection() {
		return this.numericDetection;
	}

	/**
	 * API name: {@code properties}
	 */
	public final Map<String, Property> properties() {
		return this.properties;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public final RoutingField routing() {
		return this.routing;
	}

	/**
	 * API name: {@code _size}
	 */
	@Nullable
	public final SizeField size() {
		return this.size;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceField source() {
		return this.source;
	}

	/**
	 * API name: {@code runtime}
	 */
	public final Map<String, RuntimeField> runtime() {
		return this.runtime;
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
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

		if (this.allField != null) {
			generator.writeKey("all_field");
			this.allField.serialize(generator, mapper);

		}
		if (this.dateDetection != null) {
			generator.writeKey("date_detection");
			generator.write(this.dateDetection);

		}
		if (this.dynamic != null) {
			generator.writeKey("dynamic");
			this.dynamic.serialize(generator, mapper);
		}
		if (ModelTypeHelper.isDefined(this.dynamicDateFormats)) {
			generator.writeKey("dynamic_date_formats");
			generator.writeStartArray();
			for (String item0 : this.dynamicDateFormats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.dynamicTemplates)) {
			generator.writeKey("dynamic_templates");
			generator.writeStartArray();
			for (Map<String, DynamicTemplate> item0 : this.dynamicTemplates) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, DynamicTemplate> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.fieldNames != null) {
			generator.writeKey("_field_names");
			this.fieldNames.serialize(generator, mapper);

		}
		if (this.indexField != null) {
			generator.writeKey("index_field");
			this.indexField.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.numericDetection != null) {
			generator.writeKey("numeric_detection");
			generator.write(this.numericDetection);

		}
		if (ModelTypeHelper.isDefined(this.properties)) {
			generator.writeKey("properties");
			generator.writeStartObject();
			for (Map.Entry<String, Property> item0 : this.properties.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.routing != null) {
			generator.writeKey("_routing");
			this.routing.serialize(generator, mapper);

		}
		if (this.size != null) {
			generator.writeKey("_size");
			this.size.serialize(generator, mapper);

		}
		if (this.source != null) {
			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.runtime)) {
			generator.writeKey("runtime");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtime.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TypeMapping}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TypeMapping> {
		@Nullable
		private AllField allField;

		@Nullable
		private Boolean dateDetection;

		@Nullable
		private DynamicMapping dynamic;

		@Nullable
		private List<String> dynamicDateFormats;

		@Nullable
		private List<Map<String, DynamicTemplate>> dynamicTemplates;

		@Nullable
		private FieldNamesField fieldNames;

		@Nullable
		private IndexField indexField;

		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private Boolean numericDetection;

		@Nullable
		private Map<String, Property> properties;

		@Nullable
		private RoutingField routing;

		@Nullable
		private SizeField size;

		@Nullable
		private SourceField source;

		@Nullable
		private Map<String, RuntimeField> runtime;

		@Nullable
		private Boolean enabled;

		/**
		 * API name: {@code all_field}
		 */
		public final Builder allField(@Nullable AllField value) {
			this.allField = value;
			return this;
		}

		/**
		 * API name: {@code all_field}
		 */
		public final Builder allField(Consumer<AllField.Builder> fn) {
			AllField.Builder builder = new AllField.Builder();
			fn.accept(builder);
			return this.allField(builder.build());
		}

		/**
		 * API name: {@code date_detection}
		 */
		public final Builder dateDetection(@Nullable Boolean value) {
			this.dateDetection = value;
			return this;
		}

		/**
		 * API name: {@code dynamic}
		 */
		public final Builder dynamic(@Nullable DynamicMapping value) {
			this.dynamic = value;
			return this;
		}

		/**
		 * API name: {@code dynamic_date_formats}
		 */
		public final Builder dynamicDateFormats(@Nullable List<String> value) {
			this.dynamicDateFormats = value;
			return this;
		}

		/**
		 * API name: {@code dynamic_date_formats}
		 */
		public final Builder dynamicDateFormats(String... value) {
			this.dynamicDateFormats = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code dynamic_templates}
		 */
		public final Builder dynamicTemplates(@Nullable List<Map<String, DynamicTemplate>> value) {
			this.dynamicTemplates = value;
			return this;
		}

		/**
		 * API name: {@code dynamic_templates}
		 */
		public final Builder dynamicTemplates(Map<String, DynamicTemplate>... value) {
			this.dynamicTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code _field_names}
		 */
		public final Builder fieldNames(@Nullable FieldNamesField value) {
			this.fieldNames = value;
			return this;
		}

		/**
		 * API name: {@code _field_names}
		 */
		public final Builder fieldNames(Consumer<FieldNamesField.Builder> fn) {
			FieldNamesField.Builder builder = new FieldNamesField.Builder();
			fn.accept(builder);
			return this.fieldNames(builder.build());
		}

		/**
		 * API name: {@code index_field}
		 */
		public final Builder indexField(@Nullable IndexField value) {
			this.indexField = value;
			return this;
		}

		/**
		 * API name: {@code index_field}
		 */
		public final Builder indexField(Consumer<IndexField.Builder> fn) {
			IndexField.Builder builder = new IndexField.Builder();
			fn.accept(builder);
			return this.indexField(builder.build());
		}

		/**
		 * API name: {@code _meta}
		 */
		public final Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		/**
		 * API name: {@code numeric_detection}
		 */
		public final Builder numericDetection(@Nullable Boolean value) {
			this.numericDetection = value;
			return this;
		}

		/**
		 * API name: {@code properties}
		 */
		public final Builder properties(@Nullable Map<String, Property> value) {
			this.properties = value;
			return this;
		}

		public final Builder properties(
				Function<MapBuilder<String, Property, Property.Builder>, ObjectBuilder<Map<String, Property>>> fn) {
			return properties(fn.apply(new MapBuilder<>(Property.Builder::new)).build());
		}

		/**
		 * API name: {@code _routing}
		 */
		public final Builder routing(@Nullable RoutingField value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code _routing}
		 */
		public final Builder routing(Consumer<RoutingField.Builder> fn) {
			RoutingField.Builder builder = new RoutingField.Builder();
			fn.accept(builder);
			return this.routing(builder.build());
		}

		/**
		 * API name: {@code _size}
		 */
		public final Builder size(@Nullable SizeField value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code _size}
		 */
		public final Builder size(Consumer<SizeField.Builder> fn) {
			SizeField.Builder builder = new SizeField.Builder();
			fn.accept(builder);
			return this.size(builder.build());
		}

		/**
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable SourceField value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public final Builder source(Consumer<SourceField.Builder> fn) {
			SourceField.Builder builder = new SourceField.Builder();
			fn.accept(builder);
			return this.source(builder.build());
		}

		/**
		 * API name: {@code runtime}
		 */
		public final Builder runtime(@Nullable Map<String, RuntimeField> value) {
			this.runtime = value;
			return this;
		}

		public final Builder runtime(
				Function<MapBuilder<String, RuntimeField, RuntimeField.Builder>, ObjectBuilder<Map<String, RuntimeField>>> fn) {
			return runtime(fn.apply(new MapBuilder<>(RuntimeField.Builder::new)).build());
		}

		/**
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Builds a {@link TypeMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TypeMapping build() {
			_checkSingleUse();

			return new TypeMapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TypeMapping}
	 */
	public static final JsonpDeserializer<TypeMapping> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TypeMapping::setupTypeMappingDeserializer);

	protected static void setupTypeMappingDeserializer(ObjectDeserializer<TypeMapping.Builder> op) {

		op.add(Builder::allField, AllField._DESERIALIZER, "all_field");
		op.add(Builder::dateDetection, JsonpDeserializer.booleanDeserializer(), "date_detection");
		op.add(Builder::dynamic, DynamicMapping._DESERIALIZER, "dynamic");
		op.add(Builder::dynamicDateFormats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"dynamic_date_formats");
		op.add(Builder::dynamicTemplates, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(DynamicTemplate._DESERIALIZER)), "dynamic_templates");
		op.add(Builder::fieldNames, FieldNamesField._DESERIALIZER, "_field_names");
		op.add(Builder::indexField, IndexField._DESERIALIZER, "index_field");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::numericDetection, JsonpDeserializer.booleanDeserializer(), "numeric_detection");
		op.add(Builder::properties, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER), "properties");
		op.add(Builder::routing, RoutingField._DESERIALIZER, "_routing");
		op.add(Builder::size, SizeField._DESERIALIZER, "_size");
		op.add(Builder::source, SourceField._DESERIALIZER, "_source");
		op.add(Builder::runtime, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER), "runtime");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

	}

}
