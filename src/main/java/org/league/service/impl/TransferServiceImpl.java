package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.Transfer;
import org.league.repository.TransferRepository;
import org.league.service.TransferService;

public class TransferServiceImpl extends BaseServiceImpl<Transfer, Long, TransferRepository>
        implements TransferService {
    public TransferServiceImpl(TransferRepository repository) {
        super(repository);
    }
}
