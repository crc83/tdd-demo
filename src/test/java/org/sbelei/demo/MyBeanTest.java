package org.sbelei.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.sbelei.demo.SampleMatcher.*;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import org.sbelei.demo.MyBean;

public class MyBeanTest {
	
	@Test
	public void testShouldBeFoundInCollectionByTwoAttributes() {
//		Collection<MyBean> actuals = null;
		Collection<MyBean> actuals = new ArrayList<>();
		actuals.add(new MyBean());
		assertThat(actuals, hasItem(withSomeAttributes("a1", "a2")));
	}

}
