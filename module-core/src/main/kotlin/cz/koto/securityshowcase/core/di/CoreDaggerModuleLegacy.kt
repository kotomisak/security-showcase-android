package cz.koto.securityshowcase.core.di

import cz.koto.securityshowcase.core.crypto.hash.HashDaggerModule
import cz.koto.securityshowcase.core.database.preferences.LocalPreferences
import cz.koto.securityshowcase.core.database.preferences.PreferencesCommon
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module(includes = [
	AndroidDaggerModuleLegacy::class,
	CoreInitDaggerModule::class,
	HashDaggerModule::class
	//rest
	//persistence
	//analytics
])
abstract class CoreDaggerModule {

	@Binds
	@IntoSet
	abstract fun bindPreferences(pref: PreferencesCommon): LocalPreferences
}

@Module
object CoreInitDaggerModule {
	@Provides
	@JvmStatic
	@IntoSet
	@AppInitAction
	fun provideAppInitActions(): () -> Unit = {
		//Initialize anything related to core module.
	}
}