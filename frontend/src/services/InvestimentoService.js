import axios from "axios";
import { API_URL } from "../utils/request";

class InvestimentoService {
  retrieveAllInvestimentos() {
    return axios.get(`${API_URL}/investimentos`);
  }

  saveInvestimentos(investimento) {
    return axios.post(`${API_URL}/investimentos`, investimento);
  }

  deleteInvestimentos(codigo) {
    return axios.delete(`${API_URL}/investimentos/${codigo}`);
  }
}

export default new InvestimentoService();
