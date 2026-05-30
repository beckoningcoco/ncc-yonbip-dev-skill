# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10318.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_uagroup | pk_uagroup | pk_uagroup | varchar2(50) | √ |
| 2 | cuserid | cuserid | cuserid | char(20) | √ |
| 3 | disabledate | disabledate | disabledate | char(10) |
| 4 | enabledate | enabledate | enabledate | char(10) | √ |
| 5 | pk_group | pk_group | pk_group | char(20) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |