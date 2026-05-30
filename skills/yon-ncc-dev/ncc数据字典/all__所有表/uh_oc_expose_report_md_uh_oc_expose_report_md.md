# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12661.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | end_time | end_time | end_time | varchar2(50) |
| 2 | medicine_name | medicine_name | medicine_name | varchar2(50) |
| 3 | num | num | num | varchar2(50) |
| 4 | pk_medicine | pk_medicine | pk_medicine | varchar2(50) |
| 5 | pk_oc_expose_report | pk_oc_expose_report | pk_oc_expose_report | char(20) | √ |
| 6 | pk_oc_expose_report_md | pk_oc_expose_report_md | pk_oc_expose_report_md | char(20) | √ |
| 7 | start_time | start_time | start_time | varchar2(50) |
| 8 | unit | unit | unit | varchar2(50) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |