package com.kitabisa;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Tests extends Setup {
	
	@Test
	@Order(1)
	@DisplayName("Select any campaign")
	public void navigate() {
		HomePage home = new HomePage(driver);
		home.selectCampaign();
	}
	
	@Test
	@Order(2)
	@DisplayName("Click Donasi Sekarang")
	public void clickButton() {
		CampaignPage campaign = new CampaignPage(driver);
		campaign.clickDonasiSekarang();
	}
	
	@Test
	@Order(3)
	@DisplayName("Select amount as 10K")
	public void selectDonation() {
		DonationPage donation = new DonationPage(driver);
		donation.selectDonation();
	}
	
	@Test
	@Order(4)
	@DisplayName("Select payment method as Transfer BCA")
	public void selectPaymentMethod() {
		MethodPaymentPage methodPayment = new MethodPaymentPage(driver);
		methodPayment.selectPaymentMethod();
	}
	
	@Test
	@Order(5)
	@DisplayName("Enter any name and email id in the corresponding fields")
	public void inputData() {
		InputNameAndEmail inputData = new InputNameAndEmail(driver);
		inputData.inputName("Haris");
		inputData.inputEmail("hariskaisardaniels@gmail.com");
	}
	
	@Test
	@Order(6)
	@DisplayName("Click Lanjutkan Pembayaran")
	public void clickLanjutkanPembayaran() {
		InputNameAndEmail lanjutkanPembayaran = new InputNameAndEmail(driver);
		lanjutkanPembayaran.clickLanjutkanPembayaran();
	}
	
	@Test
	@Order(7)
	@DisplayName("Click Kembali ke Penggalangan")
	public void clickKembaliKePenggalangan() {
		Back kembaliKePenggalangan = new Back(driver);
		kembaliKePenggalangan.clickKembaliKePenggalangan();
	}
	
	@Test
	@Order(8)
	@DisplayName("Click back arrow on the campaign")
	public void clickBackArrowOntheCampaign() {
		Back backArrow = new Back(driver);
		backArrow.clickBackArrowOnTheCampaign();
	}

}