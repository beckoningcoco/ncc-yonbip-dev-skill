# |<<

**操作员结账_财务交割 (uh_bl_cc_fc / com.yonyou.yh.nhis.bl.cc.vo.BLCCFIConfirmVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5921.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_blccfc | 财务交割主键 | pk_blccfc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_cctype | 结账类型 | pk_cctype | varchar(20) |  | 字符串 (String) |
| 5 | dt_cctype | 结账类型编码 | dt_cctype | char(20) |  | 主键 (UFID) |
| 6 | eu_blcltype | 财务交割类型 | eu_blcltype | varchar(50) |  | 财务交割类型 (CcfcTypeEnum) |  | 0=院内财务; |