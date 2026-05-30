# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10929.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_itfextend | pk_itfextend | pk_itfextend | char(20) | √ |
| 2 | canserialize | canserialize | canserialize | char(1) |  |  | 'Y' |
| 3 | comp | comp | comp | varchar2(50) |
| 4 | devmodule | devmodule | devmodule | varchar2(200) |
| 5 | implclassname | implclassname | implclassname | varchar2(200) |
| 6 | itfclassname | itfclassname | itfclassname | varchar2(200) | √ |
| 7 | memo | memo | memo | varchar2(1024) |
| 8 | operorder | operorder | operorder | number(38, 0) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |