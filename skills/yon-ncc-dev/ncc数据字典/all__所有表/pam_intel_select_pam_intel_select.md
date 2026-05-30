# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10397.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intelselect | pk_intelselect | pk_intelselect | char(20) | √ |
| 2 | mount | mount | mount | number(38, 0) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | select_type | select_type | select_type | varchar2(50) |
| 6 | source | source | source | varchar2(50) |
| 7 | target | target | target | varchar2(50) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |