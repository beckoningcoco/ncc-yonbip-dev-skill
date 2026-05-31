# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6916.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtype | pk_emrtype | pk_emrtype | char(20) | √ |
| 2 | code | code | code | varchar2(100) |
| 3 | code_std | code_std | code_std | varchar2(100) |
| 4 | eu_applyto | eu_applyto | eu_applyto | number(38, 0) |
| 5 | flag_sys | flag_sys | flag_sys | char(1) |
| 6 | innercode | innercode | innercode | varchar2(50) |
| 7 | name | name | name | varchar2(50) |
| 8 | note | note | note | varchar2(256) |
| 9 | pk_editor | pk_editor | pk_editor | varchar2(20) |  |  | '~' |
| 10 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_use | pk_org_use | pk_org_use | char(20) |  |  | '' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | sortno | sortno | sortno | varchar2(50) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |