# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11789.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_targetadj | pk_targetadj | pk_targetadj | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |
| 4 | ctargetid | ctargetid | ctargetid | varchar2(20) |
| 5 | dbilldate | dbilldate | dbilldate | char(19) |
| 6 | dmakedate | dmakedate | dmakedate | char(19) |
| 7 | fpfstatusflag | fpfstatusflag | fpfstatusflag | number(38, 0) |
| 8 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |
| 11 | taudittime | taudittime | taudittime | char(19) |
| 12 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 13 | vnote | vnote | vnote | varchar2(181) |
| 14 | vsrcbillcode | vsrcbillcode | vsrcbillcode | varchar2(40) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |