package com.listaaunos.help.listaraluno;

public class ScriptSQL {

    public static String getCreateAluno(){
        StringBuilder sqlBuilder = new StringBuilder();

        sqlBuilder.append(" create TABLE IF NOT EXISTS ALUNO( ");
        sqlBuilder.append(" ID        INTEGER        NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT, ");
        sqlBuilder.append("MATRICULA                VARCHAR(10), ");
        sqlBuilder.append("NOME                     VARCHAR(40), ");
        sqlBuilder.append("TELEFONE                 VARCHAR(15), ");
        sqlBuilder.append("EMAIL                    VARCHAR(30) ");
        sqlBuilder.append(");");

            return  sqlBuilder.toString();
    }
}
