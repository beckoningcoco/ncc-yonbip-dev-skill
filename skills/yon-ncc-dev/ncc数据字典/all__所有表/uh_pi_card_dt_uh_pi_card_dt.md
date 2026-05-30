# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12691.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paticarddt | pk_paticarddt | pk_paticarddt | char(20) | √ |
| 2 | code_card | code_card | code_card | varchar2(30) |
| 3 | code_card_new | code_card_new | code_card_new | varchar2(30) |
| 4 | date_entry | date_entry | date_entry | char(19) |
| 5 | eu_cardoptype | eu_cardoptype | eu_cardoptype | varchar2(50) |
| 6 | name_psn | name_psn | name_psn | varchar2(50) |
| 7 | note | note | note | varchar2(256) |
| 8 | pk_cardtype | pk_cardtype | pk_cardtype | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 12 | pk_paticard | pk_paticard | pk_paticard | varchar2(20) |  |  | '~' |
| 13 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |