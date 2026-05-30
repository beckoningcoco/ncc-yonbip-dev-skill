# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7145.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hp | pk_hp | pk_hp | char(20) | √ |
| 2 | class_name | class_name | class_name | varchar2(200) |
| 3 | class_name_java | class_name_java | class_name_java | varchar2(200) |
| 4 | class_name_readcard | class_name_readcard | class_name_readcard | varchar2(200) |
| 5 | code | code | code | varchar2(50) |
| 6 | dt_icmode_prop | dt_icmode_prop | dt_icmode_prop | varchar2(50) |
| 7 | dt_icmode_ratio | dt_icmode_ratio | dt_icmode_ratio | varchar2(50) |
| 8 | eu_selmd | eu_selmd | eu_selmd | varchar2(50) |
| 9 | flag_active | flag_active | flag_active | char(1) |
| 10 | flag_insur_ip | flag_insur_ip | flag_insur_ip | char(1) |  |  | 'N' |
| 11 | flag_insur_op | flag_insur_op | flag_insur_op | char(1) |  |  | 'N' |
| 12 | flag_ip_active | flag_ip_active | flag_ip_active | char(1) |  |  | 'Y' |
| 13 | flag_op_active | flag_op_active | flag_op_active | char(1) |  |  | 'Y' |
| 14 | icfunc_prop | icfunc_prop | icfunc_prop | varchar2(50) |
| 15 | icfunc_ratio | icfunc_ratio | icfunc_ratio | varchar2(50) |
| 16 | innercode | innercode | innercode | varchar2(50) |
| 17 | mnecode | mnecode | mnecode | varchar2(50) |
| 18 | name | name | name | varchar2(200) |
| 19 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_hp_link | pk_hp_link | pk_hp_link | varchar2(20) |  |  | '~' |
| 22 | pk_icmode_prop | pk_icmode_prop | pk_icmode_prop | varchar2(20) |  |  | '~' |
| 23 | pk_icmode_ratio | pk_icmode_ratio | pk_icmode_ratio | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_payer | pk_payer | pk_payer | varchar2(20) |  |  | '~' |
| 26 | ratio | ratio | ratio | number(14, 2) |
| 27 | creationtime | creationtime | creationtime | char(19) |
| 28 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 31 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |