package matheusluna.io.newsapp.presenter.favorite

import matheusluna.io.newsapp.model.Article
import matheusluna.io.newsapp.model.data.NewsDataSource
import matheusluna.io.newsapp.presenter.ViewHome

class FavoritePresenter(
    val view: ViewHome.Favorite,
    private val dataSource: NewsDataSource
) : FavoriteHome.Presenter {

    fun saveArticle(article: Article) {
        this.dataSource.saveArticle(article)
    }

    fun deleteArticle(article: Article) {
        this.dataSource.deleteArticles(article)
    }

    override fun onSuccess(articles: List<Article>) {
        this.view.showArticles(articles)
    }

    fun getAll() {
        this.dataSource.getAllArticles(this)
    }
}