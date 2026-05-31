# |<<

**票据管理_月结 (un_bl_inv_mc / com.yonyou.yh.nhis.bl.invc.vo.BlinvcmcVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6303.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incmc | 票据月结主键 | pk_incmc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 所属机构版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_accperiodmonth | 会计月份主键 | pk_accperiodmonth | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | date_begin | 开始日期 | date_begin | char(19) |  | 日期(开始) (UFDateBegin) |
| 7 | date_end | 结束日期 | date_end | char(19) |  | 日期(结束) (UFDateEnd) |
| 8 | dt_mthclose | 月结类型 | dt_mthclose | int |  | 月结类型 (MthcloseEnum) | 1 | 0=领用月结; |