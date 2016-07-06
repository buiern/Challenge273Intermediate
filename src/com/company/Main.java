package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        List<String> values = new ArrayList<>();

        String key = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String value = "áăắặằẳẵǎâấậầẩẫäạàảāąåǻãɑɐɒ," +
                "ḅɓß♭␢Б," +
                "ćčçĉɕċ," +
                "ďḓḍɗḏđɖ," +
                "éĕěêếệềểễëėẹèẻēęẽɘəɚ," +
                "ƒſʃʆʅɟʄ," +
                "ǵğǧģĝġɠḡɡ," +
                "ḫĥḥɦẖħɧ," +
                "íĭǐîïịìỉīįɨĩɩı," +
                "ǰĵʝȷɟʄ," +
                "ķḳƙḵĸʞ," +
                "ĺƚɬľļḽḷḹḻŀɫɭł," +
                "ḿṁṃɱɯɰ," +
                "ŉńňņṋṅṇǹɲṉɳñŋ," +
                "óŏǒôốộồổỗöọőòỏơớợờởỡōǫøǿõɵʘ," +
                "ɸþᵱƥᵽṗṕ," +
                "ʠꝗɋq̃ϙ," +
                "ŕřŗṙṛṝɾṟɼɽɿɹɻ," +
                "śšşŝșṡṣʂ," +
                "ťţṱțẗṭṯʈŧ," +
                "ʉúŭǔûüǘǚǜǖụűùủưứựừửữūųůũʊ," +
                "ʋʌⱴṿṽ," +
                "ẃŵẅẁʍ," +
                "χẍẋⲭ," +
                "ýŷÿẏỵỳƴỷȳỹʎ," +
                "źžʑżẓẕʐƶ," +
                "ÁĂẮẶẰẲẴǍÂẤẬẦẨẪÄẠÀẢĀĄÅǺÃ," +
                "ḄƁᛒ\uD800\uDF31ɃḂḆ฿β," +
                "ĆČÇĈĊƆʗ," +
                "ĎḒḌƊḎĐÐ," +
                "ÉĔĚÊẾỆỀỂỄËĖẸÈẺĒĘẼƐ," +
                "ƑḞ\uD800\uDF05₣," +
                "ǴĞǦĢĜĠḠʛ," +
                "ḪĤḤĦ," +
                "ÍĬǏÎÏİỊÌỈĪĮĨ," +
                "ĴɈʝ," +
                "ĶḲƘḴ," +
                "ĹȽĽĻḼḶḸḺĿŁ," +
                "ḾṀṂ," +
                "ŃŇŅṊṄṆǸƝṈÑ," +
                "ÓŎǑÔỐỘỒỔỖÖỌŐÒỎƠỚỢỜỞỠŌƟǪØǾÕ," +
                "Þ\uD800\uDF10ṔṖⱣƤ₱♇," +
                "ꝖɊ," +
                "ŔŘŖṘṚṜṞʁ," +
                "ŚŠŞŜȘṠṢ," +
                "ŤŢṰȚṬṮŦ," +
                "ÚŬǓÛÜǗǙǛǕỤŰÙỦƯỨỰỪỬỮŪŲŮŨ," +
                "ṼṾƲ℣∨," +
                "ẂŴẄẀʬ," +
                "χẌẊⲬ\uD800\uDF47," +
                "ÝŶŸẎỴỲƳỶȲỸ," +
                "ŹŽŻẒẔƵ";

        int count = 0;

        for (int i = 0; i < value.length(); i++) {
            String check = String.valueOf(value.charAt(i));
            if (check.equals(",")) {
                values.add(value.substring(count, i));
                count = i + 1;
            }

        }
        values.add(value.substring(count, value.length()));

        for (int i = 0; i < key.length(); i++) {

            hm.put(String.valueOf(key.charAt(i)), values.get(i));

        }
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String selection;
        System.out.println("Please enter your text.");
        String twist = sc.nextLine();

        for (int i = 0; i < twist.length(); i++) {

            String letter = String.valueOf(twist.charAt(i));
            if (hm.containsKey(letter)) {
                selection = String.valueOf(hm.get(letter).charAt(rand.nextInt(hm.get(letter).length())));
                sb.append(selection);
            }

        }
        System.out.println(sb);
    }
}
