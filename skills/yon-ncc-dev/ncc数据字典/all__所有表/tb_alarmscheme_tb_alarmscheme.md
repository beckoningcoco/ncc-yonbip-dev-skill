# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11980.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | accctrollflag | accctrollflag | accctrollflag | char(1) |
| 3 | ctrlpercent | ctrlpercent | ctrlpercent | number(30, 8) |
| 4 | ctrlsign | ctrlsign | ctrlsign | varchar2(10) |
| 5 | dataattr | dataattr | dataattr | varchar2(20) |
| 6 | isgroup | isgroup | isgroup | char(1) |
| 7 | memo | memo | memo | varchar2(512) |
| 8 | pk_cube | pk_cube | pk_cube | varchar2(20) |
| 9 | pk_month | pk_month | pk_month | varchar2(20) |
| 10 | pk_plan | pk_plan | pk_plan | varchar2(20) |
| 11 | pk_taskdef | pk_taskdef | pk_taskdef | varchar2(20) |
| 12 | pk_year | pk_year | pk_year | varchar2(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |