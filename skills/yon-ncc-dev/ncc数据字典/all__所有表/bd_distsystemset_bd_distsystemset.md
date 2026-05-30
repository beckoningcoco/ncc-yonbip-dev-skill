# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6877.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distsystemset | pk_distsystemset | pk_distsystemset | char(20) | √ |
| 2 | distcode | distcode | distcode | varchar2(100) |
| 3 | distname | distname | distname | varchar2(100) |
| 4 | ismain | ismain | ismain | char(1) |  |  | 'N' |
| 5 | systemstatus | systemstatus | systemstatus | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |