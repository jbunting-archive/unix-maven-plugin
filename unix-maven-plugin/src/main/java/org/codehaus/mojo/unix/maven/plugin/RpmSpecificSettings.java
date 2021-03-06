package org.codehaus.mojo.unix.maven.plugin;

/*
 * The MIT License
 *
 * Copyright 2009 The Codehaus.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import fj.data.*;
import static fj.data.Option.*;
import org.apache.commons.lang.builder.*;

/**
 * @author <a href="mailto:trygvis@codehaus.org">Trygve Laugst&oslash;l</a>
 */
public class RpmSpecificSettings
{
    private Option<String> group = none();

	private Option<String> provides = none();

	private Option<String> requires = none();

	private Option<String> conflicts = none();

    public Option<String> getGroup()
    {
        return group;
    }

    public void setGroup( String group )
    {
        this.group = fromNull( group );
    }

	public Option<String> getProvides()
	{
		return provides;
	}

	public void setProvides(final String provides)
	{
		this.provides = fromNull( provides );
	}

	public Option<String> getRequires()
	{
		return requires;
	}

	public void setRequires(final String requires)
	{
		this.requires = fromNull( requires );
	}

	public Option<String> getConflicts()
	{
		return conflicts;
	}

	public void setConflicts(final String conflicts)
	{
		this.conflicts = fromNull( conflicts );
	}

	public String toString()
    {
        return ToStringBuilder.reflectionToString( this, ToStringStyle.MULTI_LINE_STYLE );
    }
}
