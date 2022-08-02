package matheusluna.io.newsapp.presenter.news

import matheusluna.io.newsapp.model.NewsResponse

interface NewsHome {

    interface Presenter{
        fun requestAll()
        fun onSuccess(newsResponse: NewsResponse)
        fun onError(message: String)
        fun onComplete()
    }
}