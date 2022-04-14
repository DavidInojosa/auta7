package school.cesar.aula7.repositories

import school.cesar.aula7.entities.Student

class StudentRepository {

    private val students = mutableListOf<Student>()

    fun add(student: Student){
        students.add(student)
    }
}

