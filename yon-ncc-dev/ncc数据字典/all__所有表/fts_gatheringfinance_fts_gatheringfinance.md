# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8396.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatheringfinance | pk_gatheringfinance | pk_gatheringfinance | char(20) | √ |
| 2 | address_p | address_p | address_p | varchar2(200) |
| 3 | amount | amount | amount | number(28, 8) |
| 4 | bankaccount_p | bankaccount_p | bankaccount_p | varchar2(200) |
| 5 | bankname_p | bankname_p | bankname_p | varchar2(300) |
| 6 | brief | brief | brief | varchar2(181) |
| 7 | company_p | company_p | company_p | varchar2(300) |
| 8 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 9 | glcamount | glcamount | glcamount | number(28, 8) |
| 10 | glcrate | glcrate | glcrate | number(15, 8) |
| 11 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 12 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 13 | olcamount | olcamount | olcamount | number(28, 8) |
| 14 | olcrate | olcrate | olcrate | number(15, 8) |
| 15 | origetmode | origetmode | origetmode | varchar2(30) |
| 16 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 17 | pk_bankaccount_p | pk_bankaccount_p | pk_bankaccount_p | varchar2(20) |  |  | '~' |
| 18 | pk_bankname_p | pk_bankname_p | pk_bankname_p | varchar2(20) |  |  | '~' |
| 19 | pk_company_p | pk_company_p | pk_company_p | varchar2(20) |  |  | '~' |
| 20 | pk_financeorg_r | pk_financeorg_r | pk_financeorg_r | varchar2(20) |  |  | '~' |
| 21 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 22 | pk_financeplan | pk_financeplan | pk_financeplan | varchar2(20) |  |  | '~' |
| 23 | pk_gathering | pk_gathering | pk_gathering | char(20) | √ |
| 24 | pk_getcostsubj | pk_getcostsubj | pk_getcostsubj | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_inneraccount_r | pk_inneraccount_r | pk_inneraccount_r | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 30 | pk_srcbillbodyrow | pk_srcbillbodyrow | pk_srcbillbodyrow | varchar2(20) |  |  | '~' |
| 31 | recmodule | recmodule | recmodule | varchar2(50) |
| 32 | relationindex | relationindex | relationindex | number(38, 0) |
| 33 | rowno | rowno | rowno | number(38, 0) |
| 34 | sourcedealtype | sourcedealtype | sourcedealtype | varchar2(50) |
| 35 | sourcedealtypeid | sourcedealtypeid | sourcedealtypeid | varchar2(20) |  |  | '~' |
| 36 | vsourcebustype | vsourcebustype | vsourcebustype | varchar2(50) |  |  | '~' |
| 37 | vsourcecode | vsourcecode | vsourcecode | varchar2(50) |
| 38 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 39 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 40 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 41 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 42 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 43 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 44 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 45 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 46 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 47 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |