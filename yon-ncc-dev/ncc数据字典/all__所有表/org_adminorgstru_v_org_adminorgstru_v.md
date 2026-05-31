# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10147.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | pk_vid | pk_vid | char(20) | √ |
| 2 | islastversion | islastversion | islastversion | char(1) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | venddate | venddate | venddate | char(19) |
| 5 | vname | vname | vname | varchar2(75) |
| 6 | vno | vno | vno | varchar2(50) |
| 7 | vstartdate | vstartdate | vstartdate | char(19) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |