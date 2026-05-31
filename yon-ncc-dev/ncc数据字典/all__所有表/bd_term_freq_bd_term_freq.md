# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7116.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freq | pk_freq | pk_freq | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billno | billno | billno | varchar2(50) |
| 8 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 9 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 10 | busitype | busitype | busitype | varchar2(50) |
| 11 | dt_frequnit | dt_frequnit | dt_frequnit | varchar2(50) |
| 12 | emendenum | emendenum | emendenum | number(38, 0) |
| 13 | flag_day_bill | flag_day_bill | flag_day_bill | char(1) |
| 14 | flag_day_bill_clinic | flag_day_bill_clinic | flag_day_bill_clinic | char(1) |  |  | 'N' |
| 15 | flag_day_bill_drug | flag_day_bill_drug | flag_day_bill_drug | char(1) |
| 16 | freqcode | freqcode | freqcode | varchar2(30) | √ |
| 17 | freqct | freqct | freqct | number(38, 0) | √ |
| 18 | freqdesc | freqdesc | freqdesc | varchar2(256) |
| 19 | freqname | freqname | freqname | varchar2(200) | √ |
| 20 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 21 | maketime | maketime | maketime | char(19) |
| 22 | mnecode | mnecode | mnecode | varchar2(30) |
| 23 | pk_frequnit | pk_frequnit | pk_frequnit | varchar2(20) |  |  | '~' |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 28 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 29 | transtype | transtype | transtype | varchar2(50) |
| 30 | transtypepk | transtypepk | transtypepk | varchar2(20) |  |  | '~' |
| 31 | unitct | unitct | unitct | number(38, 0) | √ |
| 32 | creationtime | creationtime | creationtime | char(19) |
| 33 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 36 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |