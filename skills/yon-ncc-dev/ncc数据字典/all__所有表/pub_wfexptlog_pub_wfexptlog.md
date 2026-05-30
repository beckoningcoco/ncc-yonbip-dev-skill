# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11012.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exptlog | pk_exptlog | pk_exptlog | char(20) | √ |
| 2 | billno | billno | billno | varchar2(256) |
| 3 | billtype | billtype | billtype | varchar2(20) |
| 4 | content | content | content | varchar2(600) |
| 5 | flowname | flowname | flowname | varchar2(200) |
| 6 | flowtype | flowtype | flowtype | number(38, 0) |
| 7 | msghint | msghint | msghint | varchar2(100) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |