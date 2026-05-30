# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10030.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indidata | pk_indidata | pk_indidata | char(20) | √ |
| 2 | direct | direct | direct | varchar2(50) |
| 3 | indiclass | indiclass | indiclass | varchar2(50) |
| 4 | md5 | md5 | md5 | varchar2(50) |
| 5 | pk_center | pk_center | pk_center | varchar2(20) |  |  | '~' |
| 6 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 7 | pk_dim_other | pk_dim_other | pk_dim_other | varchar2(20) |  |  | '~' |
| 8 | pk_dim_this | pk_dim_this | pk_dim_this | varchar2(20) |  |  | '~' |
| 9 | pk_indidataorder | pk_indidataorder | pk_indidataorder | varchar2(20) |  |  | '~' |
| 10 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 11 | pk_org_other | pk_org_other | pk_org_other | varchar2(20) |  |  | '~' |
| 12 | pk_org_this | pk_org_this | pk_org_this | varchar2(20) |  |  | '~' |
| 13 | pk_pcorg_other | pk_pcorg_other | pk_pcorg_other | varchar2(20) |  |  | '~' |
| 14 | pk_pcorg_this | pk_pcorg_this | pk_pcorg_this | varchar2(20) |  |  | '~' |
| 15 | pk_purorg | pk_purorg | pk_purorg | varchar2(20) |  |  | '~' |
| 16 | pk_rule | pk_rule | pk_rule | varchar2(20) |  |  | '~' |
| 17 | pk_ruledetail | pk_ruledetail | pk_ruledetail | varchar2(20) |  |  | '~' |
| 18 | pk_staindi | pk_staindi | pk_staindi | varchar2(20) |  |  | '~' |
| 19 | quantity | quantity | quantity | number(28, 8) |
| 20 | rowno | rowno | rowno | varchar2(50) |
| 21 | unit | unit | unit | varchar2(20) |  |  | '~' |
| 22 | uuid | uuid | uuid | varchar2(50) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |