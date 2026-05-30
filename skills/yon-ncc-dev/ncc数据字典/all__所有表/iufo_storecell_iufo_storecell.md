# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9694.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_package | pk_package | pk_package | char(20) | √ |
| 2 | dbtables | dbtables | dbtables | blob |
| 3 | pk_keygroup | pk_keygroup | pk_keygroup | char(20) |
| 4 | pk_report | pk_report | pk_report | char(20) |
| 5 | storecells | storecells | storecells | blob |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |