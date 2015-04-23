package Loja;

import java.util.List;

import Carro.Carro;
import Motocicleta.Motocicleta;

public class Loja {
		private String Enderešo;
		private String Nome;
		private List<Carro> listaDeCarros;
		private List<Motocicleta> listaDeMotocicletas;

		
		
		public String getEnderešo() {
			return Enderešo;
		}

		public void setEnderešo(String enderešo) {
			Enderešo = enderešo;
		}

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public List<Carro> getListaDeCarros() {
			return listaDeCarros;
		}

		public void setListaDeCarros(List<Carro> listaDeCarros) {
			this.listaDeCarros = listaDeCarros;
		}

		public List<Motocicleta> getListaDeMotocicletas() {
			return listaDeMotocicletas;
		}

		public void setListaDeMotocicletas(List<Motocicleta> listaDeMotocicletas) {
			this.listaDeMotocicletas = listaDeMotocicletas;
		}
		
		
		

}
