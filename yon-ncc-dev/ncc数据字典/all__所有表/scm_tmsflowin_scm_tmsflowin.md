# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11463.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tmsflowin | pk_tmsflowin | pk_tmsflowin | char(20) | √ |
| 2 | cbillbid | cbillbid | cbillbid | varchar2(20) |
| 3 | cbillid | cbillid | cbillid | varchar2(20) |
| 4 | cdestbillid | cdestbillid | cdestbillid | varchar2(20) |
| 5 | flowtype | flowtype | flowtype | varchar2(10) |
| 6 | md5code | md5code | md5code | varchar2(32) |
| 7 | pk_billtype | pk_billtype | pk_billtype | varchar2(10) |
| 8 | systembillcode | systembillcode | systembillcode | varchar2(50) |
| 9 | systembillid | systembillid | systembillid | varchar2(50) |
| 10 | systemcode | systemcode | systemcode | varchar2(10) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |