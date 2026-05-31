# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8620.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_appconf_item | pk_appconf_item | pk_appconf_item | char(20) | √ |
| 2 | entry_approval | entry_approval | entry_approval | char(1) |
| 3 | entry_card_show | entry_card_show | entry_card_show | char(1) |
| 4 | entry_editable | entry_editable | entry_editable | char(1) |
| 5 | entry_list_show | entry_list_show | entry_list_show | char(1) |
| 6 | entry_not_null | entry_not_null | entry_not_null | char(1) |
| 7 | manager_card_show | manager_card_show | manager_card_show | char(1) |
| 8 | manager_list_show | manager_list_show | manager_list_show | char(1) |
| 9 | pk_appconf_set | pk_appconf_set | pk_appconf_set | char(20) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_infoset_item | pk_infoset_item | pk_infoset_item | char(20) |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | unentry_card_show | unentry_card_show | unentry_card_show | char(1) |
| 14 | unentry_editable | unentry_editable | unentry_editable | char(1) |
| 15 | unentry_list_show | unentry_list_show | unentry_list_show | char(1) |
| 16 | unentry_not_null | unentry_not_null | unentry_not_null | char(1) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |