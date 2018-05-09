package com.discovr.discord.ui.main

import com.discovr.discord.model.Tag
import io.reactivex.Observable

interface MainContract {
    interface Activity {
        fun render(model: MainModel)
    }

    interface ActivityPresenter {
        fun getValue(tag: Tag): Boolean

        fun clear()

        fun dispose()
    }

    interface CardFragment {
        fun render(model: MainModel)
    }

    interface CardFragmentPresenter {
        fun clear()

        fun dispose()
    }
}