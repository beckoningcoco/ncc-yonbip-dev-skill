# |<<

**电票数据下载设置 (obm_ebankdatadownLoad / nc.vo.obm.ebankdatadownload.EbankDataDownLoadHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3919.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankdatadownload | 主键 | pk_ebankdatadownload | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | code | code | varchar(50) |  | 字符串 (String) |
| 6 | name | name | name | varchar(50) |  | 字符串 (String) |
| 7 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 10 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 11 | pkorg | 所属组织 | pkorg | varchar(50) |  | 字符串 (String) |
| 12 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 13 | billmaker | 制单人 | billmaker | varchar(50) |  | 字符串 (String) |
| 14 | approver | 审批人 | approver | varchar(50) |  | 字符串 (String) |
| 15 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |