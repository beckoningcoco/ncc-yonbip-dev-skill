# |<<

**出资人情况 (ipmrm_regist_investor / nc.vo.ipmrm.equityregist.EqutiyRegisterInvestorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3382.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_investor | 出资人主键 | pk_investor | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目单位 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 项目单位版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_enterprise_person | 出资人编码 | pk_enterprise_person | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 5 | category | 类别 | category | varchar(50) |  | 企业and自然人类别 (EnterprisePersonType) |  | 1=企业; |