# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7118.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mc | pk_mc | pk_mc | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | dt_mctype | dt_mctype | dt_mctype | varchar2(20) |  |  | '~' |
| 4 | flag_active | flag_active | flag_active | char(1) |
| 5 | flag_cust | flag_cust | flag_cust | char(1) |
| 6 | mcsrc | mcsrc | mcsrc | varchar2(50) |
| 7 | name | name | name | varchar2(50) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | sysinfo | sysinfo | sysinfo | varchar2(50) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |