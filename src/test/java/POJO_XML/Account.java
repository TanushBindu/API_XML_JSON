package POJO_XML;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account
{
    private String availableCash;
    private String purchaseCTDAmount;
    private String lastReqOperator;
    private String minimumPaymentDue;
    private String creditCTDAmount;
    private String lastNSFAmount;
    private String lastDisputeAmount;
    private String type;
    private String overlimit;
    private String currentBalanceSign;
    private String lastStatementBalDue;
    private String lastStatementDate;
    private String suppressHardCopyFlag;
    private String outstandingAuthorizations;
    private String lastStatementBalanceSign;
    private StatusCodesList statusCodesList;
    private OptOutsList optOutsList;
    private String creditLimit;
    private String disclosureFlag;
    private String id;
    private String cashAdvanceCTDAmount;
    private String chipCardOptionSet;
    private String loyaltyNumber;
    private String tsysProductCode;
    private String availableCredit;
    private String cdf10;
    private String disclosureGroup;
    private String currentBalance;
    private String lastCreditTransactionAmount;
    private String lastCashAdvanceAmount;
    private String lastReqReason;
    private String yearToDateInterestPd;
    private String paymentDue;
    private String nsfCounter;
    private String paymentDueDate;
    private String dateLastRequest;
    private String custSegValue;
    private String nextStatementDate;
    private String yearToDateInterestChgd;
    private String billingCycle;
    private String repaymentMonths;
    private String availableCreditPad;
    private String creditLimitDate;
    private String custSegId;
    private String availableCashPad;
    private Scores scores;
    private String cashLimit;
    private String dateThirdPartyNameAdded;
    private String totalDue;
    private String nbrStmtsLTD;
    private String pastDue;
    private PaymentHistory paymentHistory;
    private String optOutOnlineOffer;
    private String authorizationStatus;
    private String postedBalance;
    private String cardExpiryDate;
    private DigitalFlagsList digitalFlagsList;
    private String clientProductCode;
    private String tuAuthenticationRequired;
    private String fixedPaymentAmount;
    private String electronicStatementFlag;
    private String purchaseApr;
    private String consecutiveDaysPastDue;
    private String productUpgradeCode;
    private String lastAccessDateTime;
    private String lastFinanceChargeAmount;
    private String availableCreditSign;
    private String cashApr;
    private String authorizationReason;
    private String outstandingCardRequest;
    private String idCompliantFlag;
    private String lastPurchase;
    private String minPaymentDueAmt;
    private String chipCardIndicator;
    private String underivedOutstandingMinPaymentDue;
    private PrimaryCardholder primaryCardholder;
    private String solicitationFlag;
    private String thirdPartyName;
    private String lastStatementBalance;
    private OtherCardholdersList otherCardholdersList;
    private String disclosureGroupDesc;
    private String lastPayment;
    private String openDate;
    private String arqCounter;
    @XmlElement
     public String getAvailableCash ()
    {
        return availableCash;
    }
    public void setAvailableCash (String availableCash)
    {
        this.availableCash = availableCash;
    }
    @XmlElement
    public String getPurchaseCTDAmount ()
    {
        return purchaseCTDAmount;
    }
    public void setPurchaseCTDAmount (String purchaseCTDAmount)
    {
        this.purchaseCTDAmount = purchaseCTDAmount;
    }
    @XmlElement
    public String getLastReqOperator ()
    {
        return lastReqOperator;
    }
    public void setLastReqOperator (String lastReqOperator)
    {
        this.lastReqOperator = lastReqOperator;
    }
    @XmlElement
    public String getMinimumPaymentDue ()
    {
        return minimumPaymentDue;
    }
    public void setMinimumPaymentDue (String minimumPaymentDue)
    {
        this.minimumPaymentDue = minimumPaymentDue;
    }
    @XmlElement
    public String getCreditCTDAmount ()
    {
        return creditCTDAmount;
    }
    public void setCreditCTDAmount (String creditCTDAmount)
    {
        this.creditCTDAmount = creditCTDAmount;
    }
    @XmlElement
    public String getLastNSFAmount ()
    {
        return lastNSFAmount;
    }
    public void setLastNSFAmount (String lastNSFAmount)
    {
        this.lastNSFAmount = lastNSFAmount;
    }
    @XmlElement
    public String getLastDisputeAmount ()
    {
        return lastDisputeAmount;
    }
    public void setLastDisputeAmount (String lastDisputeAmount)
    {
        this.lastDisputeAmount = lastDisputeAmount;
    }
    @XmlElement
    public String getType ()
    {
        return type;
    }
    public void setType (String type)
    {
        this.type = type;
    }
    @XmlElement
    public String getOverlimit ()
    {
        return overlimit;
    }
    public void setOverlimit (String overlimit)
    {
        this.overlimit = overlimit;
    }
    @XmlElement
    public String getCurrentBalanceSign ()
    {
        return currentBalanceSign;
    }
    public void setCurrentBalanceSign (String currentBalanceSign)
    {
        this.currentBalanceSign = currentBalanceSign;
    }
    @XmlElement
    public String getLastStatementBalDue ()
    {
        return lastStatementBalDue;
    }
    public void setLastStatementBalDue (String lastStatementBalDue)
    {
        this.lastStatementBalDue = lastStatementBalDue;
    }
    @XmlElement
    public String getLastStatementDate ()
    {
        return lastStatementDate;
    }
    public void setLastStatementDate (String lastStatementDate)
    {
        this.lastStatementDate = lastStatementDate;
    }
    @XmlElement
    public String getSuppressHardCopyFlag ()
    {
        return suppressHardCopyFlag;
    }
    public void setSuppressHardCopyFlag (String suppressHardCopyFlag)
    {
        this.suppressHardCopyFlag = suppressHardCopyFlag;
    }
    @XmlElement
    public String getOutstandingAuthorizations ()
    {
        return outstandingAuthorizations;
    }
    public void setOutstandingAuthorizations (String outstandingAuthorizations)
    {
        this.outstandingAuthorizations = outstandingAuthorizations;
    }
    @XmlElement
    public String getLastStatementBalanceSign ()
    {
        return lastStatementBalanceSign;
    }
    public void setLastStatementBalanceSign (String lastStatementBalanceSign)
    {
        this.lastStatementBalanceSign = lastStatementBalanceSign;
    }
    @XmlElement
    public StatusCodesList getStatusCodesList ()
    {
        return statusCodesList;
    }
    public void setStatusCodesList (StatusCodesList statusCodesList)
    {
        this.statusCodesList = statusCodesList;
    }
    @XmlElement
    public OptOutsList getOptOutsList ()
    {
        return optOutsList;
    }
    public void setOptOutsList (OptOutsList optOutsList)
    {
        this.optOutsList = optOutsList;
    }
    @XmlElement
    public String getCreditLimit ()
    {
        return creditLimit;
    }
    public void setCreditLimit (String creditLimit)
    {
        this.creditLimit = creditLimit;
    }
    @XmlElement
    public String getDisclosureFlag ()
    {
        return disclosureFlag;
    }
    public void setDisclosureFlag (String disclosureFlag)
    {
        this.disclosureFlag = disclosureFlag;
    }
    @XmlElement
    public String getId ()
    {
        return id;
    }
    public void setId (String id)
    {
        this.id = id;
    }
    @XmlElement
    public String getCashAdvanceCTDAmount ()
    {
        return cashAdvanceCTDAmount;
    }
    public void setCashAdvanceCTDAmount (String cashAdvanceCTDAmount)
    {
        this.cashAdvanceCTDAmount = cashAdvanceCTDAmount;
    }
    @XmlElement
    public String getChipCardOptionSet ()
    {
        return chipCardOptionSet;
    }
    public void setChipCardOptionSet (String chipCardOptionSet)
    {
        this.chipCardOptionSet = chipCardOptionSet;
    }
    @XmlElement
    public String getLoyaltyNumber ()
    {
        return loyaltyNumber;
    }
    public void setLoyaltyNumber (String loyaltyNumber)
    {
        this.loyaltyNumber = loyaltyNumber;
    }
    @XmlElement
    public String getTsysProductCode ()
    {
        return tsysProductCode;
    }
    public void setTsysProductCode (String tsysProductCode)
    {
        this.tsysProductCode = tsysProductCode;
    }
    @XmlElement
    public String getAvailableCredit ()
    {
        return availableCredit;
    }
    public void setAvailableCredit (String availableCredit)
    {
        this.availableCredit = availableCredit;
    }
    @XmlElement
    public String getCdf10 ()
    {
        return cdf10;
    }
    public void setCdf10 (String cdf10)
    {
        this.cdf10 = cdf10;
    }
    @XmlElement
    public String getDisclosureGroup ()
    {
        return disclosureGroup;
    }
    public void setDisclosureGroup (String disclosureGroup)
    {
        this.disclosureGroup = disclosureGroup;
    }
    @XmlElement
    public String getCurrentBalance ()
    {
        return currentBalance;
    }
    public void setCurrentBalance (String currentBalance)
    {
        this.currentBalance = currentBalance;
    }
    @XmlElement
    public String getLastCreditTransactionAmount ()
    {
        return lastCreditTransactionAmount;
    }
    public void setLastCreditTransactionAmount (String lastCreditTransactionAmount)
    {
        this.lastCreditTransactionAmount = lastCreditTransactionAmount;
    }
    @XmlElement
    public String getLastCashAdvanceAmount ()
    {
        return lastCashAdvanceAmount;
    }
    public void setLastCashAdvanceAmount (String lastCashAdvanceAmount)
    {
        this.lastCashAdvanceAmount = lastCashAdvanceAmount;
    }
    @XmlElement
    public String getLastReqReason ()
    {
        return lastReqReason;
    }
    public void setLastReqReason (String lastReqReason)
    {
        this.lastReqReason = lastReqReason;
    }
    @XmlElement
    public String getYearToDateInterestPd ()
    {
        return yearToDateInterestPd;
    }
    public void setYearToDateInterestPd (String yearToDateInterestPd)
    {
        this.yearToDateInterestPd = yearToDateInterestPd;
    }
    @XmlElement
    public String getPaymentDue ()
    {
        return paymentDue;
    }
    public void setPaymentDue (String paymentDue)
    {
        this.paymentDue = paymentDue;
    }
    @XmlElement
    public String getNsfCounter ()
    {
        return nsfCounter;
    }
    public void setNsfCounter (String nsfCounter)
    {
        this.nsfCounter = nsfCounter;
    }
    @XmlElement
    public String getPaymentDueDate ()
    {
        return paymentDueDate;
    }
    public void setPaymentDueDate (String paymentDueDate)
    {
        this.paymentDueDate = paymentDueDate;
    }
    @XmlElement
    public String getDateLastRequest ()
    {
        return dateLastRequest;
    }
    public void setDateLastRequest (String dateLastRequest)
    {
        this.dateLastRequest = dateLastRequest;
    }
    @XmlElement
    public String getCustSegValue ()
    {
        return custSegValue;
    }
    public void setCustSegValue (String custSegValue)
    {
        this.custSegValue = custSegValue;
    }
    @XmlElement
    public String getNextStatementDate ()
    {
        return nextStatementDate;
    }
    public void setNextStatementDate (String nextStatementDate)
    {
        this.nextStatementDate = nextStatementDate;
    }
    @XmlElement
    public String getYearToDateInterestChgd ()
    {
        return yearToDateInterestChgd;
    }
    public void setYearToDateInterestChgd (String yearToDateInterestChgd)
    {
        this.yearToDateInterestChgd = yearToDateInterestChgd;
    }
    @XmlElement
    public String getBillingCycle ()
    {
        return billingCycle;
    }
    public void setBillingCycle (String billingCycle)
    {
        this.billingCycle = billingCycle;
    }
    @XmlElement
    public String getRepaymentMonths ()
    {
        return repaymentMonths;
    }
    public void setRepaymentMonths (String repaymentMonths)
    {
        this.repaymentMonths = repaymentMonths;
    }
    @XmlElement
    public String getAvailableCreditPad ()
    {
        return availableCreditPad;
    }
    public void setAvailableCreditPad (String availableCreditPad)
    {
        this.availableCreditPad = availableCreditPad;
    }
    @XmlElement
    public String getCreditLimitDate ()
    {
        return creditLimitDate;
    }
    public void setCreditLimitDate (String creditLimitDate)
    {
        this.creditLimitDate = creditLimitDate;
    }
    @XmlElement
    public String getCustSegId ()
    {
        return custSegId;
    }
    public void setCustSegId (String custSegId)
    {
        this.custSegId = custSegId;
    }
    @XmlElement
    public String getAvailableCashPad ()
    {
        return availableCashPad;
    }
    public void setAvailableCashPad (String availableCashPad)
    {
        this.availableCashPad = availableCashPad;
    }
    @XmlElement
    public Scores getScores ()
    {
        return scores;
    }
    public void setScores (Scores scores)
    {
        this.scores = scores;
    }
    @XmlElement
    public String getCashLimit ()
    {
        return cashLimit;
    }
    public void setCashLimit (String cashLimit)
    {
        this.cashLimit = cashLimit;
    }
    @XmlElement
    public String getDateThirdPartyNameAdded ()
    {
        return dateThirdPartyNameAdded;
    }
    public void setDateThirdPartyNameAdded (String dateThirdPartyNameAdded)
    {
        this.dateThirdPartyNameAdded = dateThirdPartyNameAdded;
    }
    @XmlElement
    public String getTotalDue ()
    {
        return totalDue;
    }
    public void setTotalDue (String totalDue)
    {
        this.totalDue = totalDue;
    }
    @XmlElement
    public String getNbrStmtsLTD ()
    {
        return nbrStmtsLTD;
    }
    public void setNbrStmtsLTD (String nbrStmtsLTD)
    {
        this.nbrStmtsLTD = nbrStmtsLTD;
    }
    @XmlElement
    public String getPastDue ()
    {
        return pastDue;
    }
    public void setPastDue (String pastDue)
    {
        this.pastDue = pastDue;
    }
    @XmlElement
    public PaymentHistory getPaymentHistory ()
    {
        return paymentHistory;
    }
    public void setPaymentHistory (PaymentHistory paymentHistory)
    {
        this.paymentHistory = paymentHistory;
    }
    @XmlElement
    public String getOptOutOnlineOffer ()
    {
        return optOutOnlineOffer;
    }
    public void setOptOutOnlineOffer (String optOutOnlineOffer)
    {
        this.optOutOnlineOffer = optOutOnlineOffer;
    }
    @XmlElement
    public String getAuthorizationStatus ()
    {
        return authorizationStatus;
    }
    public void setAuthorizationStatus (String authorizationStatus)
    {
        this.authorizationStatus = authorizationStatus;
    }
    @XmlElement
    public String getPostedBalance ()
    {
        return postedBalance;
    }
    public void setPostedBalance (String postedBalance)
    {
        this.postedBalance = postedBalance;
    }
    @XmlElement
    public String getCardExpiryDate ()
    {
        return cardExpiryDate;
    }
    public void setCardExpiryDate (String cardExpiryDate)
    {
        this.cardExpiryDate = cardExpiryDate;
    }
    @XmlElement
    public DigitalFlagsList getDigitalFlagsList ()
    {
        return digitalFlagsList;
    }
    public void setDigitalFlagsList (DigitalFlagsList digitalFlagsList)
    {
        this.digitalFlagsList = digitalFlagsList;
    }
    @XmlElement
    public String getClientProductCode ()
    {
        return clientProductCode;
    }
    public void setClientProductCode (String clientProductCode)
    {
        this.clientProductCode = clientProductCode;
    }
    @XmlElement
    public String getTuAuthenticationRequired ()
    {
        return tuAuthenticationRequired;
    }
    public void setTuAuthenticationRequired (String tuAuthenticationRequired)
    {
        this.tuAuthenticationRequired = tuAuthenticationRequired;
    }
    @XmlElement
    public String getFixedPaymentAmount ()
    {
        return fixedPaymentAmount;
    }
    public void setFixedPaymentAmount (String fixedPaymentAmount)
    {
        this.fixedPaymentAmount = fixedPaymentAmount;
    }
    @XmlElement
    public String getElectronicStatementFlag ()
    {
        return electronicStatementFlag;
    }
    public void setElectronicStatementFlag (String electronicStatementFlag)
    {
        this.electronicStatementFlag = electronicStatementFlag;
    }
    @XmlElement
    public String getPurchaseApr ()
    {
        return purchaseApr;
    }
    public void setPurchaseApr (String purchaseApr)
    {
        this.purchaseApr = purchaseApr;
    }
    @XmlElement
    public String getConsecutiveDaysPastDue ()
    {
        return consecutiveDaysPastDue;
    }
    public void setConsecutiveDaysPastDue (String consecutiveDaysPastDue)
    {
        this.consecutiveDaysPastDue = consecutiveDaysPastDue;
    }
    @XmlElement
    public String getProductUpgradeCode ()
    {
        return productUpgradeCode;
    }
    public void setProductUpgradeCode (String productUpgradeCode)
    {
        this.productUpgradeCode = productUpgradeCode;
    }
    @XmlElement
    public String getLastAccessDateTime ()
    {
        return lastAccessDateTime;
    }
    public void setLastAccessDateTime (String lastAccessDateTime)
    {
        this.lastAccessDateTime = lastAccessDateTime;
    }
    @XmlElement
    public String getLastFinanceChargeAmount ()
    {
        return lastFinanceChargeAmount;
    }
    public void setLastFinanceChargeAmount (String lastFinanceChargeAmount)
    {
        this.lastFinanceChargeAmount = lastFinanceChargeAmount;
    }
    @XmlElement
    public String getAvailableCreditSign ()
    {
        return availableCreditSign;
    }
    public void setAvailableCreditSign (String availableCreditSign)
    {
        this.availableCreditSign = availableCreditSign;
    }
    @XmlElement
    public String getCashApr ()
    {
        return cashApr;
    }
    public void setCashApr (String cashApr)
    {
        this.cashApr = cashApr;
    }
    @XmlElement
    public String getAuthorizationReason ()
    {
        return authorizationReason;
    }
    public void setAuthorizationReason (String authorizationReason)
    {
        this.authorizationReason = authorizationReason;
    }
    @XmlElement
    public String getOutstandingCardRequest ()
    {
        return outstandingCardRequest;
    }
    public void setOutstandingCardRequest (String outstandingCardRequest)
    {
        this.outstandingCardRequest = outstandingCardRequest;
    }
    @XmlElement
     public String getIdCompliantFlag ()
    {
        return idCompliantFlag;
    }
    public void setIdCompliantFlag (String idCompliantFlag)
    {
        this.idCompliantFlag = idCompliantFlag;
    }
    @XmlElement
    public String getLastPurchase ()
    {
        return lastPurchase;
    }
    public void setLastPurchase (String lastPurchase)
    {
        this.lastPurchase = lastPurchase;
    }
    @XmlElement
    public String getMinPaymentDueAmt ()
    {
        return minPaymentDueAmt;
    }
    public void setMinPaymentDueAmt (String minPaymentDueAmt)
    {
        this.minPaymentDueAmt = minPaymentDueAmt;
    }
    @XmlElement
    public String getChipCardIndicator ()
    {
        return chipCardIndicator;
    }
    public void setChipCardIndicator (String chipCardIndicator)
    {
        this.chipCardIndicator = chipCardIndicator;
    }
    @XmlElement
    public String getUnderivedOutstandingMinPaymentDue ()
    {
        return underivedOutstandingMinPaymentDue;
    }
    public void setUnderivedOutstandingMinPaymentDue (String underivedOutstandingMinPaymentDue)
    {
        this.underivedOutstandingMinPaymentDue = underivedOutstandingMinPaymentDue;
    }
    @XmlElement
    public PrimaryCardholder getPrimaryCardholder ()
    {
        return primaryCardholder;
    }
    public void setPrimaryCardholder (PrimaryCardholder primaryCardholder)
    {
        this.primaryCardholder = primaryCardholder;
    }
    @XmlElement
    public String getSolicitationFlag ()
    {
        return solicitationFlag;
    }
    public void setSolicitationFlag (String solicitationFlag)
    {
        this.solicitationFlag = solicitationFlag;
    }
    @XmlElement
    public String getThirdPartyName ()
    {
        return thirdPartyName;
    }
    public void setThirdPartyName (String thirdPartyName)
    {
        this.thirdPartyName = thirdPartyName;
    }
    @XmlElement
    public String getLastStatementBalance ()
    {
        return lastStatementBalance;
    }
    public void setLastStatementBalance (String lastStatementBalance)
    {
        this.lastStatementBalance = lastStatementBalance;
    }
    @XmlElement
    public OtherCardholdersList getOtherCardholdersList ()
    {
        return otherCardholdersList;
    }
    public void setOtherCardholdersList (OtherCardholdersList otherCardholdersList)
    {
        this.otherCardholdersList = otherCardholdersList;
    }
    @XmlElement
    public String getDisclosureGroupDesc ()
    {
        return disclosureGroupDesc;
    }
    public void setDisclosureGroupDesc (String disclosureGroupDesc)
    {
        this.disclosureGroupDesc = disclosureGroupDesc;
    }
    @XmlElement
    public String getLastPayment ()
    {
        return lastPayment;
    }
    public void setLastPayment (String lastPayment)
    {
        this.lastPayment = lastPayment;
    }
    @XmlElement
    public String getOpenDate ()
    {
        return openDate;
    }
    public void setOpenDate (String openDate)
    {
        this.openDate = openDate;
    }
    @XmlElement
    public String getArqCounter ()
    {
        return arqCounter;
    }
    public void setArqCounter (String arqCounter)
    {
        this.arqCounter = arqCounter;
    }
}