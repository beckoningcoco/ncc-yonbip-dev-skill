# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12086.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | bigclass | bigclass | bigclass | char(20) | √ |
| 3 | issystem | issystem | issystem | char(1) | √ |
| 4 | objcode | objcode | objcode | varchar2(50) | √ |
| 5 | objname | objname | objname | varchar2(50) | √ |
| 6 | pk_mdsheet | pk_mdsheet | pk_mdsheet | varchar2(20) |
| 7 | ruletype | ruletype | ruletype | number(38, 0) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |