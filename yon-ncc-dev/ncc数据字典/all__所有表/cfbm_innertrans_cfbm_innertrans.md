# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7514.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innertrans | pk_innertrans | pk_innertrans | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | acceptor | acceptor | acceptor | varchar2(20) |  |  | '~' |
| 4 | applydate | applydate | applydate | char(19) |
| 5 | approvedate | approvedate | approvedate | char(19) |
| 6 | approvenote | approvenote | approvenote | varchar2(1024) |
| 7 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 8 | balanceplanitem | balanceplanitem | balanceplanitem | varchar2(20) |  |  | '~' |
| 9 | billmakedate | billmakedate | billmakedate | char(19) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | binnerdiscount | binnerdiscount | binnerdiscount | char(1) |
| 12 | busistatus | busistatus | busistatus | number(38, 0) |
| 13 | disableflag | disableflag | disableflag | char(1) |
| 14 | discountyrate | discountyrate | discountyrate | number(28, 8) |
| 15 | glcrate | glcrate | glcrate | number(28, 8) |
| 16 | glcsumbillamount | glcsumbillamount | glcsumbillamount | number(28, 8) |
| 17 | glcsumtransamount | glcsumtransamount | glcsumtransamount | number(28, 8) |
| 18 | glcsumtransinterest | glcsumtransinterest | glcsumtransinterest | number(28, 8) |
| 19 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 20 | gllcsumbillamount | gllcsumbillamount | gllcsumbillamount | number(28, 8) |
| 21 | gllcsumtransamount | gllcsumtransamount | gllcsumtransamount | number(28, 8) |
| 22 | gllcsumtransinterest | gllcsumtransinterest | gllcsumtransinterest | number(28, 8) |
| 23 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 24 | interestplanitem | interestplanitem | interestplanitem | varchar2(20) |  |  | '~' |
| 25 | olcrate | olcrate | olcrate | number(28, 8) |
| 26 | olcsumbillamount | olcsumbillamount | olcsumbillamount | number(28, 8) |
| 27 | olcsumtransamount | olcsumtransamount | olcsumtransamount | number(28, 8) |
| 28 | olcsumtransinterest | olcsumtransinterest | olcsumtransinterest | number(28, 8) |
| 29 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 30 | pk_billtypeid | pk_billtypeid | pk_billtypeid | char(20) |
| 31 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |
| 32 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 33 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 34 | pk_inneracc | pk_inneracc | pk_inneracc | varchar2(20) |  |  | '~' |
| 35 | pk_innerfbacc | pk_innerfbacc | pk_innerfbacc | varchar2(20) |  |  | '~' |
| 36 | pk_inputorg | pk_inputorg | pk_inputorg | varchar2(20) |  |  | '~' |
| 37 | pk_inputorg_v | pk_inputorg_v | pk_inputorg_v | varchar2(20) |  |  | '~' |
| 38 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 39 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 40 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 41 | pk_transfromorg | pk_transfromorg | pk_transfromorg | varchar2(20) |  |  | '~' |
| 42 | pk_transfromorg_v | pk_transfromorg_v | pk_transfromorg_v | varchar2(20) |  |  | '~' |
| 43 | pk_transtoorg | pk_transtoorg | pk_transtoorg | varchar2(20) |  |  | '~' |
| 44 | pk_transtoorg_v | pk_transtoorg_v | pk_transtoorg_v | varchar2(20) |  |  | '~' |
| 45 | ratedaynum | ratedaynum | ratedaynum | number(38, 0) |
| 46 | remark | remark | remark | varchar2(181) |
| 47 | returndate | returndate | returndate | char(19) |
| 48 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 49 | returnreason | returnreason | returnreason | varchar2(181) |
| 50 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 51 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 52 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 53 | saga_status | saga_status | saga_status | number(38, 0) |
| 54 | submitdate | submitdate | submitdate | char(19) |
| 55 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 56 | sumbillamount | sumbillamount | sumbillamount | number(28, 8) |
| 57 | sumtransamount | sumtransamount | sumtransamount | number(28, 8) |
| 58 | sumtransinterest | sumtransinterest | sumtransinterest | number(28, 8) |
| 59 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 60 | transdate | transdate | transdate | char(19) |
| 61 | vbillno | vbillno | vbillno | varchar2(50) |
| 62 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 63 | voucherdate | voucherdate | voucherdate | char(19) |
| 64 | voucherflag | voucherflag | voucherflag | char(1) |
| 65 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 66 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 67 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 68 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 69 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 70 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 71 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 72 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 73 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 74 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 75 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 76 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 77 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 78 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 79 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 80 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 81 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 82 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 83 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 84 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 85 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 86 | creationtime | creationtime | creationtime | char(19) |
| 87 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 88 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 89 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 90 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 91 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |