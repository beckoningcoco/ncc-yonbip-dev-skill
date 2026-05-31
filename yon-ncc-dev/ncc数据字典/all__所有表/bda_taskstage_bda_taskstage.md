# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6704.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stage | pk_stage | pk_stage | char(20) | √ |
| 2 | finishtime | finishtime | finishtime | char(19) |
| 3 | pk_adptask | pk_adptask | pk_adptask | char(20) | √ |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | processor | processor | processor | varchar2(50) |
| 6 | stageno | stageno | stageno | number(38, 0) |
| 7 | stagestatus | stagestatus | stagestatus | number(38, 0) |
| 8 | starttime | starttime | starttime | char(19) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |