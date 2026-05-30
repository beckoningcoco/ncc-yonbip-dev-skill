# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9255.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plan | pk_plan | pk_plan | char(20) | √ |
| 2 | batchrule | batchrule | batchrule | varchar2(20) |
| 3 | bdatafull | bdatafull | bdatafull | char(1) |
| 4 | cmaterialoid | cmaterialoid | cmaterialoid | varchar2(20) |  |  | '~' |
| 5 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 6 | cplanbatchid | cplanbatchid | cplanbatchid | varchar2(40) |
| 7 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 8 | dplandate | dplandate | dplandate | char(19) |
| 9 | fmethod | fmethod | fmethod | number(38, 0) |
| 10 | ftimebucket | ftimebucket | ftimebucket | number(38, 0) |
| 11 | iconfirmfence | iconfirmfence | iconfirmfence | number(38, 0) |
| 12 | iplanhorizon | iplanhorizon | iplanhorizon | number(38, 0) |
| 13 | ireqfence | ireqfence | ireqfence | number(38, 0) |
| 14 | naheadbatch | naheadbatch | naheadbatch | number(28, 8) |
| 15 | naheadcoff | naheadcoff | naheadcoff | number(28, 8) |
| 16 | nincrementnum | nincrementnum | nincrementnum | number(28, 8) |
| 17 | nmaxnum | nmaxnum | nmaxnum | number(28, 8) |
| 18 | nmixnum | nmixnum | nmixnum | number(28, 8) |
| 19 | npartnum | npartnum | npartnum | number(28, 8) |
| 20 | npriod | npriod | npriod | number(28, 8) |
| 21 | nreordernum | nreordernum | nreordernum | number(28, 8) |
| 22 | nsafetynum | nsafetynum | nsafetynum | number(28, 8) |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_scheme | pk_scheme | pk_scheme | varchar2(20) |  |  | '~' |
| 27 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |