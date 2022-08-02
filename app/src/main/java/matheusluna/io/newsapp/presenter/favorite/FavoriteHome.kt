package matheusluna.io.newsapp.presenter.favorite

import matheusluna.io.newsapp.model.Article

interface FavoriteHome {

    interface Presenter {
        fun onSuccess(article: List<Article>)
    }
}