package com.example.veterinaria_backend
import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity // Importante

@RestController
@RequestMapping("/api/animales")
class AnimalController(private val repository: AnimalRepository) {

    @GetMapping
    fun obtenerTodos(): List<Animal> = repository.findAll()

    @DeleteMapping("/{id}")
    fun eliminar(@PathVariable id: Long): ResponseEntity<Void> {
        return if (repository.existsById(id)) {
            repository.deleteById(id)
            ResponseEntity.noContent().build() // Retorna 204 No Content (Éxito)
        } else {
            ResponseEntity.notFound().build()
        }
}
    @PostMapping
    fun guardar(@RequestBody animal: Animal): Animal = repository.save(animal)

    @PutMapping("/{id}")
    fun actualizar(@PathVariable id: Long, @RequestBody animalActualizado: Animal): ResponseEntity<Animal> {
        return if (repository.existsById(id)) {
            val animalGuardado = repository.save(animalActualizado.copy(id = id))
            ResponseEntity.ok(animalGuardado)
        } else {
            ResponseEntity.notFound().build()
        }
    }
}