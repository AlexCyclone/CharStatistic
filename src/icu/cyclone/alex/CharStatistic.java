package icu.cyclone.alex;

import java.util.ArrayList;
import java.util.Formatter;

public class CharStatistic {
    private String text;
    private ArrayList<SymbolQuantity> statistic;

    public CharStatistic(String text) {
        this.text = text;
        fillStatistic();
    }

    private void fillStatistic() {
        statistic = new ArrayList();
        for (char i = 'a'; i <= 'z'; i++) {
            statistic.add(new SymbolQuantity(i));
        }
    }

    private void calcStatistic() {
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            int pos = statistic.indexOf(new SymbolQuantity(text.charAt(i)));
            if (pos >= 0) {
                statistic.get(pos).up();
            }
        }
        statistic.sort((SymbolQuantity sq1, SymbolQuantity sq2)->(sq2.getQuantity()-sq1.getQuantity()));
    }

    @Override
    public String toString() {
        calcStatistic();
        StringBuffer sb = new StringBuffer();
        sb.append("Char -> Times").append(System.lineSeparator());
        for (int i = 0; i < statistic.size() && statistic.get(i).getQuantity() > 0; i++) {
            Formatter frm = new Formatter();
            frm.format("%-4c -> %d", statistic.get(i).getSymbol(), statistic.get(i).getQuantity());
            sb.append(frm.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
