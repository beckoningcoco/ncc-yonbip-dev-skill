# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12694.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paticreddt | pk_paticreddt | pk_paticreddt | char(20) | √ |
| 2 | amt_cred | amt_cred | amt_cred | number(14, 2) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | check_status | check_status | check_status | number(38, 0) |
| 5 | date_chk | date_chk | date_chk | char(19) |
| 6 | date_entry | date_entry | date_entry | char(19) |
| 7 | eu_credtype | eu_credtype | eu_credtype | number(38, 0) |
| 8 | eu_direct | eu_direct | eu_direct | number(38, 0) |
| 9 | name_psn_chk | name_psn_chk | name_psn_chk | varchar2(50) |
| 10 | name_psn_entry | name_psn_entry | name_psn_entry | varchar2(50) |
| 11 | note | note | note | varchar2(256) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 15 | pk_patiacc | pk_patiacc | pk_patiacc | char(20) | √ |
| 16 | pk_psn_chk | pk_psn_chk | pk_psn_chk | varchar2(20) |  |  | '~' |
| 17 | pk_psn_entry | pk_psn_entry | pk_psn_entry | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |