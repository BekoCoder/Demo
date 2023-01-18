package service;

import model.History;

import java.util.ArrayList;
import java.util.List;

public class HistoryService {
    private History [] historyList=new History[1000];
    private List<History> debit=new ArrayList<>();
    private List<History> credit=new ArrayList<>();
        public boolean debitHistory(String  cardNumber){
            for (History history: historyList) {
                if(history!=null){
                    if (history.getReceiverCard().equals(cardNumber)){
                        debit.add(history);
                        return true;
                    }
                }
            }
            return false;
        }
    public boolean creditHistory(String  cardNumber){
        for (History history: historyList) {
            if(history!=null){
                if (history.getSenderCard().equals(cardNumber)){
                    credit.add(history);
                    return true;
                }
            }
        }
        return false;
    }
}


