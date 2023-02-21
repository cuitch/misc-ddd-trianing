package com.ch.test.infrastructure.common.enums;

import java.util.Objects;

/** Error Message */
public enum ErrorCode {
  B_CUSTOMER_companyNameConflict("B_CUSTOMER_companyNameConflict", "客户公司名冲突"),

  B_USER_PASSWORD_ERROR("B_USER_PASSWORD_ERROR", "用户名或密码不正确"),

  B_USER_HIRE_DATE_ERROR("B_USER_HIRE_DATE_ERROR", "user hire date error"),

  B_PASSWORD_VERIFICATION_ERROR(
      "B_PASSWORD_VERIFICATION_ERROR", "The passwords do not match twice, please re-enter them"),

  B_USERNAME_VERIFICATION_ERROR("B_USERNAME_VERIFICATION_ERROR", "The user name is already in use"),

  B_MOBILE_VERIFICATION_ERROR("B_MOBILE_VERIFICATION_ERROR", "The mobile is already in use"),

  B_USER_NAME_NOT_NULL("B_USER_NAME_NOT_NULL", "Please enter your name"),

  B_USER_NAME_SIZE_LIMIT("B_USER_NAME_SIZE_LIMIT", "The maximum character length is 50 characters"),

  B_USER_USERNAME_NOT_NULL("B_USERNAME_NOT_NULL", "Please enter a username"),

  B_USER_USERNAME_RULE_LIMIT(
      "B_USER_USERNAME_RULE_LIMIT", "64-bit character length, letters + numbers, case sensitive"),

  B_USER_MOBILE_CORRECT_ERROR(
      "B_USER_MOBILE_CORRECT_ERROR", "Please enter the correct mobile phone number"),

  B_USER_EMAIL_CORRECT_ERROR(
      "B_USER_EMAIL_CORRECT_ERROR", "Please enter the correct email address"),

  B_USER_EMAIL_SIZE_LIMIT("B_USER_EMAIL_SIZE_LIMIT", "Only up to 64 characters are supported"),

  B_USER_PASSWORD_NOT_NULL("B_USER_PASSWORD_NOT_NULL", "Please enter a password"),

  B_USER_PASSWORD_CORRECT_ERROR(
      "B_USER_PASSWORD_CORRECT_ERROR",
      "8-20 characters, It contains 3 combinations of uppercase and lowercase letters and numbers, and no spaces are supported"),

  B_USER_CONFIRM_PASSWORD_NOT_NULL(
      "B_USER_CONFIRM_PASSWORD_NOT_NULL", "Please enter confirm password"),
  B_EMAIL_VERIFICATION_ERROR("B_EMAIL_VERIFICATION_ERROR", "The email is already in use"),

  B_ROLE_ENTITY_NOT_FOUND("B_ROLE_ENTITY_NOT_FOUND", "Role entity not found"),

  B_ROLE_MENU_MAPPING_NOT_FOUND("B_ROLE_MENU_MAPPING_NOT_FOUND", "Role-menu-mapping not found"),
  B_PARAM_ERROR("B_PARAM_ERROR", "Param error"),

  B_PARAM_MISS_ERROR("B_PARAM_MISS_ERROR", "Param miss error"),

  B_REQUEST_TYPE_ERROR("B_REQUEST_TYPE_ERROR", "Request type error"),
  B_ORG_DELETE_PARAMS_ERROR("B_ORG_DELETE_PARAMS_ERROR", "Org delete params error"),
  B_ORG_ID_NOT_EXIST_ERROR("B_ORG_ID_NOT_EXIST_ERROR", "ORG ID NOT EXIST"),

  B_ORG_NAMES_EMPTY_ERROR("B_ORG_NAMES_EMPTY_ERROR", "Org name not empty"),

  B_ORG_PARAMS_EMPTY_ERROR("B_ORG_PARAMS_EMPTY_ERROR", "Org add/update params not empty"),

  B_ORG_NAMES_REPEAT_ERROR("B_ORG_NAMES_REPEAT_ERROR", ""),

  B_USER_ROLE_MAPPING_EXISTS(
      "B_USER_ROLE_MAPPING_EXISTS",
      "Can not delete the role, cause there are users blow the role."),

  B_ROLE_NAME_REPEAT_ERROR("B_ROLE_NAME_REPEAT_ERROR", "Role name can not be repeatable"),

  B_ROLE_NAME_SIZE_LIMIT(
      "B_ROLE_NAME_SIZE_LIMIT", "The length of role name can not be more than 50"),

  B_ROLE_CODE_REPEAT_ERROR("B_ROLE_CODE_REPEAT_ERROR", "Role code can not be repeatable"),
  B_DEFAULT_ROLE_NAME_LIMIT("B_DEFAULT_ROLE_NAME_LIMIT", "Can not rename default role's name"),
  B_DEFAULT_ROLE("B_DEFAULT_ROLE", "Can not delete default role"),
  B_MENU_ENTITY_NOT_FOUND("B_MENU_ENTITY_NOT_FOUND", "Menu entity not found"),
  B_MENU_NAME_REPEAT_ERROR("B_MENU_NAME_REPEAT_ERROR", "Menu name can not be repeatable"),
  B_USER_ROLE_ONLY_ONE(
      "B_USER_ROLE_ONLY_ONE", "Can not remove the mapping,cause the user only has one role"),

  B_USER_ROLE_NOT_NULL("B_USER_ROLE_NOT_NULL", "The user role cannot be empty"),

  B_USER_ORG_NOT_NULL("B_USER_ORG_NOT_NULL", "The user org cannot be empty"),

  B_DEFAULT_ROLE_MAPPING(
      "B_DEFAULT_ROLE_MAPPING",
      "Can not remove the mapping,cause the user's role belong to default roles"),

  B_CANNOT_REMOVE_SELF("B_CANNOT_REMOVE_SELF", "Can not remove self"),

  B_POST_NAME_LENGTH_LIMIT("B_POST_NAME_LENGTH_LIMIT", "Post name more than 50 characters"),
  B_POST_GROUP_NAME_LENGTH_LIMIT(
      "B_POST_GROUP_NAME_LENGTH_LIMIT", "Post Group name more than 50 characters"),
  B_NULL_PARAMETER("B_NULL_PARAMETER", "Parameter can not be null"),
  B_DATA_NOT_FOUND("B_RESOURCE_NOT_FOUND", "No data found in the database"),
  B_DUPLICATE_DATA("B_DUPLICATE_DATA", "Data already exists"),
  B_NOT_A_EMPTY_POST_GROUP("B_NOT_A_EMPTY_POST_GROUP","Some posts exist in the group");

  private final String errCode;
  private final String errDesc;

  public static String getErrDesc(String errCode) {
    ErrorCode[] errorCodes = ErrorCode.values();
    for (ErrorCode errorCode : errorCodes) {
      if (Objects.equals(errCode, errorCode.getErrCode())) {
        return errorCode.getErrDesc();
      }
    }
    return null;
  }

  private ErrorCode(String errCode, String errDesc) {
    this.errCode = errCode;
    this.errDesc = errDesc;
  }

  public String getErrCode() {
    return errCode;
  }

  public String getErrDesc() {
    return errDesc;
  }
}
