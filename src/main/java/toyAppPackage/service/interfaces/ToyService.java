package toy.service.interfaces;


import toy.data.Toy;

import java.util.List;

public interface ToyService {
    Toy getOneById(int id);
    List<Toy>getAllToys();
    void createToy(Toy toy);
}
