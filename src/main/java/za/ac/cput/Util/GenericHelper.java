/*GenericHelper.java
 Factory for Generic Helper
 Author: Lihle Njobe(218193882)
 Date: 9 June 2021
 */

package za.ac.cput.Util;

import java.util.UUID;

public class GenericHelper {
    public static int generateId() {
        return UUID.randomUUID().toString();

    }
}
