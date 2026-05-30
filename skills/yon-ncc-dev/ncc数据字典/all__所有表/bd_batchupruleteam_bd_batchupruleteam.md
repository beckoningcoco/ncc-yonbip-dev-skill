# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6766.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchupruleteam | pk_batchupruleteam | pk_batchupruleteam | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | executeday | executeday | executeday | number(38, 0) |
| 4 | executetime | executetime | executetime | varchar2(8) |
| 5 | frequencytype | frequencytype | frequencytype | number(38, 0) |
| 6 | isautoexecute | isautoexecute | isautoexecute | char(1) |  |  | 'Y' |
| 7 | memo | memo | memo | varchar2(1536) |
| 8 | name | name | name | varchar2(300) | √ |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_alertregistry | pk_alertregistry | pk_alertregistry | varchar2(20) |
| 15 | pk_group | pk_group | pk_group | char(20) | √ |
| 16 | pk_org | pk_org | pk_org | char(20) | √ |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |