package seedu.address.model.consultation.exceptions;

import seedu.address.model.consultation.Consultation;

/**
 * Signals that operation will result in duplicate consultations.
 *
 * @see Consultation#isSameConsultation(Consultation)
 */
public class DuplicateConsultationException extends RuntimeException {
    public DuplicateConsultationException() {
        super("Operation would result in duplicate consultations.");
    }
}
