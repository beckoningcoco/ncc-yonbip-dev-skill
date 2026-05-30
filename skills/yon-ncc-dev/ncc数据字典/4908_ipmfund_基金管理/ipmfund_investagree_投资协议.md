# |<<

**投资协议 (ipmfund_investagree / nc.vo.ipmfund.investagreement.InvestAgreementVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3316.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agreement | 投资协议主键 | pk_agreement | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 协议编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | name | 协议名称 | name | varchar(500) |  | 字符串 (String) |
| 7 | pk_fundlib | 基金名称 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 8 | pk_projectlib | 标的项目 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 9 | pk_fundlib_target | 标的基金 | pk_fundlib_target | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 10 | pk_enterprise_person | 标的公司 | pk_enterprise_person | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 11 | pk_investtype | 投资类型 | pk_investtype | varchar(20) |  | 投资类型 (InvestTypeVO) |
| 12 | norigmoneymny | 投资金额 | norigmoneymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nbasemoneymny | 投资金额组织本币 | nbasemoneymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ngpmoneymny | 投资金额集团本币 | ngpmoneymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nallmoneymny | 投资金额全局本币 | nallmoneymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | vinvestway | 投资方式 | vinvestway | varchar(50) |  | 字符串 (String) |
| 17 | vagreementcontent | 协议内容概述 | vagreementcontent | varchar(2048) |  | 备注 (Memo) |
| 18 | dstartdate | 计划开始时间 | dstartdate | char(19) |  | 日期 (UFDate) |
| 19 | denddate | 计划完成时间 | denddate | char(19) |  | 日期 (UFDate) |
| 20 | vsignsite | 签约地点 | vsignsite | varchar(500) |  | 字符串 (String) |
| 21 | dbilldate | 签约日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 22 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 23 | ccurrencyid | 组织本位币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 24 | cgroupcurrencyid | 集团本位币币种 | cgroupcurrencyid | varchar(20) |  | 币种 (currtype) |
| 25 | cglobalcurrencyid | 全局本位币币种 | cglobalcurrencyid | varchar(20) |  | 币种 (currtype) |
| 26 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 27 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 28 | pk_psndoc | 经办人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 29 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 30 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 31 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |