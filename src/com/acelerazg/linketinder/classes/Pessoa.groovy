package com.acelerazg.linketinder.classes

class Pessoa implements ISkills{
    String nome, email, estado, descricao, pais, cep
    List skills = []

    void adicionarSkill(EnumSkills skill){
        this.skills << skill
        this.skills = this.skills.unique()
    }
    void removerSkill(EnumSkills skill){
        this.skills.remove(skill)
    }

}
