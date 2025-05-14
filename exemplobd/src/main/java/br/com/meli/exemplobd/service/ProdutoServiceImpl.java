package br.com.meli.exemplobd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.exemplobd.dto.ProdutoReq;
import br.com.meli.exemplobd.exceptions.NotFoundException;
import br.com.meli.exemplobd.model.Departamento;
import br.com.meli.exemplobd.model.Produto;
import br.com.meli.exemplobd.repo.IProdutoRepo;

@Service
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired
	private IProdutoRepo repo;
	
	@Override
	public Produto addNew(ProdutoReq req) {
		// TODO Auto-generated method stub
		Produto p = new Produto();
		p.setNome(req.nome());
		p.setPreco(req.preco());
		p.setLinkFoto(req.link());		
		
		Departamento d= new Departamento();
		d.setId(req.idDepto());
		p.setDepartamento(d);
		return repo.save(p);
	}

	@Override
	public Produto update(Produto p) {
		// TODO Auto-generated method stub
		if (repo.existsById(p.getId()))
				return repo.save(p);
		throw new NotFoundException("Produto nao existe");
		
	}

	@Override
	public List<Produto> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll(); //.stream().map(p -> new ProdutoDTO(p.getId(), p.getNome(), p.getPreco(), p.getLinkFoto(), p.getDepartamento().getId(), p.getDepartamento().getNome())).toList();
				
	}

	@Override
	public Produto readById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(()-> new NotFoundException("Produto nao encontrado"));
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		Produto p = repo.findById(id).orElseThrow(() -> new NotFoundException("Produto nao encontrado"));
		repo.deleteById(id);
	}

}
