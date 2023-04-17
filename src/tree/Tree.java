package tree;

import java.util.List;

public interface Tree<E> extends Iterable<E> {
    boolean addpeople(String str);

    void addintree(E h, E mh, E fh);

    E findHuman(String str);

    List<E> getPeople();
}
