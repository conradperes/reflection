package br.com.sparta.reflection.example.field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;

import br.com.sparta.reflection.utils.PrintUtils;

public class MainManupulaField extends PrintUtils{

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Veiculo veiculo= new Veiculo();
		veiculo.setMarca("fiat");
		veiculo.setPeso(550.0);
		veiculo.setPotencia(1.2);
		veiculo.setQuantidadeMaximaPassageiros(5);
		veiculo.setValor(new BigDecimal("20450.0"));
		Class clazz=veiculo.getClass();
		Field[] fields=clazz.getFields();
		print("Quantidade de fields "+fields.length);
		fields=clazz.getDeclaredFields();
		print("Quantidade de fields "+fields.length);
		showValuesInFields(fields,veiculo);
		print("Valor apos o set via reflexao");
		print("Marca Nova:"+veiculo.getMarca());
	}

	private static void showValuesInFields(Field[] fields, Object obj) throws IllegalArgumentException, IllegalAccessException {
		for (Field field : fields) {
			if(Modifier.isPrivate(field.getModifiers())){
				field.setAccessible(true);
				print("Modificador="+field.getModifiers());
			}
		   print(field.getName()+" Valor:"+field.get(obj));
		   if(field.getName().equals("marca")){
			   field.set(obj, "GM");
		   }
		}
	}

}
