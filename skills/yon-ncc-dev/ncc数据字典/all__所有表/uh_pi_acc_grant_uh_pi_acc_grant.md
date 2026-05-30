# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12686.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accgrant | pk_accgrant | pk_accgrant | char(20) | √ |
| 2 | date_entry | date_entry | date_entry | char(19) |
| 3 | flag_active | flag_active | flag_active | char(1) |
| 4 | name_psn_input | name_psn_input | name_psn_input | varchar2(50) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 8 | pk_patiacc | pk_patiacc | pk_patiacc | varchar2(20) |  |  | '~' |
| 9 | pk_pati_grant | pk_pati_grant | pk_pati_grant | varchar2(20) |  |  | '~' |
| 10 | pk_psn_input | pk_psn_input | pk_psn_input | varchar2(20) |  |  | '~' |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |