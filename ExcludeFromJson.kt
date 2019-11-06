package sk.wds.soteria.network.moshi


import kotlin.annotation.AnnotationTarget.PROPERTY

@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Target(PROPERTY)
annotation class ExcludeFromJson
