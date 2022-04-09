package com.acelerazg.linketinder

import com.acelerazg.linketinder.classes.Cadastro
import com.acelerazg.linketinder.classes.Candidato
import com.acelerazg.linketinder.classes.Empresa
import com.acelerazg.linketinder.classes.EnumSkills
import com.acelerazg.linketinder.classes.Pessoa

List<Empresa> empresas = []
List<Candidato> candidatos = []

BufferedReader scan = new BufferedReader(new InputStreamReader(System.in))

for(empresa in Cadastro.Empresas()){
    empresas << empresa
}

for (candidato in Cadastro.Candidatos()){
    candidatos << candidato
}
    int menuOP = 0
    while (menuOP != 2){

        println("1 - Acessar Empresas/Candidatos.\n2 - Sair.")
        menuOP = Integer.parseInt(scan.readLine())
        switch (menuOP){
            case 1:
                println("1 - Empresas\n2 - Candidatos")
                option = Integer.parseInt(scan.readLine())
                if (option == 1){
                    for (y in empresas){
                        println(y)
                    }
                }else if(option == 2){
                    for (x in candidatos){
                        println(x)
                    }
                }
                break
            case 2:
                break
}
}





