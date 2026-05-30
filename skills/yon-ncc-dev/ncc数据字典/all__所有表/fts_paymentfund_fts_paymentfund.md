# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8405.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paymentfund | pk_paymentfund | pk_paymentfund | char(20) | √ |
| 2 | accountdate | accountdate | accountdate | char(19) |
| 3 | allotaccname | allotaccname | allotaccname | varchar2(300) |
| 4 | allotaccount | allotaccount | allotaccount | varchar2(200) |
| 5 | amount | amount | amount | number(28, 8) | √ |
| 6 | bankpaymsg | bankpaymsg | bankpaymsg | varchar2(400) |
| 7 | bankrelatcode | bankrelatcode | bankrelatcode | varchar2(50) |
| 8 | bankretmsg | bankretmsg | bankretmsg | varchar2(400) |
| 9 | billno | billno | billno | varchar2(100) |  |  | '~' |
| 10 | brief | brief | brief | varchar2(450) |
| 11 | callbackdate | callbackdate | callbackdate | char(19) |
| 12 | callbacktime | callbacktime | callbacktime | char(19) |
| 13 | callbackuser | callbackuser | callbackuser | varchar2(20) |  |  | '~' |
| 14 | dealway | dealway | dealway | varchar2(30) |
| 15 | direct_ecds | direct_ecds | direct_ecds | char(1) |
| 16 | feeamount | feeamount | feeamount | number(28, 8) |
| 17 | feedirection | feedirection | feedirection | varchar2(50) |
| 18 | fundbankaccname_p | fundbankaccname_p | fundbankaccname_p | varchar2(300) |
| 19 | fundbankacc_p | fundbankacc_p | fundbankacc_p | varchar2(200) |
| 20 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 21 | glcamount | glcamount | glcamount | number(28, 8) |
| 22 | glcfeeamount | glcfeeamount | glcfeeamount | number(28, 8) |
| 23 | glcrate | glcrate | glcrate | number(15, 8) |
| 24 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 25 | gllcfeeamount | gllcfeeamount | gllcfeeamount | number(28, 8) |
| 26 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 27 | isebankback | isebankback | isebankback | char(1) |
| 28 | isebankbackfull | isebankbackfull | isebankbackfull | char(1) |
| 29 | isebankunback | isebankunback | isebankunback | char(1) |
| 30 | isebankunbackfull | isebankunbackfull | isebankunbackfull | char(1) |
| 31 | isebankwritefull | isebankwritefull | isebankwritefull | char(1) |
| 32 | isfees | isfees | isfees | char(1) |
| 33 | ismergepay | ismergepay | ismergepay | char(1) |
| 34 | isnetpay | isnetpay | isnetpay | char(1) |
| 35 | isreserve | isreserve | isreserve | char(1) |
| 36 | issamebank | issamebank | issamebank | varchar2(50) |
| 37 | issamecity | issamecity | issamecity | varchar2(50) |
| 38 | makevdate | makevdate | makevdate | char(19) |
| 39 | makevtime | makevtime | makevtime | char(19) |
| 40 | makevuser | makevuser | makevuser | varchar2(20) |  |  | '~' |
| 41 | memo | memo | memo | varchar2(450) |
| 42 | notedirection | notedirection | notedirection | varchar2(50) |
| 43 | olcamount | olcamount | olcamount | number(28, 8) |
| 44 | olcfeeamount | olcfeeamount | olcfeeamount | number(28, 8) |
| 45 | olcrate | olcrate | olcrate | number(15, 8) |
| 46 | paydate | paydate | paydate | char(19) |
| 47 | paymode | paymode | paymode | varchar2(30) |
| 48 | payphase | payphase | payphase | varchar2(50) |
| 49 | paysignature | paysignature | paysignature | varchar2(20) |  |  | '~' |
| 50 | paystatus | paystatus | paystatus | number(38, 0) |
| 51 | paytime | paytime | paytime | char(19) |
| 52 | payuser | payuser | payuser | varchar2(20) |  |  | '~' |
| 53 | pay_type | pay_type | pay_type | varchar2(50) |
| 54 | pk_allotaccount | pk_allotaccount | pk_allotaccount | varchar2(20) |  |  | '~' |
| 55 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 56 | pk_billno | pk_billno | pk_billno | varchar2(20) |  |  | '~' |
| 57 | pk_drawer | pk_drawer | pk_drawer | varchar2(20) |  |  | '~' |
| 58 | pk_fddownbill | pk_fddownbill | pk_fddownbill | varchar2(20) |  |  | '~' |
| 59 | pk_fddownchildbill | pk_fddownchildbill | pk_fddownchildbill | varchar2(20) |  |  | '~' |
| 60 | pk_fundbankaccount_p | pk_fundbankaccount_p | pk_fundbankaccount_p | varchar2(20) |  |  | '~' |
| 61 | pk_fundcashaccount | pk_fundcashaccount | pk_fundcashaccount | varchar2(20) |  |  | '~' |
| 62 | pk_fundplan | pk_fundplan | pk_fundplan | varchar2(20) |  |  | '~' |
| 63 | pk_fundupbill | pk_fundupbill | pk_fundupbill | varchar2(20) |  |  | '~' |
| 64 | pk_fundupchildbill | pk_fundupchildbill | pk_fundupchildbill | varchar2(20) |  |  | '~' |
| 65 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 66 | pk_notetype | pk_notetype | pk_notetype | varchar2(20) |  |  | '~' |
| 67 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 68 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 69 | pk_payinfochanging | pk_payinfochanging | pk_payinfochanging | varchar2(20) |  |  | '~' |
| 70 | pk_payment | pk_payment | pk_payment | char(20) | √ |
| 71 | pk_payrollyurref | pk_payrollyurref | pk_payrollyurref | varchar2(20) |  |  | '~' |
| 72 | rebackdate | rebackdate | rebackdate | char(19) |
| 73 | rebacktime | rebacktime | rebacktime | char(19) |
| 74 | rebackuser | rebackuser | rebackuser | varchar2(20) |  |  | '~' |
| 75 | relationindex | relationindex | relationindex | number(38, 0) |
| 76 | rowno | rowno | rowno | varchar2(50) |
| 77 | transerial | transerial | transerial | varchar2(50) |
| 78 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 79 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 80 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 81 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 82 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 83 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 84 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 85 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 86 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 87 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 88 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 89 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |