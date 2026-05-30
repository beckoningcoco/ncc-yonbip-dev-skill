# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6561.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | bcmapid | bcmapid | bcmapid | char(20) | √ |
| 2 | dest_billid | dest_billid | dest_billid | char(20) |
| 3 | dest_billtype | dest_billtype | dest_billtype | varchar2(20) |
| 4 | src_billid | src_billid | src_billid | char(20) |
| 5 | src_billtype | src_billtype | src_billtype | varchar2(20) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |