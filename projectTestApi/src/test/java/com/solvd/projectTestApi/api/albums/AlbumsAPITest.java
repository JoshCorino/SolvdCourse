package com.solvd.projectTestApi.api.albums;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

public class AlbumsAPITest extends AbstractTest {

	@Test
	@MethodOwner(owner ="Joshua corino")
	public void createAlbum() {
		PostAlbumMethod pA = new PostAlbumMethod();
		pA.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		pA.callAPI();
		pA.validateResponse();
	}
}
