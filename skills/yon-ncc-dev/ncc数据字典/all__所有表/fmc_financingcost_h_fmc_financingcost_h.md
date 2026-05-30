# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8379.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financingcost_h | pk_financingcost_h | pk_financingcost_h | char(20) | √ |
| 2 | account | account | account | varchar2(20) |  |  | '~' |
| 3 | accountflag | accountflag | accountflag | char(1) |
| 4 | amount | amount | amount | number(28, 8) |
| 5 | approvecomments | approvecomments | approvecomments | varchar2(200) |
| 6 | approvedate | approvedate | approvedate | char(19) |
| 7 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 8 | autosharemode | autosharemode | autosharemode | varchar2(10) |  |  | '~' |
| 9 | billdate | billdate | billdate | char(19) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | busistatus | busistatus | busistatus | varchar2(20) |
| 12 | costdate | costdate | costdate | char(19) |
| 13 | costproject | costproject | costproject | varchar2(20) |  |  | '~' |
| 14 | costshare | costshare | costshare | char(1) |
| 15 | direction | direction | direction | varchar2(20) |  |  | '~' |
| 16 | glcamount | glcamount | glcamount | number(28, 8) |
| 17 | glcrate | glcrate | glcrate | number(28, 8) |
| 18 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 19 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 20 | isbeginperiod | isbeginperiod | isbeginperiod | char(1) |
| 21 | latest | latest | latest | char(1) |
| 22 | olcamount | olcamount | olcamount | number(28, 8) |
| 23 | olcrate | olcrate | olcrate | number(28, 8) |
| 24 | oppounittype | oppounittype | oppounittype | varchar2(20) |  |  | '~' |
| 25 | pk_bank | pk_bank | pk_bank | varchar2(20) |  |  | '~' |
| 26 | pk_bankaccount | pk_bankaccount | pk_bankaccount | varchar2(20) |  |  | '~' |
| 27 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 28 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 29 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 30 | pk_custsup | pk_custsup | pk_custsup | varchar2(20) |  |  | '~' |
| 31 | pk_custsupaccount | pk_custsupaccount | pk_custsupaccount | varchar2(20) |  |  | '~' |
| 32 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 33 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 34 | pk_orginbill | pk_orginbill | pk_orginbill | varchar2(50) |
| 35 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 36 | remark | remark | remark | varchar2(200) |
| 37 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 38 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 39 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 40 | saga_status | saga_status | saga_status | number(38, 0) |
| 41 | sharedate | sharedate | sharedate | char(19) |
| 42 | shareman | shareman | shareman | varchar2(20) |  |  | '~' |
| 43 | submitdate | submitdate | submitdate | char(19) |
| 44 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 45 | vbillno | vbillno | vbillno | varchar2(50) |
| 46 | vbillstatus | vbillstatus | vbillstatus | varchar2(20) |  |  | '~' |
| 47 | version | version | version | number(38, 0) |
| 48 | voucherdate | voucherdate | voucherdate | char(19) |
| 49 | voucherflag | voucherflag | voucherflag | char(1) |
| 50 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 51 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 52 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 53 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 54 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 55 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 56 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 57 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 58 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 59 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 60 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 61 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 62 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 63 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 64 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 65 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 66 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 67 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 68 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 69 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 70 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 71 | creationtime | creationtime | creationtime | char(19) |
| 72 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 73 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 74 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 75 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 76 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |