# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6865.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dataioconfig | pk_dataioconfig | pk_dataioconfig | char(20) | √ |
| 2 | funccode | funccode | funccode | varchar2(50) |
| 3 | hookclient | hookclient | hookclient | varchar2(256) |
| 4 | hookprivate | hookprivate | hookprivate | varchar2(256) |
| 5 | hookpublic | hookpublic | hookpublic | varchar2(256) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |