# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12628.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hosapply | pk_hosapply | pk_hosapply | char(20) | √ |
| 2 | apply_cate | apply_cate | apply_cate | varchar2(3) |
| 3 | date_apply | date_apply | date_apply | char(19) |
| 4 | date_begin | date_begin | date_begin | char(19) |
| 5 | date_end | date_end | date_end | char(19) |
| 6 | date_report | date_report | date_report | char(19) |
| 7 | date_upload | date_upload | date_upload | char(19) |
| 8 | flag_cancel | flag_cancel | flag_cancel | char(1) |
| 9 | flag_upload | flag_upload | flag_upload | char(1) |
| 10 | hosname | hosname | hosname | varchar2(50) |
| 11 | hos_level | hos_level | hos_level | varchar2(3) |
| 12 | hos_opinion | hos_opinion | hos_opinion | varchar2(100) |
| 13 | hpcode | hpcode | hpcode | varchar2(50) |
| 14 | hpitemcode | hpitemcode | hpitemcode | varchar2(20) |
| 15 | hpitemname | hpitemname | hpitemname | varchar2(50) |
| 16 | idno | idno | idno | varchar2(18) |
| 17 | num_apply | num_apply | num_apply | varchar2(6) |
| 18 | num_personal | num_personal | num_personal | varchar2(14) |
| 19 | num_unit | num_unit | num_unit | varchar2(14) |
| 20 | patiname | patiname | patiname | varchar2(20) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 23 | pk_hpitem | pk_hpitem | pk_hpitem | varchar2(50) |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_srv | pk_srv | pk_srv | varchar2(50) |
| 26 | psn_oper | psn_oper | psn_oper | varchar2(20) |
| 27 | srvcode | srvcode | srvcode | varchar2(20) |
| 28 | srvname | srvname | srvname | varchar2(100) |
| 29 | status_report | status_report | status_report | number(38, 0) |
| 30 | zylsh | zylsh | zylsh | varchar2(18) |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |