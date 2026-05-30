# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12449.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item_ex | pk_item_ex | pk_item_ex | varchar2(20) | √ |
| 2 | name_item | name_item | name_item | varchar2(200) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 4 | pk_item | pk_item | pk_item | char(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 6 | pk_stage_ex | pk_stage_ex | pk_stage_ex | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |