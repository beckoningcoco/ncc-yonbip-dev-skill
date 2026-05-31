# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7973.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_controlmode | pk_controlmode | pk_controlmode | char(20) | √ |
| 2 | pk_control | pk_control | pk_control | char(20) | √ |
| 3 | pk_controlmodedef | pk_controlmodedef | pk_controlmodedef | char(20) | √ |
| 4 | value | value | value | number(20, 8) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |