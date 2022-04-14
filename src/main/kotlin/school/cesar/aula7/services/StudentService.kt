package school.cesar.aula7.services

import school.cesar.aula7.entities.Student
import school.cesar.aula7.repositories.StudentRepository
import school.cesar.aula7.validators.StudentValidator

class StudentService(
    private val studentValidator: StudentValidator,
    private val studentRepository: StudentRepository
) {

    fun addAll(students: List<Student>){
        students.forEach {
            studentValidator.validade(it)
            studentRepository.add(it)
        }
    }
}
