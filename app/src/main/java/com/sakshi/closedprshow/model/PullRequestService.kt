package com.sakshi.closedprshow.model

import io.reactivex.Single
import javax.inject.Inject
import com.sakshi.closedprshow.di.DaggerApiComponent


class PullRequestService {

    @Inject
    lateinit var api:PullRequestApi

    init {
        DaggerApiComponent.create().inject(this)

    }

    fun getPullRequest(): Single<List<PullRequest>> {
        return api.getPullRequest()
    }
}