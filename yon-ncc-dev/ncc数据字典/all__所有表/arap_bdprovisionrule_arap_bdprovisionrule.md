# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6568.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdprovisionrule | pk_bdprovisionrule | pk_bdprovisionrule | char(20) | √ |
| 2 | agingscheme | agingscheme | agingscheme | varchar2(20) |  |  | '~' |
| 3 | analysisdate | analysisdate | analysisdate | number(38, 0) |
| 4 | code | code | code | varchar2(50) |
| 5 | name | name | name | varchar2(200) |
| 6 | name2 | name2 | name2 | varchar2(200) |
| 7 | name3 | name3 | name3 | varchar2(200) |
| 8 | name4 | name4 | name4 | varchar2(200) |
| 9 | name5 | name5 | name5 | varchar2(200) |
| 10 | name6 | name6 | name6 | varchar2(200) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | provisionbill | provisionbill | provisionbill | number(38, 0) |
| 14 | provisiondim | provisiondim | provisiondim | varchar2(200) |  |  | '~' |
| 15 | provisionfreq | provisionfreq | provisionfreq | number(38, 0) | √ |
| 16 | provisiontype | provisiontype | provisiontype | number(38, 0) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |