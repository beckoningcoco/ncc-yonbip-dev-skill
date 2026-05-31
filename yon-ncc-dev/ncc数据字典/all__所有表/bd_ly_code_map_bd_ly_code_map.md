# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6968.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lycodemap | pk_lycodemap | pk_lycodemap | char(20) | √ |
| 2 | cremethod | cremethod | cremethod | number(38, 0) |
| 3 | cretime | cretime | cretime | char(19) |
| 4 | dataitemcode | dataitemcode | dataitemcode | varchar2(256) |
| 5 | dataitemname | dataitemname | dataitemname | varchar2(256) |
| 6 | exter_value | exter_value | exter_value | varchar2(4000) |
| 7 | exter_value_name | exter_value_name | exter_value_name | varchar2(50) |
| 8 | inter_value | inter_value | inter_value | varchar2(4000) |
| 9 | inter_value_name | inter_value_name | inter_value_name | varchar2(50) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |