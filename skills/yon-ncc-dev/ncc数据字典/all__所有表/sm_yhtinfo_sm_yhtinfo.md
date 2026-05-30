# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11666.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_yhtinfo | pk_yhtinfo | pk_yhtinfo | char(20) | √ |
| 2 | accountcode | accountcode | accountcode | varchar2(50) | √ |
| 3 | datasource | datasource | datasource | varchar2(50) | √ |
| 4 | pk_group | pk_group | pk_group | varchar2(50) | √ |
| 5 | tenantid | tenantid | tenantid | varchar2(50) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | TO_CHAR(SYSDATE,'yyyy-mm-dd hh24:mi:ss') |