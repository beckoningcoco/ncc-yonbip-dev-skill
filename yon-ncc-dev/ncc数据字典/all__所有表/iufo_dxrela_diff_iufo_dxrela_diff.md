# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9607.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_difrule | pk_difrule | pk_difrule | char(20) | √ |
| 2 | code | code | code | varchar2(500) |
| 3 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 4 | diffvalue | diffvalue | diffvalue | number(28, 8) |
| 5 | name | name | name | varchar2(750) |
| 6 | name2 | name2 | name2 | varchar2(750) |
| 7 | name3 | name3 | name3 | varchar2(750) |
| 8 | name4 | name4 | name4 | varchar2(750) |
| 9 | name5 | name5 | name5 | varchar2(750) |
| 10 | name6 | name6 | name6 | varchar2(750) |
| 11 | pk_dxrelation | pk_dxrelation | pk_dxrelation | varchar2(20) |  |  | '~' |
| 12 | pk_dxscheme | pk_dxscheme | pk_dxscheme | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | preferredorg | preferredorg | preferredorg | varchar2(20) |  |  | '~' |
| 16 | rule_type | rule_type | rule_type | varchar2(50) |
| 17 | sealflag | sealflag | sealflag | char(1) |
| 18 | upreferredorg | upreferredorg | upreferredorg | varchar2(20) |
| 19 | usedflag | usedflag | usedflag | char(1) |  |  | 'Y' |
| 20 | voucher_type | voucher_type | voucher_type | varchar2(50) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |