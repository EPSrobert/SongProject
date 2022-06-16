package com.goodee.song;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class SongTestCase {

	private File file;
	
	@Before
	public void setUp() throws Exception {
		file = new File("song.mp3");
	}

	@Test
	public void 파일점검테스트() {
		
	}

}
