# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12618.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskconfig | pk_taskconfig | pk_taskconfig | char(20) | √ |
| 2 | flag_avtivity | flag_avtivity | flag_avtivity | char(1) |  |  | 'Y' |
| 3 | name_task | name_task | name_task | varchar2(100) |
| 4 | pk_group | pk_group | pk_group | char(20) |
| 5 | pk_org | pk_org | pk_org | char(20) |
| 6 | pk_task | pk_task | pk_task | char(20) |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |