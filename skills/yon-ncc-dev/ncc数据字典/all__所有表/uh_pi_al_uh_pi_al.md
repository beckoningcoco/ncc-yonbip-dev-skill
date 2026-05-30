# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12688.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patial | pk_patial | pk_patial | char(20) | √ |
| 2 | date_al | date_al | date_al | char(19) |
| 3 | date_entry | date_entry | date_entry | char(19) |
| 4 | dt_altype | dt_altype | dt_altype | char(20) |
| 5 | eu_mcsrc | eu_mcsrc | eu_mcsrc | number(38, 0) |
| 6 | name_al | name_al | name_al | varchar2(50) |
| 7 | name_psn | name_psn | name_psn | varchar2(50) |
| 8 | note | note | note | varchar2(150) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_pati | pk_pati | pk_pati | char(20) |
| 12 | pk_psn | pk_psn | pk_psn | char(20) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |