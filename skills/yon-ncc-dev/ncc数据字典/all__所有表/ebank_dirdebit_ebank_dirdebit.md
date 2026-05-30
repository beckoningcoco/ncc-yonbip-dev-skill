# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7827.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_dirdebit | pk_ebank_dirdebit | pk_ebank_dirdebit | char(20) | √ |
| 2 | amdmntind | amdmntind | amdmntind | varchar2(50) |
| 3 | banktypecode | banktypecode | banktypecode | varchar2(10) |
| 4 | batchbooking | batchbooking | batchbooking | char(1) |
| 5 | billimporter | billimporter | billimporter | varchar2(20) |  |  | '~' |
| 6 | chargebearer | chargebearer | chargebearer | varchar2(50) |
| 7 | creater | creater | creater | varchar2(20) |  |  | '~' |
| 8 | createtime | createtime | createtime | char(19) |
| 9 | creditorreference | creditorreference | creditorreference | varchar2(50) |
| 10 | crtacc | crtacc | crtacc | varchar2(50) |
| 11 | crtadrline1 | crtadrline1 | crtadrline1 | varchar2(100) |
| 12 | crtadrline2 | crtadrline2 | crtadrline2 | varchar2(100) |
| 13 | crtcountry | crtcountry | crtcountry | varchar2(50) |
| 14 | crtcountrycd | crtcountrycd | crtcountrycd | varchar2(10) |
| 15 | crtissuer | crtissuer | crtissuer | varchar2(50) |
| 16 | crtragt | crtragt | crtragt | varchar2(50) |
| 17 | crtrnm | crtrnm | crtrnm | varchar2(70) |
| 18 | crtrothrid | crtrothrid | crtrothrid | varchar2(50) |
| 19 | crttragtbic | crttragtbic | crttragtbic | varchar2(50) |
| 20 | c_ccynbr | c_ccynbr | c_ccynbr | varchar2(30) |
| 21 | dbtacc | dbtacc | dbtacc | varchar2(50) |
| 22 | dbtadrline1 | dbtadrline1 | dbtadrline1 | varchar2(100) |
| 23 | dbtadrline2 | dbtadrline2 | dbtadrline2 | varchar2(100) |
| 24 | dbtcountry | dbtcountry | dbtcountry | varchar2(50) |
| 25 | dbtcountrycd | dbtcountrycd | dbtcountrycd | varchar2(10) |
| 26 | dbtissuer | dbtissuer | dbtissuer | varchar2(30) |
| 27 | dbtragt | dbtragt | dbtragt | varchar2(50) |
| 28 | dbtragtbic | dbtragtbic | dbtragtbic | varchar2(30) |
| 29 | dbtrnm | dbtrnm | dbtrnm | varchar2(70) |
| 30 | dbtrothrid | dbtrothrid | dbtrothrid | varchar2(50) |
| 31 | dealstate | dealstate | dealstate | number(38, 0) |
| 32 | dtofsgntr | dtofsgntr | dtofsgntr | char(19) |
| 33 | elctrncsgntr | elctrncsgntr | elctrncsgntr | varchar2(35) |
| 34 | func | func | func | varchar2(30) |
| 35 | headpackageid | headpackageid | headpackageid | varchar2(30) |
| 36 | importdatetime | importdatetime | importdatetime | char(19) |
| 37 | importflag | importflag | importflag | char(1) |
| 38 | importtime | importtime | importtime | number(38, 0) |
| 39 | instrid | instrid | instrid | varchar2(35) |
| 40 | lclinstrmcd | lclinstrmcd | lclinstrmcd | varchar2(50) |
| 41 | mndtid | mndtid | mndtid | varchar2(50) |
| 42 | modulecode | modulecode | modulecode | varchar2(20) |
| 43 | msgid | msgid | msgid | varchar2(35) |
| 44 | objcode | objcode | objcode | varchar2(50) |
| 45 | objname | objname | objname | varchar2(50) |
| 46 | orgncrtid | orgncrtid | orgncrtid | varchar2(50) |
| 47 | orgncrtnm | orgncrtnm | orgncrtnm | varchar2(70) |
| 48 | orgndbtacc | orgndbtacc | orgndbtacc | varchar2(50) |
| 49 | orgndbtragt | orgndbtragt | orgndbtragt | varchar2(50) |
| 50 | orgnlmndtid | orgnlmndtid | orgnlmndtid | varchar2(50) |
| 51 | packageid | packageid | packageid | varchar2(30) |
| 52 | payerrmsg | payerrmsg | payerrmsg | varchar2(300) |
| 53 | paymsg | paymsg | paymsg | varchar2(300) |
| 54 | payresultcode | payresultcode | payresultcode | varchar2(30) |
| 55 | paystate | paystate | paystate | number(38, 0) |
| 56 | paytime | paytime | paytime | char(19) |
| 57 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 58 | pk_bankaccbas_crt | pk_bankaccbas_crt | pk_bankaccbas_crt | varchar2(20) |  |  | '~' |
| 59 | pk_bankaccsub | pk_bankaccsub | pk_bankaccsub | varchar2(20) |  |  | '~' |
| 60 | pk_bankaccsub_crt | pk_bankaccsub_crt | pk_bankaccsub_crt | varchar2(20) |  |  | '~' |
| 61 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 62 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 63 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 64 | pk_mndt | pk_mndt | pk_mndt | varchar2(30) |
| 65 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 66 | pk_org_d | pk_org_d | pk_org_d | varchar2(30) |
| 67 | pk_org_r | pk_org_r | pk_org_r | varchar2(50) |
| 68 | pk_org_v | pk_org_v | pk_org_v | varchar2(50) |
| 69 | pmtinfcode | pmtinfcode | pmtinfcode | varchar2(181) |
| 70 | pmtinfid | pmtinfid | pmtinfid | varchar2(35) |
| 71 | pmtmtd | pmtmtd | pmtmtd | varchar2(30) |
| 72 | reconciliationcode | reconciliationcode | reconciliationcode | varchar2(50) |
| 73 | reqcolltndt | reqcolltndt | reqcolltndt | char(19) |
| 74 | reqdexctndt | reqdexctndt | reqdexctndt | char(19) |
| 75 | reqreserved1 | reqreserved1 | reqreserved1 | varchar2(100) |
| 76 | reqreserved2 | reqreserved2 | reqreserved2 | varchar2(100) |
| 77 | reqreserved3 | reqreserved3 | reqreserved3 | varchar2(100) |
| 78 | reqreserved4 | reqreserved4 | reqreserved4 | varchar2(100) |
| 79 | rmtinfustrd | rmtinfustrd | rmtinfustrd | varchar2(50) |
| 80 | senddate | senddate | senddate | char(19) |
| 81 | seqtp | seqtp | seqtp | varchar2(50) |
| 82 | serial | serial | serial | varchar2(50) |
| 83 | srcbillcode | srcbillcode | srcbillcode | varchar2(50) |
| 84 | srcbilltype | srcbilltype | srcbilltype | varchar2(30) |
| 85 | srcpkid | srcpkid | srcpkid | varchar2(30) |
| 86 | srcpkparentid | srcpkparentid | srcpkparentid | varchar2(30) |
| 87 | srcsystem | srcsystem | srcsystem | varchar2(30) |
| 88 | structuredstandard | structuredstandard | structuredstandard | varchar2(50) |
| 89 | svclvlcode | svclvlcode | svclvlcode | varchar2(50) |
| 90 | transnum | transnum | transnum | number(38, 0) |
| 91 | trsamt | trsamt | trsamt | number(28, 8) |
| 92 | ultmtcdtr | ultmtcdtr | ultmtcdtr | varchar2(50) |
| 93 | ultmtcdtrbic | ultmtcdtrbic | ultmtcdtrbic | varchar2(50) |
| 94 | ultmtcdtrid | ultmtcdtrid | ultmtcdtrid | varchar2(50) |
| 95 | ultmtcdtrnm | ultmtcdtrnm | ultmtcdtrnm | varchar2(70) |
| 96 | ultmtdbtr | ultmtdbtr | ultmtdbtr | varchar2(50) |
| 97 | ultmtdbtrbic | ultmtdbtrbic | ultmtdbtrbic | varchar2(50) |
| 98 | ultmtdbtrid | ultmtdbtrid | ultmtdbtrid | varchar2(50) |
| 99 | ultmtdbtrnm | ultmtdbtrnm | ultmtdbtrnm | varchar2(70) |
| 100 | useflag | useflag | useflag | number(38, 0) |
| 101 | yurref | yurref | yurref | varchar2(50) |
| 102 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 103 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 104 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 105 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 106 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 107 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 108 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 109 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 110 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 111 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 112 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 113 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 114 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 115 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |