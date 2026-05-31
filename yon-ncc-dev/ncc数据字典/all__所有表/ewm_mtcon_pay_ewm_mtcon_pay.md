# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8011.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon_pay | pk_mtcon_pay | pk_mtcon_pay | char(20) | √ |
| 2 | act_pay | act_pay | act_pay | number(28, 8) |
| 3 | act_pay_date | act_pay_date | act_pay_date | char(19) |
| 4 | act_pay_global | act_pay_global | act_pay_global | number(28, 8) |
| 5 | act_pay_group | act_pay_group | act_pay_group | number(28, 8) |
| 6 | act_pay_org | act_pay_org | act_pay_org | number(28, 8) |
| 7 | memo | memo | memo | varchar2(200) |
| 8 | pay_condition | pay_condition | pay_condition | varchar2(200) |
| 9 | pay_content | pay_content | pay_content | varchar2(200) |
| 10 | pay_proportion | pay_proportion | pay_proportion | varchar2(80) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_mtcon | pk_mtcon | pk_mtcon | char(20) | √ |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | plan_pay | plan_pay | plan_pay | number(28, 8) |
| 16 | plan_pay_date | plan_pay_date | plan_pay_date | char(19) |
| 17 | plan_pay_global | plan_pay_global | plan_pay_global | number(28, 8) |
| 18 | plan_pay_group | plan_pay_group | plan_pay_group | number(28, 8) |
| 19 | plan_pay_org | plan_pay_org | plan_pay_org | number(28, 8) |
| 20 | rowno | rowno | rowno | varchar2(30) |
| 21 | def1 | def1 | def1 | varchar2(101) |
| 22 | def2 | def2 | def2 | varchar2(101) |
| 23 | def3 | def3 | def3 | varchar2(101) |
| 24 | def4 | def4 | def4 | varchar2(101) |
| 25 | def5 | def5 | def5 | varchar2(101) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |