# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6443.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | sessionid | sessionid | sessionid | char(20) | √ |
| 2 | createtime | createtime | createtime | char(19) |
| 3 | currsyscode | currsyscode | currsyscode | varchar2(50) |
| 4 | localcreation | localcreation | localcreation | char(1) |
| 5 | localprop | localprop | localprop | blob |
| 6 | originator | originator | originator | varchar2(50) |
| 7 | sessionheader | sessionheader | sessionheader | blob |
| 8 | sessionstatus | sessionstatus | sessionstatus | number(38, 0) |
| 9 | sessionuuid | sessionuuid | sessionuuid | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |