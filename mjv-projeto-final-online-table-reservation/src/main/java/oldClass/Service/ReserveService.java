package oldClass.Service;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.talita.mjvprojetofinalonlinetablereservation.model.reserve.Reserve;
import com.mjv.talita.mjvprojetofinalonlinetablereservation.model.reserve.ReserveStatus;
import com.mjv.talita.mjvprojetofinalonlinetablereservation.repository.ReserveRepository;

//DEVE CONSTAR AS REGRAS DO NEGÓCIO

@Service                        
public class ReserveService {
	@Autowired
	private ReserveRepository repository;
	
	public void save(Reserve reserve) {
		
		reserve.setStatus(ReserveStatus.EM_ANÁLISE);
		//reserve.setData(LocalDate.now());
	}
	
}

	//LocalTime antecedencia = LocalTime.now();
	
	/*
	 * public void gravar(Pedido pedido) {
		pedido.setStatus(PedidoStatus.NOVO);
		Double valorTotal = 0.0;
		for(PedidoItem item: pedido.getItens()) {
			valorTotal = valorTotal + item.getSubtotal();
		}
		pedido.setValorTotal(valorTotal);
		repository.save(pedido);
	}
	 */
	
	

