# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11950.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_configuration | pk_configuration | pk_configuration | char(20) | √ |
| 2 | impclassname | impclassname | impclassname | varchar2(200) |
| 3 | jumpposition | jumpposition | jumpposition | number(38, 0) |
| 4 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 5 | pk_busiactivity | pk_busiactivity | pk_busiactivity | varchar2(50) |
| 6 | pk_taskstate | pk_taskstate | pk_taskstate | varchar2(50) |
| 7 | repmethods | repmethods | repmethods | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |