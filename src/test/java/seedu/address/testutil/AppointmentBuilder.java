package seedu.address.testutil;

import static seedu.address.testutil.TypicalPersons.ADAM;
import static seedu.address.testutil.TypicalPersons.ALICE_AS_PATIENT;

<<<<<<< HEAD:src/test/java/seedu/clinicio/testutil/AppointmentBuilder.java
import seedu.clinicio.model.appointment.Appointment;
import seedu.clinicio.model.appointment.Date;
import seedu.clinicio.model.appointment.Time;
import seedu.clinicio.model.patient.Patient;
import seedu.clinicio.model.staff.Staff;
||||||| merged common ancestors
import seedu.clinicio.model.appointment.Appointment;
import seedu.clinicio.model.appointment.Date;
import seedu.clinicio.model.appointment.Time;
import seedu.clinicio.model.doctor.Doctor;
import seedu.clinicio.model.patient.Patient;
=======
import seedu.address.model.appointment.Appointment;
import seedu.address.model.appointment.Date;
import seedu.address.model.appointment.Time;
import seedu.address.model.doctor.Doctor;
import seedu.address.model.patient.Patient;
>>>>>>> fd0466fa9c4e16f0bbc839aa76ae8488c7686bff:src/test/java/seedu/address/testutil/AppointmentBuilder.java

//@@author gingivitiss
/**
 * A utility class to help build Appointment objects.
 */
public class AppointmentBuilder {

    public static final Date DEFAULT_DATE = new Date(1, 1, 2018);
    public static final Time DEFAULT_TIME = new Time(16, 30);
    public static final Patient DEFAULT_PATIENT = ALICE_AS_PATIENT;
    public static final int DEFAULT_TYPE = 0;
    public static final int DEFAULT_STATUS = 1;
    public static final Staff DEFAULT_STAFF = ADAM;

    private Date date;
    private Time time;
    private Patient patient;
    private int type;
    private int status;
    private Staff staff;

    public AppointmentBuilder() {
        date = DEFAULT_DATE;
        time = DEFAULT_TIME;
        patient = DEFAULT_PATIENT;
        type = DEFAULT_TYPE;
        status = DEFAULT_STATUS;
        staff = DEFAULT_STAFF;
    }

    /**
     * Initializes the AppointmentBuilder with the data of {@code appointmentToCopy}.
     */
    public AppointmentBuilder(Appointment appointmentToCopy) {
        date = appointmentToCopy.getAppointmentDate();
        time = appointmentToCopy.getAppointmentTime();
        patient = appointmentToCopy.getPatient();
        type = appointmentToCopy.getAppointmentType();
        status = appointmentToCopy.getAppointmentStatus();
        staff = appointmentToCopy.getAssignedStaff();
    }

    /**
     * Sets the {@code Date} of the {@code Appointment} that we are building.
     */
    public AppointmentBuilder withDate(int day, int month, int year) {
        date = new Date(day, month, year);
        return this;
    }

    /**
     * Sets the {@code Time} of the {@code Appointment} that we are building.
     */
    public AppointmentBuilder withTime(int hours, int minutes) {
        time = new Time(hours, minutes);
        return this;
    }

    /**
     * Sets the {@code Patient} of the {@code Appointment} that we are building.
     */
    public AppointmentBuilder withPatient(Patient patient) {
        this.patient = patient;
        return this;
    }

    /**
     * Sets the {@code Doctor} of the {@code Appointment} that we are building.
     */
    public AppointmentBuilder withStaff(Staff staff) {
        this.staff = staff;
        return this;
    }

    public Appointment build() {
        return new Appointment(date, time, patient, type, staff);
    }
}
