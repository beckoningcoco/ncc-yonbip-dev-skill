# |<<

**发债申请 (Bond_Apply / nc.vo.bond.bondmanage.apply.BondApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1235.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bondapply | 主键 | pk_bondapply | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | applycode | 申请编号 | applycode | varchar(200) |  | 字符串 (String) |
| 6 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | pk_finvariety | 发债品种 | pk_finvariety | varchar(20) |  | 投融资品种 (FinVarietyVO) |
| 8 | applydate | 申请日期 | applydate | char(19) |  | 日期 (UFDate) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 11 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 12 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |
| 13 | busistatus | 单据状态 | busistatus | int |  | 发债申请单据状态 (BillStatusEnum) |  | 0=待提交; |