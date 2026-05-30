# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8404.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paymentfinance | pk_paymentfinance | pk_paymentfinance | varchar2(20) | √ |
| 2 | address_r | address_r | address_r | varchar2(200) |
| 3 | amount | amount | amount | number(28, 8) | √ |
| 4 | bankaccountname_p | bankaccountname_p | bankaccountname_p | varchar2(300) |
| 5 | bankaccountname_r | bankaccountname_r | bankaccountname_r | varchar2(300) |
| 6 | bankaccount_r | bankaccount_r | bankaccount_r | varchar2(200) |
| 7 | bankacc_p | bankacc_p | bankacc_p | varchar2(200) |
| 8 | bankname_r | bankname_r | bankname_r | varchar2(300) |
| 9 | brief | brief | brief | varchar2(272) |
| 10 | company_r | company_r | company_r | varchar2(300) |
| 11 | custaccprop | custaccprop | custaccprop | number(38, 0) |
| 12 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 13 | glcamount | glcamount | glcamount | number(28, 8) |
| 14 | glcrate | glcrate | glcrate | number(15, 8) |
| 15 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 16 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 17 | olcamount | olcamount | olcamount | number(28, 8) |
| 18 | olcrate | olcrate | olcrate | number(15, 8) |
| 19 | oripaymode | oripaymode | oripaymode | varchar2(30) |
| 20 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 21 | pk_bankaccount_p | pk_bankaccount_p | pk_bankaccount_p | varchar2(20) |  |  | '~' |
| 22 | pk_bankaccount_r | pk_bankaccount_r | pk_bankaccount_r | varchar2(20) |  |  | '~' |
| 23 | pk_bankname_r | pk_bankname_r | pk_bankname_r | varchar2(20) |  |  | '~' |
| 24 | pk_company_r | pk_company_r | pk_company_r | varchar2(20) |  |  | '~' |
| 25 | pk_financeorg_p | pk_financeorg_p | pk_financeorg_p | varchar2(20) |  |  | '~' |
| 26 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 27 | pk_financeplan | pk_financeplan | pk_financeplan | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_inneraccount_p | pk_inneraccount_p | pk_inneraccount_p | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 32 | pk_payment | pk_payment | pk_payment | varchar2(20) | √ |
| 33 | pk_personnel | pk_personnel | pk_personnel | varchar2(20) |  |  | '~' |
| 34 | pk_psnbankacc | pk_psnbankacc | pk_psnbankacc | varchar2(20) |  |  | '~' |
| 35 | pk_splitkey | pk_splitkey | pk_splitkey | varchar2(20) |  |  | '~' |
| 36 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 37 | pk_srcbillbodyrow | pk_srcbillbodyrow | pk_srcbillbodyrow | varchar2(20) |  |  | '~' |
| 38 | psnbankacc | psnbankacc | psnbankacc | varchar2(200) |
| 39 | psnbankaccname | psnbankaccname | psnbankaccname | varchar2(300) |
| 40 | recmodule | recmodule | recmodule | varchar2(30) |
| 41 | relationindex | relationindex | relationindex | number(38, 0) |
| 42 | rowno | rowno | rowno | varchar2(50) |
| 43 | vsourcebustype | vsourcebustype | vsourcebustype | varchar2(30) |
| 44 | vsourcecode | vsourcecode | vsourcecode | varchar2(50) |
| 45 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 46 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 47 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 48 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 49 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 50 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 51 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 52 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 53 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 54 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 55 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 56 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |