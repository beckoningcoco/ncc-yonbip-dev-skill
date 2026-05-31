# |<<

**基金投决 (ipmfund_investdecision / nc.vo.ipmfund.investdecision.InvestDecisionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3321.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_investdecision | 基金投决主键 | pk_investdecision | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | vbillname | 单据名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 7 | pk_fundlib | 基金编号 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 8 | pk_fundtype | 基金类型 | pk_fundtype | varchar(20) |  | 基金类型 (FundTypeVO) |
| 9 | pk_fundform | 组织形式 | pk_fundform | varchar(20) |  | 基金组织形式 (FundFormVO) |
| 10 | vmanagetype | 管理类型 | vmanagetype | varchar(50) |  | 管理类型 (FundManageType) |  | 1=自我管理; |