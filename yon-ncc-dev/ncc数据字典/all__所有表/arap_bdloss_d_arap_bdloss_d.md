# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6564.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdloss_d | pk_bdloss_d | pk_bdloss_d | char(20) | √ |
| 2 | lossglobalmoney | lossglobalmoney | lossglobalmoney | number(28, 8) |  |  | 0 |
| 3 | lossglobalrate | lossglobalrate | lossglobalrate | number(28, 8) |  |  | 1 |
| 4 | lossgroupmoney | lossgroupmoney | lossgroupmoney | number(28, 8) |  |  | 0 |
| 5 | lossgrouprate | lossgrouprate | lossgrouprate | number(28, 8) |  |  | 1 |
| 6 | losslocalmoney | losslocalmoney | losslocalmoney | number(28, 8) |  |  | 0 |
| 7 | lossmoney | lossmoney | lossmoney | number(28, 8) |  |  | 0 |
| 8 | lossrate | lossrate | lossrate | number(28, 8) |  |  | 1 |
| 9 | pk_bdloss | pk_bdloss | pk_bdloss | varchar2(20) |  |  | '~' |
| 10 | pk_bill | pk_bill | pk_bill | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |