# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12656.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | flag_exresult | flag_exresult | flag_exresult | varchar2(50) |
| 2 | pk_oc_expose_report | pk_oc_expose_report | pk_oc_expose_report | char(20) | √ |
| 3 | pk_oc_expose_report_cl | pk_oc_expose_report_cl | pk_oc_expose_report_cl | char(20) | √ |
| 4 | symptom | symptom | symptom | varchar2(50) |
| 5 | creationtime | creationtime | creationtime | char(19) |
| 6 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 9 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |