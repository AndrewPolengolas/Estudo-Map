# Estudo Map

### Interface Map

A interface Map "mapeia" listas no formato chave valor, ou seja, através da chave consegue ser acessado o valor configurado, sendo que a chave não pode ser repetida ao contrário do valor, mas se caso tiver uma chave repetida é sobrescrito pela última chamada. Também faz parte do pacote java.util e diferente das interfaces List, Set e Queue a interface Mpa não possui métodos da interface Collection.

![Hierarquia da Interface Map](https://arquivo.devmedia.com.br/artigos/Thiago_Varallo/maps_java/hierarquia_interface.jpg)

A implementação da interface Map pode ser usada de diversas formas, utilizando-se de HashMap, LinkedHashMap e TreeMap.

HashMap: é mais rápida tendo sua busca em O(1) ou seja, ordem de um, ela aceita valores nulos e não garante a organização de suas entidades.

LinkedHashMap: é quase como um HashMap mas sua lista mantem a ordem de adição.

TreeMap: esta é um pouco mais lenta que as demais tendo sua busca em O(Log(n)) ou seja sua ordem de execução depende de uma determinada quantidade de passos para trazer suas entidade, mas em contra partida ela garante a organização de entidades desde que a classe usada como chave implemente "Comparable" para que a TreeMap tenha uma forma de organizar suas coleções, além de não aceitar chaves nulas como HashMap.



**Exemplo HashMap:**

Na imagem abaixo temos duas classes uma de produtos e outra de consumidores, onde o map recebe como chave um consumidor e como valor uma lista de compras desse mesmo consumidor:



![codigoHashMap](https://github.com/AndrewPolengolas/Estudo-Map/blob/main/img/codigoHashMap.png)



**OUTPUT**



![OUTPUTHashMap](https://github.com/AndrewPolengolas/Estudo-Map/blob/main/img/OUTPUTHashMap.png)



**Exemplo TreeMap:**

Na imagem a seguir temos uma implementação parecida com o HashMap, entretanto na classe consumidor foi implementado o Comparable onde ele compara o numero do CPF dos clientes veja abaixo: 

![ConsumidorTreeMap](https://github.com/AndrewPolengolas/Estudo-Map/blob/main/img/ConsumidorTreeMap.png)

**CÓDIGO**



![CODIGOTreeMap](https://github.com/AndrewPolengolas/Estudo-Map/blob/main/img/CODIGOTreeMap.png)



**OUTPUT**



![outputTreeMap](https://github.com/AndrewPolengolas/Estudo-Map/blob/main/img/outputTreeMap.png)



Como Podemos ver, no TreeMap a ordem de organização depende da comparação que ele fara no metodo "compareTo" dentro da classe Consumidor.
