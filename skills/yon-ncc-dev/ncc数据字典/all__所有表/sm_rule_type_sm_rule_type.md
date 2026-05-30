# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11634.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule_type | pk_rule_type | pk_rule_type | char(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | ismetadatatype | ismetadatatype | ismetadatatype | char(1) |
| 4 | ownmodule | ownmodule | ownmodule | varchar2(20) |  |  | '~' |
| 5 | ownresource | ownresource | ownresource | varchar2(20) |  |  | '~' |
| 6 | ruleeditorclass | ruleeditorclass | ruleeditorclass | varchar2(200) |
| 7 | ruleeditorclass4web | ruleeditorclass4web | ruleeditorclass4web | varchar2(200) |
| 8 | ruleeditorpath4js | ruleeditorpath4js | ruleeditorpath4js | varchar2(200) |
| 9 | ruleeditortype | ruleeditortype | ruleeditortype | varchar2(50) |
| 10 | rulefactoryclass | rulefactoryclass | rulefactoryclass | varchar2(200) |
| 11 | seqnum | seqnum | seqnum | number(38, 0) |
| 12 | typecode | typecode | typecode | varchar2(50) |
| 13 | typename | typename | typename | varchar2(75) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |