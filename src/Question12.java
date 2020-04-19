


    interface Exportable{

        void export();// void upper case or lower case


    }
    class Tool implements Exportable {
        public void export() {
            System.out.println("tool:export");
        }
    }
    class ReportTool extends Tool implements Exportable {
        public void export() {
            System.out.println("Rtool::export");
        }

        public static void main(String[] args) {
            Tool atool=new ReportTool();
            Tool btool=new Tool();
            callExport(atool);
            callExport(btool);



        }
        public static void callExport(Exportable ex){
            ex.export();
        }

    }




