package assignment;

import assignment.dependencies.Ui_fromScanner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class TestMenu<Bufferedwriter> {


    OpenFile openFile = new OpenFile();

    @Mock
    Ui_fromScanner mockUiFromScanner;

    @InjectMocks
    Menu fixture;
    OpenFile fixtureOpenFile;

    @Before
    public void setup(){


    }

    @Test
    public void exitMenu(){

        when(mockUiFromScanner.inputIntFromUser()).thenReturn(12);
        fixture.menu();
        verify(mockUiFromScanner, times(1)).inputIntFromUser();
    }
/*
    @Test
    public void mainReport() {
        when(mockUiFromScanner.inputIntFromUser()).thenReturn(6).thenReturn(1);
        fixture.menu();

    }*/


    /*
    @Test
    public void openFile_correctFileName() throws IOException {

        File temp = File.createTempFile("temp",".csv");

        FileWriter fileoutput = new FileWriter(temp);
        Bufferedwriter buffout = (Bufferedwriter) new BufferedWriter(fileoutput);




        when(mockUiFromScanner.inputIntFromUser()).thenReturn(1);
        when(mockUiFromScanner.inputStringFromUser()).thenReturn("Se");
        fixture.menu();

        long expected = 999;
        long actual = openFile.getLines();

        Assert.assertEquals(expected, actual);
        temp.deleteOnExit();
        verify(mockUiFromScanner, times(1)).inputIntFromUser();
        verify(mockUiFromScanner, times(1)).inputStringFromUser();
    }

    @Test
    public void openFile_incorrectFileName(){

        when(mockUiFromScanner.inputIntFromUser()).thenReturn(1);
        when(mockUiFromScanner.inputStringFromUser()).thenReturn("NoFileWithThisName");
        fixture.menu();

        String expected = "File doesn't exist";
        String actual = openFile.openFile("adsf");

        Assert.assertEquals(expected, actual);

        verify(mockUiFromScanner, times(1)).inputIntFromUser();
        verify(mockUiFromScanner, times(1)).inputStringFromUser();
    }
*/

}
