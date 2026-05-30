# |<<

**日间手术 (uh_bl_cg_opconvert / com.yonyou.yh.nhis.bl.cg.vo.BlCgOpConvertVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5927.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cgopconvert | 主键 | pk_cgopconvert | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 组织 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 5 | pk_pati | 患者 | pk_pati | char(20) |  | 主键 (UFID) |
| 6 | pk_pv | 就诊 | pk_pv | char(20) |  | 主键 (UFID) |
| 7 | pk_st | 门诊结算主键 | pk_st | char(20) |  | 主键 (UFID) |
| 8 | pk_cg | 门诊计费主键 | pk_cg | varchar(50) |  | 字符串 (String) |
| 9 | pk_item | 服务收费项目 | pk_item | char(20) |  | 主键 (UFID) |
| 10 | pk_measdoc | 物品单位 | pk_measdoc | char(20) |  | 主键 (UFID) |
| 11 | price | 单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | quan_med | 数量 | quan_med | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | pk_dept_ord | 开立科室 | pk_dept_ord | char(20) |  | 主键 (UFID) |
| 15 | pk_psn_phy | 管床医生 | pk_psn_phy | char(20) |  | 主键 (UFID) |
| 16 | name_psn_phy | 管床医生姓名 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 17 | pk_psn_pay | 开立医生 | pk_psn_pay | char(20) |  | 主键 (UFID) |
| 18 | name_psn_pay | 开立医生姓名 | name_psn_pay | varchar(50) |  | 字符串 (String) |
| 19 | pk_org_exec | 执行机构 | pk_org_exec | char(20) |  | 主键 (UFID) |
| 20 | pk_dept_exec | 执行科室 | pk_dept_exec | char(20) |  | 主键 (UFID) |
| 21 | pk_ord | 关联医嘱 | pk_ord | char(20) |  | 主键 (UFID) |
| 22 | date_cg | 计费时间 | date_cg | char(19) |  | 日期时间 (UFDateTime) |
| 23 | date_audit | 审核时间 | date_audit | char(19) |  | 日期时间 (UFDateTime) |
| 24 | pk_org_audit | 审核机构 | pk_org_audit | char(20) |  | 主键 (UFID) |
| 25 | pk_dept_audit | 审核科室 | pk_dept_audit | char(20) |  | 主键 (UFID) |
| 26 | pk_psn_audit | 审核人 | pk_psn_audit | char(20) |  | 主键 (UFID) |
| 27 | name_psn_audit | 审核人姓名 | name_psn_audit | varchar(50) |  | 字符串 (String) |
| 28 | flag_recept | 接收标志 | flag_recept | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | date_recept | 接收时间 | date_recept | char(19) |  | 日期时间 (UFDateTime) |
| 30 | pk_org_recept | 接收机构 | pk_org_recept | char(20) |  | 主键 (UFID) |
| 31 | pk_dept_recept | 接收部门 | pk_dept_recept | varchar(50) |  | 字符串 (String) |
| 32 | pk_psn_recept | 接收人 | pk_psn_recept | char(20) |  | 主键 (UFID) |
| 33 | name_psn_recept | 接收人姓名 | name_psn_recept | varchar(50) |  | 字符串 (String) |
| 34 | pk_pv_recept | 接收就诊 | pk_pv_recept | char(20) |  | 主键 (UFID) |
| 35 | flag_canc | 取消标志 | flag_canc | varchar(50) |  | 字符串 (String) |
| 36 | date_canc | 取消时间 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 37 | pk_org_canc | 取消机构 | pk_org_canc | char(20) |  | 主键 (UFID) |
| 38 | pk_dept_canc | 取消部门 | pk_dept_canc | char(20) |  | 主键 (UFID) |
| 39 | pk_psn_canc | 取消人 | pk_psn_canc | char(20) |  | 主键 (UFID) |
| 40 | name_psn_canc | 取消人姓名 | name_psn_canc | varchar(50) |  | 字符串 (String) |
| 41 | flag_audit | 审核标志 | flag_audit | varchar(50) |  | 字符串 (String) |