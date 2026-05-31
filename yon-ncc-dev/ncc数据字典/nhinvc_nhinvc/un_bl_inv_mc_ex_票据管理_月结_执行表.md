# |<<

**票据管理_月结_执行表 (un_bl_inv_mc_ex / com.yonyou.yh.nhis.bl.invc.vo.BlinvcmcexVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6304.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mth_exec | 票据月结执行主键 | pk_mth_exec | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 所属机构版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_accperiodmonth | 会计月主键 | pk_accperiodmonth | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | date_ex | 执行时间 | date_ex | char(19) |  | 日期 (UFDate) |
| 7 | flag_mc | 是否月结 | flag_mc | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |