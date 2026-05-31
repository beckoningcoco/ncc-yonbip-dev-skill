# |<<

**患者就诊_固定费用_明细 (uh_pv_daycg_dt / com.yonyou.yh.nhis.pv.pvfixed.vo.PvFixedDtVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6217.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvdaycgdt | 患者就诊固定费用明细主键 | pk_pvdaycgdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_pvdaycgdt | 患者就诊固定费用明细主键 | pk_pvdaycgdt | char(20) | √ | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_item | 固定收费项目 | pk_item | char(20) |  | 主键 (UFID) |
| 6 | eu_cgmode | 固定收费方式 | eu_cgmode | varchar(50) |  | 固定费用收费模式 (eu_daycgsetEnum) |  | 0=继承科室; |