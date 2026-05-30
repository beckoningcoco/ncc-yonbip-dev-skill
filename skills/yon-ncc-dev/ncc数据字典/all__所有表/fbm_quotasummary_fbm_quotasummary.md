# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8214.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_quotasummary | pk_quotasummary | pk_quotasummary | char(20) | √ |
| 2 | applyedaccmoney | applyedaccmoney | applyedaccmoney | number(28, 8) |
| 3 | defdate | defdate | defdate | char(19) |
| 4 | downaccmoney | downaccmoney | downaccmoney | number(28, 8) |
| 5 | globaldownaccmoney | globaldownaccmoney | globaldownaccmoney | number(28, 8) |
| 6 | globalrate | globalrate | globalrate | number(28, 8) |
| 7 | globalupaccmoney | globalupaccmoney | globalupaccmoney | number(28, 8) |
| 8 | gobalapplyedaccmoney | gobalapplyedaccmoney | gobalapplyedaccmoney | number(28, 8) |
| 9 | groupapplyedaccmoney | groupapplyedaccmoney | groupapplyedaccmoney | number(28, 8) |
| 10 | groupdownaccmoney | groupdownaccmoney | groupdownaccmoney | number(28, 8) |
| 11 | grouprate | grouprate | grouprate | number(28, 8) |
| 12 | groupupaccmoney | groupupaccmoney | groupupaccmoney | number(28, 8) |
| 13 | orgapplyedaccmoney | orgapplyedaccmoney | orgapplyedaccmoney | number(28, 8) |
| 14 | orgdownaccmoney | orgdownaccmoney | orgdownaccmoney | number(28, 8) |
| 15 | orgrate | orgrate | orgrate | number(28, 8) |
| 16 | orgupaccmoney | orgupaccmoney | orgupaccmoney | number(28, 8) |
| 17 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 18 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 19 | pk_fundorg_v | pk_fundorg_v | pk_fundorg_v | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | upaccmoney | upaccmoney | upaccmoney | number(28, 8) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |