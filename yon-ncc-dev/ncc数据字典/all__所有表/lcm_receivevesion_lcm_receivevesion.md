# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9782.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receivemodify | pk_receivemodify | pk_receivemodify | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billitem | billitem | billitem | varchar2(181) |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | futuredays | futuredays | futuredays | number(38, 0) |
| 9 | glclcamount | glclcamount | glclcamount | number(28, 8) |
| 10 | glcrate | glcrate | glcrate | number(28, 8) |
| 11 | gllclcamount | gllclcamount | gllclcamount | number(28, 8) |
| 12 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 13 | goodsitem | goodsitem | goodsitem | varchar2(181) |
| 14 | isbatch | isbatch | isbatch | char(1) |
| 15 | isinitial | isinitial | isinitial | char(1) |
| 16 | isoverflow | isoverflow | isoverflow | char(1) |
| 17 | latestdeliverdate | latestdeliverdate | latestdeliverdate | char(19) |
| 18 | latestshippingdate | latestshippingdate | latestshippingdate | char(19) |
| 19 | lcamount | lcamount | lcamount | number(28, 8) |
| 20 | lcno | lcno | lcno | varchar2(20) |  |  | '~' |
| 21 | lcremark | lcremark | lcremark | varchar2(181) |
| 22 | lcstatus | lcstatus | lcstatus | varchar2(50) |
| 23 | lowscale | lowscale | lowscale | number(28, 8) |
| 24 | olclcamount | olclcamount | olclcamount | number(28, 8) |
| 25 | olcrate | olcrate | olcrate | number(28, 8) |
| 26 | otheritem | otheritem | otheritem | varchar2(181) |
| 27 | overscale | overscale | overscale | number(28, 8) |
| 28 | paytype | paytype | paytype | number(38, 0) |
| 29 | pk_advisingbank | pk_advisingbank | pk_advisingbank | varchar2(20) |  |  | '~' |
| 30 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 31 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 32 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 33 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 34 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 35 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 36 | pk_issuingbank | pk_issuingbank | pk_issuingbank | varchar2(50) |  |  | '~' |
| 37 | pk_lccurrtype | pk_lccurrtype | pk_lccurrtype | varchar2(20) |  |  | '~' |
| 38 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 39 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 40 | pk_receivebank | pk_receivebank | pk_receivebank | varchar2(20) |  |  | '~' |
| 41 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 42 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |
| 43 | postponetype | postponetype | postponetype | number(38, 0) |
| 44 | priceitem | priceitem | priceitem | varchar2(181) |
| 45 | receivedate | receivedate | receivedate | char(19) |
| 46 | receivemodifydate | receivemodifydate | receivemodifydate | char(19) |
| 47 | remark | remark | remark | varchar2(181) |
| 48 | specifydate | specifydate | specifydate | char(19) |
| 49 | validdate | validdate | validdate | char(19) |
| 50 | vbillno | vbillno | vbillno | varchar2(40) |
| 51 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 52 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 53 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 54 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 55 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 56 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 57 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 58 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 59 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 60 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 61 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 62 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 63 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 64 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 65 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 66 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 67 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 68 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 69 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 70 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 71 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 72 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 73 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 74 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 75 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 76 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 77 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 78 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 79 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 80 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 81 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 82 | creationtime | creationtime | creationtime | char(19) |
| 83 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 84 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 85 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 86 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 87 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |