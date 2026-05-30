# |<<

**结算 (uh_bl_st / com.yonyou.yh.nhis.bl.sett.vo.BLSettleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5951.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_st | 结算主键 | pk_st | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(30) |  | 字符串 (String) |
| 6 | pk_pv | 就诊编码 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 7 | pk_sttype | 结算类型 | pk_sttype | varchar(20) |  | 结算类型(自定义档案) (Defdoc-110102) |
| 8 | dt_sttype | 结算类型编码 | dt_sttype | varchar(30) |  | 字符串 (String) |
| 9 | eu_stresult | 结算结果分类 | eu_stresult | varchar(50) |  | 结算结果分类 (StResultEnum) |  | 0=正常结算; |