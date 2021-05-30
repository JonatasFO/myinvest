import axios from "axios";
import { API_URL } from "../utils/request";
class CategoriaService {
  retrieveAllCategorias() {
    return axios.get(`${API_URL}/categorias`);
  }
}

export default new CategoriaService();
