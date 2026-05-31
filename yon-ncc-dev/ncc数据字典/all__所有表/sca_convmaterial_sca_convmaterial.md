# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11398.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convmaterial | pk_convmaterial | pk_convmaterial | char(20) | √ |
| 2 | cmaterialclass | cmaterialclass | cmaterialclass | varchar2(20) |  |  | '~' |
| 3 | convmaterial | convmaterial | convmaterial | char(20) | √ |
| 4 | materialid | materialid | materialid | varchar2(20) |  |  | '~' |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |