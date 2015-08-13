/*
 * #%L Simmetrics Core %% Copyright (C) 2014 - 2015 Simmetrics Authors %% This
 * program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/gpl-3.0.html>. #L%
 */

package org.simmetrics.tokenizers;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Splits a string into tokens around white space.
 * <p>
 * This class is immutable and thread-safe.
 * 
 * @deprecated use {@link Tokenizers#whitespace()} instead
 */
@Deprecated
public final class Whitespace extends AbstractTokenizer {

	@Override
	public String toString() {
		return "WhitespaceTokenizer [" + pattern + "]";
	}

	private static final Pattern pattern = Pattern.compile("\\s+");

	@Override
	public List<String> tokenizeToList(final String input) {
		if (input.isEmpty()) {
			return emptyList();
		}

		return asList(pattern.split(input));
	}

}
