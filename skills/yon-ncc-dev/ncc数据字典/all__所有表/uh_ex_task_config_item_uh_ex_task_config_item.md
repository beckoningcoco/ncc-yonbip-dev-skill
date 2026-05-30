# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12619.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskconfig_item | pk_taskconfig_item | pk_taskconfig_item | char(20) | √ |
| 2 | flag_avtivity | flag_avtivity | flag_avtivity | char(1) |  |  | 'Y' |
| 3 | name_psn | name_psn | name_psn | varchar2(100) |
| 4 | phonenumber | phonenumber | phonenumber | char(11) | √ |
| 5 | pk_group | pk_group | pk_group | char(20) |
| 6 | pk_org | pk_org | pk_org | char(20) |
| 7 | pk_psn | pk_psn | pk_psn | char(20) |
| 8 | pk_taskconfig | pk_taskconfig | pk_taskconfig | char(20) |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |