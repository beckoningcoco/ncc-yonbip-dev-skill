# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12629.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hosmadmed | pk_hosmadmed | pk_hosmadmed | char(20) | √ |
| 2 | cate_med | cate_med | cate_med | varchar2(3) |
| 3 | code_med | code_med | code_med | varchar2(20) |
| 4 | country_med | country_med | country_med | varchar2(100) |
| 5 | date_report | date_report | date_report | char(19) |
| 6 | days | days | days | varchar2(8) |
| 7 | dosage | dosage | dosage | varchar2(8) |
| 8 | dosageform | dosageform | dosageform | varchar2(20) |
| 9 | dose_unit | dose_unit | dose_unit | varchar2(20) |
| 10 | freq | freq | freq | varchar2(100) |
| 11 | homemade_med | homemade_med | homemade_med | varchar2(3) |
| 12 | hpcode | hpcode | hpcode | varchar2(50) |
| 13 | med_com_name | med_com_name | med_com_name | varchar2(100) |
| 14 | name_med | name_med | name_med | varchar2(100) |
| 15 | pinyincode | pinyincode | pinyincode | varchar2(8) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | psn_oper | psn_oper | psn_oper | varchar2(20) |
| 20 | specif | specif | specif | varchar2(100) |
| 21 | status_report | status_report | status_report | number(38, 0) |
| 22 | unit | unit | unit | varchar2(10) |
| 23 | usage | usage | usage | varchar2(100) |
| 24 | wubicode | wubicode | wubicode | varchar2(8) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |