package com.sscl.data.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.awt.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void testMockList() {
		List listMock = mock(List.class);
		when(listMock.getSelectedIndex()).thenReturn(2);
		assertEquals(2,  listMock.getSelectedIndex());
	}
	
	@Test
	public void testMockListReturnMultipleValue() {
		List listMock = mock(List.class);
		when(listMock.getSelectedIndex()).thenReturn(2).thenReturn(5);
		assertEquals(2,  listMock.getSelectedIndex());		// first call
		assertEquals(5,  listMock.getSelectedIndex());		// second call

	}
	
	
	

}
