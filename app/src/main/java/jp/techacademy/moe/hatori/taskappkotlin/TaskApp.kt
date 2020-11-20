package jp.techacademy.moe.hatori.taskappkotlin

import android.app.Application
import io.realm.Realm

class TaskApp: Application() {
    //ApplicationクラスはActivityのOnCreateよりも先に実行される
    //アプリ起動時に行いたい初期設定や、アプリ内で共有させたいデータの設定などをさせる
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
    //Realmの初期化
    //小クラスでonCreateの中身を定義し直している（override）
}