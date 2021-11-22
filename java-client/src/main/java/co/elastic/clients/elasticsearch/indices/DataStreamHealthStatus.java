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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

@JsonpDeserializable
public enum DataStreamHealthStatus implements JsonEnum {
	/**
	 * All shards are assigned.
	 */
	Green("green", "GREEN"),

	/**
	 * All primary shards are assigned, but one or more replica shards are
	 * unassigned.
	 */
	Yellow("yellow", "YELLOW"),

	/**
	 * One or more primary shards are unassigned, so some data is unavailable.
	 */
	Red("red", "RED"),

	;

	private final String jsonValue;
	private final String[] aliases;

	DataStreamHealthStatus(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<DataStreamHealthStatus> _DESERIALIZER = new JsonEnum.Deserializer<>(
			DataStreamHealthStatus.values());
}
