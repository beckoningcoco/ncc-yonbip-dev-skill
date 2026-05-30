# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8114.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depaccrual | pk_depaccrual | pk_depaccrual | char(20) | √ |
| 2 | accounting_period | accounting_period | accounting_period | char(19) |
| 3 | begin_date | begin_date | begin_date | char(19) |
| 4 | begin_liability | begin_liability | begin_liability | number(28, 8) |
| 5 | calculate_rentnotax | calculate_rentnotax | calculate_rentnotax | number(28, 8) |
| 6 | calculate_renttax | calculate_renttax | calculate_renttax | number(28, 8) |
| 7 | change_information | change_information | change_information | varchar2(200) |
| 8 | day_date | day_date | day_date | char(19) |
| 9 | discouted | discouted | discouted | number(28, 8) |
| 10 | end_date | end_date | end_date | char(19) |
| 11 | end_liability | end_liability | end_liability | number(28, 8) |
| 12 | interest | interest | interest | number(28, 8) |
| 13 | isaccruedbymonth | isaccruedbymonth | isaccruedbymonth | char(1) |
| 14 | pk_card | pk_card | pk_card | char(20) |
| 15 | remarks | remarks | remarks | varchar2(200) |
| 16 | def1 | def1 | def1 | varchar2(101) |
| 17 | def2 | def2 | def2 | varchar2(101) |
| 18 | def3 | def3 | def3 | varchar2(101) |
| 19 | def4 | def4 | def4 | varchar2(101) |
| 20 | def5 | def5 | def5 | varchar2(101) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |