# |<<

**拆分流水 (ps_splitflow / nc.vo.ps.splitflow.SplitFlowVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4691.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_splitflow | 主键 | pk_splitflow | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 付款组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 付款组织版本主键 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | billname | 单据描述 | billname | varchar(181) |  | 字符串 (String) |
| 7 | pk_busitype | 业务类型 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 8 | pk_billtype | 单据类型（或交易类型） | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | remark | 详细说明 | remark | varchar(181) |  | 字符串 (String) |
| 10 | billmaker | 动作操作人（审批、核准） | billmaker | varchar(20) |  | 用户 (user) |
| 11 | voperatornote | 批语 | voperatornote | varchar(181) |  | 字符串 (String) |
| 12 | voperatetype | 动作操作类型 | voperatetype | int |  | 拆分操作类型 (splittype) |  | 1=审批; |