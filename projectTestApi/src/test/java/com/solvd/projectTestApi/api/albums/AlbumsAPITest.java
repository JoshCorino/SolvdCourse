package com.solvd.projectTestApi.api.albums;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

import io.restassured.path.json.JsonPath;

public class AlbumsAPITest extends AbstractTest {

	@Test
	@MethodOwner(owner ="Joshua corino")
	public void createAlbum() {
		PostAlbumMethod pA = new PostAlbumMethod();
		pA.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		String rs = pA.callAPI().asString();
		pA.validateResponse();
		int idGetted=new JsonPath(rs).getInt("albumId");
		GetAlbumMethod gA = new GetAlbumMethod(String.valueOf(idGetted));
		gA.expectResponseStatus(HttpResponseStatusType.OK_200);
		gA.callAPI();
	}
}
