# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7515.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innertransapply | pk_innertransapply | pk_innertransapply | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | acceptor | acceptor | acceptor | varchar2(20) |  |  | '~' |
| 4 | appbalanceplanitem | appbalanceplanitem | appbalanceplanitem | varchar2(20) |  |  | '~' |
| 5 | appinterestplanitem | appinterestplanitem | appinterestplanitem | varchar2(20) |  |  | '~' |
| 6 | applydate | applydate | applydate | char(19) |
| 7 | approvedate | approvedate | approvedate | char(19) |
| 8 | approvenote | approvenote | approvenote | varchar2(1024) |
| 9 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 10 | billmakedate | billmakedate | billmakedate | char(19) |
| 11 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 12 | billmaketime | billmaketime | billmaketime | char(19) |
| 13 | busistatus | busistatus | busistatus | number(38, 0) |
| 14 | commissiondate | commissiondate | commissiondate | char(19) |
| 15 | commissionuser | commissionuser | commissionuser | varchar2(20) |  |  | '~' |
| 16 | disableflag | disableflag | disableflag | char(1) |
| 17 | discountyrate | discountyrate | discountyrate | number(28, 8) |
| 18 | glcrate | glcrate | glcrate | number(28, 8) |
| 19 | glcsumbillamount | glcsumbillamount | glcsumbillamount | number(28, 8) |
| 20 | glcsumtransamount | glcsumtransamount | glcsumtransamount | number(28, 8) |
| 21 | glcsumtransinterest | glcsumtransinterest | glcsumtransinterest | number(28, 8) |
| 22 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 23 | gllcsumbillamount | gllcsumbillamount | gllcsumbillamount | number(28, 8) |
| 24 | gllcsumtransamount | gllcsumtransamount | gllcsumtransamount | number(28, 8) |
| 25 | gllcsumtransinterest | gllcsumtransinterest | gllcsumtransinterest | number(28, 8) |
| 26 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 27 | innerdiscountflag | innerdiscountflag | innerdiscountflag | char(1) |
| 28 | olcrate | olcrate | olcrate | number(28, 8) |
| 29 | olcsumbillamount | olcsumbillamount | olcsumbillamount | number(28, 8) |
| 30 | olcsumtransamount | olcsumtransamount | olcsumtransamount | number(28, 8) |
| 31 | olcsumtransinterest | olcsumtransinterest | olcsumtransinterest | number(28, 8) |
| 32 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 33 | pk_billtypeid | pk_billtypeid | pk_billtypeid | char(20) |
| 34 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |
| 35 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 36 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 37 | pk_inneracc | pk_inneracc | pk_inneracc | varchar2(20) |  |  | '~' |
| 38 | pk_innerfbacc | pk_innerfbacc | pk_innerfbacc | varchar2(20) |  |  | '~' |
| 39 | pk_inputorg | pk_inputorg | pk_inputorg | varchar2(20) |  |  | '~' |
| 40 | pk_inputorg_v | pk_inputorg_v | pk_inputorg_v | varchar2(20) |  |  | '~' |
| 41 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 42 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 43 | pk_srcbill | pk_srcbill | pk_srcbill | char(20) |
| 44 | pk_transfromorg | pk_transfromorg | pk_transfromorg | varchar2(20) |  |  | '~' |
| 45 | pk_transfromorg_v | pk_transfromorg_v | pk_transfromorg_v | varchar2(20) |  |  | '~' |
| 46 | pk_transtoorg | pk_transtoorg | pk_transtoorg | varchar2(20) |  |  | '~' |
| 47 | pk_transtoorg_v | pk_transtoorg_v | pk_transtoorg_v | varchar2(20) |  |  | '~' |
| 48 | ratedaynum | ratedaynum | ratedaynum | number(38, 0) |
| 49 | remark | remark | remark | varchar2(181) |
| 50 | returndate | returndate | returndate | char(19) |
| 51 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 52 | returnreason | returnreason | returnreason | varchar2(181) |
| 53 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 54 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 55 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 56 | saga_status | saga_status | saga_status | number(38, 0) |
| 57 | submitdate | submitdate | submitdate | char(19) |
| 58 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 59 | sumbillamount | sumbillamount | sumbillamount | number(28, 8) |
| 60 | sumtransamount | sumtransamount | sumtransamount | number(28, 8) |
| 61 | sumtransinterest | sumtransinterest | sumtransinterest | number(28, 8) |
| 62 | tallydate | tallydate | tallydate | char(19) |
| 63 | tallyflag | tallyflag | tallyflag | char(1) |
| 64 | tallyor | tallyor | tallyor | varchar2(20) |  |  | '~' |
| 65 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 66 | transdate | transdate | transdate | char(19) |
| 67 | vbillno | vbillno | vbillno | varchar2(50) |
| 68 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 69 | voucherdate | voucherdate | voucherdate | char(19) |
| 70 | voucherflag | voucherflag | voucherflag | char(1) |
| 71 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 72 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 73 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 74 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 75 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 76 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 77 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 78 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 79 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 80 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 81 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 82 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 83 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 84 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 85 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 86 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 87 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 88 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 89 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 90 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 91 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 92 | creationtime | creationtime | creationtime | char(19) |
| 93 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 94 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 95 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 96 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 97 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |