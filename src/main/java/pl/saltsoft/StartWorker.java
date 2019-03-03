package pl.saltsoft;

public class StartWorker {
        public void startManyWorkers(int howMany) {
            for (int i = 0; i < howMany; i++) {
                Thread object = new Thread(new WorkerWatkowy());
                object.start();
            }
        }
    }

