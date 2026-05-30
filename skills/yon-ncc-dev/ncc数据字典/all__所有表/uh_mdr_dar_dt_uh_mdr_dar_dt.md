# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12644.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | bedcode | bedcode | bedcode | varchar2(50) |
| 2 | dt_sex | dt_sex | dt_sex | varchar2(10) |
| 3 | eu_type | eu_type | eu_type | char(1) |
| 4 | flag_mi | flag_mi | flag_mi | char(1) |
| 5 | note | note | note | varchar2(100) |
| 6 | patiname | patiname | patiname | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 8 | pk_mdrdar | pk_mdrdar | pk_mdrdar | char(20) | √ |
| 9 | pk_mdrdar_dt | pk_mdrdar_dt | pk_mdrdar_dt | char(20) | √ |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_pati | pk_pati | pk_pati | char(20) |
| 12 | pk_pv | pk_pv | pk_pv | char(20) |
| 13 | pk_sex | pk_sex | pk_sex | char(20) |
| 14 | pvcode | pvcode | pvcode | varchar2(50) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |