# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8471.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convertrate | pk_convertrate | pk_convertrate | char(20) | √ |
| 2 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 3 | pk_accsubj | pk_accsubj | pk_accsubj | char(20) |
| 4 | pk_convertrule | pk_convertrule | pk_convertrule | char(20) |
| 5 | pk_financeorg | pk_financeorg | pk_financeorg | char(20) |
| 6 | pk_group | pk_group | pk_group | char(20) |
| 7 | pk_subjtype | pk_subjtype | pk_subjtype | char(20) |
| 8 | rate | rate | rate | number(15, 8) |
| 9 | ratetype | ratetype | ratetype | char(1) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | char(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | char(20) |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |