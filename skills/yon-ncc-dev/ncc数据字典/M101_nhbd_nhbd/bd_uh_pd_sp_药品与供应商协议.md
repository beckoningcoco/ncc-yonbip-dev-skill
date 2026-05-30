# |<<

**药品与供应商协议 (bd_uh_pd_sp / com.yonyou.yh.nhis.bd.uhpdsp.vo.UHPdSpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1074.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdsp | 主键 | pk_pdsp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pd | 医疗物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | pk_sp | 供应商 | pk_sp | varchar(20) |  | 供应商基本信息 (supplier) |
| 6 | agreecode | 协议号 | agreecode | varchar(50) |  | 字符串 (String) |
| 7 | price_saleunit | 协议单价_零售单位 | price_saleunit | decimal(28, 4) |  | 数值 (UFDouble) |
| 8 | flag_def | 默认标志 | flag_def | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | date_begin | 协议开始日期 | date_begin | char(19) |  | 日期(开始) (UFDateBegin) |
| 10 | date_end | 协议结束日期 | date_end | char(19) |  | 日期(结束) (UFDateEnd) |
| 11 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_psn_agree | 协议人 | pk_psn_agree | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |