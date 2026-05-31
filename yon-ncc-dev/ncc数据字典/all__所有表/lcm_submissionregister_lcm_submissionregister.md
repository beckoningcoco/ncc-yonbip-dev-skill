# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9785.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_submissionregister | pk_submissionregister | pk_submissionregister | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billmakedate | billmakedate | billmakedate | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | diliverdate | diliverdate | diliverdate | char(19) |
| 8 | glcpoundage | glcpoundage | glcpoundage | number(28, 8) |
| 9 | glcrate | glcrate | glcrate | number(28, 8) |
| 10 | gllcpoundage | gllcpoundage | gllcpoundage | number(28, 8) |
| 11 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 12 | isbatch | isbatch | isbatch | char(1) |
| 13 | isdocubills | isdocubills | isdocubills | char(1) |
| 14 | isinitial | isinitial | isinitial | char(1) |
| 15 | isinvoicedeliver | isinvoicedeliver | isinvoicedeliver | char(1) |
| 16 | isreceiveflag | isreceiveflag | isreceiveflag | char(1) |  |  | 'N' |
| 17 | lcno | lcno | lcno | varchar2(20) |  |  | '~' |
| 18 | olcpoundage | olcpoundage | olcpoundage | number(28, 8) |
| 19 | olcrate | olcrate | olcrate | number(28, 8) |
| 20 | paytype | paytype | paytype | number(38, 0) |
| 21 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 22 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 23 | pk_busipersion | pk_busipersion | pk_busipersion | varchar2(20) |  |  | '~' |
| 24 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 25 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 26 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 27 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 28 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 29 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 32 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 33 | pk_receivebank | pk_receivebank | pk_receivebank | varchar2(20) |  |  | '~' |
| 34 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 35 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(50) |
| 36 | poundage | poundage | poundage | number(28, 8) |
| 37 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 38 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 39 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 40 | saga_status | saga_status | saga_status | number(38, 0) |
| 41 | serialno | serialno | serialno | varchar2(101) |
| 42 | srcno | srcno | srcno | varchar2(50) |
| 43 | submissionamount | submissionamount | submissionamount | number(28, 8) |
| 44 | submissiondate | submissiondate | submissiondate | char(19) |
| 45 | submissionglcamount | submissionglcamount | submissionglcamount | number(28, 8) |
| 46 | submissiongllcamount | submissiongllcamount | submissiongllcamount | number(28, 8) |
| 47 | submissionolcamount | submissionolcamount | submissionolcamount | number(28, 8) |
| 48 | submissiontype | submissiontype | submissiontype | varchar2(50) |
| 49 | submitdate | submitdate | submitdate | char(19) |
| 50 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 51 | vbillno | vbillno | vbillno | varchar2(40) |
| 52 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 53 | voucherdate | voucherdate | voucherdate | char(19) |
| 54 | voucherflag | voucherflag | voucherflag | char(1) |
| 55 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 56 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 57 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 58 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 59 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 60 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 61 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 62 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 63 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 64 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 65 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 66 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 67 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 68 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 69 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 70 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 71 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 72 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 73 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 74 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 75 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 76 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 77 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 78 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 79 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 80 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 81 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 82 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 83 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 84 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 85 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 86 | creationtime | creationtime | creationtime | char(19) |
| 87 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 88 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 89 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 90 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 91 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |