package com.sakshi.closedprshow.model

import io.reactivex.Single
import retrofit2.http.GET

interface PullRequestApi {
      @GET("repos/sakshi-123-eng/OABS/pulls?state=closed")
    fun getPullRequest(): Single<List<PullRequest>>
}
