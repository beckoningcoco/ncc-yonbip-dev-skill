# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12404.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_blpay_prtrec | pk_blpay_prtrec | pk_blpay_prtrec | char(20) | √ |
| 2 | amuont | amuont | amuont | number(28, 8) |
| 3 | count | count | count | number(38, 0) |
| 4 | date_print | date_print | date_print | char(19) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 8 | sernum | sernum | sernum | varchar2(50) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |