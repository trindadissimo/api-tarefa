// TarefaServiceImpl.java
package demo.restservices;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class TarefaServiceImpl implements TarefaService {

    private static Map<Integer, Tarefa> tarefas = new HashMap<>();
    private int nextId = 1;

    // Populate collection with some sample Tarefas
    {
        insert(new Tarefa("Estudar Spring Boot", false));
        insert(new Tarefa("Fazer compras", true));
        insert(new Tarefa("Ir à academia", false));
    }

    @Override
    public Tarefa getTarefa(int id) {
        return tarefas.get(id);
    }

    @Override
    public Collection<Tarefa> getTarefas() {
        return tarefas.values();
    }

    @Override
    public void insert(Tarefa tarefa) {
        tarefa.setId(nextId++);
        tarefas.put(tarefa.getId(), tarefa);
    }

    @Override
    public void update(Tarefa tarefa) {
        int id = tarefa.getId();
        if (tarefas.containsKey(id)) {
            tarefas.put(id, tarefa);
        }
    }

    @Override
    public void delete(int id) {
        Tarefa tarefa = tarefas.get(id);
        if (tarefa != null) {
            tarefas.remove(id);
        }
    }
}
