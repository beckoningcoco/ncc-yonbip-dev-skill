# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6562.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdbill | pk_bdbill | pk_bdbill | char(20) | √ |
| 2 | globalmnytotal | globalmnytotal | globalmnytotal | number(28, 8) |  |  | 0 |
| 3 | groupmnytotal | groupmnytotal | groupmnytotal | number(28, 8) |  |  | 0 |
| 4 | localmnytotal | localmnytotal | localmnytotal | number(28, 8) |  |  | 0 |
| 5 | lossglobalmnytotal | lossglobalmnytotal | lossglobalmnytotal | number(28, 8) |  |  | 0 |
| 6 | lossgroupmnytotal | lossgroupmnytotal | lossgroupmnytotal | number(28, 8) |  |  | 0 |
| 7 | losslocalmnytotal | losslocalmnytotal | losslocalmnytotal | number(28, 8) |  |  | 0 |
| 8 | lossmnytotal | lossmnytotal | lossmnytotal | number(28, 8) |  |  | 0 |
| 9 | mnytotal | mnytotal | mnytotal | number(28, 8) |  |  | 0 |
| 10 | pk_bdprovisionrule | pk_bdprovisionrule | pk_bdprovisionrule | varchar2(20) |  |  | '~' |
| 11 | pk_bdprovision_d | pk_bdprovision_d | pk_bdprovision_d | varchar2(20) |  |  | '~' |
| 12 | pk_bill | pk_bill | pk_bill | varchar2(20) |  |  | '~' |
| 13 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 14 | pk_dimratio | pk_dimratio | pk_dimratio | varchar2(20) |  |  | '~' |
| 15 | pk_item | pk_item | pk_item | varchar2(20) |  |  | '~' |
| 16 | recglobalmnytotal | recglobalmnytotal | recglobalmnytotal | number(28, 8) |  |  | 0 |
| 17 | recgroupmnytotal | recgroupmnytotal | recgroupmnytotal | number(28, 8) |  |  | 0 |
| 18 | reclocalmnytotal | reclocalmnytotal | reclocalmnytotal | number(28, 8) |  |  | 0 |
| 19 | recmnytotal | recmnytotal | recmnytotal | number(28, 8) |  |  | 0 |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |