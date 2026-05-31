# |<<

**定期存入申请 (ifac_fixdepositapply / nc.vo.ifac.fixdepositapply.FixDepositApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3081.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fixdepositapply | 定期存入申请主键 | pk_fixdepositapply | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_fundorg | 资金组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 6 | pk_fundorg_v | 资金组织版本 | pk_fundorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 7 | applydate | 申请日期 | applydate | char(19) |  | 日期(开始) (UFDateBegin) |
| 8 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | billstate | 单据状态 | billstate | int |  | 单据状态 (Billstate) |  | 1=待提交; |