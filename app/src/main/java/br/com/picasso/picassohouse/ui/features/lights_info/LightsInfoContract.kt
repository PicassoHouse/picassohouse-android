package br.com.picasso.picassohouse.ui.features.lights_info

import br.com.picasso.picassohouse.models.LightHistory
import br.com.picasso.picassohouse.ui.base.BasePresenter
import br.com.picasso.picassohouse.ui.base.BaseView

interface LightsInfoContract {

    interface View : BaseView {
        fun showAccessHistory(history: List<LightHistory>)
    }

    interface Presenter : BasePresenter<View>

}