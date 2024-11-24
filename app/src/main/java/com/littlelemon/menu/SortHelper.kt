package com.littlelemon.menu

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> TODO("create extension function for List<Product> with sorting based on price ascending")
            SortType.PriceDesc -> TODO("create extension function for List<Product> with sorting based on price descending")
        }
    }


    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> productsList.sortPriceAsc()
            SortType.PriceDesc -> productsList.sortPriceDesc()
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

    private fun List<ProductItem>.sortPriceAsc(): List<ProductItem> {
        return sortedBy { it.price }
    }

    private fun List<ProductItem>.sortPriceDesc(): List<ProductItem> {
        return sortedByDescending { it.price }
    }

}

