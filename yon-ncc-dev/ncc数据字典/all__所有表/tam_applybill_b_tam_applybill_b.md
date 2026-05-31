# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11966.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_applychild | pk_applychild | pk_applychild | char(20) | √ |
| 2 | account_type | account_type | account_type | number(38, 0) |
| 3 | isconcerted | isconcerted | isconcerted | char(1) |
| 4 | isswapper | isswapper | isswapper | char(1) |
| 5 | money | money | money | number(28, 8) |
| 6 | overdraftype | overdraftype | overdraftype | number(38, 0) |
| 7 | pk_applybill | pk_applybill | pk_applybill | varchar2(20) |  |  | '~' |
| 8 | pk_bankaccsub | pk_bankaccsub | pk_bankaccsub | varchar2(20) |  |  | '~' |
| 9 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | protruding | protruding | protruding | number(28, 8) |
| 14 | sub_code | sub_code | sub_code | varchar2(60) |
| 15 | sub_name | sub_name | sub_name | varchar2(272) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |