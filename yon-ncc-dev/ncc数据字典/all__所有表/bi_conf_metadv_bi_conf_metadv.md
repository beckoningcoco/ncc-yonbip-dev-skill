# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7303.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_metadv | pk_metadv | pk_metadv | char(20) | √ |
| 2 | datasourcename | datasourcename | datasourcename | varchar2(50) |
| 3 | displayname | displayname | displayname | varchar2(50) | √ |
| 4 | driver | driver | driver | varchar2(50) | √ |
| 5 | metatype | metatype | metatype | varchar2(50) | √ |
| 6 | resdir | resdir | resdir | varchar2(50) |
| 7 | resid | resid | resid | varchar2(50) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | TO_CHAR(SYSDATE,'yyyy-mm-dd hh24:mi:ss') |