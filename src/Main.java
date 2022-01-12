import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Model model1 = new Model();
        String run = "C:\\Users\\User\\Desktop\\HomeWork\\All.txt";
        File files = new File(run);
        Scanner scanner = new Scanner(files);
        String line = scanner.nextLine();
        String[] split = line.split(";");
        String[] tox1 = split[0].split(",");
        for (int i = 0; i < tox1.length; i++) {
            model1.setName(tox1[0]);
            model1.setSurname(tox1[1]);
            model1.setYear(Integer.parseInt(tox1[2]));
            model1.setMore(Double.parseDouble(tox1[3]));



        }
        File myFile = new File("Name1.txt");
        BufferedWriter writer1 = new BufferedWriter(new FileWriter(myFile));
        writer1.write(model1.getName());
        writer1.write(model1.getSurname());
        writer1.write(Integer.toString(model1.getYear()));
        writer1.write(Double.toString(model1.getMore()));
        writer1.close();


        String[] tox2 = split[1].split(",");
        for (int i = 0; i < tox2.length; i++) {
            model1.setName(tox2[0]);
            model1.setSurname(tox2[1]);
            model1.setYear(Integer.parseInt(tox2[2]));
            model1.setMore(Double.parseDouble(tox2[3]));

        }
        File myfile1 = new File("C:\\Users\\User\\Desktop\\HomeWork\\Zapis1.txt");
        try (OutputStream out = new FileOutputStream(myfile1)) {
            String up = Integer.toString(model1.getYear());
            String down = Double.toString(model1.getMore());
            byte[] src = model1.getName().getBytes();
            byte[] src1 = model1.getSurname().getBytes();
            byte[] src2 = up.getBytes();
            byte[] src3 = down.getBytes();
            out.write(src);
            out.write(src1);
            out.write(src2);
            out.write(src3);

        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] tox3 = split[2].split(",");
        for (int i = 0; i < tox3.length; i++) {
            model1.setName(tox3[0]);
            model1.setSurname(tox3[1]);
            model1.setYear(Integer.parseInt(tox3[2]));
            model1.setMore(Double.parseDouble(tox3[3]));

        }
        System.out.println();
        System.out.println(model1.getName());
        System.out.println(model1.getSurname());
        System.out.println(model1.getYear());
        System.out.println(model1.getMore());

        String[] tox4 = split[3].split(",");
        for (int i = 0; i < tox4.length; i++) {
            model1.setName(tox4[0]);
            model1.setSurname(tox4[1]);
            model1.setYear(Integer.parseInt(tox4[2]));
            model1.setMore(Double.parseDouble(tox4[3]));


        }
        System.out.println();
        System.out.println(model1.getName());
        System.out.println(model1.getSurname());
        System.out.println(model1.getYear());
        System.out.println(model1.getMore());


        String[] tox5 = split[4].split(",");
        for (int i = 0; i < tox5.length; i++) {
            model1.setName(tox5[0]);
            model1.setSurname(tox5[1]);
            model1.setYear(Integer.parseInt(tox5[2]));
            model1.setMore(Double.parseDouble(tox5[3]));

        }
        System.out.println();
        System.out.println(model1.getName());
        System.out.println(model1.getSurname());
        System.out.println(model1.getYear());
        System.out.println(model1.getMore());

        String[] tox6 = split[5].split(",");
        for (int i = 0; i < tox6.length; i++) {
            model1.setName(tox6[0]);
            model1.setSurname(tox6[1]);
            model1.setYear(Integer.parseInt(tox6[2]));
            model1.setMore(Double.parseDouble(tox6[3]));

        }
        System.out.println();
        System.out.println(model1.getName());
        System.out.println(model1.getSurname());
        System.out.println(model1.getYear());
        System.out.println(model1.getMore());


    }


}