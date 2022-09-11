package com.sakshi.closedprshow.di

import com.sakshi.closedprshow.model.PullRequestService
import com.sakshi.closedprshow.viewmodel.PullRequestViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: PullRequestService)

    fun inject(viewModel: PullRequestViewModel)
}