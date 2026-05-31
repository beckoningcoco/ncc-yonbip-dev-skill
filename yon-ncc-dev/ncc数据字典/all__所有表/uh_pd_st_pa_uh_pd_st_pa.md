# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12679.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpa | pk_pdpa | pk_pdpa | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | date_chk | date_chk | date_chk | char(19) |
| 4 | date_entry | date_entry | date_entry | char(19) |
| 5 | date_pa | date_pa | date_pa | char(19) |
| 6 | dt_pdpatype | dt_pdpatype | dt_pdpatype | varchar2(50) |
| 7 | eu_status | eu_status | eu_status | number(38, 0) |
| 8 | flag_active | flag_active | flag_active | char(1) |
| 9 | flag_chk | flag_chk | flag_chk | char(1) |
| 10 | name | name | name | varchar2(50) |
| 11 | note | note | note | varchar2(50) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_psn_chk | pk_psn_chk | pk_psn_chk | varchar2(20) |  |  | '~' |
| 15 | pk_psn_pa | pk_psn_pa | pk_psn_pa | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |