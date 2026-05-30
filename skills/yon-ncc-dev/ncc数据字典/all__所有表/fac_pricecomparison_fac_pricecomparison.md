# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8083.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricecomparison | pk_pricecomparison | pk_pricecomparison | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestate | approvestate | approvestate | number(38, 0) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billmaketime | billmaketime | billmaketime | char(19) |
| 8 | billtype | billtype | billtype | varchar2(50) |
| 9 | busitype | busitype | busitype | varchar2(50) |
| 10 | depositamount | depositamount | depositamount | number(28, 8) |
| 11 | depositdate | depositdate | depositdate | char(19) |
| 12 | glcdepositamount | glcdepositamount | glcdepositamount | number(28, 8) |
| 13 | glcrate | glcrate | glcrate | number(15, 8) |
| 14 | gllcdepositamount | gllcdepositamount | gllcdepositamount | number(28, 8) |
| 15 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 16 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 17 | olcdepositamount | olcdepositamount | olcdepositamount | number(28, 8) |
| 18 | olcrate | olcrate | olcrate | number(15, 8) |
| 19 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 20 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | remark | remark | remark | varchar2(181) |
| 25 | rowno | rowno | rowno | varchar2(50) |
| 26 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 27 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 28 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 29 | saga_status | saga_status | saga_status | number(38, 0) |
| 30 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 31 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 32 | submitdate | submitdate | submitdate | char(19) |
| 33 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 34 | transtype | transtype | transtype | varchar2(50) |
| 35 | transtypepk | transtypepk | transtypepk | char(20) |
| 36 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 37 | vbillstate | vbillstate | vbillstate | number(38, 0) |
| 38 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 39 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 40 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 41 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 42 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 43 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 44 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 45 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 46 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 47 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 48 | creationtime | creationtime | creationtime | char(19) |
| 49 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |