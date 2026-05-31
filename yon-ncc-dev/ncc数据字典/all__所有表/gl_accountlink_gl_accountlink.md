# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8423.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountlink | pk_accountlink | pk_accountlink | char(20) | √ |
| 2 | bankaccount | bankaccount | bankaccount | varchar2(20) |
| 3 | bankno | bankno | bankno | varchar2(50) |
| 4 | creditamount | creditamount | creditamount | number(28, 8) |
| 5 | debitamount | debitamount | debitamount | number(28, 8) |
| 6 | memo | memo | memo | varchar2(750) |
| 7 | memo1 | memo1 | memo1 | varchar2(150) |
| 8 | memo2 | memo2 | memo2 | varchar2(150) |
| 9 | memo3 | memo3 | memo3 | varchar2(150) |
| 10 | period | period | period | varchar2(20) |
| 11 | pk_accbank | pk_accbank | pk_accbank | varchar2(20) |
| 12 | pk_ass | pk_ass | pk_ass | varchar2(20) |
| 13 | pk_contrastaccount | pk_contrastaccount | pk_contrastaccount | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 17 | pk_subject | pk_subject | pk_subject | varchar2(20) |
| 18 | years | years | years | varchar2(20) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |