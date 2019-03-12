package cz.kotox.securityshowcase.loginx.di

import androidx.lifecycle.ViewModel
import cz.kotox.securityshowcase.core.di.ViewModelKey
import cz.kotox.securityshowcase.loginx.ui.MainActivity
import cz.kotox.securityshowcase.loginx.ui.MainFragment
import cz.kotox.securityshowcase.loginx.ui.MainViewModel
import cz.kotox.securityshowcase.loginx.ui.SplashActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class AppLoginDaggerModule {

	@ContributesAndroidInjector()
	abstract fun contributeMainActivity(): MainActivity

	@ContributesAndroidInjector
	abstract fun contributeMainFragment(): MainFragment

	@Binds
	@IntoMap
	@ViewModelKey(MainViewModel::class)
	abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

	@ContributesAndroidInjector()
	abstract fun contributeSplashActivity(): SplashActivity

}