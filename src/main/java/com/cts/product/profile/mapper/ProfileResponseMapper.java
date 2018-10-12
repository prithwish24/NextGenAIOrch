package com.cts.product.profile.mapper;

import com.cts.product.profile.domain.UserProfile;
import com.cts.product.profile.dto.messages.ProfileResponse;

public class ProfileResponseMapper {
    public static UserProfile mapUserProfile(ProfileResponse response) {
	UserProfile userProfile = new UserProfile();
	userProfile.setFirstName(response.getProfile().getBasicProfile().getFirstName());
	userProfile.setLastName(response.getProfile().getBasicProfile().getLastName());
	userProfile.setUsername(response.getProfile().getUserName());
	userProfile.setEmailId(response.getContactProfile().getMaskEmail());
	userProfile.setDateOfBirth(response.getProfile().getBasicProfile().getDateOfBirth());
	userProfile.setMobileNo(response.getContactProfile().getPhones().get(0).getMaskPhoneNumber());
	userProfile.setIndividualId(response.getProfile().getIndividualId());
	userProfile.setLoyaltyNumber(response.getProfile().getBasicProfile().getLoyaltyData().getLoyaltyNumber());
	userProfile.setLoyaltyProgram(response.getProfile().getBasicProfile().getLoyaltyData().getLoyaltyProgram());
	userProfile.setAuthToken(response.getAdditionalData().getAuthToken());
	userProfile.setEncryptedCredential(response.getAdditionalData().getEncryptedCredential());
	userProfile.setCreditCardExpired(response.getAdditionalData().getCreditCardExpired());
	userProfile.setCreditCardNearExpiration(response.getAdditionalData().getCreditCardNearExpiration());
	userProfile.setDriverLicenseExpired(response.getAdditionalData().getDriverLicenseExpired());
	userProfile.setDriverLicenseNearExpiration(response.getAdditionalData().getDriverLicenseNearExpiration());
	return userProfile;
    }
}
