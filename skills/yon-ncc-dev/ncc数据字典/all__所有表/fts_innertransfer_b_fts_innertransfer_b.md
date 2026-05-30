# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8399.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innertransfer_b | pk_innertransfer_b | pk_innertransfer_b | char(20) | √ |
| 2 | acceptancetype | acceptancetype | acceptancetype | number(38, 0) |
| 3 | acceptdate | acceptdate | acceptdate | char(19) |
| 4 | acceptor | acceptor | acceptor | varchar2(20) |  |  | '~' |
| 5 | acceptstatus | acceptstatus | acceptstatus | number(38, 0) |
| 6 | accepttime | accepttime | accepttime | char(19) |
| 7 | amount | amount | amount | number(28, 8) |
| 8 | bookaccdate | bookaccdate | bookaccdate | char(19) |
| 9 | brief | brief | brief | varchar2(300) |
| 10 | forceacceptdate | forceacceptdate | forceacceptdate | char(19) |
| 11 | forceacceptor | forceacceptor | forceacceptor | varchar2(20) |  |  | '~' |
| 12 | forceaccepttime | forceaccepttime | forceaccepttime | char(19) |
| 13 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 14 | glcamount | glcamount | glcamount | number(28, 8) |
| 15 | glcpayamount | glcpayamount | glcpayamount | number(28, 8) |
| 16 | glcrate | glcrate | glcrate | number(15, 8) |
| 17 | glcunpayamount | glcunpayamount | glcunpayamount | number(28, 8) |
| 18 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 19 | gllcpayamount | gllcpayamount | gllcpayamount | number(28, 8) |
| 20 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 21 | gllcunpayamount | gllcunpayamount | gllcunpayamount | number(28, 8) |
| 22 | isforceaccept | isforceaccept | isforceaccept | char(1) |
| 23 | isunaccept | isunaccept | isunaccept | char(1) |
| 24 | memo | memo | memo | varchar2(300) |
| 25 | needacceptance | needacceptance | needacceptance | char(1) |
| 26 | olcamount | olcamount | olcamount | number(28, 8) |
| 27 | olcpayamount | olcpayamount | olcpayamount | number(28, 8) |
| 28 | olcrate | olcrate | olcrate | number(15, 8) |
| 29 | olcunpayamount | olcunpayamount | olcunpayamount | number(28, 8) |
| 30 | payamount | payamount | payamount | number(28, 8) |
| 31 | pk_financeorg_p | pk_financeorg_p | pk_financeorg_p | varchar2(20) |  |  | '~' |
| 32 | pk_financeorg_p_v | pk_financeorg_p_v | pk_financeorg_p_v | varchar2(20) |  |  | '~' |
| 33 | pk_financeorg_r | pk_financeorg_r | pk_financeorg_r | varchar2(20) |  |  | '~' |
| 34 | pk_financeorg_r_v | pk_financeorg_r_v | pk_financeorg_r_v | varchar2(20) |  |  | '~' |
| 35 | pk_getcostsubj | pk_getcostsubj | pk_getcostsubj | varchar2(20) |  |  | '~' |
| 36 | pk_getplanitem | pk_getplanitem | pk_getplanitem | varchar2(20) |  |  | '~' |
| 37 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 38 | pk_inneraccount_p | pk_inneraccount_p | pk_inneraccount_p | varchar2(20) |  |  | '~' |
| 39 | pk_inneraccount_r | pk_inneraccount_r | pk_inneraccount_r | varchar2(20) |  |  | '~' |
| 40 | pk_innertransfer_h | pk_innertransfer_h | pk_innertransfer_h | char(20) | √ |
| 41 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 42 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 43 | pk_paycostsubj | pk_paycostsubj | pk_paycostsubj | varchar2(20) |  |  | '~' |
| 44 | pk_payplanitem | pk_payplanitem | pk_payplanitem | varchar2(20) |  |  | '~' |
| 45 | pk_sourcebillid | pk_sourcebillid | pk_sourcebillid | varchar2(20) |  |  | '~' |
| 46 | pk_sourcebillrowid | pk_sourcebillrowid | pk_sourcebillrowid | varchar2(20) |  |  | '~' |
| 47 | refusereason | refusereason | refusereason | varchar2(300) |
| 48 | returnacceptdate | returnacceptdate | returnacceptdate | char(19) |
| 49 | returnacceptor | returnacceptor | returnacceptor | varchar2(20) |  |  | '~' |
| 50 | returnaccepttime | returnaccepttime | returnaccepttime | char(19) |
| 51 | rowno | rowno | rowno | number(38, 0) |
| 52 | settleway | settleway | settleway | varchar2(20) |  |  | '~' |
| 53 | unacceptreason | unacceptreason | unacceptreason | varchar2(272) |
| 54 | unpayamount | unpayamount | unpayamount | number(28, 8) |
| 55 | vsourcebilltype | vsourcebilltype | vsourcebilltype | varchar2(21) |
| 56 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 57 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 58 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 59 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 60 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 61 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 62 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 63 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 64 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 65 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 66 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 67 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |