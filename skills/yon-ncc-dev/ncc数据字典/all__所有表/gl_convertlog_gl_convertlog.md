# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8469.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | converttime | converttime | converttime | char(19) |
| 2 | failreason | failreason | failreason | number(38, 0) |
| 3 | isoccur | isoccur | isoccur | char(1) |
| 4 | issuccess | issuccess | issuccess | char(1) |
| 5 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 6 | pk_dessob | pk_dessob | pk_dessob | char(20) |
| 7 | pk_desvoucher | pk_desvoucher | pk_desvoucher | char(20) |
| 8 | pk_fcrule | pk_fcrule | pk_fcrule | char(20) |
| 9 | pk_group | pk_group | pk_group | char(20) |
| 10 | pk_org | pk_org | pk_org | char(20) |
| 11 | pk_srcsob | pk_srcsob | pk_srcsob | char(20) |
| 12 | pk_srcvoucher | pk_srcvoucher | pk_srcvoucher | char(20) | √ |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | char(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | char(20) |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |