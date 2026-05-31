# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11048.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workingtasklog | pk_workingtasklog | pk_workingtasklog | char(20) | √ |
| 2 | endtime | endtime | endtime | char(19) |
| 3 | logstr | logstr | logstr | varchar2(4000) |
| 4 | pkregistry | pkregistry | pkregistry | varchar2(128) |
| 5 | registry | registry | registry | blob |
| 6 | sagaid | sagaid | sagaid | varchar2(200) |
| 7 | serverinstanceid | serverinstanceid | serverinstanceid | varchar2(64) |
| 8 | servername | servername | servername | varchar2(64) |
| 9 | starttime | starttime | starttime | char(19) |
| 10 | taskid | taskid | taskid | varchar2(64) |
| 11 | taskname | taskname | taskname | varchar2(200) |
| 12 | tasktype | tasktype | tasktype | number(38, 0) |
| 13 | workingresult | workingresult | workingresult | char(1) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |