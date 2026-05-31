# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9621.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_property | pk_property | pk_property | char(20) | √ |
| 2 | pk_graph | pk_graph | pk_graph | varchar2(20) | √ |
| 3 | properties | properties | properties | blob |
| 4 | def1 | def1 | def1 | varchar2(50) |
| 5 | def2 | def2 | def2 | varchar2(50) |
| 6 | def3 | def3 | def3 | varchar2(50) |
| 7 | def4 | def4 | def4 | varchar2(50) |
| 8 | def5 | def5 | def5 | varchar2(50) |
| 9 | creationtime | creationtime | creationtime | varchar2(19) |
| 10 | creator | creator | creator | varchar2(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |