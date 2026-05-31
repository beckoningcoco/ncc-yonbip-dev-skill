# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12442.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nurs | pk_nurs | pk_nurs | char(20) | √ |
| 2 | code_case | code_case | code_case | varchar2(20) |
| 3 | day_or_stage | day_or_stage | day_or_stage | number(38, 0) |
| 4 | desc_nurs | desc_nurs | desc_nurs | varchar2(1000) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 6 | pk_item | pk_item | pk_item | varchar2(20) | √ |
| 7 | pk_org | pk_org | pk_org | char(20) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |