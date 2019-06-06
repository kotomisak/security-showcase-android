package cz.kotox.securityshowcase.module_core.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AndroidDaggerModuleLegacy {
	@Provides
	@Singleton
	@JvmStatic
	fun provideAppContext(application: Application): Context = application.applicationContext

	@Provides
	@Singleton
	@JvmStatic
	fun provideSharedPreferences(context: Context): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
}