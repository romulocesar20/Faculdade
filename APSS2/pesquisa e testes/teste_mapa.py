import googlemaps
from datetime import datetime

gmaps = googlemaps.Client(key='AIzaSyAw6CsSIj8bc54D9CwM2mgXuNYQDXvtHqo')

# Endereço Latitude e Longitude
endereço= input('Qual o seu endereço: ')
geocode_result = gmaps.geocode (endereço)

#Latitude e Longitude 
print (geocode_result[0]['geometry']['location']['lat'])
print (geocode_result[0]['geometry']['location']['lng'])

#Pontos de Coleta
coleta_1 = ('R. Mata Atlântica, 447 - Bosque de Barão Geraldo, Campinas - SP, 13082-755')
coleta_2 = ('R. da Abolição, 1900 - Pte. Preta, Campinas - SP, 13041-445')
coleta_3 = ('Av. Mal. Rondon, 2296-2382 - Jardim Chapadão, Campinas - SP, 13063-490')
coleta_4 = ('R. Saldanha da Gama, 77 - Vila Costa e Silva, Campinas - SP, 13081-000')
coleta_5 = ('Av. Santa Isabel, 2300 - Barão Geraldo, Campinas - SP, 13084-012') 

#Calculo da distancia
consulta1= gmaps.distance_matrix(endereço,coleta_1)
consulta2= gmaps.distance_matrix(endereço,coleta_2)
consulta3= gmaps.distance_matrix(endereço,coleta_3)
consulta4= gmaps.distance_matrix(endereço,coleta_4)
consulta5= gmaps.distance_matrix(endereço,coleta_5)


#Resultado Distancia
if consulta1['rows'][0]['elements'][0]['distance']['text'] < consulta2['rows'][0]['elements'][0]['distance']['text'] and consulta1['rows'][0]['elements'][0]['distance']['text'] < consulta3['rows'][0]['elements'][0]['distance']['text'] and consulta1['rows'][0]['elements'][0]['distance']['text'] < consulta4['rows'][0]['elements'][0]['distance']['text'] and consulta1['rows'][0]['elements'][0]['distance']['text'] < consulta5['rows'][0]['elements'][0]['distance']['text']:
    print ("Do seu endereço até o ponto de coleta na R. Mata Atlântica, 447 - Bosque de Barão Geraldo, Campinas - SP, 13082-755 a distância é de ", consulta1['rows'][0]['elements'][0]['distance']['text'])

if consulta2['rows'][0]['elements'][0]['distance']['text'] < consulta1['rows'][0]['elements'][0]['distance']['text'] and consulta2['rows'][0]['elements'][0]['distance']['text'] < consulta3['rows'][0]['elements'][0]['distance']['text'] and consulta2['rows'][0]['elements'][0]['distance']['text'] < consulta4['rows'][0]['elements'][0]['distance']['text'] and consulta2['rows'][0]['elements'][0]['distance']['text'] < consulta5['rows'][0]['elements'][0]['distance']['text']:
    print ("Do seu endereço até o ponto de coleta na a R. da Abolição, 1900 - Pte. Preta, Campinas - SP, 13041-445 distância é de ", consulta2['rows'][0]['elements'][0]['distance']['text'])

if consulta3['rows'][0]['elements'][0]['distance']['text'] < consulta1['rows'][0]['elements'][0]['distance']['text'] and consulta3['rows'][0]['elements'][0]['distance']['text'] < consulta2['rows'][0]['elements'][0]['distance']['text'] and consulta3['rows'][0]['elements'][0]['distance']['text'] < consulta4['rows'][0]['elements'][0]['distance']['text'] and consulta3['rows'][0]['elements'][0]['distance']['text'] < consulta5['rows'][0]['elements'][0]['distance']['text']:    
    print ("Do seu endereço até o ponto de coleta na Av. Mal. Rondon, 2296-2382 - Jardim Chapadão, Campinas - SP, 13063-490 a distância é de ", consulta3['rows'][0]['elements'][0]['distance']['text'])

if consulta4['rows'][0]['elements'][0]['distance']['text'] < consulta1['rows'][0]['elements'][0]['distance']['text'] and consulta4['rows'][0]['elements'][0]['distance']['text'] < consulta2['rows'][0]['elements'][0]['distance']['text'] and consulta4['rows'][0]['elements'][0]['distance']['text'] < consulta3['rows'][0]['elements'][0]['distance']['text'] and consulta4['rows'][0]['elements'][0]['distance']['text'] < consulta5['rows'][0]['elements'][0]['distance']['text']:
    print ("Do seu endereço até o ponto de coleta na R. Saldanha da Gama, 77 - Vila Costa e Silva, Campinas - SP, 13081-000 a distância é de ", consulta4['rows'][0]['elements'][0]['distance']['text'])

if consulta5['rows'][0]['elements'][0]['distance']['text'] < consulta1['rows'][0]['elements'][0]['distance']['text'] and consulta5['rows'][0]['elements'][0]['distance']['text'] < consulta2['rows'][0]['elements'][0]['distance']['text'] and consulta5['rows'][0]['elements'][0]['distance']['text'] < consulta3['rows'][0]['elements'][0]['distance']['text'] and consulta5['rows'][0]['elements'][0]['distance']['text'] < consulta4['rows'][0]['elements'][0]['distance']['text']:
    print ("Do seu endereço até o ponto de coleta na Av. Santa Isabel, 2300 - Barão Geraldo, Campinas - SP, 13084-012 a distância é de ", consulta5['rows'][0]['elements'][0]['distance']['text'])
