# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10457.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_techvalue | pk_techvalue | pk_techvalue | varchar2(20) | √ |
| 2 | pk_equip | pk_equip | pk_equip | char(20) | √ |
| 3 | tech_classid | tech_classid | tech_classid | varchar2(50) |
| 4 | tech_index | tech_index | tech_index | number(38, 0) |
| 5 | tech_showname | tech_showname | tech_showname | varchar2(100) |
| 6 | tech_showvalue | tech_showvalue | tech_showvalue | varchar2(100) |
| 7 | tech_value | tech_value | tech_value | varchar2(100) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |