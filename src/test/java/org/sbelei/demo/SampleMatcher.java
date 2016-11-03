package org.sbelei.demo;

import java.util.logging.Logger;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class SampleMatcher {

	protected static final Logger LOG = Logger.getLogger(SampleMatcher.class.getName());

	public static BaseMatcher<MyBean> withSomeAttributes(final String attr1, final String attr2) {
			
			return new BaseMatcher<MyBean>() {
		
				public boolean matches(Object item) {
					if ( (item == null || !(item instanceof MyBean)) ) {
						return false;
					}
					MyBean bean = (MyBean) item;
					LOG.fine("Checking item:"+bean);
					if (bean.getAttr1().equals(attr1) && bean.getAttr2().equals(attr2)) {
						return true;
					}
					return false;
				}
		
				public void describeTo(Description description) {
					description.appendText("Item with specific attributes ["
							+ attr1 + ":" + attr2 + "] not found "); 
				}
				
				@Override
				public void describeMismatch(Object item, Description description) {
					if (item instanceof MyBean) {
						MyBean bean = (MyBean) item;
						description.appendText("was ").appendValue(bean.toString());
					} else {
						super.describeMismatch(item, description);
					}
				}
			};
		}

}
