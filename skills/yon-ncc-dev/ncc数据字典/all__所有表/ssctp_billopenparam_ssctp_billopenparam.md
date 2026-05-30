# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11897.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billopenparam | pk_billopenparam | pk_billopenparam | char(20) | √ |
| 2 | pk_billopen | pk_billopen | pk_billopen | char(20) |
| 3 | remark | remark | remark | varchar2(200) |
| 4 | srcitem | srcitem | srcitem | varchar2(50) |
| 5 | sscitem | sscitem | sscitem | varchar2(50) |
| 6 | sscitemname | sscitemname | sscitemname | varchar2(50) |
| 7 | type | type | type | number(38, 0) |
| 8 | creationtime | creationtime | creationtime | varchar2(50) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | varchar2(50) |
| 12 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |