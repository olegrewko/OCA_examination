//package JAVACalculated;
//
//import java.io.BufferedReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class RecordFile {
//    public static void main(String[] args) {
//        void recordInFile(String text, String fileName, boolean b){
//            try(FileWriter sw = new FileWriter(fileName,b)) {
//                sw.write(text+"\n");
//                if(!b)
//                    toast("Запись сохранена");
//            }catch(Exception e){
//                toast("Ошибка записи файла");
//            }
//        }
//        String readerFile(String s){
//            String str,f="";
//            try{
//                File file=new File(s);
//                FileReader fr=new FileReader(file);
//                BufferedReader br=new BufferedReader(fr);
//                while((str = br.readLine()) != null){
//                    f+=str+"\n";
//                }
//            }catch(IOException e){
//                toast("Ошибка чтения файла");
//            }
//            return f;
//        }
//
//    }
//}
