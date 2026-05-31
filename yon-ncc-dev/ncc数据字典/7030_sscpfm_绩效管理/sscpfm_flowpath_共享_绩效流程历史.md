# |<<

**共享_绩效流程历史 (sscpfm_flowpath / nc.vo.sscpfm.basic.PFMFlowPathVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5575.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar(36) | √ | 字符串 (String) |
| 2 | actionsscnode | 执行环节 | actionsscnode | varchar(36) |  | 字符串 (String) |
| 3 | actionsscpost | 执行岗位 | actionsscpost | varchar(36) |  | 字符串 (String) |
| 4 | actiontype | 动作 | actiontype | varchar(254) |  | 字符串 (String) |
| 5 | actionuser | 执行人 | actionuser | varchar(36) |  | 字符串 (String) |
| 6 | endtime | 结束时间 | endtime | varchar(36) |  | 字符串 (String) |
| 7 | ssctask | 任务表 | ssctask | varchar(36) |  | 字符串 (String) |
| 8 | starttime | 开始时间 | starttime | varchar(36) |  | 字符串 (String) |
| 9 | statisticaltime | 用时 | statisticaltime | int |  | 整数 (Integer) |
| 10 | statisticaltime_calendar | 工作日历用时 | statisticaltime_calendar | int |  | 整数 (Integer) |
| 11 | businessid | 业务主键 | businessid | varchar(36) |  | 字符串 (String) |
| 12 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 13 | pk_billtype | 单据大类 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 14 | pk_sscunit | 共享中心 | pk_sscunit | varchar(50) |  | 字符串 (String) |
| 15 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 16 | typeisfinal | 是否是最终状态 | typeisfinal | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | isrejectout | 是否驳出共享中心 | isrejectout | char(1) |  | 布尔类型 (UFBoolean) |