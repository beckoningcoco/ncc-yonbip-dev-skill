# |<<

**医疗执行_部门_物品发退 (uh_ex_dept_pdde / com.yonyou.yh.nhis.ex.pd.vo.DeptPdAppDeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6076.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptpdde | 部门物品发放主键 | pk_deptpdde | char(20) | √ | 主键 (UFID) |
| 2 | pk_deptpdde | 部门物品发放主键 | pk_deptpdde | char(20) | √ | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 5 | pk_deptpdapdt | 部门物品请领(退)明细 | pk_deptpdapdt | char(50) |  | 字符串 (String) |
| 6 | eu_direct | 发退方向 | eu_direct | int |  | 整数 (Integer) |
| 7 | pk_pddecate | 医疗物品发退分类 | pk_pddecate | varchar(50) |  | 字符串 (String) |
| 8 | pk_pd | 物品 | pk_pd | char(50) |  | 字符串 (String) |
| 9 | pk_measdoc_cur | 物品包装单位_当前 | pk_measdoc_cur | char(50) |  | 字符串 (String) |
| 10 | pk_measdoc_base | 物品包装单位_基本 | pk_measdoc_base | char(50) |  | 字符串 (String) |
| 11 | factor_cb | 换算系数公式_当前单位/基本单位 | factor_cb | varchar(256) |  | 字符串 (String) |
| 12 | batch | 物品批号 | batch | varchar(30) |  | 字符串 (String) |
| 13 | quan_cur_de | 实发(退)数量_当前 | quan_cur_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | quan_base_de | 实发(退)数量_基本 | quan_base_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | price_sp | 售价_零售单位(主计量单位) | price_sp | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | purprice_sp | 进价_零售单位(主计量单位) | purprice_sp | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | amount_de | 实发(退)金额 | amount_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | flag_inv | 已出入库标志 | flag_inv | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | pk_inv | 对应出入库 | pk_inv | char(50) |  | 字符串 (String) |
| 20 | pk_org_ap | 申请机构 | pk_org_ap | varchar(50) |  | 字符串 (String) |
| 21 | pk_dept_ap | 申请科室 | pk_dept_ap | varchar(50) |  | 字符串 (String) |
| 22 | pk_pv | 就诊 | pk_pv | char(50) |  | 字符串 (String) |
| 23 | pk_ord | 医嘱主键 | pk_ord | char(50) |  | 字符串 (String) |
| 24 | pk_inv_dt | 对应出入库明细 | pk_inv_dt | char(50) |  | 字符串 (String) |
| 25 | pk_org_de | 发退机构 | pk_org_de | varchar(50) |  | 字符串 (String) |
| 26 | pk_dept_de | 发退部门 | pk_dept_de | varchar(50) |  | 字符串 (String) |
| 27 | date_de | 发退日期 | date_de | char(19) |  | 日期时间 (UFDateTime) |
| 28 | pk_psn_de | 发退人员 | pk_psn_de | varchar(50) |  | 字符串 (String) |
| 29 | name_psn_de | 发退人员姓名 | name_psn_de | varchar(50) |  | 字符串 (String) |
| 30 | flag_print | 打印标志 | flag_print | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | flag_pivas | 静配标志 | flag_pivas | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 33 | flag_barcode | 瓶签生成标志 | flag_barcode | char(1) |  | 布尔类型 (UFBoolean) |
| 34 | code_de | 发药编码 | code_de | varchar(50) |  | 字符串 (String) |
| 35 | flag_pvdeprint | flag_pvdeprint | flag_pvdeprint | char(1) |  | 布尔类型 (UFBoolean) |
| 36 | eu_pddetype | 医疗物品发放类型 | eu_pddetype | varchar(20) |  | 字符串 (String) |
| 37 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 38 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 39 | name_de | 医疗物品发放单名称 | name_de | varchar(100) |  | 字符串 (String) |
| 40 | date_ap_bs_b | 请领开始日期_基数模式 | date_ap_bs_b | char(19) |  | 日期时间 (UFDateTime) |
| 41 | date_ap_bs_e | 请领结束日期_基数模式 | date_ap_bs_e | char(19) |  | 日期时间 (UFDateTime) |
| 42 | flag_canc | 发放单作废标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 43 | date_canc | 作废日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 44 | pk_psn_canc | 作废人员 | pk_psn_canc | varchar(20) |  | 字符串 (String) |
| 45 | name_psn_canc | 作废人员名称 | name_psn_canc | varchar(256) |  | 字符串 (String) |
| 46 | times_prt | 发放单打印次数 | times_prt | int |  | 整数 (Integer) |
| 47 | pk_org_v | 所属组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 48 | flag_need_iv | 静配标志new | flag_need_iv | char(1) |  | 布尔类型 (UFBoolean) |
| 49 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 50 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 51 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 52 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |