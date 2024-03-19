package com.example.composeapp

data class Plist(
    val name: String,
    val img : Int,
    val desc : String
)
fun getList():List<Plist> {
    val pLists = arrayListOf<Plist>()
        for(i in 0..9){
            pLists.add(Plist(names[i], img[i], desc[i]))
        }
        return pLists
}

val names = listOf(
    "project1",
    "project2",
    "project3",
    "project4",
    "project5",
    "project6",
    "project7",
    "project8",
    "project9",
    "project10"
)
val img = listOf(
    R.drawable.image,
    R.drawable.image,
    R.drawable.image,
    R.drawable.image,
    R.drawable.image,
    R.drawable.image,
    R.drawable.image,
    R.drawable.image,
    R.drawable.image,
    R.drawable.image,
)
val desc = listOf(
    "A great project indeed",
    "A great project indeed",
    "A great project indeed",
    "A great project indeed",
    "A great project indeed",
    "A great project indeed",
    "A great project indeed",
    "A great project indeed",
    "A great project indeed",
    "A great project indeed"
)