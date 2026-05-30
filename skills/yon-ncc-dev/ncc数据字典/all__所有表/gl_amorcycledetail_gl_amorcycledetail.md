# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8427.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cycledetail | pk_cycledetail | pk_cycledetail | varchar2(50) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | no | no | no | number(38, 0) |
| 4 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |
| 5 | pk_accperiodmonth | pk_accperiodmonth | pk_accperiodmonth | varchar2(50) |
| 6 | pk_amorcycle | pk_amorcycle | pk_amorcycle | char(20) | √ |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |
| 9 | pk_voucher | pk_voucher | pk_voucher | varchar2(50) |
| 10 | rate | rate | rate | number(28, 8) |
| 11 | remarks | remarks | remarks | varchar2(1000) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |