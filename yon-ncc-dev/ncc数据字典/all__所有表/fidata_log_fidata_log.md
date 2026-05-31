# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8265.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fidatalog | pk_fidatalog | pk_fidatalog | varchar2(20) | √ |
| 2 | dealmsg | dealmsg | dealmsg | varchar2(500) |
| 3 | dealstatus | dealstatus | dealstatus | number(38, 0) |
| 4 | operatetime | operatetime | operatetime | varchar2(20) | √ |
| 5 | operatetype | operatetype | operatetype | number(38, 0) | √ |
| 6 | sourcemodule | sourcemodule | sourcemodule | varchar2(20) | √ |
| 7 | sourcepk | sourcepk | sourcepk | varchar2(100) | √ |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |