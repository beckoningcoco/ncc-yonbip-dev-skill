# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8621.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_appconf_set | pk_appconf_set | pk_appconf_set | char(20) | √ |
| 2 | entry_approval | entry_approval | entry_approval | char(1) |
| 3 | entry_edit | entry_edit | entry_edit | char(1) |
| 4 | entry_not_null | entry_not_null | entry_not_null | char(1) |
| 5 | entry_show | entry_show | entry_show | char(1) |
| 6 | manager_show | manager_show | manager_show | char(1) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_infoset | pk_infoset | pk_infoset | char(20) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | unentry_edit | unentry_edit | unentry_edit | char(1) |
| 11 | unentry_not_null | unentry_not_null | unentry_not_null | char(1) |
| 12 | unentry_show | unentry_show | unentry_show | char(1) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |