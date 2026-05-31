# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8510.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lastpagedata | pk_lastpagedata | pk_lastpagedata | char(20) | √ |
| 2 | assid | assid | assid | char(20) |
| 3 | averageprice | averageprice | averageprice | number(20, 8) |
| 4 | balancedirect | balancedirect | balancedirect | number(38, 0) |
| 5 | balcreditamount | balcreditamount | balcreditamount | number(20, 4) |
| 6 | balcreditfracamount | balcreditfracamount | balcreditfracamount | number(20, 4) |
| 7 | balcreditlocalamount | balcreditlocalamount | balcreditlocalamount | number(20, 4) |
| 8 | balcreditquant | balcreditquant | balcreditquant | number(20, 8) |
| 9 | baldebitamount | baldebitamount | baldebitamount | number(20, 4) |
| 10 | baldebitfracamount | baldebitfracamount | baldebitfracamount | number(20, 4) |
| 11 | baldebitlocalamount | baldebitlocalamount | baldebitlocalamount | number(20, 4) |
| 12 | baldebitquant | baldebitquant | baldebitquant | number(20, 8) |
| 13 | bothoriflag | bothoriflag | bothoriflag | char(1) |
| 14 | corpcode | corpcode | corpcode | varchar2(12) |
| 15 | corpname | corpname | corpname | varchar2(100) |
| 16 | creditamount | creditamount | creditamount | number(20, 4) |
| 17 | creditfracamount | creditfracamount | creditfracamount | number(20, 4) |
| 18 | creditlocalamount | creditlocalamount | creditlocalamount | number(20, 4) |
| 19 | creditquant | creditquant | creditquant | number(20, 8) |
| 20 | currtypename | currtypename | currtypename | varchar2(20) |
| 21 | dates | dates | dates | char(10) |
| 22 | daybak | daybak | daybak | char(10) |
| 23 | debitamount | debitamount | debitamount | number(20, 4) |
| 24 | debitfracamount | debitfracamount | debitfracamount | number(20, 4) |
| 25 | debitlocalamount | debitlocalamount | debitlocalamount | number(20, 4) |
| 26 | debitquant | debitquant | debitquant | number(20, 8) |
| 27 | digitnum | digitnum | digitnum | number(38, 0) |
| 28 | excrate1 | excrate1 | excrate1 | number(15, 8) |
| 29 | excrate2 | excrate2 | excrate2 | number(15, 8) |
| 30 | explanation | explanation | explanation | varchar2(200) |
| 31 | glbookcode | glbookcode | glbookcode | varchar2(60) |
| 32 | glbookname | glbookname | glbookname | varchar2(100) |
| 33 | glorgcode | glorgcode | glorgcode | varchar2(60) |
| 34 | glorgname | glorgname | glorgname | varchar2(100) |
| 35 | oppositesubj | oppositesubj | oppositesubj | varchar2(200) |
| 36 | period | period | period | char(2) |
| 37 | pk_accsubj | pk_accsubj | pk_accsubj | char(20) |
| 38 | pk_corp | pk_corp | pk_corp | char(4) |
| 39 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 40 | pk_glbook | pk_glbook | pk_glbook | char(20) |
| 41 | pk_glorg | pk_glorg | pk_glorg | char(20) |
| 42 | pk_glorgbook | pk_glorgbook | pk_glorgbook | char(20) |
| 43 | pk_querycondition | pk_querycondition | pk_querycondition | char(20) |
| 44 | pk_voucher | pk_voucher | pk_voucher | char(20) |
| 45 | pk_vouchertype | pk_vouchertype | pk_vouchertype | char(20) |
| 46 | price | price | price | number(20, 8) |
| 47 | rowproperty | rowproperty | rowproperty | char(2) |
| 48 | settleinfo | settleinfo | settleinfo | varchar2(100) |
| 49 | subfieldproperty | subfieldproperty | subfieldproperty | char(2) |
| 50 | subjcode | subjcode | subjcode | varchar2(30) |
| 51 | subjdirect | subjdirect | subjdirect | number(38, 0) |
| 52 | subjname | subjname | subjname | varchar2(40) |
| 53 | voucherno | voucherno | voucherno | varchar2(20) |
| 54 | vouchertypename | vouchertypename | vouchertypename | varchar2(20) |
| 55 | year | year | year | char(4) |
| 56 | free1 | free1 | free1 | varchar2(60) |
| 57 | free2 | free2 | free2 | varchar2(60) |
| 58 | free3 | free3 | free3 | varchar2(60) |
| 59 | free4 | free4 | free4 | varchar2(60) |
| 60 | free5 | free5 | free5 | varchar2(60) |
| 61 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 62 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |