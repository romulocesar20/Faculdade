import googlemaps
from datetime import datetime

gmaps = googlemaps.Client(key='AIzaSyAw6CsSIj8bc54D9CwM2mgXuNYQDXvtHqo')


selecao = int(input('\n Digite a opção desejada:'))
while selecao < 0 or selecao >5:
    
    selecao = int(input('\nOpção inválida!\nDigite novamente uma opção válida:'))

while selecao != 0:


    if selecao == 2:

        print(' Bem vindo ao menu de Pontos de Coleta\n ')
        print('\nMenu de materiais: \n 1- Papel/Papelão \n 2- Vidro \n 3- Plástico \n 4- Metal \n 5- Madeira \n 6- Orgânico \n 7- Lixo Hospitalar \n 8- Lixo Eletrônico \n 9- Lixo Industrial \n 0- Retornar ao Menu Anterior')
        selecao1 = int(input('Identifique o material reciclado para saber pontos de coleta que o recebem.\nDigite a opção desejada:'))

        while selecao1 < 0 or selecao1 > 9:
            selecao1 = int(input('\n Opção inválida!\n Digite uma opção válida:'))

        while selecao1 != 0:
           
            if selecao1 == 1:
                print('Você selecionou Papel/Papelão\nExistem 3 pontos de coleta em Campinas para esse material.')

    # Endereço Latitude e Longitude
               
                endereço= input('Informe seu endereço:')
                geocode_result = gmaps.geocode (endereço)

    #Latitude e Longitude 
                
                print ('Sua latitude:',geocode_result[0]['geometry']['location']['lat'])
                print ('Sua longitude:',geocode_result[0]['geometry']['location']['lng'])

    #Pontos de Coleta
                
                coleta_1 = ('R. Mata Atlântica, 447 - Bosque de Barão Geraldo, Campinas - SP, 13082-755')
                coleta_2 = ('R. da Abolição, 1900 - Pte. Preta, Campinas - SP, 13041-445')
                coleta_3 = ('Av. Mal. Rondon, 2296-2382 - Jardim Chapadão, Campinas - SP, 13063-490')
    #Calculo da distancia
                
                consulta1= gmaps.distance_matrix(endereço,coleta_1)
                consulta2= gmaps.distance_matrix(endereço,coleta_2)
                consulta3= gmaps.distance_matrix(endereço,coleta_3)

    #Condicional de distancia

                print ("Do seu endereço até o ponto de coleta na R. Mata Atlântica, 447 - Bosque de Barão Geraldo, Campinas - SP, 13082-755 a distância é de:")
                print (consulta1['rows'][0]['elements'][0]['distance']['text'])

                print ("Do seu endereço até o ponto de coleta na a R. da Abolição, 1900 - Pte. Preta, Campinas - SP, 13041-445 distância é de:")
                print(consulta2['rows'][0]['elements'][0]['distance']['text'])
        
                print ("Do seu endereço até o ponto de coleta na Av. Mal. Rondon, 2296-2382 - Jardim Chapadão, Campinas - SP, 13063-490 a distância é de:")
                print (consulta3['rows'][0]['elements'][0]['distance']['text'])
