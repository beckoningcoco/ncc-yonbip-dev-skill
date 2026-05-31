# |<<

**业务插件实体 (pub_eventlistener / nc.vo.uap.businessevent.EventListenerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4724.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eventlistener | 主键 | pk_eventlistener | char(20) | √ | 主键 (UFID) |
| 2 | pk_eventtype | 事件源标识 | pk_eventtype | varchar(20) | √ | 事件类型 (eventtype) |
| 3 | name | 插件名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | implclassname | 插件全类名 | implclassname | varchar(200) | √ | 字符串 (String) |
| 5 | owner | 插件所属模块 | owner | varchar(20) | √ | 模块信息 (module) |
| 6 | note | 插件功能备注 | note | varchar(1024) |  | 字符串 (String) |
| 7 | operindex | 插件执行顺序号 | operindex | int |  | 整数 (Integer) |
| 8 | enabled | 是否启用 | enabled | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | localtype | 本地化 | localtype | varchar(20) |  | 国家地区 (countryzone) |
| 10 | industrytype | 行业化 | industrytype | varchar(20) |  | 行业目录 (industry) |