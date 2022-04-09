package com.acelerazg.linketinder.classes

import groovy.transform.ToString

@ToString



class Cadastro {
    static List<Pessoa> Empresas(){
        Empresa emp1 = new Empresa(nome: "Dell", email: "delltecnologia@dell.com", estado: "Rio Grande do Sul",
                descricao: "melhor empresa de tecnologia do brasil",pais: "Brasil", cep: "92990-000", cnpj: "72.381.189/0001-10",
                skills: [EnumSkills.Java,EnumSkills.Groovy])
        Empresa emp2 = new Empresa(nome: "Tres Corações", email: "cafetcoracoes@tres.com", estado: "Rio Grande do Sul",
                descricao: "venha programar e tomar café",pais: "Brasil", cep: "92480-000", cnpj: "17.467.515/0001-07",
                skills: [EnumSkills.Java,EnumSkills.Groovy])
        Empresa emp3 = new Empresa(nome: "Arroz Gostoso", email: "arrozgostoso@arroz.com", estado: "Goiás",
                descricao: "venha programar e ganhe um arroz gostoso",pais: "Brasil", cep: "76600-000", cnpj: "14.835.511/0001-07",
                skills: [EnumSkills.Java,EnumSkills.Groovy])
        Empresa emp4 = new Empresa(nome: "Sertanejo e afins", email: "violaosertanejo@sertanejo.com", estado: "Goiás",
                descricao: "Venha tocar sertanejo",pais: "Brasil", cep: "72800-570", cnpj: "13.487.545/0001-02",
                skills: [EnumSkills.Java,EnumSkills.Groovy])
        Empresa emp5 = new Empresa(nome: "Império do Boliche", email: "boliche@imperio.com", estado: "Rio Grande do Sul",
                descricao: "Venha se divertir com boliche e trabalhar, é claro",pais: "Brasil", cep: "74660-070", cnpj: "12.424.576/0001-07",
                skills: [EnumSkills.Java,EnumSkills.Groovy])

        return [emp1,emp2,emp3,emp4,emp5]
    }
    static List<Pessoa> Candidatos(){
            Candidato can1 = new Candidato(nome:"Andre", email: "andsores@gmail.com",estado: "São Paulo",
                    descricao: "Java Programmer", pais: "Brasil", cep: "01153-000", cpf: "123.654.978-09",
                    skills: [EnumSkills.Java, EnumSkills.Groovy, EnumSkills.Angular])
            Candidato can2 = new Candidato(nome:"Jose", email: "zehacker@hotmail.com",estado: "São Paulo",
                    descricao: "Java Programmer", pais: "Brasil", cep: "01153-000", cpf: "213.645.987-09",
                    skills: [EnumSkills.Java, EnumSkills.Groovy, EnumSkills.Angular])
            Candidato can3 = new Candidato(nome:"Maria", email: "m1920@protonmail.com",estado: "São Paulo",
                    descricao: "JS Programmer", pais: "Brasil", cep: "01153-000", cpf: "312.666.693-13",
                    skills: [EnumSkills.JavaScript, EnumSkills.Bootstrap])
            Candidato can4 = new Candidato(nome:"Joao", email: "joaozinho@yahoo.com",estado: "São Paulo",
                    descricao: "Groovy Programmer", pais: "Brasil", cep: "01153-000", cpf: "223.775.917-47",
                    skills: [EnumSkills.Groovy, EnumSkills.Java, EnumSkills.Ruby])
            Candidato can5 = new Candidato(nome:"Mario", email: "mariodoarmario@uol.com.br",estado: "São Paulo",
                    descricao: "Programador JavaScript", pais: "Brasil", cep: "01153-000", cpf: "223.775.917-47",
                    skills: [EnumSkills.JavaScript, EnumSkills.Bootstrap])

        return[can1,can2,can3,can4,can5]
    }
}
