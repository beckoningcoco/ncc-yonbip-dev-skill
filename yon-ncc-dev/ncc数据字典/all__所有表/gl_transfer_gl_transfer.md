# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8568.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transfer | pk_transfer | pk_transfer | char(20) | √ |
| 2 | billnum | billnum | billnum | number(38, 0) |
| 3 | cycletime | cycletime | cycletime | char(12) |
| 4 | execfreq | execfreq | execfreq | char(30) |
| 5 | note | note | note | varchar2(60) |
| 6 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 7 | pk_corp | pk_corp | pk_corp | char(4) |
| 8 | pk_glbook | pk_glbook | pk_glbook | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(50) |
| 10 | pk_operator | pk_operator | pk_operator | char(20) |
| 11 | pk_org | pk_org | pk_org | varchar2(50) |
| 12 | pk_system | pk_system | pk_system | varchar2(50) |
| 13 | pk_transsort | pk_transsort | pk_transsort | char(20) |
| 14 | pk_unit | pk_unit | pk_unit | char(20) |
| 15 | pk_vouchertype | pk_vouchertype | pk_vouchertype | char(20) |
| 16 | transferno | transferno | transferno | varchar2(28) |
| 17 | transfertype | transfertype | transfertype | char(20) |
| 18 | transfrequency | transfrequency | transfrequency | number(38, 0) |
| 19 | transtimelimit | transtimelimit | transtimelimit | varchar2(50) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | char(20) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | char(20) |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |