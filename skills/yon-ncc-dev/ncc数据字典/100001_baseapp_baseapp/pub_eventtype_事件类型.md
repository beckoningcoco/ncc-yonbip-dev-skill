# |<<

**事件类型 (pub_eventtype / nc.vo.uap.businessevent.EventTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4725.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eventtype | 主键 | pk_eventtype | char(20) | √ | 主键 (UFID) |
| 2 | sourceid | 事件源ID | sourceid | varchar(50) | √ | 字符串 (String) |
| 3 | sourcename | 事件源名称 | sourcename | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | owner | 所属模块 | owner | char(20) | √ | 模块信息 (module) |
| 5 | eventtypecode | 事件类型编码 | eventtypecode | varchar(50) | √ | 事件类型枚举 (eventtype_enum) |  | 1001=1001 新增前; |