# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11581.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgprops | pk_msgprops | pk_msgprops | char(20) | √ |
| 2 | pk_message | pk_message | pk_message | char(20) |
| 3 | propname | propname | propname | varchar2(100) |
| 4 | proptype | proptype | proptype | varchar2(20) |
| 5 | propvalue | propvalue | propvalue | varchar2(2000) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |