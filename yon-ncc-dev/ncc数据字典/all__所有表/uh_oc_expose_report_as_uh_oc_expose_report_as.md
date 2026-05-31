# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12655.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | alt | alt | alt | varchar2(50) |
| 2 | expose_grade | expose_grade | expose_grade | varchar2(50) |
| 3 | expose_source | expose_source | expose_source | varchar2(50) |
| 4 | flag_prm | flag_prm | flag_prm | varchar2(50) |
| 5 | flag_side | flag_side | flag_side | varchar2(50) |
| 6 | pk_oc_expose_report | pk_oc_expose_report | pk_oc_expose_report | char(20) | √ |
| 7 | pk_oc_expose_report_as | pk_oc_expose_report_as | pk_oc_expose_report_as | char(50) | √ |
| 8 | rft | rft | rft | varchar2(50) |
| 9 | side_effect_note | side_effect_note | side_effect_note | varchar2(50) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |