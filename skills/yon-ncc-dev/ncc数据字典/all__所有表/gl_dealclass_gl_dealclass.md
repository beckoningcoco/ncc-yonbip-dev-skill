# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8479.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dealclass | pk_dealclass | pk_dealclass | char(20) | √ |
| 2 | classname | classname | classname | varchar2(200) |
| 3 | classno | classno | classno | number(38, 0) |
| 4 | ispublic | ispublic | ispublic | char(1) |
| 5 | moduleid | moduleid | moduleid | varchar2(20) |
| 6 | modules | modules | modules | varchar2(20) |
| 7 | modulgroup | modulgroup | modulgroup | varchar2(50) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |