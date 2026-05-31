# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6424.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | configid | configid | configid | varchar2(50) | √ |
| 2 | emailenable | emailenable | emailenable | char(1) |
| 3 | msgtemplate | msgtemplate | msgtemplate | varchar2(2000) |
| 4 | ncmsgenable | ncmsgenable | ncmsgenable | char(1) |
| 5 | ncuserid | ncuserid | ncuserid | varchar2(20) |  |  | '~' |
| 6 | restypeid | restypeid | restypeid | varchar2(20) |  |  | '~' |
| 7 | smsenable | smsenable | smsenable | char(1) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |