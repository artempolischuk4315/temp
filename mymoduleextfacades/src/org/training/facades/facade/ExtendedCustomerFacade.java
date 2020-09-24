package org.training.facades.facade;

import de.hybris.platform.commercefacades.user.data.CustomerData;

public class ExtendedCustomerFacade extends DefaultCustomerFacade {
    @Override
    public void updateProfile(CustomerData customerData) throws DuplicateUidException {
        super.updateProfile(customerData);
        ///
    }
}
