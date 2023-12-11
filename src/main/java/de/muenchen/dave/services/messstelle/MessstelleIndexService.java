package de.muenchen.dave.services.messstelle;

import de.muenchen.dave.domain.elasticsearch.detektor.Messstelle;
import de.muenchen.dave.repositories.elasticsearch.MessstelleIndex;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Die Klasse {@link MessstelleIndexService} holt alle relevanten Messstellen aus MobidaM und
 * aktualisiert die in Dave gespeichereten Daten.
 */
@Slf4j
@Service
@AllArgsConstructor
public class MessstelleIndexService {

    private final MessstelleIndex messstelleIndex;

    public void saveMessstelle(final Messstelle toSave) {
        log.info("#saveMessstelle");
        messstelleIndex.save(toSave);
    }

    public Optional<Messstelle> findByNummer(final String messstellenNummer) {
        return messstelleIndex.findByNummer(messstellenNummer);
    }
}
