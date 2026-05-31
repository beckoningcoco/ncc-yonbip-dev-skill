# |<<

**物品存储_计划_明细 (uh_pd_pl_dt / com.yonyou.yh.nhis.scm.uhpd.vo.UhPdPlDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6147.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpldt | 物品计划明细主键 | pk_pdpldt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pdpl | 计划 | pk_pdpl | varchar(20) |  | 物料计划信息 (materialplan) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | unit_cur | 包装单位_当前 | unit_cur | varchar(50) |  | 字符串 (String) |
| 8 | favtor_cur | 换算系数公式new | favtor_cur | varchar(50) |  | 字符串 (String) |
| 9 | factor_cb | 换算系数公式_当前单位/基本单位 | factor_cb | varchar(50) |  | 字符串 (String) |
| 10 | factor_fb | 换算系数公式_主计量单位/基本单位 | factor_fb | varchar(50) |  | 字符串 (String) |
| 11 | quan_pl_cur | 计划/采购数量_当前 | quan_pl_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | quan_pl_base | 计划/采购数量_基本 | quan_pl_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | date_reqr | 需要日期 | date_reqr | char(19) |  | 日期时间 (UFDateTime) |
| 14 | pk_ord | 服务机构 | pk_ord | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 15 | pk_dept | 服务部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 16 | pk_stordoc | 服务仓库 | pk_stordoc | varchar(20) |  | 物料仓库信息 (materialwarh) |
| 17 | pk_sup | 供应商 | pk_sup | varchar(20) |  | 供应商基本信息 (supplier) |
| 18 | quan_deli_base | 实发/已入库数量_基本 | quan_deli_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | date_deli | 最近实发/入库日期 | date_deli | char(19) |  | 日期时间 (UFDateTime) |
| 20 | pk_psn_deli | 最近实发/入库经办人 | pk_psn_deli | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 22 | flag_finish | 执行完成标志 | flag_finish | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | quan_rq_cur | 需要数量_当前 | quan_rq_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | quan_rq_base | 需要数量_基本 | quan_rq_base | decimal(28, 8) |  | 数值 (UFDouble) |