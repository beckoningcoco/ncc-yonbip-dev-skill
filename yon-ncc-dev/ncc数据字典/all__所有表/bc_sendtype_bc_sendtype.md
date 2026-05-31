# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6696.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_type | pk_type | pk_type | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 3 | bisred | bisred | bisred | char(1) |
| 4 | vsystype | vsystype | vsystype | number(38, 0) |
| 5 | creationtime | creationtime | creationtime | char(19) |
| 6 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 9 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |