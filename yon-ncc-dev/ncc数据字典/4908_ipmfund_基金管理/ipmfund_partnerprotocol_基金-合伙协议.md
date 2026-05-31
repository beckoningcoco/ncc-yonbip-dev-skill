# |<<

**基金-合伙协议 (ipmfund_partnerprotocol / nc.vo.ipmfund.partnerprotocol.PartnerProtocolVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3333.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_partnerprotocol | 合伙协议主键 | pk_partnerprotocol | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 合伙协议编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | pk_fundlib | 基金编号 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 7 | fundlid_name | 基金名称 | fundlid_name | varchar(500) |  | 字符串 (String) |
| 8 | pk_fundtype | 基金类型 | pk_fundtype | varchar(20) |  | 基金类型 (FundTypeVO) |
| 9 | norigtotalinvestmny | 总出资额 | norigtotalinvestmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nbasetotalinvestmny | 总出资额组织本币 | nbasetotalinvestmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | ngptotalinvestmny | 总出资额集团本币 | ngptotalinvestmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nalltotalinvestmny | 总出资额全局本币 | nalltotalinvestmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | dbilldate | 签订日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 14 | partnernum | 合伙人数 | partnernum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | partnerterm | 合伙期限 | partnerterm | int |  | 整数 (Integer) |
| 16 | pk_dept | 编制部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 17 | pk_dept_v | 编制部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 18 | pk_psndoc | 编制人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 19 | vcontentdes | 出资协议内容描述 | vcontentdes | varchar(2048) |  | 备注 (Memo) |
| 20 | vsharemethod | 利润分配亏损分担方式 | vsharemethod | varchar(2048) |  | 备注 (Memo) |
| 21 | vmemo | 其他执行事务说明 | vmemo | varchar(2048) |  | 备注 (Memo) |
| 22 | vmemosecond | 表头备注 | vmemosecond | varchar(2048) |  | 备注 (Memo) |
| 23 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |