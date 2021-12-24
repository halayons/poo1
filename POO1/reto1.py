def valor_deuda(contrato:str, valor1:float, valor2:float, valor3:float,
 valor4:float, valor5:float,valor6:float, tasa_cambio:float):
 valor_pesos=((valor1+valor2+valor3+valor4+valor5+valor6)*5/100)+(valor1+valor2+valor3+valor4+valor5+valor6)
 valor_dolares=round(valor_pesos/tasa_cambio)
 d="""El contrato {} adeuda un valor de: ${} COP y un valor ${} USD""".format(contrato,valor_pesos,valor_dolares)

 return d

 valor_deuda("B102548L", 125000, 125000, 125000, 125000, 125000, 125000, 3600.52 )