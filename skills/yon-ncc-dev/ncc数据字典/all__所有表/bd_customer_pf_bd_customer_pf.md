# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6853.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_customerpf | pk_customerpf | pk_customerpf | char(20) | √ |
| 2 | approvenote | approvenote | approvenote | varchar2(1536) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvestate | approvestate | approvestate | number(38, 0) | √ |
| 5 | approvetime | approvetime | approvetime | char(19) |
| 6 | billnumber | billnumber | billnumber | varchar2(50) | √ |
| 7 | customercode | customercode | customercode | varchar2(40) |
| 8 | customerinfo | customerinfo | customerinfo | blob |
| 9 | customername | customername | customername | varchar2(300) |
| 10 | customername2 | customername2 | customername2 | varchar2(300) |
| 11 | customername3 | customername3 | customername3 | varchar2(300) |
| 12 | customername4 | customername4 | customername4 | varchar2(300) |
| 13 | customername5 | customername5 | customername5 | varchar2(300) |
| 14 | customername6 | customername6 | customername6 | varchar2(300) |
| 15 | customerorg | customerorg | customerorg | varchar2(20) |  |  | '~' |
| 16 | destorg | destorg | destorg | number(38, 0) | √ |
| 17 | memo | memo | memo | varchar2(1536) |
| 18 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 19 | pk_custclass | pk_custclass | pk_custclass | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | char(20) | √ |
| 21 | pk_org | pk_org | pk_org | char(20) | √ |
| 22 | proposer | proposer | proposer | varchar2(20) |  |  | '~' |
| 23 | proposetime | proposetime | proposetime | char(19) |
| 24 | remark | remark | remark | varchar2(1024) |
| 25 | def1 | def1 | def1 | varchar2(101) |
| 26 | def2 | def2 | def2 | varchar2(101) |
| 27 | def3 | def3 | def3 | varchar2(101) |
| 28 | def4 | def4 | def4 | varchar2(101) |
| 29 | def5 | def5 | def5 | varchar2(101) |
| 30 | def6 | def6 | def6 | varchar2(101) |
| 31 | def7 | def7 | def7 | varchar2(101) |
| 32 | def8 | def8 | def8 | varchar2(101) |
| 33 | def9 | def9 | def9 | varchar2(101) |
| 34 | def10 | def10 | def10 | varchar2(101) |
| 35 | creationtime | creationtime | creationtime | char(19) |
| 36 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 37 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 38 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 39 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |