package com.solvd.projectTestApi.api.albums;


import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetAlbumMethod extends AbstractApiMethodV2{
	
    public GetAlbumMethod(String albumId) {
        super(null,null);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        addParameter("albumId", albumId);
    }
}
