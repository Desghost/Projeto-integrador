package testes;

import entidades.Categoria;
import persistencia.CategoriaDao;

public class TesteCategoria {
    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setNome("Filme");
        categoria.setTipo('F');
        
        //Testes
        //CategoriaDAO.inserir(categoria);
        
        //categoria.setId(1);
        //System.out.println(CategoriaDAO.alterar(categoria));
        
        //System.out.println(CategoriaDAO.excluir(1));
    }
}
