package com.example.lab4.fragmets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab4.R
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatDelegate
import android.widget.RadioButton
import androidx.core.os.LocaleListCompat
import androidx.appcompat.widget.SwitchCompat
class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val switchDark = view.findViewById<SwitchCompat>(R.id.themeSwitch)
        val radioGroupLang = view.findViewById<RadioGroup>(R.id.langRadio)

        switchDark.isChecked = AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES

        switchDark.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        val currentLang = AppCompatDelegate.getApplicationLocales().toLanguageTags()
        if (currentLang.contains("en")) {
            view.findViewById<RadioButton>(R.id.radioButtonEn).isChecked = true
        } else {
            view.findViewById<RadioButton>(R.id.radioButtonRu).isChecked = true
        }

        radioGroupLang.setOnCheckedChangeListener { _, checkedId ->
            val localeTag = when (checkedId) {
                R.id.radioButtonEn -> "en"
                else -> "ru"
            }
            val appLocale: LocaleListCompat = LocaleListCompat.forLanguageTags(localeTag)
            AppCompatDelegate.setApplicationLocales(appLocale)
        }
    }
    }
