package com.example.veterinaria_backend
import jakarta.persistence.*

@Entity
@Table(name = "animales")
data class Animal(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0, // Usa var
    var nombre: String = "",
    var tipo: String = "",
    var edad: Int = 0,
    var descripcion: String = "",
    var adoptado: Boolean = false,
    var fotoUri: String = "" 
)