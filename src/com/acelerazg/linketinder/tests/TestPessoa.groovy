package com.acelerazg.linketinder.tests

import com.acelerazg.linketinder.classes.Candidato
import com.acelerazg.linketinder.classes.EnumSkills
import groovy.test.GroovyTestCase

class TestPessoa extends GroovyTestCase{
    void testCadastro(){
        List<Candidato> lista = new ArrayList<Candidato>()
        Candidato can1 = new Candidato()
        can1.setNome("Andre")

        lista.add(can1)
        def resultadoEsperado = "Andre"

        GroovyTestCase.assertEquals(resultadoEsperado, can1.getNome())

        println("Teste de cadastro realizado")
    }
    void testNaoAdicionaSkillRepetida(){
        Candidato candidato = new Candidato()
        candidato.adicionarSkill(EnumSkills.JavaScript)
        candidato.adicionarSkill(EnumSkills.Groovy)
        candidato.adicionarSkill(EnumSkills.Bootstrap)
        candidato.adicionarSkill(EnumSkills.Bootstrap)

        int resultadoEsperado = 3

        GroovyTestCase.assertEquals(resultadoEsperado, candidato.getSkills().size())
        println("Teste de Nao adicionar Skill Repetida realizado")
    }
    void testRemoveSkills(){
        Candidato candidato = new Candidato()
        candidato.adicionarSkill(EnumSkills.JavaScript)
        candidato.adicionarSkill(EnumSkills.Groovy)

        candidato.removerSkill(EnumSkills.Groovy)

        boolean resultadoEsperado = true
        int tamanhoEsperado = 1

        assertTrue(resultadoEsperado.equals(candidato.getSkills().contains(EnumSkills.JavaScript)) && tamanhoEsperado == candidato.getSkills().size())
        println("Teste de remocao de skill realizado")
    }
}
