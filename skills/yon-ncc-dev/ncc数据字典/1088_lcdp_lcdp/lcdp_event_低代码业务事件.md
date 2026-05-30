# |<<

**低代码业务事件 (lcdp_event / nc.vo.lcdp.feature.event.LcdpEventVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3551.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_event | 主键 | pk_event | char(20) | √ | 主键 (UFID) |
| 2 | pk_doc | 业务对象主键 | pk_doc | char(20) |  | 字符串 (String) |
| 3 | event_code | 事件类型编码 | event_code | varchar(50) |  | 字符串 (String) |
| 4 | pk_eventlistener | 事件主键 | pk_eventlistener | varchar(20) |  | 字符串 (String) |
| 5 | pk_eventtype | 事件类型主键 | pk_eventtype | varchar(20) |  | 字符串 (String) |
| 6 | publishstatus | 发布状态 | publishstatus | int |  | 发布状态 (publishstatus) |  | 1=未发布; |