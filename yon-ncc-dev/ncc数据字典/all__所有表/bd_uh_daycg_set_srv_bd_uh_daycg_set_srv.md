# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7136.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_daycgsetsrv | pk_daycgsetsrv | pk_daycgsetsrv | char(20) | √ |
| 2 | day_begin | day_begin | day_begin | number(38, 0) |
| 3 | day_end | day_end | day_end | number(38, 0) |
| 4 | describe | describe | describe | varchar2(256) |
| 5 | eu_cgmode | eu_cgmode | eu_cgmode | varchar2(50) |
| 6 | month_begin | month_begin | month_begin | number(38, 0) |
| 7 | month_end | month_end | month_end | number(38, 0) |
| 8 | pk_daycgset | pk_daycgset | pk_daycgset | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 10 | pk_item | pk_item | pk_item | varchar2(50) | √ |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | def1 | def1 | def1 | varchar2(50) |
| 13 | def2 | def2 | def2 | varchar2(50) |
| 14 | def3 | def3 | def3 | varchar2(50) |
| 15 | def4 | def4 | def4 | varchar2(50) |
| 16 | def5 | def5 | def5 | varchar2(50) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |