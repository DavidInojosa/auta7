package school.cesar.aula7.validators

import school.cesar.aula7.entities.Student

class StudentValidator {

    fun validade(student: Student){
        validadeRequiredFields(student)
    }

    fun validadeRequiredFields(student: Student){
        if(student.nome == ""){
            throw RuntimeException("Nome deve ser preenchido")
        }
    }
}
