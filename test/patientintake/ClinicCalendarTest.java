package patientintake;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClinicCalendarTest {
    @Test
    public  void allowEntryOfAnAppointment(){
        ClinicCalendar calendar = new ClinicCalendar();
        calendar.addAppointment("Hemza","Lekkat","avery","09/18/1987 2:00 pm");
        List<PatientAppointment> appointments = calendar.getAppointments();
        assertNotNull(appointments);
        assertEquals(appointments.size(),1);


    }



}