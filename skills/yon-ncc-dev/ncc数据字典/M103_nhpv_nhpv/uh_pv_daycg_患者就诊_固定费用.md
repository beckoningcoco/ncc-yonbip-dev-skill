# |<<

**患者就诊_固定费用 (uh_pv_daycg / com.yonyou.yh.nhis.pv.pvfixed.vo.PvFixedVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6216.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvdaycg | 患者就诊固定费用主键 | pk_pvdaycg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 5 | eu_daycgset | 固定费用收费模式 | eu_daycgset | varchar(50) |  | 固定收费方式 (enum) |  | 0=按人收费; |