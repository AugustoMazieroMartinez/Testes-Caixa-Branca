# Grafo de Fluxo:

![alt text](https://github.com/AugustoMazieroMartinez/Testes-Caixa-Branca/blob/Etapa-3/imagem/Grafo%20De%20Fluxo.png)

# Complexidade e caminhos: 

## Complexidade:
De acordo com a equação M=E−N+2P o cáculo será 24−20+2=6.

## Caminhos:
### Caminho 1:
1-2-3-4-5-6-7-8-10-11-12-13-14-15-16(falso)-20.

### Caminho 2:
1-2-3-4-5-6-7-8-10-11-12-13-14-15-16(verdadeiro)-17-18-20.

### Caminho 3:
1-2-3-4-5-6-7-9(exceção)-10-11-12-13-14-19(exceção)-20.

### Caminho 4:
1-2-3-4-5-6-7-8-10-11-12-13-14-19(exceção)-20.

### Caminho 5:
1-2-3-4-5-6-7-8-10-11-12-13-19(exceção)-20.

### Caminho 6:
1-2-3-4-5-6-7-8-10-11-12-13-14-15-16(verdadeiro)-19(exceção)-20.