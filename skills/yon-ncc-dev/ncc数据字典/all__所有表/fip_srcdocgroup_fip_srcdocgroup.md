# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8329.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srcdocgroup | pk_srcdocgroup | pk_srcdocgroup | char(20) | √ |
| 2 | docindex | docindex | docindex | number(38, 0) |
| 3 | pk_classview | pk_classview | pk_classview | char(20) | √ |
| 4 | pk_srcdocid | pk_srcdocid | pk_srcdocid | varchar2(36) |  |  | '~' |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |