package com.loopedlabs.lang;
/*
The MIT License (MIT)

Copyright (c) 2015 Looped Labs Pvt. Ltd.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KnUnicodeToBaraha {
	private static final Map<String, String> mapping;
	static {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("ಅ", "C");
		m.put("ಆ", "D");
		m.put("ಇ", "E");
		m.put("ಈ", "F");
		m.put("ಉ", "G");
		m.put("ಊ", "H");
		m.put("ಋ", "IÄ");
		m.put("ಎ", "J");
		m.put("ಏ", "K");
		m.put("ಐ", "L");
		m.put("ಒ", "M");
		m.put("ಓ", "N");
		m.put("ಔ", "O");
		m.put("ಂ", "A");
		m.put("ಃ", "B");
		m.put("ಕ್", "Pï");
		m.put("ಕ", "PÀ");
		m.put("ಕಾ", "PÁ");
		m.put("ಕಿ", "Q");
		m.put("ಕೀ", "QÃ");
		m.put("ಕು", "PÀÄ");
		m.put("ಕೂ", "PÀÆ");
		m.put("ಕೃ", "PÀÈ");
		m.put("ಕೆ", "PÉ");
		m.put("ಕೇ", "PÉÃ");
		m.put("ಕೈ", "PÉÊ");
		m.put("ಕೊ", "PÉÆ");
		m.put("ಕೋ", "PÉÆÃ");
		m.put("ಕೌ", "PË");
		m.put("ಖ್", "Sï");
		m.put("ಖ", "R");
		m.put("ಖಾ", "SÁ");
		m.put("ಖಿ", "T");
		m.put("ಖೀ", "TÃ");
		m.put("ಖು", "RÄ");
		m.put("ಖೂ", "RÆ");
		m.put("ಖೃ", "RÈ");
		m.put("ಖೆ", "SÉ");
		m.put("ಖೇ", "SÉÃ");
		m.put("ಖೈ", "SÉÊ");
		m.put("ಖೊ", "SÉÆ");
		m.put("ಖೋ", "SÉÆÃ");
		m.put("ಖೌ", "SË");
		m.put("ಗ್", "Uï");
		m.put("ಗ", "UÀ");
		m.put("ಗಾ", "UÁ");
		m.put("ಗಿ", "V");
		m.put("ಗೀ", "VÃ");
		m.put("ಗು", "UÀÄ");
		m.put("ಗೂ", "UÀÆ");
		m.put("ಗೃ", "UÀÈ");
		m.put("ಗೆ", "UÉ");
		m.put("ಗೇ", "UÉÃ");
		m.put("ಗೈ", "UÉÊ");
		m.put("ಗೊ", "UÉÆ");
		m.put("ಗೋ", "UÉÆÃ");
		m.put("ಗೌ", "UË");
		m.put("ಘ್", "Wï");
		m.put("ಘ", "WÀ");
		m.put("ಘಾ", "WÁ");
		m.put("ಘಿ", "X");
		m.put("ಘೀ", "XÃ");
		m.put("ಘು", "WÀÄ");
		m.put("ಘೂ", "WÀÆ");
		m.put("ಘೃ", "WÀÈ");
		m.put("ಘೆ", "WÉ");
		m.put("ಘೇ", "WÉÃ");
		m.put("ಘೈ", "WÉÊ");
		m.put("ಘೊ", "WÉÆ");
		m.put("ಘೋ", "WÉÆÃ");
		m.put("ಘೌ", "WË");
		m.put("ಞ", "k");
		m.put("ಚ್", "Zï");
		m.put("ಚ", "ZÀ");
		m.put("ಚಾ", "ZÁ");
		m.put("ಚಿ", "a");
		m.put("ಚೀ", "aÃ");
		m.put("ಚು", "ZÀÄ");
		m.put("ಚೂ", "ZÀÆ");
		m.put("ಚೃ", "ZÀÈ");
		m.put("ಚೆ", "ZÉ");
		m.put("ಚೇ", "ZÉÃ");
		m.put("ಚೈ", "ZÉÊ");
		m.put("ಚೊ", "ZÉÆ");
		m.put("ಚೋ", "ZÉÆÃ");
		m.put("ಚೌ", "ZË");
		m.put("ಛ್", "bï");
		m.put("ಛ", "bÀ");
		m.put("ಛಾ", "bÁ");
		m.put("ಛಿ", "c");
		m.put("ಛೀ", "cÃ");
		m.put("ಛು", "bÀÄ");
		m.put("ಛೂ", "bÀÆ");
		m.put("ಛೃ", "bÀÈ");
		m.put("ಛೆ", "bÉ");
		m.put("ಛೇ", "bÉÃ");
		m.put("ಛೈ", "bÉÆ");
		m.put("ಛೊ", "bÉÆÃ");
		m.put("ಛೋ", "bË");
		m.put("ಛೌ", "bË");
		m.put("ಜ್", "eï");
		m.put("ಜ", "d");
		m.put("ಜಾ", "eÁ");
		m.put("ಜಿ", "f");
		m.put("ಜೀ", "fÃ");
		m.put("ಜು", "dÄ");
		m.put("ಜೂ", "dÆ");
		m.put("ಜೃ", "dÈ");
		m.put("ಜೆ", "eÉ");
		m.put("ಜೇ", "eÉÊ");
		m.put("ಜೈ", "eÉÆ");
		m.put("ಜೊ", "eÉÆÃ");
		m.put("ಜೋ", "eË");
		m.put("ಜೌ", "eË");
		m.put("ಝ್", "gÀhiï");
		m.put("ಝ", "gÀhÄ");
		m.put("ಝಾ", "gÀhiÁ");
		m.put("ಝಿ", "jhÄ");
		m.put("ಝೀ", "jhÄÃ");
		m.put("ಝೆ", "gÉhÄ");
		m.put("ಝು", "gÀhÄÄ");
		m.put("ಝೂ", "gÀhÄÆ");
		m.put("ಝೃ", "gÀhÄÈ");
		m.put("ಝೆ", "gÉhÄ");
		m.put("ಝೇ", "gÉhÄÃ");
		m.put("ಝೈ", "gÉhÄÊ");
		m.put("ಝೊ", "gÉhÆ");
		m.put("ಝೋ", "gÉhÆÃ");
		m.put("ಝೌ", "gÀhiË");
		m.put("ಙ", "Y");
		m.put("ಟ್", "mï");
		m.put("ಟ", "l");
		m.put("ಟಾ", "mÁ");
		m.put("ಟಿ", "n");
		m.put("ಟೀ", "nÃ");
		m.put("ಟು", "lÄ");
		m.put("ಟೂ", "lÆ");
		m.put("ಟೃ", "lÈ");
		m.put("ಟೆ", "mÉ");
		m.put("ಟೇ", "mÉÃ");
		m.put("ಟೈ", "mÉÊ");
		m.put("ಟೊ", "mÉÆ");
		m.put("ಟೋ", "mÉÆÃ");
		m.put("ಟೌ", "mË");
		m.put("ಠ್", "oï");
		m.put("ಠ", "oÀ");
		m.put("ಠಾ", "oÁ");
		m.put("ಠಿ", "p");
		m.put("ಠೀ", "pÃ");
		m.put("ಠು", "oÀÄ");
		m.put("ಠೂ", "oÀÆ");
		m.put("ಠೃ", "oÀÈ");
		m.put("ಠೆ", "oÉ");
		m.put("ಠೇ", "oÉÃ");
		m.put("ಠೈ", "oÉÊ");
		m.put("ಠೊ", "oÉÆ");
		m.put("ಠೋ", "oÉÆÃ");
		m.put("ಠೌ", "oË");
		m.put("ಡ್", "qï");
		m.put("ಡ", "qÀ");
		m.put("ಡಾ", "qÁ");
		m.put("ಡಿ", "r");
		m.put("ಡೀ", "rÃ");
		m.put("ಡು", "qÀÄ");
		m.put("ಡೂ", "qÀÆ");
		m.put("ಡೃ", "qÀÈ");
		m.put("ಡೆ", "qÉ");
		m.put("ಡೇ", "qÉÃ");
		m.put("ಡೈ", "qÉÊ");
		m.put("ಡೊ", "qÉÆ");
		m.put("ಡೋ", "qÉÆÃ");
		m.put("ಡೌ", "qË");
		m.put("ಢ್", "qsï");
		m.put("ಢ", "qsÀ");
		m.put("ಢಾ", "qsÁ");
		m.put("ಢಿ", "rü");
		m.put("ಢೀ", "rüÃ");
		m.put("ಢು", "qsÀÄ");
		m.put("ಢೂ", "qsÀÆ");
		m.put("ಢೃ", "qsÀÈ");
		m.put("ಢೆ", "qsÉ");
		m.put("ಢೇ", "qsÉÃ");
		m.put("ಢೈ", "qsÉÊ");
		m.put("ಢೊ", "qsÉÆ");
		m.put("ಢೋ", "qsÉÆÃ");
		m.put("ಢೌ", "qsË");
		m.put("ಣ್", "uï");
		m.put("ಣ", "t");
		m.put("ಣಾ", "uÁ");
		m.put("ಣಿ", "tÂ");
		m.put("ಣೀ", "tÂÃ");
		m.put("ಣು", "tÄ");
		m.put("ಣೂ", "tÆ");
		m.put("ಣೃ", "tÈ");
		m.put("ಣೆ", "uÉ");
		m.put("ಣೇ", "uÉÃ");
		m.put("ಣೈ", "uÉÊ");
		m.put("ಣೊ", "uÉÆ");
		m.put("ಣೋ", "uÉÆÃ");
		m.put("ಣೌ", "uË");
		m.put("ತ್", "vï");
		m.put("ತ", "vÀ");
		m.put("ತಾ", "vÁ");
		m.put("ತಿ", "w");
		m.put("ತೀ", "wÃ");
		m.put("ತು", "vÀÄ");
		m.put("ತೂ", "vÀÆ");
		m.put("ತೃ", "vÀÈ");
		m.put("ತೆ", "vÉ");
		m.put("ತೇ", "vÉÃ");
		m.put("ತೈ", "vÉÊ");
		m.put("ತೊ", "vÉÆ");
		m.put("ತೋ", "vÉÆÃ");
		m.put("ತೌ", "vË");
		m.put("ಥ್", "xï");
		m.put("ಥ", "xÀ");
		m.put("ಥಾ", "xÁ");
		m.put("ಥಿ", "y");
		m.put("ಥೀ", "yÃ");
		m.put("ಥು", "xÀÄ");
		m.put("ಥೂ", "xÀÆ");
		m.put("ಥೃ", "xÀÈ");
		m.put("ಥೆ", "xÉ");
		m.put("ಥೇ", "xÉÃ");
		m.put("ಥೈ", "xÉÊ");
		m.put("ಥೊ", "xÉÆ");
		m.put("ಥೋ", "xÉÆÃ");
		m.put("ಥೌ", "xË");
		m.put("ದ್", "zï");
		m.put("ದ", "zÀ");
		m.put("ದಾ", "zÁ");
		m.put("ದಿ", "¢");
		m.put("ದೀ", "¢Ã");
		m.put("ದು", "zÀÄ");
		m.put("ದೂ", "zÀÆ");
		m.put("ದೃ", "zÀÈ");
		m.put("ದೆ", "zÉ");
		m.put("ದೇ", "zÉÃ");
		m.put("ದೈ", "zÉÊ");
		m.put("ದೊ", "zÉÆ");
		m.put("ದೋ", "zÉÆÃ");
		m.put("ದೌ", "zË");
		m.put("ಧ್", "zsï");
		m.put("ಧ", "zsÀ");
		m.put("ಧಾ", "zsÁ");
		m.put("ಧಿ", "¢ü");
		m.put("ಧೀ", "¢üÃ");
		m.put("ಧು", "zsÀÄ");
		m.put("ಧೂ", "zsÀÆ");
		m.put("ಧೃ", "zsÀÈ");
		m.put("ಧೆ", "zsÉ");
		m.put("ಧೇ", "zsÉÃ");
		m.put("ಧೈ", "zsÉÊ");
		m.put("ಧೊ", "zsÉÆ");
		m.put("ಧೋ", "zsÉÆÃ");
		m.put("ಧೌ", "zsË");
		m.put("ನ್", "£ï");
		m.put("ನ", "£À");
		m.put("ನಾ", "£Á");
		m.put("ನಿ", "¤");
		m.put("ನೀ", "¤Ã");
		m.put("ನು", "£ÀÄ");
		m.put("ನೂ", "£ÀÆ");
		m.put("ನೃ", "£ÀÈ");
		m.put("ನೆ", "£É");
		m.put("ನೇ", "£ÉÃ");
		m.put("ನೈ", "£ÉÊ");
		m.put("ನೊ", "£ÉÆ");
		m.put("ನೋ", "£ÉÆÃ");
		m.put("ನೌ", "£Ë");
		m.put("ಪ್", "¥ï");
		m.put("ಪ", "¥À");
		m.put("ಪಾ", "¥Á");
		m.put("ಪಿ", "¦");
		m.put("ಪೀ", "¦Ã");
		m.put("ಪು", "¥ÀÄ");
		m.put("ಪೂ", "¥ÀÆ");
		m.put("ಪೃ", "¥ÀÈ");
		m.put("ಪೆ", "¥É");
		m.put("ಪೇ", "¥ÉÃ");
		m.put("ಪೈ", "¥ÉÊ");
		m.put("ಪೊ", "¥ÉÆ");
		m.put("ಪೋ", "¥ÉÆÃ");
		m.put("ಪೌ", "¥Ë");
		m.put("ಫ್", "¥sï");
		m.put("ಫ", "¥sÀ");
		m.put("ಫಾ", "¥sÁ");
		m.put("ಫಿ", "¦ü");
		m.put("ಫೀ", "¦üÃ");
		m.put("ಫು", "¥sÀÄ");
		m.put("ಫೂ", "¥sÀÆ");
		m.put("ಫೃ", "¥sÀÈ");
		m.put("ಫೆ", "¥sÉ");
		m.put("ಫೇ", "¥sÉÃ");
		m.put("ಫೈ", "¥sÉÊ");
		m.put("ಫೊ", "¥sÉÆ");
		m.put("ಫೋ", "¥sÉÆÃ");
		m.put("ಫೌ", "¥sË");
		m.put("ಬ್", "¨ï");
		m.put("ಬ", "§");
		m.put("ಬಾ", "¨Á");
		m.put("ಬಿ", "©");
		m.put("ಬೀ", "©Ã");
		m.put("ಬು", "§Ä");
		m.put("ಬೂ", "§Æ");
		m.put("ಬೃ", "§È");
		m.put("ಬೆ", "¨É");
		m.put("ಬೇ", "¨ÉÃ");
		m.put("ಬೈ", "¨ÉÊ");
		m.put("ಬೊ", "¨ÉÆ");
		m.put("ಬೋ", "¨ÉÆÃ");
		m.put("ಬೌ", "¨Ë");
		m.put("ಭ್", "¨sï");
		m.put("ಭ", "¨sÀ");
		m.put("ಭಾ", "¨sÁ");
		m.put("ಭಿ", "©ü");
		m.put("ಭೆ", "¨sÉ");
		m.put("ಭೌ", "¨sË");
		m.put("ಮ್", "ªÀiï");
		m.put("ಮ", "ªÀÄ");
		m.put("ಮಾ", "ªÀiÁ");
		m.put("ಮಿ", "«Ä");
		m.put("ಮೀ", "«ÄÃ");
		m.put("ಮು", "ªÀÄÄ");
		m.put("ಮೂ", "ªÀÄÆ");
		m.put("ಮೃ", "ªÀÄÈ");
		m.put("ಮೆ", "ªÉÄ");
		m.put("ಮೇ", "ªÉÄÃ");
		m.put("ಮೈ", "ªÉÄÊ");
		m.put("ಮೊ", "ªÉÆ");
		m.put("ಮೋ", "ªÉÆÃ");
		m.put("ಮೌ", "ªÀiË");
		m.put("ಯ್", "AiÀiï");
		m.put("ಯ", "AiÀÄ");
		m.put("ಯಾ", "AiÀiÁ");
		m.put("ಯಿ", "¬Ä");
		m.put("ಯೀ", "¬ÄÃ");
		m.put("ಯು", "AiÀÄÄ");
		m.put("ಯೂ", "AiÀÄÆ");
		m.put("ಯೃ", "AiÀÄÈ");
		m.put("ಯೆ", "AiÉÄ");
		m.put("ಯೇ", "AiÉÄÃ");
		m.put("ಯೈ", "AiÉÄÊ");
		m.put("ಯೊ", "AiÉÆ");
		m.put("ಯೋ", "AiÉÆÃ");
		m.put("ಯೌ", "AiÀiË");
		m.put("ರ್", "gï");
		m.put("ರ", "gÀ");
		m.put("ರಾ", "gÁ");
		m.put("ರಿ", "j");
		m.put("ರೀ", "jÃ");
		m.put("ರು", "gÀÄ");
		m.put("ರೂ", "gÀÆ");
		m.put("ರೃ", "gÀÈ");
		m.put("ರೆ", "gÉ");
		m.put("ರೇ", "gÉÃ");
		m.put("ರೈ", "gÉÊ");
		m.put("ರೊ", "gÉÆ");
		m.put("ರೋ", "gÉÆÃ");
		m.put("ರೌ", "gË");
		m.put("ಲ್", "¯ï");
		m.put("ಲ", "®");
		m.put("ಲಾ", "¯Á");
		m.put("ಲಿ", "°");
		m.put("ಲೀ", "°Ã");
		m.put("ಲು", "®Ä");
		m.put("ಲೂ", "®Æ");
		m.put("ಲೃ", "®È");
		m.put("ಲೆ", "¯É");
		m.put("ಲೇ", "¯ÉÃ");
		m.put("ಲೈ", "¯ÉÊ");
		m.put("ಲೊ", "¯ÉÆ");
		m.put("ಲೋ", "¯ÉÆÃ");
		m.put("ಲೌ", "¯Ë");
		m.put("ವ್", "ªï");
		m.put("ವ", "ªÀ");
		m.put("ವಾ", "ªÁ");
		m.put("ವಿ", "«");
		m.put("ವೀ", "«Ã");
		m.put("ವು", "ªÀÅ");
		m.put("ವೂ", "ªÀÇ");
		m.put("ವೃ", "ªÀÈ");
		m.put("ವೆ", "ªÉ");
		m.put("ವೇ", "ªÉÃ");
		m.put("ವೈ", "ªÉÊ");
		m.put("ವೊ", "ªÉÇ");
		m.put("ವೋ", "ªÉÇÃ");
		m.put("ವೌ", "ªË");
		m.put("ಶ್", "±ï");
		m.put("ಶ", "±À");
		m.put("ಶಾ", "±Á");
		m.put("ಶಿ", "²");
		m.put("ಶೀ", "²Ã");
		m.put("ಶು", "±ÀÄ");
		m.put("ಶೂ", "±ÀÆ");
		m.put("ಶೃ", "±ÀÈ");
		m.put("ಶೆ", "±É");
		m.put("ಶೇ", "±ÉÃ");
		m.put("ಶೈ", "±ÉÊ");
		m.put("ಶೊ", "±ÉÆ");
		m.put("ಶೋ", "±ÉÆÃ");
		m.put("ಶೌ", "±Ë");
		m.put("ಷ್", "µï");
		m.put("ಷ", "µÀ");
		m.put("ಷಾ", "µÁ");
		m.put("ಷಿ", "¶");
		m.put("ಷೀ", "¶Ã");
		m.put("ಷು", "µÀÄ");
		m.put("ಷೂ", "µÀÆ");
		m.put("ಷೃ", "µÀÈ");
		m.put("ಷೆ", "µÉ");
		m.put("ಷೇ", "µÉÃ");
		m.put("ಷೈ", "µÉÊ");
		m.put("ಷೊ", "µÉÆ");
		m.put("ಷೋ", "µÉÆÃ");
		m.put("ಷೌ", "µË");
		m.put("ಸ್", "¸ï");
		m.put("ಸ", "¸À");
		m.put("ಸಾ", "¸Á");
		m.put("ಸಿ", "¹");
		m.put("ಸೀ", "¹Ã");
		m.put("ಸು", "¸ÀÄ");
		m.put("ಸೂ", "¸ÀÆ");
		m.put("ಸೃ", "¸ÀÈ");
		m.put("ಸೆ", "¸É");
		m.put("ಸೇ", "¸ÉÃ");
		m.put("ಸೈ", "¸ÉÊ");
		m.put("ಸೊ", "¸ÉÆ");
		m.put("ಸೋ", "¸ÉÆÃ");
		m.put("ಸೌ", "¸Ë");
		m.put("ಹ್", "ºï");
		m.put("ಹ", "ºÀ");
		m.put("ಹಾ", "ºÁ");
		m.put("ಹಿ", "»");
		m.put("ಹೀ", "»Ã");
		m.put("ಹು", "ºÀÄ");
		m.put("ಹೂ", "ºÀÆ");
		m.put("ಹೃ", "ºÀÈ");
		m.put("ಹೆ", "ºÉ");
		m.put("ಹೇ", "ºÉÃ");
		m.put("ಹೈ", "ºÉÊ");
		m.put("ಹೊ", "ºÉÆ");
		m.put("ಹೋ", "ºÉÆÃ");
		m.put("ಹೌ", "ºË");
		m.put("ಳ್", "¼ï");
		m.put("ಳ", "¼À");
		m.put("ಳಾ", "¼Á");
		m.put("ಳಿ", "½");
		m.put("ಳೀ", "½Ã");
		m.put("ಳು", "¼ÀÄ");
		m.put("ಳೂ", "¼ÀÆ");
		m.put("ಳೃ", "¼ÀÈ");
		m.put("ಳೆ", "¼É");
		m.put("ಳೇ", "¼ÉÃ");
		m.put("ಳೈ", "¼ÉÊ");
		m.put("ಳೊ", "¼ÉÆ");
		m.put("ಳೋ", "¼ÉÆÃ");
		m.put("ಳೌ", "¼Ë");
		mapping = Collections.unmodifiableMap(m);
	}

	private static final Map<String, String> vattaksharagalu;
	static {
		HashMap<String, String> v = new HashMap<String, String>();
		v.put("ಕ", "Ì");
		v.put("ಖ", "Í");
		v.put("ಗ", "Î");
		v.put("ಘ", "Ï");
		v.put("ಞ", "Õ");
		v.put("ಚ", "Ñ");
		v.put("ಛ", "Ò");
		v.put("ಜ", "Ó");
		v.put("ಝ", "Ô");
		v.put("ಟ", "Ö");
		v.put("ಠ", "×");
		v.put("ಡ", "Ø");
		v.put("ಢ", "Ù");
		v.put("ಣ", "Ú");
		v.put("ತ", "Û");
		v.put("ಥ", "Ü");
		v.put("ದ", "Ý");
		v.put("ಧ", "Þ");
		v.put("ನ", "ß");
		v.put("ಪ", "à");
		v.put("ಫ", "á");
		v.put("ಬ", "â");
		v.put("ಭ", "ã");
		v.put("ಮ", "ä");
		v.put("ಯ", "å");
		v.put("ರ", "æ");
		v.put("ಲ", "è");
		v.put("ವ", "é");
		v.put("ಶ", "ê");
		v.put("ಷ", "ë");
		v.put("ಸ", "ì");
		v.put("ಹ", "í");
		v.put("ಳ", "î");
		v.put("ರ", "ç");
		vattaksharagalu = Collections.unmodifiableMap(v);
	}

	private static ArrayList<String> dependent_vowels = new ArrayList<String>();
	static {
		dependent_vowels.add("್");
		dependent_vowels.add("ಾ");
		dependent_vowels.add("ಿ");
		dependent_vowels.add("ೀ");
		dependent_vowels.add("ು");
		dependent_vowels.add("ೂ");
		dependent_vowels.add("ೃ");
		dependent_vowels.add("ೆ");
		dependent_vowels.add("ೇ");
		dependent_vowels.add("ೈ");
		dependent_vowels.add("ೊ");
		dependent_vowels.add("ೋ");
		dependent_vowels.add("ೌ");
	}

	private ArrayList<String> op;

	public String convert(String knUnicode) {
		ArrayList<String> aOut = new ArrayList<String>();

		String[] words = knUnicode.split(" ");
		for (String word : words) {
			aOut.add(processWord(word));
		}
		return join(aOut, " ");
	}

	private String processWord(String word) {
		// Initialize op
		op = new ArrayList<String>();
		int maxLen = word.length();
		int i = 0;

		// rearrange "್", only if in the middle of the word
		int wl = word.length();

		StringBuilder sbWord = new StringBuilder(word);
		String v = "";
		for (int zz = 1; zz < wl; zz++) {
			if (word.charAt(zz) == '್') {
				switch (wl - zz) {
				case 0:
				case 1:
					// do nothing; word ending with ್
					break;
				case 2:
					// no dependent vowels
					v = vattaksharagalu
							.get(String.valueOf(word.charAt(zz + 1)));
					sbWord.replace(zz, zz + 1, v);
					if (sbWord.length() >= (zz + 2)) {
						sbWord.deleteCharAt(zz + 1);
					}
					break;
				default:
					String dv = word.substring(zz + 2, zz + 3);
					// check for dependent vowels
					if (dependent_vowels.contains(dv)) {
						v = vattaksharagalu.get(String.valueOf(word
								.charAt(zz + 1)));
						sbWord.replace(zz, zz + 1, dv);
						sbWord.replace(zz + 1, zz + 2, v);
						sbWord.deleteCharAt(zz + 2);
					} else {
						v = vattaksharagalu.get(String.valueOf(word
								.charAt(zz + 1)));
						sbWord.replace(zz, zz + 1, v);
					}
					break;
				}
			}
		}
		word = sbWord.toString();

		while (i < maxLen) {
			// Find the mapping data
			int data = find_mapping(word, i);

			// Jump if data > 0 which means found a match for more than
			// one letter combination
			i += (1 + data);
		}
		return join(op, "");
	}

	private int find_mapping(String txt, int current_pos) {
		// Finds mapping in reverse order, For Example if input string
		// is abcde then itteration will be for abcde, abcd, abc, ab, a
		// Only when mapping available the index jumps, say if mapping
		// available for ab
		// then subtract length of ab while processing next

		// Combination length, if length remaining is less than max len then
		// Consider length remaining as max length
		// remaining length = len(txt) - current_pos
		int max_len = 4;
		int remaining = txt.length() - current_pos;
		if (remaining < 5) {
			max_len = (remaining - 1);
		}
		// Number of letters found mapping, will be returned to caller and
		// used to jump the index (Zero if one char found mapping)
		int n = 0;
		// String zwj = "\u200d‍";

		// Loop 4 to 0 or max to 0
		// Controller which checks direct mapping,
		// arkavattu, vattaksharagalu and broken cases
		for (int i = max_len; i >= 0; i--) {
			int substr_till = current_pos + i + 1;
			String t = txt.substring(current_pos, substr_till);

			if (mapping.containsKey(t)) {
				// Direct mapping case
				op.add(mapping.get(t));
				// Update Jump by number
				n = i;
				// Break and return to caller since we found the mapping
				// for given input
				break;
			} else {
				// Try without processing till reaches to last char
				if (i > 0) {
					continue;
				}
				// No match
				op.add(t);
			}
		}
		return n;
	}

	private String join(ArrayList<String> s, String glue) {
		int k = s.size();
		if (k == 0) {
			return "";
		}
		StringBuilder out = new StringBuilder();
		out.append(s.get(0));
		for (int x = 1; x < k; ++x) {
			out.append(glue).append(s.get(x));
		}
		return out.toString();
	}
}
