# |<<

**物品_采购_明细 (uh_pd_pu_dt / com.yonyou.yh.nhis.scm.uhpd.vo.UhPdPuDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6149.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpudt | 物品采购订单明细主键 | pk_pdpudt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pdpu | 订单 | pk_pdpu | varchar(20) |  | 物料对应订单交易类型设置 (ordertranstype) |
| 5 | pk_org_acpt | 入库机构 | pk_org_acpt | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_acpt | 入库部门 | pk_dept_acpt | varchar(20) |  | 组织_部门 (dept) |
| 7 | pk_stordoc | 入库仓库 | pk_stordoc | varchar(20) |  | 仓库 (stordoc) |
| 8 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 9 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | pk_measdoc_cur | 包装单位_当前 | pk_measdoc_cur | varchar(20) |  | 包装单位取整模式(自定义档案) (Defdoc-030409) |
| 11 | factor_bc | 换算系数公式new | factor_bc | varchar(50) |  | 字符串 (String) |
| 12 | factor_cb | 换算系数公式_当前单位/基本单位 | factor_cb | varchar(50) |  | 字符串 (String) |
| 13 | factor_fb | 换算系数公式_主计量单位/基本单位 | factor_fb | varchar(50) |  | 字符串 (String) |
| 14 | quan_pu_cur | 采购数量_当前 | quan_pu_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | quan_pu_base | 采购数量_基本 | quan_pu_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | date_reqr | 需要日期 | date_reqr | char(19) |  | 日期 (UFDate) |
| 17 | quan_acpt_base | 已入库数量_基本 | quan_acpt_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | date_acpt | 最近入库日期 | date_acpt | char(19) |  | 日期时间 (UFDateTime) |
| 19 | pk_psn_acpt | 最近入库经办人 | pk_psn_acpt | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | pk_pdpldt | 库存计划明细 | pk_pdpldt | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | flag_acpt | 入库完成标志 | flag_acpt | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | flag_pay | 付款完成标志 | flag_pay | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | flag_active | 有效标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |