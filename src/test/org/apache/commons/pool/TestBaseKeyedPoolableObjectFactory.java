/*
 * Copyright 1999-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.pool;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Rodney Waldhoff
 * @version $Revision: 1.5 $ $Date: 2004/02/28 12:16:21 $
 */
public class TestBaseKeyedPoolableObjectFactory extends TestCase {
    public TestBaseKeyedPoolableObjectFactory(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TestBaseKeyedPoolableObjectFactory.class);
    }
    
    // tests
    public void testDefaultMethods() throws Exception {
        KeyedPoolableObjectFactory factory = new BaseKeyedPoolableObjectFactory() { 
            public Object makeObject(Object key) throws Exception {
                return null;
            }
        };   
        
        factory.activateObject("key",null); // a no-op
        factory.passivateObject("key",null); // a no-op
        factory.destroyObject("key",null); // a no-op
        assertTrue(factory.validateObject("key",null)); // constant true
    }
}
