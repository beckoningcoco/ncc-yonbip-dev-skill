# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11990.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | orgtype | orgtype | orgtype | varchar2(50) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |
| 4 | pk_orgstruct | pk_orgstruct | pk_orgstruct | varchar2(20) |
| 5 | systemcode | systemcode | systemcode | varchar2(10) | √ |
| 6 | systemname | systemname | systemname | varchar2(50) | √ |
| 7 | uapdoclist | uapdoclist | uapdoclist | varchar2(512) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |