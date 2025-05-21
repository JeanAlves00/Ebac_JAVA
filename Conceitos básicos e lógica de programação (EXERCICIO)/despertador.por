programa
{
    funcao inicio()
    {
        inteiro hora, minuto
        cadeia resposta
       
        
        hora = lerHora()
        minuto = lerMinuto()
        
        escreva("Você selecionou o horário: ", hora, ":", minuto, "\n")
        
        escreva("Deseja tirar uma soneca de 10 minutos? (s/n): ")
        leia(resposta)
        
        se ((resposta == "s") ou (resposta == "S"))
        {
            minuto = minuto + 10
            se (minuto > 59)
            {
                minuto = minuto - 60
                hora = hora + 1
                se (hora > 23)
                {
                    hora = 0
                }
            }
            escreva("Despertador ajustado para: ", hora, ":", minuto, "\n")
        }
        senao
        {
            escreva("Despertador configurado para: ", hora, ":", minuto, "\n")
        }
        
        inteiro h_atual = 0
        inteiro m_atual = 0
        
        escreva("\nAguardando o despertador...\n")
        
        enquanto (h_atual != hora ou m_atual != minuto)
        {
            m_atual = m_atual + 1
            
            se (m_atual > 59)
            {
                m_atual = 0
                h_atual = h_atual + 1
                se (h_atual > 23)
                {
                    h_atual = 0
                }
            }
            
            escreva("Hora atual: ", h_atual, ":")
            se (m_atual < 10)
                escreva("0", m_atual, "\n")
            senao
                escreva(m_atual, "\n")
        }
        
        escreva("\nAcordar! São ", hora, ":")
        se (minuto < 10)
            escreva("0", minuto, "\n")
        senao
            escreva(minuto, "\n")
    }
    
    funcao inteiro lerHora()
    {
        inteiro h
        faca
        {
            escreva("Digite a hora (0 a 23): ")
            leia(h)
            se (h < 0 ou h > 23)
                escreva("Hora inválida! Tente novamente.\n")
        } enquanto (h < 0 ou h > 23)
        retorne h
    }
    
    funcao inteiro lerMinuto()
    {
        inteiro m
        faca
        {
            escreva("Digite os minutos (0 a 59): ")
            leia(m)
            se (m < 0 ou m > 59)
                escreva("Minuto inválido! Tente novamente.\n")
        } enquanto (m < 0 ou m > 59)
        retorne m
    }
}
