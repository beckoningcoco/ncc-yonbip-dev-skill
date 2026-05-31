# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8169.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_subequip | pk_subequip | pk_subequip | char(20) | √ |
| 2 | alter_date | alter_date | alter_date | char(19) |
| 3 | alter_reason | alter_reason | alter_reason | varchar2(20) |  |  | '~' |
| 4 | begin_date | begin_date | begin_date | char(19) |
| 5 | equip_code | equip_code | equip_code | varchar2(40) |
| 6 | equip_name | equip_name | equip_name | varchar2(400) |
| 7 | originvalue | originvalue | originvalue | number(28, 8) |
| 8 | pk_card | pk_card | pk_card | char(20) | √ |
| 9 | quantity | quantity | quantity | number(38, 0) |
| 10 | remark | remark | remark | varchar2(200) |
| 11 | spec | spec | spec | varchar2(400) |
| 12 | unit | unit | unit | varchar2(20) |  |  | '~' |
| 13 | usedstatue | usedstatue | usedstatue | varchar2(200) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |