package org.penta.work.jpa.write;

import org.penta.work.boostrap.port.model.Account;
import org.penta.work.boostrap.port.outgoing.Writer;
import org.penta.work.jpa.utils.DataUtil;

public class WriteService implements Writer {

    @Override
    public void save(Account account) {

        DataUtil dataUtil =  DataUtil.getInstance();
        dataUtil.accounts.put(account.getAccountNo(), account);
    }
}