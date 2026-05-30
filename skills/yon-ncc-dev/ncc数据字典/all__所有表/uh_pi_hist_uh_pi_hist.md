# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12712.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patihist | pk_patihist | pk_patihist | char(20) | √ |
| 2 | computer | computer | computer | varchar2(50) |
| 3 | date_edit | date_edit | date_edit | char(19) |
| 4 | desc_field | desc_field | desc_field | varchar2(50) |
| 5 | dt_pihisttype | dt_pihisttype | dt_pihisttype | varchar2(50) |
| 6 | ipaddr | ipaddr | ipaddr | varchar2(50) |
| 7 | name_filed | name_filed | name_filed | varchar2(50) |
| 8 | name_psn | name_psn | name_psn | varchar2(50) |
| 9 | note | note | note | varchar2(4000) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_exec | pk_org_exec | pk_org_exec | varchar2(20) |  |  | '~' |
| 13 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 14 | pk_pihisttype | pk_pihisttype | pk_pihisttype | varchar2(20) |  |  | '~' |
| 15 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 16 | val_new | val_new | val_new | varchar2(256) |
| 17 | val_old | val_old | val_old | varchar2(256) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |