# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6429.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | restypeid | restypeid | restypeid | char(20) | √ |
| 2 | allowchildselect | allowchildselect | allowchildselect | char(1) |
| 3 | allowpartlysuccess | allowpartlysuccess | allowpartlysuccess | char(1) |
| 4 | autodispose | autodispose | autodispose | char(1) |
| 5 | code | code | code | varchar2(50) | √ |
| 6 | confirmdelete | confirmdelete | confirmdelete | char(1) |
| 7 | createpkgclass | createpkgclass | createpkgclass | varchar2(500) |
| 8 | createpkgeditor | createpkgeditor | createpkgeditor | varchar2(20) |  |  | '~' |
| 9 | createtranseditor | createtranseditor | createtranseditor | varchar2(500) |  |  | 'nc.ui.uap.distribution.schedtranstask.DefaultTaskTransContentUI' |
| 10 | extpropeditorclass | extpropeditorclass | extpropeditorclass | varchar2(500) |
| 11 | ignorerpeat | ignorerpeat | ignorerpeat | char(1) |
| 12 | modulename | modulename | modulename | varchar2(50) | √ |
| 13 | name | name | name | varchar2(300) | √ |
| 14 | name2 | name2 | name2 | varchar2(300) |
| 15 | name3 | name3 | name3 | varchar2(300) |
| 16 | name4 | name4 | name4 | varchar2(300) |
| 17 | name5 | name5 | name5 | varchar2(300) |
| 18 | name6 | name6 | name6 | varchar2(300) |
| 19 | overrepeat | overrepeat | overrepeat | char(1) |
| 20 | pkgeditor | pkgeditor | pkgeditor | varchar2(20) |  |  | '~' |
| 21 | receiptclass | receiptclass | receiptclass | varchar2(500) |
| 22 | restypecatalog | restypecatalog | restypecatalog | varchar2(20) |  |  | '~' |
| 23 | serverpkgclass | serverpkgclass | serverpkgclass | varchar2(500) |
| 24 | transdowntoup | transdowntoup | transdowntoup | char(1) |
| 25 | transuptodown | transuptodown | transuptodown | char(1) |
| 26 | unloaderclass | unloaderclass | unloaderclass | varchar2(500) |
| 27 | userpkgrule | userpkgrule | userpkgrule | varchar2(1024) |
| 28 | viewreceipteditor | viewreceipteditor | viewreceipteditor | varchar2(20) |  |  | '~' |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |