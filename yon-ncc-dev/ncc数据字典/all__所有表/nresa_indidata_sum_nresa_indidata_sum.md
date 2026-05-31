# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10032.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indidata_sum | pk_indidata_sum | pk_indidata_sum | char(20) | √ |
| 2 | indiclass | indiclass | indiclass | varchar2(50) |
| 3 | md5 | md5 | md5 | varchar2(50) |
| 4 | period | period | period | varchar2(50) |
| 5 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 6 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_other | pk_org_other | pk_org_other | varchar2(20) |  |  | '~' |
| 9 | pk_org_this | pk_org_this | pk_org_this | varchar2(20) |  |  | '~' |
| 10 | pk_pcorg_other | pk_pcorg_other | pk_pcorg_other | varchar2(20) |  |  | '~' |
| 11 | pk_pcorg_this | pk_pcorg_this | pk_pcorg_this | varchar2(20) |  |  | '~' |
| 12 | pk_staindi | pk_staindi | pk_staindi | varchar2(20) |  |  | '~' |
| 13 | quantity | quantity | quantity | number(28, 8) |
| 14 | unit | unit | unit | varchar2(20) |  |  | '~' |
| 15 | uuid | uuid | uuid | varchar2(50) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |