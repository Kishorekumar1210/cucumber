package stepDefinations;

import basePage.BaseClass;

import io.cucumber.java.en.Then;
import pageObject.UserPageActions;

public class userPage extends BaseClass {

	UserPageActions userPageActions;

	@Then("click on Users")
	public void click_on_Users() throws Exception {
		userPageActions = new UserPageActions(driver);
		userPageActions.users();
	}

	@Then("click on Invite Memeber")
	public void click_on_Invite_Memeber() throws Exception {
		userPageActions.inviteMember();
	}

	@Then("Verify the fields in Invite memeber")
	public void verify_the_fields_in_Invite_memeber() throws Exception {
		userPageActions.memberTextValidation();
	}

	@Then("verify user able to toggle between user and Admin")
	public void verify_user_able_to_toggle_between_user_and_Admin() throws Exception {
		userPageActions.toggleRoles();
	}

	@Then("user provide valid email ID")
	public void user_provide_valid_email_ID() throws Exception {
		userPageActions.inviteEmailAddress();
	}

	@Then("user send Invitation")
	public void user_send_Invitation() throws Exception {
		userPageActions.sendInvitation();
	}

	@Then("verify the Invited member in pending status")
	public void verify_the_Invited_member_in_pending_status() throws Exception {
		userPageActions.invitedEmail();
	}

	@Then("user able to remove invitation")
	public void user_able_to_remove_invitation() throws Exception {
		userPageActions.removeinvitedEmail();
	}

}
