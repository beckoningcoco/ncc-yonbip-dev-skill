# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12709.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patifmtrans | pk_patifmtrans | pk_patifmtrans | char(20) | √ |
| 2 | date_transin | date_transin | date_transin | char(19) |
| 3 | date_transout | date_transout | date_transout | char(19) |
| 4 | note | note | note | varchar2(256) |
| 5 | note_trans | note_trans | note_trans | varchar2(256) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_transin | pk_org_transin | pk_org_transin | varchar2(20) |  |  | '~' |
| 9 | pk_org_transout | pk_org_transout | pk_org_transout | varchar2(20) |  |  | '~' |
| 10 | pk_patifm | pk_patifm | pk_patifm | varchar2(20) |  |  | '~' |
| 11 | pk_psn_phy_transin | pk_psn_phy_transin | pk_psn_phy_transin | varchar2(20) |  |  | '~' |
| 12 | pk_psn_phy_transout | pk_psn_phy_transout | pk_psn_phy_transout | varchar2(20) |  |  | '~' |
| 13 | pk_psn_transin | pk_psn_transin | pk_psn_transin | varchar2(20) |  |  | '~' |
| 14 | pk_psn_transout | pk_psn_transout | pk_psn_transout | varchar2(20) |  |  | '~' |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |