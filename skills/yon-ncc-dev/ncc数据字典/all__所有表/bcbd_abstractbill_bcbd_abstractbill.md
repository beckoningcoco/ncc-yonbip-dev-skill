# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6638.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bill | pk_bill | pk_bill | char(20) | √ |
| 2 | bc_03 | bc_03 | bc_03 | varchar2(50) |
| 3 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 4 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |