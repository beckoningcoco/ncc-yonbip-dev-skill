# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7037.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnbankacc | pk_psnbankacc | pk_psnbankacc | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | id | id | id | varchar2(25) |
| 4 | idtype | idtype | idtype | varchar2(20) |
| 5 | isexpenseacc | isexpenseacc | isexpenseacc | char(1) |
| 6 | payacc | payacc | payacc | number(38, 0) |
| 7 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 8 | pk_bankaccsub | pk_bankaccsub | pk_bankaccsub | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |
| 11 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 12 | psnname | psnname | psnname | varchar2(200) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |