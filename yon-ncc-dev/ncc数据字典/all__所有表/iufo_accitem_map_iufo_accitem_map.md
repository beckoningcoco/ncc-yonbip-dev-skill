# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9483.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_map | pk_map | pk_map | char(20) | √ |
| 2 | dsname | dsname | dsname | varchar2(50) |
| 3 | issyncdoc | issyncdoc | issyncdoc | char(1) |
| 4 | itemno | itemno | itemno | number(38, 0) |
| 5 | mapcolumn | mapcolumn | mapcolumn | varchar2(50) |
| 6 | metadataid | metadataid | metadataid | varchar2(100) |
| 7 | pk_map_assaccitem | pk_map_assaccitem | pk_map_assaccitem | varchar2(20) |  |  | '~' |
| 8 | pk_owen_assaccitem | pk_owen_assaccitem | pk_owen_assaccitem | varchar2(20) |  |  | '~' |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |