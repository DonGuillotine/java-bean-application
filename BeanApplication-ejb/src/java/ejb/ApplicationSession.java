/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Donald
 */
@Stateless
public class ApplicationSession implements ApplicationSessionRemote {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
