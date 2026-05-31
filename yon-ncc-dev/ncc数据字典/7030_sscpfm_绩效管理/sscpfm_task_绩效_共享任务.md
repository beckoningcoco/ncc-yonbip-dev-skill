# |<<

**绩效_共享任务 (sscpfm_task / nc.vo.sscpfm.basic.PFMTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5586.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar(36) | √ | 字符串 (String) |
| 2 | auditstatus | 审批状态 | auditstatus | varchar(254) |  | 字符串 (String) |
| 3 | businessid | 业务id | businessid | varchar(36) |  | 字符串 (String) |
| 4 | ssctaskregister | 任务注册 | ssctaskregister | varchar(36) |  | 字符串 (String) |
| 5 | taskstatus | 任务状态 | taskstatus | varchar(254) |  | 字符串 (String) |
| 6 | maker | 制单人 | maker | varchar(36) |  | 字符串 (String) |
| 7 | billno | 单据编号 | billno | varchar(254) |  | 字符串 (String) |
| 8 | sscuser | 共享人员 | sscuser | varchar(36) |  | 字符串 (String) |
| 9 | sscnode | 共享环节 | sscnode | varchar(36) |  | 字符串 (String) |
| 10 | urgent | 紧急标识 | urgent | varchar(10) |  | 字符串 (String) |
| 11 | sscpost | 共享岗位 | sscpost | varchar(36) |  | 字符串 (String) |
| 12 | oprationtime | 操作时间 | oprationtime | char(19) |  | 日期 (UFDate) |
| 13 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 14 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 15 | tasktype | 任务类型 | tasktype | varchar(50) |  | 字符串 (String) |
| 16 | sscstarttime | 共享中心开始时间 | sscstarttime | char(19) |  | 日期 (UFDate) |
| 17 | sscendtime | 共享中心结束时间 | sscendtime | char(19) |  | 日期 (UFDate) |
| 18 | issscfinish | 是否共享中心处理完成 | issscfinish | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | ssctaketime | 共享中心提取时间 | ssctaketime | char(19) |  | 日期 (UFDate) |
| 20 | endtime | 超期时间 | endtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | warningtime | 预警时间 | warningtime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | pk_sscunit | 共享中心 | pk_sscunit | varchar(50) |  | 字符串 (String) |
| 23 | rejectstatus | 共享中心驳回标识 | rejectstatus | varchar(50) |  | 字符串 (String) |
| 24 | ismatchapproverule | 是否满足智能审批规则 | ismatchapproverule | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | isautoapprove | 是否自动审批 | isautoapprove | char(1) |  | 布尔类型 (UFBoolean) |