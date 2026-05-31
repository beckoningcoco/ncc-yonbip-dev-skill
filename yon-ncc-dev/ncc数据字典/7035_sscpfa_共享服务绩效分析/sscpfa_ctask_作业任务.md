# |<<

**作业任务 (sscpfa_ctask / nc.vo.sscpfa.pfareport.CTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5563.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currenttask | 唯一标识 | pk_currenttask | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscunit | 共享中心 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 3 | pk_bill | 报账单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 4 | busiid | 单据主键 | busiid | varchar(20) |  | 字符串 (String) |
| 5 | billno | 单据编号 | billno | varchar(200) |  | 字符串 (String) |
| 6 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 交易类型 (transtype) |
| 7 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 交易类型 (transtype) |
| 8 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 9 | transtypecode | 交易类型编码 | transtypecode | varchar(50) |  | 字符串 (String) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_org | 报账单位 | pk_org | varchar(20) |  | 组织 (org) |
| 12 | billmaker | 报账人 | billmaker | varchar(20) |  | 用户 (user) |
| 13 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 14 | billdate | 制单日期 | billdate | char(19) |  | 日期 (UFDate) |
| 15 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | remark | 摘要 | remark | varchar(1000) |  | 字符串 (String) |
| 17 | flowstatus | 流程状态 | flowstatus | int |  | 整数 (Integer) |
| 18 | issscfinish | 是否审核完成 | issscfinish | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | hassettle | 是否存在结算 | hassettle | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | issettlefinish | 是否结算完成 | issettlefinish | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | committime | 提交时间 | committime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | sscendtime | 共享中心完成时间 | sscendtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | flowendtime | 流程完成时间 | flowendtime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | settletime | 结算时间 | settletime | char(19) |  | 日期时间 (UFDateTime) |
| 25 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 26 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 27 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 28 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |