package com.kotlin.project.dogAndCat.data.repository

import com.kotlin.project.dogAndCat.data.mock.TestData.kittens
import com.kotlin.project.dogAndCat.data.mock.TestData.puppies
import com.kotlin.project.dogAndCat.data.model.Kitten
import com.kotlin.project.dogAndCat.data.model.Puppy

interface InterestsRepository {
    fun getPuppies(): List<Puppy>
    fun getKittens(): List<Kitten>
    fun getPuppy(id: Int): Puppy
    fun getKitten(id: Int): Kitten
}

class FakePuppiesAndKittensRepository : InterestsRepository {
    override fun getPuppies() = puppies
    override fun getKittens() = kittens
    override fun getPuppy(id: Int) = puppies.first { it.id == id }
    override fun getKitten(id: Int) = kittens.first { it.id == id }
}