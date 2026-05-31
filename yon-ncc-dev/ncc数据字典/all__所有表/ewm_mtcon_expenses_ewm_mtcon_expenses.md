# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8008.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon_expenses | pk_mtcon_expenses | pk_mtcon_expenses | char(20) | √ |
| 2 | expenses | expenses | expenses | number(28, 8) |
| 3 | expenses_global | expenses_global | expenses_global | number(28, 8) |
| 4 | expenses_group | expenses_group | expenses_group | number(28, 8) |
| 5 | expenses_org | expenses_org | expenses_org | number(28, 8) |
| 6 | memo | memo | memo | varchar2(200) |
| 7 | pk_expenses_type | pk_expenses_type | pk_expenses_type | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_mtcon | pk_mtcon | pk_mtcon | char(20) | √ |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | def1 | def1 | def1 | varchar2(101) |
| 13 | def2 | def2 | def2 | varchar2(101) |
| 14 | def3 | def3 | def3 | varchar2(101) |
| 15 | def4 | def4 | def4 | varchar2(101) |
| 16 | def5 | def5 | def5 | varchar2(101) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |