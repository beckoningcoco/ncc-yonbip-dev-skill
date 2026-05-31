# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12703.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ehrretr | pk_ehrretr | pk_ehrretr | char(20) | √ |
| 2 | date_read | date_read | date_read | char(19) |
| 3 | func | func | func | varchar2(50) |
| 4 | name_psn_read | name_psn_read | name_psn_read | varchar2(50) |
| 5 | note | note | note | varchar2(256) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_read | pk_org_read | pk_org_read | varchar2(20) | √ |
| 9 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 10 | pk_piehr | pk_piehr | pk_piehr | varchar2(20) |  |  | '~' |
| 11 | pk_psn_read | pk_psn_read | pk_psn_read | varchar2(20) |  |  | '~' |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |