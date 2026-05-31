# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8425.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountstart | pk_accountstart | pk_accountstart | char(20) | √ |
| 2 | creditamount | creditamount | creditamount | number(28, 8) |
| 3 | debitamount | debitamount | debitamount | number(28, 8) |
| 4 | period | period | period | varchar2(20) |
| 5 | pk_contrastaccount | pk_contrastaccount | pk_contrastaccount | varchar2(20) |  |  | '~' |
| 6 | startdate | startdate | startdate | char(10) |
| 7 | status | status | status | char(1) |
| 8 | stopdate | stopdate | stopdate | char(10) |
| 9 | years | years | years | varchar2(20) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |