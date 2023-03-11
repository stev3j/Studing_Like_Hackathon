@file:OptIn(DelicateCoroutinesApi::class)

package com.example.merging_xml.presentation.feature.login

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.AsyncTask
import android.os.Build
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.browser.customtabs.CustomTabsIntent
import com.example.merging_xml.BuildConfig
import com.example.merging_xml.R
import com.example.merging_xml.data.utils.GithubConstant.GITHUB_AUTH_URL
import com.example.merging_xml.data.utils.GithubConstant.GITHUB_CLIENT_ID
import com.example.merging_xml.data.utils.GithubConstant.GITHUB_CLIENT_SECRET
import com.example.merging_xml.data.utils.GithubConstant.GITHUB_TOKEN_URL
import com.example.merging_xml.databinding.FragmentLoginBinding
import com.example.merging_xml.presentation.base.BaseFragment
import kotlinx.coroutines.*
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import org.json.JSONObject
import org.json.JSONTokener
import java.io.OutputStreamWriter
import java.net.URL
import java.util.concurrent.TimeUnit
import javax.net.ssl.HttpsURLConnection

class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>(R.layout.fragment_login) {

    override val viewModel: LoginViewModel =  LoginViewModel()// viewModels

    override fun start() {
    }
}