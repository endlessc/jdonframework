/*
 * Copyright 2003-2009 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.jdon.domain.message;

import com.jdon.async.message.EventMessage;

public class DomainMessage extends EventMessage {

	protected Object eventSource;

	public DomainMessage(Object eventSource) {
		super();
		this.eventSource = eventSource;
	}

	public Object getEventSource() {
		return eventSource;
	}

	public void setEventSource(Object eventSource) {
		this.eventSource = eventSource;
	}

	public Object getEventResult() {
		return super.getEventResult();
	}

	public void setEventResult(Object eventResult) {
		super.setEventResult(eventResult);
	}

}
