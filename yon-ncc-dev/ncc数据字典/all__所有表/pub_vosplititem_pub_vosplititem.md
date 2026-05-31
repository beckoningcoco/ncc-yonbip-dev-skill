# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11009.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vosplititem | pk_vosplititem | pk_vosplititem | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(20) |
| 3 | dest_billtype | dest_billtype | dest_billtype | varchar2(20) |
| 4 | ismust | ismust | ismust | char(1) |
| 5 | item | item | item | varchar2(256) |
| 6 | itemtype | itemtype | itemtype | number(38, 0) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |