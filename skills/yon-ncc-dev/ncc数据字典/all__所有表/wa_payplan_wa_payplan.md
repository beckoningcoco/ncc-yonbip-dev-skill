# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12883.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_payplan | pk_wa_payplan | pk_wa_payplan | char(20) | √ |
| 2 | creatorname | creatorname | creatorname | varchar2(30) |
| 3 | generate_rule | generate_rule | generate_rule | number(38, 0) |
| 4 | modifiername | modifiername | modifiername | varchar2(30) |
| 5 | pay_cycle | pay_cycle | pay_cycle | varchar2(10) |
| 6 | pay_day | pay_day | pay_day | number(38, 0) |
| 7 | pay_month | pay_month | pay_month | number(38, 0) |
| 8 | pk_group | pk_group | pk_group | char(20) |
| 9 | pk_org | pk_org | pk_org | char(20) |
| 10 | pk_wa_class | pk_wa_class | pk_wa_class | char(20) | √ |
| 11 | processbus_day | processbus_day | processbus_day | number(38, 0) |
| 12 | resname | resname | resname | varchar2(300) |
| 13 | responsible | responsible | responsible | char(300) |
| 14 | warning_day | warning_day | warning_day | number(38, 0) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | char(20) | √ |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | char(20) |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |