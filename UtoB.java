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
package com.loopedlabs.lang;

public class UtoB {
	
	public static void main(String[] args) {

		String sUnicode = "ಅ ಆ ಇ ಈ ಉ ಊ ಋ ಎ ಏ ಐ ಒ ಓ ಔ ಅಂ ಅಃ \n"
				+ "ಕ್ ಕ ಕಾ ಕಿ ಕೀ ಕು ಕೂ ಕೃ ಕೆ ಕೇ ಕೈ ಕೊ ಕೋ ಕೌ ಕಂ ಕಃ \n"
				+ "ಖ್ ಖ ಖಾ ಖಿ ಖೀ ಖು ಖೂ ಖೃ ಖೆ ಖೇ ಖೈ ಖೊ ಖೋ ಖೌ ಖಂ ಖಃ \n"
				+ "ಗ್ ಗ ಗಾ ಗಿ ಗೀ ಗು ಗೂ ಗೃ ಗೆ ಗೇ ಗೈ ಗೊ ಗೋ ಗೌ ಗಂ ಗಃ \n"
				+ "ಘ್ ಘ ಘಾ ಘಿ ಘೀ ಘು ಘೂ ಘೃ ಘೆ ಘೇ ಘೈ ಘೊ ಘೋ ಘೌ ಘಂ ಘಃ \n"
				+ "ಚ್ ಚ ಚಾ ಚಿ ಚೀ ಚು ಚೂ ಚೃ ಚೆ ಚೇ ಚೈ ಚೊ ಚೋ ಚೌ ಚಂ ಚಃ \n"
				+ "ಛ್ ಛ ಛಾ ಛಿ ಛೀ ಛು ಛೂ ಛೃ ಛೆ ಛೇ ಛೈ ಛೊ ಛೋ ಛೌ ಛಂ ಛಃ \n"
				+ "ಜ್ ಜ ಜಾ ಜಿ ಜೀ ಜು ಜೂ ಜೃ ಜೆ ಜೇ ಜೈ ಜೊ ಜೋ ಜೌ ಜಂ ಜಃ \n"
				+ "ಝ್ ಝ ಝಾ ಝಿ ಝೀ ಝು ಝೂ ಝೃ ಝೆ ಝೇ ಝೈ ಝೊ ಝೋ ಝೌ ಝಂ ಝಃ \n"
				+ "ಟ್ ಟ ಟಾ ಟಿ ಟೀ ಟು ಟೂ ಟೃ ಟೆ ಟೇ ಟೈ ಟೊ ಟೋ ಟೌ ಟಂ ಟಃ \n"
				+ "ಠ್ ಠ ಠಾ ಠಿ ಠೀ ಠು ಠೂ ಠೃ ಠೆ ಠೇ ಠೈ ಠೊ ಠೋ ಠೌ ಠಂ ಠಃ \n"
				+ "ಡ್ ಡ ಡಾ ಡಿ ಡೀ ಡು ಡೂ ಡೃ ಡೆ ಡೇ ಡೈ ಡೊ ಡೋ ಡೌ ಡಂ ಡಃ \n"
				+ "ಢ್ ಢ ಢಾ ಢಿ ಢೀ ಢು ಢೂ ಢೃ ಢೆ ಢೇ ಢೈ ಢೊ ಢೋ ಢೌ ಢಂ ಢಃ \n"
				+ "ಣ್ ಣ ಣಾ ಣಿ ಣೀ ಣು ಣೂ ಣೃ ಣೆ ಣೇ ಣೈ ಣೊ ಣೋ ಣೌ ಣಂ ಣಃ \n"
				+ "ತ್ ತ ತಾ ತಿ ತೀ ತು ತೂ ತೃ ತೆ ತೇ ತೈ ತೊ ತೋ ತೌ ತಂ ತಃ \n"
				+ "ಥ್ ಥ ಥಾ ಥಿ ಥೀ ಥು ಥೂ ಥೃ ಥೆ ಥೇ ಥೈ ಥೊ ಥೋ ಥೌ ಥಂ ಥಃ \n"
				+ "ದ್ ದ ದಾ ದಿ ದೀ ದು ದೂ ದೃ ದೆ ದೇ ದೈ ದೊ ದೋ ದೌ ದಂ ದಃ \n"
				+ "ಧ್ ಧ ಧಾ ಧಿ ಧೀ ಧು ಧೂ ಧೃ ಧೆ ಧೇ ಧೈ ಧೊ ಧೋ ಧೌ ಧಂ ಧಃ  \n"
				+ "ನ್ ನ ನಾ ನಿ ನೀ ನು ನೂ ನೃ ನೆ ನೇ ನೈ ನೊ ನೋ ನೌ ನಂ ನಃ  \n"
				+ "ಪ್ ಪ ಪಾ ಪಿ ಪೀ ಪು ಪೂ ಪೃ ಪೆ ಪೇ ಪೈ ಪೊ ಪೋ ಪೌ ಪಂ ಪಃ  \n"
				+ "ಫ್ ಫ ಫಾ ಫಿ ಫೀ ಫು ಫೂ ಫೃ ಫೆ ಫೇ ಫೈ ಫೊ ಫೋ ಫೌ ಫಂ ಫಃ  \n"
				+ "ಬ್ ಬ ಬಾ ಬಿ ಬೀ ಬು ಬೂ ಬೃ ಬೆ ಬೇ ಬೈ ಬೊ ಬೋ ಬೌ ಬಂ ಬಃ  \n"
				+ "ಭ್ ಭ ಭಾ ಭಿ ಬೀ ಭು ಭೂ ಭೃ ಭೆ ಭೇ ಭೈ ಭೊ ಭೋ ಭೌ ಭಂ ಭಃ  \n"
				+ "ಮ್ ಮ ಮಾ ಮಿ ಮೀ ಮು ಮೂ ಮೃ ಮೆ ಮೇ ಮೈ ಮೊ ಮೋ ಮೌ ಮಂ ಮಃ  \n"
				+ "ಯ್ ಯ ಯಾ ಯಿ ಯೀ ಯು ಯೂ ಯೃ ಯೆ ಯೇ ಯೈ ಯೊ ಯೋ ಯೌ ಯಂ ಯಃ  \n"
				+ "ರ್ ರ ರಾ ರಿ ರೀ ರು ರೂ ರೃ ರೆ ರೇ ರೈ ರೊ ರೋ ರೌ ರಂ ರಃ  \n"
				+ "ಲ್ ಲ ಲಾ ಲಿ ಲೀ ಲು ಲೂ ಲೃ ಲೆ ಲೇ ಲೈ ಲೊ ಲೋ ಲೌ ಲಂ ಲಃ  \n"
				+ "ವ್ ವ ವಾ ವಿ ವೀ ವು ವೂ ವೃ ವೆ ವೇ ವೈ ವೊ ವೋ ವೌ ವಂ ವಃ  \n"
				+ "ಶ್ ಶ ಶಾ ಶಿ ಶೀ ಶು ಶೂ ಶೃ ಶೆ ಶೇ ಶೈ ಶೊ ಶೋ ಶೌ ಶಂ ಶಃ  \n"
				+ "ಷ್ ಷ ಷಾ ಷಿ ಷೀ ಷು ಷೂ ಷೃ ಷೆ ಷೇ ಷೈ ಷೊ ಷೋ ಷೌ ಷಂ ಷಃ \n"
				+ "ಸ್ ಸ ಸಾ ಸಿ ಸೀ ಸು ಸೂ ಸೃ ಸೆ ಸೇ ಸೈ ಸೊ ಸೋ ಸೌ ಸಂ ಸಃ \n"
				+ "ಹ್ ಹ ಹಾ ಹಿ ಹೀ ಹು ಹೂ ಹೃ ಹೆ ಹೇ ಹೈ ಹೊ ಹೋ ಹೌ ಹಂ ಹಃ \n"
				+ "ಳ್ ಳ ಳಾ ಳಿ ಳೀ ಳು ಳೂ ಳೃ ಳೆ ಳೇ ಳೈ ಳೊ ಳೋ ಳೌ ಳಂ ಳಃ  \n"
				+ "ಕ್ಕ ಕ್ಖ ಕ್ಗ ಕ್ಘ \n" + "ಕ್ಚ ಕ್ಛ ಕ್ಜ ಕ್ಝ \n"
				+ "ಕ್ಟ ಕ್ಠ ಕ್ಡ ಕ್ಢ ಕ್ಣ  \n" + "ಕ್ತ ಕ್ಥ ಕ್ದ ಕ್ಧ ಕ್ನ  \n"
				+ "ಕ್ಪ ಕ್ಫ ಕ್ಬ ಕ್ಭ ಕ್ಮ \n"
				+ "ಕ್ಯ ಕ್ರ ಕ್ಲ ಕ್ವ ಕ್ಶ ಕ್ಷ ಕ್ಸ ಕ್ಳ  \n"
				+ "ಸ್ಟೆರೆಟ್  ಸ್ವಾತಂತ್ರ \n" + "ರ್ಯಾಂಕ್ \n"
				+ "ಲೆಕ್ಕ ಪರಿಷೋದಕರು \n" + "ಲಕ್ಷ್ಯ \n"
				+ "ಪು ಪೂ ಫು ಫೂ ವು ವೂ ಯಿ ಜ್ಞಾ ಞ ಙ ಣು ";
		sUnicode = "ಸ್ವಾತಂತ್ರ ಕ್ಕ ಕ್ಖ ಕ್ಗ ಕ್ಘ \n" + "ಕ್ಚ ಕ್ಛ ಕ್ಜ ಕ್ಝ \n"
				+ "ಕ್ಟ ಕ್ಠ ಕ್ಡ ಕ್ಢ ಕ್ಣ  \n" + "ಕ್ತ ಕ್ಥ ಕ್ದ ಕ್ಧ ಕ್ನ  \n"
				+ "ಕ್ಪ ಕ್ಫ ಕ್ಬ ಕ್ಭ ಕ್ಮ \n"
				+ "ಕ್ಯ ಕ್ರ ಕ್ಲ ಕ್ವ ಕ್ಶ ಕ್ಷ ಕ್ಸ ಕ್ಳ  \n"
				+ "ಸ್ಟೆರೆಟ್  ಸ್ವಾತಂತ್ರ \n" + "ರ್ಯಾಂಕ್ \n"
				+ "ಲೆಕ್ಕ ಪರಿಷೋದಕರು \n" + "ಲಕ್ಷ್ಯ \n"
				+ "ಪು ಪೂ ಫು ಫೂ ವು ವೂ ಯಿ ಜ್ಞಾ ಞ ಙ ಣು ";
		
		KnUnicodeToBaraha knConv = new KnUnicodeToBaraha();
		System.out.println(knConv.convert(sUnicode));
	}
}
